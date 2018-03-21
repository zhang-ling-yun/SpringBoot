package com.gdedu.system.dao;

import com.gdedu.system.domain.Teacher;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 访问数据库获取教师信息的Dao
 */
public interface TeacherDao {
    /**
     * 返回教师列表
     *
     * @return
     */
    public List<Teacher> list();

    /**
     * 根据教师姓名进行模糊查询或根据教工号进行精确查询
     *
     * @param tname
     * @param tno
     * @return
     */
    public List<Teacher> findTeachersByTnameOrTno(@Param("tname") String tname, @Param("tno") int tno);

    /**
     * 根据教师姓名进行模糊查询
     *
     * @param tname
     * @return
     */
    public List<Teacher> findTeachersByTname(String tname);

    /**
     * 根据教工号进行精确查询
     *
     * @param tno
     * @return
     */
    public Teacher findTeacherByTno(int tno);

    /**
     * 插入一条教师信息
     *
     * @param teacher
     * @return
     */
    public int insertTeacher(Teacher teacher);

    /**
     * 删除一条教师信息
     *
     * @param tno
     * @return
     */
    public int deleteTeacher(int tno);

    /**
     * 更新一条教师信息
     *
     * @param teacher
     * @return
     */
    public int updateTeacher(Teacher teacher);
}
