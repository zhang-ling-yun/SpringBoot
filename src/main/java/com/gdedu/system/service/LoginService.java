package com.gdedu.system.service;

import com.gdedu.system.dto.LoginResult;

public interface LoginService {
    //public LoginResult login(int no,String pwd);

    public LoginResult loginByStudent(int sno, String spwd);

    public LoginResult loginByManager(int tno, String tpwd);
}
