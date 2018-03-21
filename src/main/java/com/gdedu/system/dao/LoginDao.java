package com.gdedu.system.dao;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

/**
 * 访问数据库判断用户是否存在的Dao
 */
@Component
public interface LoginDao {
    /**
     * 根据学号和密码判断用户名和密码是否对应
     *
     * @param sno
     * @param spwd
     * @return
     */
    public int loginByStudent(@Param("sno") int sno, @Param("spwd") String spwd);//如果是只有一个参数，则不需要添加@Param注解

    /**
     * 根据学号判断该用户是否存在
     *
     * @param sno
     * @return
     */
    public int loginByStudentOnSno(int sno);

    /**
     * 根据教工号和密码查询判断用户名和密码是否对应
     *
     * @param tno
     * @param tpwd
     * @return
     */
    public int loginByManager(@Param("tno") int tno, @Param("tpwd") String tpwd);

    /**
     * 根据教工号判断该管理员是否存在
     *
     * @param tno
     * @return
     */
    public int loginByManagerOnTno(int tno);
}
