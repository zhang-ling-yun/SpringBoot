package com.gdedu.system.service;

import com.gdedu.system.domain.CourseStatistic;
import com.gdedu.system.domain.StudentStatistic;
import com.gdedu.system.domain.TeacherStatistic;

import java.util.List;

public interface StatisticService {
    public List<CourseStatistic> getCourseStatistic();

    public List<StudentStatistic> getStudentStatistic();

    public List<TeacherStatistic> getTeacherStatistic();
}
