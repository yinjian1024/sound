package com.sound.dao;

import com.sound.entity.Document;
import java.util.List;

public interface DocumentMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table document
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(String documentId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table document
     *
     * @mbg.generated
     */
    int insert(Document record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table document
     *
     * @mbg.generated
     */
    Document selectByPrimaryKey(String documentId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table document
     *
     * @mbg.generated
     */
    List<Document> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table document
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(Document record);
}