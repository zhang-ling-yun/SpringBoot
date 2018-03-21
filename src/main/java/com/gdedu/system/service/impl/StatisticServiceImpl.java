package com.gdedu.system.service.impl;

import com.gdedu.system.dao.StatisticDao;
import com.gdedu.system.domain.CourseStatistic;
import com.gdedu.system.domain.StudentStatistic;
import com.gdedu.system.domain.TeacherStatistic;
import com.gdedu.system.service.StatisticService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StatisticServiceImpl implements StatisticService {
    @Autowired
    private StatisticDao statisticDao;

    @Override
    public List<CourseStatistic> getCourseStatistic() {
        return statisticDao.getCourseStatisticList();
    }

    @Override
    public List<StudentStatistic> getStudentStatistic() {
        return statisticDao.getStudentStatisticList();
    }

    @Override
    public List<TeacherStatistic> getTeacherStatistic() {
        return statisticDao.getTeacherStatisticList();
    }
}
