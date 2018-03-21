package com.gdedu.system.dao;

import com.gdedu.system.domain.CourseStatistic;
import com.gdedu.system.domain.StudentStatistic;
import com.gdedu.system.domain.TeacherStatistic;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class StatisticDaoTest {

    @Autowired
    private StatisticDao statisticDao;

    @Test
    public void getCourseStatisticList() {
        List<CourseStatistic> list = statisticDao.getCourseStatisticList();
        for (CourseStatistic c : list) {
            System.out.println(c);
        }
    }

    @Test
    public void getStudentStatisticList() {
        List<StudentStatistic> list = statisticDao.getStudentStatisticList();
        for (StudentStatistic s : list) {
            System.out.println(s);
        }
    }

    @Test
    public void getTeacherStatisticList() {
        List<TeacherStatistic> list = statisticDao.getTeacherStatisticList();
        for (TeacherStatistic t : list) {
            System.out.println(t);
        }
    }
}