/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSF/JSFManagedBean.java to edit this template
 */
package com.mycompany.kabanedim_lb151;

import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;

/**
 *
 * @author Startklar
 */
@Named(value = "login")
@SessionScoped

public class Login implements Serializable {
    private String email;
    private String password;

    public Login() {
    }

    public String login() {
       
        if (email.equalsIgnoreCase("administrator@hotmail.com") && password.equals("Admin1234")) {

            return "adminuebersicht.xhtml?faces-redirect=true";
        } else {
            
            return "login.xhtml?error=true";
        }
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}