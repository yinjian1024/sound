package com.sound.dao;

import com.sound.entity.DocumentType;
import com.sound.entity.DocumentTypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DocumentTypeMapper {
    long countByExample(DocumentTypeExample example);

    int deleteByExample(DocumentTypeExample example);

    int deleteByPrimaryKey(String documentTypeId);

    int insert(DocumentType record);

    int insertSelective(DocumentType record);

    List<DocumentType> selectByExample(DocumentTypeExample example);

    DocumentType selectByPrimaryKey(String documentTypeId);

    int updateByExampleSelective(@Param("record") DocumentType record, @Param("example") DocumentTypeExample example);

    int updateByExample(@Param("record") DocumentType record, @Param("example") DocumentTypeExample example);

    int updateByPrimaryKeySelective(DocumentType record);

    int updateByPrimaryKey(DocumentType record);
}