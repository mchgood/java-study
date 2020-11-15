package com.tangkc.business.job.service.impl;

import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.tangkc.business.job.dataobject.ClassDO;
import com.tangkc.business.job.mapper.ClassMapper;
import com.tangkc.business.job.service.ClassService;

@Service
public class ClassServiceImpl extends ServiceImpl<ClassMapper, ClassDO> implements ClassService {

}


