package com.ssm.service.impl;

import com.ssm.domain.BaseResult;
import com.ssm.domain.Student;
import com.ssm.mapper.StudentMapper;
import com.ssm.page.PageBean;
import com.ssm.service.StudentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * AlsdGo 2018年01月26日 上午10:44
 * 谁的韶华流过鬓发，谁噙一笑煮酒观花，谁能相忘湖边柳下，你我纵是静坐也繁华。
 */
@Service("studentService")
public class StudentServiceImpl implements StudentService {

    // service层调用持久层的接口对象声明
    @Resource
    private StudentMapper studentMapper;

    @Override
    public List<Student> selectAll() {
        return studentMapper.selectAll();
    }

    @Override
    public BaseResult<Student> pageSelect(Student student, int pageIndex, int pageSize) {
        BaseResult<Student> result = new BaseResult<>();

        PageBean<Student> pageBean8 = new PageBean<>(student);

        int total = studentMapper.getTotalRecord(pageBean8);

        PageBean<Student> pageBean = new PageBean<>(pageIndex + 1, pageSize, total);

        pageBean.setParameter(student);

        List<Student> datas = studentMapper.pageSelect(pageBean);

        result.setTotal(total);
        result.setData(datas);

        return result;
    }


}
