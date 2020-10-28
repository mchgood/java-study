package com.tangkc.business.job.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.tangkc.business.job.dataobject.Job;
import com.tangkc.business.job.mapper.JobMapper;
import com.tangkc.business.job.service.JobService;
import org.springframework.stereotype.Service;
@Service
public class JobServiceImpl extends ServiceImpl<JobMapper, Job> implements JobService{

}
