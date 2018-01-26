package com.ssm.test;

import com.ssm.domain.Student;
import com.ssm.mapper.StudentMapper;
import com.ssm.page.PageBean;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * AlsdGo 2018年01月26日 上午10:28
 * 谁的韶华流过鬓发，谁噙一笑煮酒观花，谁能相忘湖边柳下，你我纵是静坐也繁华。
 */
public class MainTest {

    private ApplicationContext context;

    @Before
    public void init(){
        context = new ClassPathXmlApplicationContext("classpath*:spring-*.xml");
    }

    @Test
    public void testMapper(){
        // 获得mybatis的Student表的代理对象
        StudentMapper studentMapper = context.getBean(StudentMapper.class);

        // 调用接口中的查询所有
        List<Student> students = studentMapper.selectAll();

        System.out.println(students);

        // 获取总条数
        Student student8 = new Student();
        student8.setSname("中");
        PageBean<Student> pageBean8 = new PageBean<>(student8);
        int count = studentMapper.getTotalRecord(pageBean8);
        System.out.println(count);

        // 分页查询
        PageBean<Student> pageBean = new PageBean<>(1,5,count);
        Student student = new Student();
        student.setSname("中");
        pageBean.setParameter(student);
        List<Student> students1 = studentMapper.pageSelect(pageBean);
        System.out.println(students1);


    }




}
