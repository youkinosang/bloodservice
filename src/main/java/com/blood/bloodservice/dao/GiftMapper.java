package com.blood.bloodservice.dao;

import com.blood.bloodservice.entity.Gift;
import com.blood.bloodservice.entity.GiftExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GiftMapper {
    int countByExample(GiftExample example);

    int deleteByExample(GiftExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Gift record);

    int insertSelective(Gift record);

    List<Gift> selectByExample(GiftExample example);

    Gift selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Gift record, @Param("example") GiftExample example);

    int updateByExample(@Param("record") Gift record, @Param("example") GiftExample example);

    int updateByPrimaryKeySelective(Gift record);

    int updateByPrimaryKey(Gift record);
}