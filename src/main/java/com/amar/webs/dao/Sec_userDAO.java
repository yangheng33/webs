/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.amar.webs.dao;

import com.amar.webs.model.Sec_user;
import java.util.List;
/**
 *
 * @author amar
 */
public interface Sec_userDAO {
    public void deleteSec_User(Sec_user sec_user);
    public void addSec_User(Sec_user sec_user);
    public void editSec_User (Sec_user sec_user);
    public List<Sec_user> getSec_user(Sec_user sec_user);
}
