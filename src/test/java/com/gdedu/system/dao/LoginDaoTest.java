package com.gdedu.system.dao;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class LoginDaoTest {

    private final static Logger logger = LoggerFactory.getLogger(LoginDaoTest.class);
    @Autowired
    private LoginDao loginDao;

    @Test
    public void loginByStudent() {
        int sno = 1506300052;
        String spwd = "19960610";
        int result = loginDao.loginByStudent(sno, spwd);
        logger.info("loginByStudent:" + result);
    }

    @Test
    public void loginByStudentOnSno() {
        int sno = 150630005;
        int result = loginDao.loginByStudentOnSno(sno);
        logger.info("loginByStudentOnSno:" + result);
    }

    @Test
    public void loginByManager() {
        int tno = 103159;
        String tpwd = "123456";
        int result = loginDao.loginByManager(tno, tpwd);
        logger.info("loginByManager:" + result);
    }

    @Test
    public void loginByManagerOnTno() {
        int tno = 103159;
        int result = loginDao.loginByManagerOnTno(tno);
        logger.info("loginByManagerOnTno:" + result);
    }
}