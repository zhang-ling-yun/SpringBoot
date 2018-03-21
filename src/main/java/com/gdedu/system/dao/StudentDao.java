package com.gdedu.system.dao;

import com.gdedu.system.domain.Student;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * 访问数据库获取学生信息的Dao
 */
@Component
public interface StudentDao {

    /**
     * 返回学生列表
     *
     * @return
     */
    public List<Student> list();

    /**
     * 根据学生姓名进行模糊查询或根据学号进行精确查询
     *
     * @param sname
     * @param sno
     * @return
     */
    public List<Student> findStudentsBySnameOrSno(@Param("sname") String sname, @Param("sno") int sno);

    /**
     * 根据学号返回一个学生信息
     *
     * @param sno
     * @return
     */
    public Student findOneBySno(int sno);

    /**
     * 根据学生姓名模糊查询
     *
     * @param sname
     * @return
     */
    public List<Student> findStudentsBySname(String sname);

    /**
     * 更新一条学生信息
     *
     * @param student
     * @return
     */
    public int updateStudent(Student student);

    /**
     * 插入一条学生信息
     *
     * @param student
     * @return
     */
    public int insertStudent(Student student);

    /**
     * 根据学号删除一条学生信息
     *
     * @param sno
     * @return
     */
    public int deleteStudent(int sno);
}
