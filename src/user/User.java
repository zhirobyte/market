/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package user;

import market.*;

/**
 *
 * @author muchsin
 */
public class User {
    final String akun;
    final String gender;
    final String usia;
    
    public User(String akun, String gender, String usia ){
        this.akun = akun;
        this.gender = gender;
        this.usia = usia;
    }

    public String getAkun() {
        return akun;
    }
    
    public String getGender() {
        return gender;
    }
    
    public String getUsia() {
        return usia;
    }
    
}
