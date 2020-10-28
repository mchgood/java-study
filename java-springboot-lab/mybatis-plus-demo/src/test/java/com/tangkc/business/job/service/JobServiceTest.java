package com.tangkc.business.job.service;

import com.tangkc.MyBatisPlusDemo;
import com.tangkc.business.job.dataobject.Job;
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

    @Test
    public void testSelectAll(){
        List<Job> list = jobService.list();
        list.forEach(info->{
            System.out.println(info);
        });
    }
}
