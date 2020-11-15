package com.tangkc.business.job.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.tangkc.business.job.dataobject.ClassDO;
import com.tangkc.business.job.dto.ClassStudensDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ClassMapper extends BaseMapper<ClassDO> {

    public List<ClassStudensDTO> selectClassStudens();
}