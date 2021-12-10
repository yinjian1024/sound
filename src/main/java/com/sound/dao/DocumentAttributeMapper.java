package com.sound.dao;

import com.sound.entity.DocumentAttribute;
import com.sound.entity.DocumentAttributeExample;
import com.sound.entity.DocumentAttributeKey;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface DocumentAttributeMapper {
    long countByExample(DocumentAttributeExample example);

    int deleteByExample(DocumentAttributeExample example);

    int deleteByPrimaryKey(DocumentAttributeKey key);

    int insert(DocumentAttribute record);

    int insertSelective(DocumentAttribute record);

    List<DocumentAttribute> selectByExample(DocumentAttributeExample example);

    DocumentAttribute selectByPrimaryKey(DocumentAttributeKey key);

    int updateByExampleSelective(@Param("record") DocumentAttribute record, @Param("example") DocumentAttributeExample example);

    int updateByExample(@Param("record") DocumentAttribute record, @Param("example") DocumentAttributeExample example);

    int updateByPrimaryKeySelective(DocumentAttribute record);

    int updateByPrimaryKey(DocumentAttribute record);
}