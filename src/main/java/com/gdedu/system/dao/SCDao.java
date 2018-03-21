package com.gdedu.system.dao;

import com.gdedu.system.domain.SC;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 访问数据库获取选课信息的Dao
 */
public interface SCDao {
    /**
     * 返回选修列表
     *
     * @return
     */
    public List<SC> list();

    /**
     * 根据学号或者课程号查询所有已选课程,这里应返回视图//TODO
     *
     * @param sno
     * @return
     */
    public List<SC> findSCBySnoOrCno(@Param("sno") int sno, @Param("cno") int cno);

    /**
     * 根据学号查询该学生已选课程
     *
     * @param sno
     * @return
     */
    public List<SC> findSCBySno(int sno);

    /**
     * 根据学号和课程号,学生退选该门课程
     *
     * @param sno
     * @param cno
     * @return
     */
    public int deleteSC(int sno, int cno);

    /**
     * 根据学号和课程号,学生选修该门课程
     *
     * @param sno
     * @param cno
     * @return
     */
    public int insertSC(int sno, int cno);
}
