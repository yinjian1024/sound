package com.sound.dao;

import com.sound.entity.DocumentTypeAttr;
import com.sound.entity.DocumentTypeAttrExample;
import com.sound.entity.DocumentTypeAttrKey;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface DocumentTypeAttrMapper {
    long countByExample(DocumentTypeAttrExample example);

    int deleteByExample(DocumentTypeAttrExample example);

    int deleteByPrimaryKey(DocumentTypeAttrKey key);

    int insert(DocumentTypeAttr record);

    int insertSelective(DocumentTypeAttr record);

    List<DocumentTypeAttr> selectByExample(DocumentTypeAttrExample example);

    DocumentTypeAttr selectByPrimaryKey(DocumentTypeAttrKey key);

    int updateByExampleSelective(@Param("record") DocumentTypeAttr record, @Param("example") DocumentTypeAttrExample example);

    int updateByExample(@Param("record") DocumentTypeAttr record, @Param("example") DocumentTypeAttrExample example);

    int updateByPrimaryKeySelective(DocumentTypeAttr record);

    int updateByPrimaryKey(DocumentTypeAttr record);
}