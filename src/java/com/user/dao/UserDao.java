/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.user.dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import com.user.dto.UserDTO;
import java.sql.Statement;
import java.sql.ResultSet;
import com.user.util.ConnectionFactory;
import java.util.ArrayList;
import java.util.List;
import com.user.dto.UserDTO;

/**
 *
 * @author apiiit-rkv
 */
public class UserDao {
   public static final String insert_sql = "INSERT INTO user_dt (uname, uemail, uphno) VALUES (?, ?, ?)";

    public static final String select_sql="SELECT * FROM user_dt";
    public boolean saveUser(UserDTO userdt){
        boolean isSaved=false;
        try{
            Connection con=ConnectionFactory.getConnection();
            PreparedStatement pstmt=con.prepareStatement(insert_sql);
          pstmt.setString(1, userdt.getUserName());
pstmt.setString(2, userdt.getUserEmail());
pstmt.setInt(3, userdt.getUserPh());

           int count= pstmt.executeUpdate();
           if(count>0){
                isSaved=true;}
            
        }
        catch(Exception e){
            e.printStackTrace();
        }
        return isSaved;
    }
   public List<UserDTO> getUsers(){
    List<UserDTO> users= new ArrayList<>();
    try{
        Connection con=ConnectionFactory.getConnection();
        Statement stmt= con.createStatement();
        ResultSet rs=stmt.executeQuery(select_sql);
        while(rs.next()){
            UserDTO user= new UserDTO();
            user.setUserId(rs.getInt("userid"));
           
            user.setUserName(rs.getString("uname"));
            user.setUserEmail(rs.getString("uemail"));
            user.setUserPh(rs.getInt("uphno"));
            users.add(user);
        }
        }
    catch(Exception e){
        e.printStackTrace();}
    return users;
    
}
}


