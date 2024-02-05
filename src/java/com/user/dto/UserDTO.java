/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.user.dto;

/**
 *
 * @author apiiit-rkv
 */
public class UserDTO {
    private Integer userId;
    private String username;
    private Integer userph;
    private String useremail;
    
    public Integer getUserId(){
       return this.userId; }
    public void setUserId(Integer id){
    this.userId=id;}
     public String getUserName(){
       return this.username; }
    public void setUserName(String name){
    this.username=name;}
      public Integer getUserPh(){
       return this.userph; }
    public void setUserPh(Integer ph){
    this.userph=ph;}
      public String getUserEmail(){
       return this.useremail; }
    public void setUserEmail(String email){
    this.useremail=email;}
    
}
