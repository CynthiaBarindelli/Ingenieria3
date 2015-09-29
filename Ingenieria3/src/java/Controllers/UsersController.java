/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

/**
 *
 * @author Cynthia
 */
public class UsersController {
    public static boolean ValidateUserPassword(String user, String password){
        return user.equals("usuario") && password.equals("123456");
    }
}
