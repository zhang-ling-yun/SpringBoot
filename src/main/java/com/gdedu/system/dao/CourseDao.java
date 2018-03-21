package com.gdedu.system.dao;

import com.gdedu.system.domain.Course;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 连接数据库获取课程信息的Dao
 */
public interface CourseDao {
    /**
     * 返回课程列表
     *
     * @return
     */
    public List<Course> list();

    /**
     * 根据课程名进行模糊查询或根据课程号进行精确查询
     *
     * @param cname
     * @param cno
     * @return
     */
    public List<Course> findCoursesByCnameOrCno(@Param("cname") String cname, @Param("cno") int cno);

    /**
     * 根据课程名进行模糊查询
     *
     * @param cname
     * @return
     */
    public List<Course> findCourseByCname(String cname);

    /**
     * 根据课程号进行精确查询
     *
     * @param cno
     * @return
     */
    public Course findCourseByCno(int cno);

    /**
     * 更新一门课程信息
     *
     * @param course
     * @return
     */
    public int updateCourse(Course course);

    /**
     * 删除一门课程信息
     *
     * @param cno
     * @return
     */
    public int deleteCourse(int cno);

    /**
     * 添加一门课程信息
     *
     * @param course
     * @return
     */
    public int insertCourse(Course course);
}
