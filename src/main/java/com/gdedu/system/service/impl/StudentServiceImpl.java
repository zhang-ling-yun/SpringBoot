package com.gdedu.system.service.impl;

import com.gdedu.system.dao.StudentDao;
import com.gdedu.system.domain.Student;
import com.gdedu.system.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentDao studentDao;

    /**
     * 返回学生列表
     *
     * @return
     */
    @Override
    public List<Student> listStudent() {
        return studentDao.list();
    }

    /**
     * 根据学号删除一个学生
     *
     * @param sno
     * @return
     */
    @Override
    public int deleteStudent(int sno) {
        return studentDao.deleteStudent(sno);
    }

    /**
     * 插入一条学生信息
     *
     * @param student
     * @return
     */
    @Override
    public int insertStudent(Student student) {
        return studentDao.insertStudent(student);
    }

    /**
     * 更新一条学生信息
     *
     * @param student
     * @return
     */
    @Override
    public int updateStudent(Student student) {
        return studentDao.updateStudent(student);
    }
}
