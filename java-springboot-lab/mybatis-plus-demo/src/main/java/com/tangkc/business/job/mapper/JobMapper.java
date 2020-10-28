package com.tangkc.business.job.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.tangkc.business.job.dataobject.Job;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface JobMapper extends BaseMapper<Job> {
}