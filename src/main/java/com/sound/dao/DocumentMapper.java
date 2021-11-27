package com.sound.dao;

import com.sound.entity.Document;

public interface DocumentMapper {
    int deleteByPrimaryKey(String documentId);

    int insert(Document record);

    int insertSelective(Document record);

    Document selectByPrimaryKey(String documentId);

    int updateByPrimaryKeySelective(Document record);

    int updateByPrimaryKeyWithBLOBs(Document record);

    int updateByPrimaryKey(Document record);
}