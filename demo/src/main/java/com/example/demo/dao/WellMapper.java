package com.example.demo.dao;

import com.example.demo.entity.Well;
import com.example.demo.entity.WellExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface WellMapper {
    long countByExample(WellExample example);

    int deleteByExample(WellExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Well record);

    int insertSelective(Well record);

    List<Well> selectByExample(WellExample example);
    List<Well> listwell();


    Well selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Well record, @Param("example") WellExample example);

    int updateByExample(@Param("record") Well record, @Param("example") WellExample example);

    int updateByPrimaryKeySelective(Well record);

    int updateByPrimaryKey(Well record);

}