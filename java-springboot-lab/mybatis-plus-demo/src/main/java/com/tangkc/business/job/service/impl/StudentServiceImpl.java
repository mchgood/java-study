package com.tangkc.business.job.service.impl;

import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.tangkc.business.job.mapper.StudentMapper;
import com.tangkc.business.job.dataobject.StudentDO;
import com.tangkc.business.job.service.StudentService;
@Service
public class StudentServiceImpl extends ServiceImpl<StudentMapper, StudentDO> implements StudentService{

}
