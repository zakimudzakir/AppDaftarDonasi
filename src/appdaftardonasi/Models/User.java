/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appdaftardonasi.Models;

/**
 *
 * @author Razikk
 */
public class User {
    private String userID;
    private String password;
    private String firstName;
    private String lastName;
    private String email;
    
    public User(String userID, String password){
        this.userID = userID;
        this.password = password;
    }
    
    public void setUserId(String userID){
        this.userID = userID;
    }
    
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }
    
    public void setLastName(String lastName){
        this.lastName = lastName;
    }
    
    public void setEmail(String email){
        this.email = email;
    }
    
    public void setPassword(String password){
        this.password = password;
    }
    
    public String getUserID(){
        return this.userID;
    }
    
    public String getFirstName(){
        return this.firstName;
    }
    
    public String getLastName(){
        return this.lastName;
    }
    
    public String getEmail(){
        return this.email;
    }
    
    public String getPassword(){
        return this.password;
    }
}
