package com.ssm.service;

import com.ssm.domain.BaseResult;
import com.ssm.domain.Student;
import com.ssm.page.PageBean;

import java.util.List;

/**
 * AlsdGo 2018年01月26日 上午10:43
 * 谁的韶华流过鬓发，谁噙一笑煮酒观花，谁能相忘湖边柳下，你我纵是静坐也繁华。
 */
public interface StudentService {

    List<Student> selectAll();

    /**
     *
     * @param student 页码 从0开始
     * @param pageIndex 每页显示的条数
     * @param pageSize 包含条件查询的参数对象
     * @return 返回包含total和data的结果封装对象
     */
    BaseResult<Student> pageSelect(Student student, int pageIndex, int pageSize);

}
