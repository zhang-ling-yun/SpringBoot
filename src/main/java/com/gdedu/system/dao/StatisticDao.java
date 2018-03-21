package com.gdedu.system.dao;

import com.gdedu.system.domain.CourseStatistic;
import com.gdedu.system.domain.StudentStatistic;
import com.gdedu.system.domain.TeacherStatistic;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface StatisticDao {
    /**
     * 获取课程统计列表
     *
     * @return
     */
    public List<CourseStatistic> getCourseStatisticList();

    /**
     * 获取学生统计列表
     *
     * @return
     */
    public List<StudentStatistic> getStudentStatisticList();

    /**
     * 获取教师统计列表
     *
     * @return
     */
    public List<TeacherStatistic> getTeacherStatisticList();

}
