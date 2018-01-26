package com.ssm.mapper;

/**
 * AlsdGo 2018年01月26日 上午9:51
 * 谁的韶华流过鬓发，谁噙一笑煮酒观花，谁能相忘湖边柳下，你我纵是静坐也繁华。
 */

import com.ssm.domain.Student;
import com.ssm.page.PageBean;

import java.util.List;

/**
 * Student操作的对外接口声明
 * 具体实现见Student.xml
 */
public interface StudentMapper {

    /**
     * 查询所有学生列表
     * 1.方法名对应Student.xml中的id属性
     * 2.方法参数对应Student.xml中的parameterType属性
     * 3.方法返回值对应Student.xml中的resultType属性
     */
    List<Student> selectAll();

    /**
     * 分页查询
     * @param pageBean
     * @return
     */
    List<Student> pageSelect(PageBean<Student> pageBean);

    /**
     * 获取学生表总条数
     */
    Integer getTotalRecord(PageBean<Student> pageBean);

}
