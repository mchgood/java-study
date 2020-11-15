package com.tangkc.business.job.service;

import com.tangkc.MyBatisPlusDemo;
import com.tangkc.business.job.dataobject.StudentDO;
import com.tangkc.business.job.dto.ClassStudensDTO;
import com.tangkc.business.job.mapper.ClassMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

/**
 * @author tangkc
 * @description
 * @date 2020/10/28 18:55
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = MyBatisPlusDemo.class)
public class JobServiceTest {
    @Autowired
    JobService jobService;
    @Autowired
    ClassMapper classMapper;

    @Test
    public void testSelectAll(){
        List<ClassStudensDTO> classStudensDTOS = classMapper.selectClassStudens();

        classStudensDTOS.forEach(info->{
            String className = info.getClassName();
            List<StudentDO> students = info.getStudents();
            System.out.println(String.format("%s===>%s",className,students.toString()));
        });


    }
}
