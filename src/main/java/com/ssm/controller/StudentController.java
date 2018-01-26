package com.ssm.controller;

import com.ssm.domain.BaseResult;
import com.ssm.domain.Student;
import com.ssm.page.PageBean;
import com.ssm.service.StudentService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

/**
 * AlsdGo 2018年01月25日 下午5:43
 * 谁的韶华流过鬓发，谁噙一笑煮酒观花，谁能相忘湖边柳下，你我纵是静坐也繁华。
 */
@Controller
public class StudentController {

    @Resource
    private StudentService studentService;

    /**
     * 配置起始页
     */
    @RequestMapping(value = {"", "/"})
    public String index() {
        return "index";
    }

    /**
     * 获取学生列表数据 用于前端页面表格显示
     * 返回数据以json格式进行返回
     */
    @RequestMapping(value = "/searchStudent")
    @ResponseBody
    public BaseResult<Student> searchStudent() {

        List<Student> students = studentService.selectAll();

        // 将查询到的结果集进行封装
        BaseResult<Student> result = new BaseResult<>();

        result.setTotal(100);

        result.setData(students);

        return result;
    }

    /**
     * 分页查询
     * pageIndex和pageSize分别是miniui前端传递过来的参数
     * student接收前端页码传递过来的参数
     */
    @RequestMapping(value = "/findStudent")
    @ResponseBody
    public BaseResult<Student> findStudent(Student student, int pageIndex, int pageSize) {

        BaseResult<Student> result = studentService.pageSelect(student, pageIndex, pageSize);

        return result;
    }


}
