package com.gdedu.system.service.impl;

import com.gdedu.system.constant.CookieConstant;
import com.gdedu.system.dao.LoginDao;
import com.gdedu.system.dto.LoginResult;
import com.gdedu.system.enums.LoginResultEnum;
import com.gdedu.system.service.LoginService;
import com.gdedu.system.util.CookieUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.Cookie;
import java.util.UUID;

/**
 * 进行登录处理的业务逻辑类
 */
@Service
public class LoginServiceImpl implements LoginService {

    @Autowired
    private LoginDao loginDao;

    @Override
    public LoginResult loginByStudent(int sno, String spwd) {
        int result = loginDao.loginByStudentOnSno(sno);
        if (result == 0) {
            return new LoginResult(LoginResultEnum.NOT_EXIST);
        }
        result = loginDao.loginByStudent(sno, spwd);
        if (result == 0) {
            return new LoginResult(LoginResultEnum.NOT_MATCH);
        }
        //设置Cookie//TODO
        CookieUtil.saveCookie(CookieConstant.TOKEN, UUID.randomUUID().toString());
        return new LoginResult(LoginResultEnum.SUCCESS);
    }

    @Override
    public LoginResult loginByManager(int tno, String tpwd) {
        int result = loginDao.loginByManagerOnTno(tno);
        if (result == 0) {
            return new LoginResult(LoginResultEnum.NOT_EXIST);
        }
        result = loginDao.loginByManager(tno, tpwd);
        if (result == 0) {
            return new LoginResult(LoginResultEnum.NOT_MATCH);
        }
        //设置cookie
        CookieUtil.saveCookie(CookieConstant.TOKEN, UUID.randomUUID().toString());
        return new LoginResult(LoginResultEnum.SUCCESS);
    }
}


