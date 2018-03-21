package com.gdedu.system.controller;

import com.gdedu.system.domain.Student;
import com.gdedu.system.dto.PageBean;
import com.gdedu.system.dto.StudentReturnResult;
import com.gdedu.system.enums.StudentReturnResultEnum;
import com.gdedu.system.service.StatisticService;
import com.gdedu.system.service.StudentService;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/")
public class ManagerController {
    @Autowired
    private StudentService studentService;
    @Autowired
    private StatisticService statisticService;

    @GetMapping("manager")
    public String manager() {
        return "manager/manager";
    }

    //学生管理
    //返回学生列表
    @GetMapping("manager/students")
    public String listStudent(Model model, @RequestParam("currentPage") int currentPage) {
        PageHelper.startPage(currentPage, PageBean.PAGE_SIZE);
        model.addAttribute("page", new PageBean<Student>(studentService.listStudent()));
        return "manager/listStudent";
    }

    @GetMapping("manager/students/addition")
    public String addition() {
        return "manager/addStudent";
    }

    //添加一个学生,注意使用@ResponseBody和@RequestBody 传参和返回参数
    @PostMapping("manager/students/addition")
    @ResponseBody
    public StudentReturnResult insertStudent(@RequestBody Student student) {
        int result = studentService.insertStudent(student);
        if (result == 0) {
            return new StudentReturnResult(StudentReturnResultEnum.INSERT_FAIL);
        }
        return new StudentReturnResult(StudentReturnResultEnum.INSERT_SUCCESS);
    }

    //更新一个学生
    @PutMapping("manager/students/update")
    @ResponseBody
    public StudentReturnResult updateStudent(@RequestBody Student student) {
        int result = studentService.updateStudent(student);
        if (result == 0) {
            return new StudentReturnResult(StudentReturnResultEnum.UPDATE_FAIL);
        }
        return new StudentReturnResult(StudentReturnResultEnum.UPDATE_SUCCESS);
    }

    //删除一个学生
    @DeleteMapping("manager/students/{sno}/delete")
    @ResponseBody
    public StudentReturnResult deleteStudent(@PathVariable("sno") int sno) {
        int result = studentService.deleteStudent(sno);
        if (result == 0) {
            return new StudentReturnResult(StudentReturnResultEnum.DELETE_FAIL);
        }
        return new StudentReturnResult(StudentReturnResultEnum.DELETE_SUCCESS);
    }

    //教师管理TODO


    //统计报表
    @GetMapping("manager/statistic")
    public String getStatistic(Model model) {
        model.addAttribute("courseStatistic", statisticService.getCourseStatistic());
        model.addAttribute("studentStatistic", statisticService.getStudentStatistic());
        model.addAttribute("teacherStatistic", statisticService.getTeacherStatistic());
        return "manager/statistic";
    }
}
