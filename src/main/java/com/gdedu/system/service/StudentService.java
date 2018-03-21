package com.gdedu.system.service;

import com.gdedu.system.domain.Student;

import java.util.List;

public interface StudentService {
    /**
     * 查询学生列表
     *
     * @return
     */
    public List<Student> listStudent();

    /**
     * 删除一个学生
     *
     * @param sno
     * @return
     */
    public int deleteStudent(int sno);

    /**
     * 添加一个学生
     *
     * @param student
     * @return
     */
    public int insertStudent(Student student);

    /**
     * 更新一个学生
     *
     * @param student
     * @return
     */
    public int updateStudent(Student student);
}
