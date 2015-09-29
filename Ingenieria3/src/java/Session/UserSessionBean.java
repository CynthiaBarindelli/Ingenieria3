/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Session;

import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author Cynthia
 */
@ManagedBean(name = "LoginSessionBean", eager = true)
@SessionScoped
public class UserSessionBean implements Serializable {
    String user;
    
    public void Login(){
        user = "Usuario";
        System.out.println(user);
   }
    
    public String GetUser(){
        return user;
    }
}
