/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.user.servlet;

import com.user.dao.UserDao;
import com.user.dto.UserDTO;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 *
 * @author apiiit-rkv
 */
@WebServlet("/user")
public class UserServlet extends HttpServlet{
    public void doGet(HttpServletRequest req,HttpServletResponse resp) throws IOException, ServletException{
        UserDao userDao=new UserDao();
        List<UserDTO> users=userDao.getUsers();
        req.setAttribute("users",users);
        req.getRequestDispatcher("/viewers.jsp").forward(req,resp);
        }
    @Override
    public void doPost(HttpServletRequest req,HttpServletResponse resp) throws ServletException, IOException{
        String name=req.getParameter("name");
        String email=req.getParameter("email");
        String phno=req.getParameter("phno");
        UserDTO user=new UserDTO();
         user.setUserName(name);
            user.setUserEmail(email);
            user.setUserPh(Integer.parseInt(phno));
            UserDao dao= new UserDao();
            boolean isSaved=dao.saveUser(user);
            String msg=null;
           if(isSaved){
               msg="User Saved";
            }
           else{
          msg="User not Saved";}
        
    req.setAttribute("msg",msg);
    req.getRequestDispatcher("/index.jsp").forward(req,resp);
    
    
    
}
}
