/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appdaftardonasi.Controllers.Interfaces;

import appdaftardonasi.Models.User;

/**
 *
 * @author Razikk
 */
public interface UserInterface {
    
    public User login(String userID, String password);
    
}
