package com.sound.service;

import com.sound.dao.DocumentAttributeMapper;
import com.sound.dao.DocumentMapper;
import com.sound.dao.DocumentTypeAttrMapper;
import com.sound.dao.DocumentTypeMapper;
import com.sound.entity.Document;
import com.sound.entity.DocumentAttribute;
import com.sound.entity.DocumentType;
import com.sound.entity.DocumentTypeAttr;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@Service
@Transactional
public class ArticleService {

    @Autowired
    private DocumentMapper documentMapper;

    @Autowired
    private DocumentAttributeMapper documentAttributeMapper;

    @Autowired
    private DocumentTypeMapper documentTypeMapper;

    @Autowired
    private DocumentTypeAttrMapper documentTypeAttrMapper;

    public Map<String,Object> createArticle(Map<String,Object> params){


        String author = (String) params.get("author");
        String classify = (String) params.get("classify");
        String content = (String) params.get("content");
        String title = (String) params.get("title");
        String status = (String) params.get("status");
        String content_short = (String) params.get("content_short");
        String source_uri = (String) params.get("source_uri");
        String platforms = (String) params.get("platforms");
        String importance = (String) params.get("importance");
        String image_uri = (String) params.get("image_uri");
        String id = (String) params.get("id");
        String display_time = (String) params.get("display_time");
        String comment_disabled = (String) params.get("comment_disabled");


        String hasTable = "";
        if("draft".equals(status)){
            hasTable = "0";
        } else if("published".equals(status)){
            hasTable = "1";
        }


        String documentTypeId = "";
        if("java".equals(classify)){
            documentTypeId = "1";
        }




        String uuid = String.valueOf(System.currentTimeMillis());


        // document
        String document_documentId = uuid; // 内容ID
        String document_documentTypeId = documentTypeId; //内容类型ID
        Date document_dateCreated = new Date(); //创建日期
        String document_comments = content_short;//总结
        String document_documentLocation = source_uri;//文档地址
        String document_documentText = title;//标题
        String document_imageData = content;//内容

        // documentAttribute
        String documentAttribute_documentId = uuid;//内容ID
        String documentAttribute_attrName = "author";//属性名称-作者
        String documentAttribute_attrValue = author;//属性值
        String documentAttribute_attrDescription = "作者";//属性描述

        // documentType
        String documentType_documentTypeId = documentTypeId;//标题/菜单类型
        String documentType_parentTypeId = "ROOT";//父级标题
        String documentType_hasTable = hasTable;//状态：0-保存、1-发布、2-上传
        String documentType_description = "1";//菜单类型：1-标题、2-文章

        // documentTypeAttr
        String documentTypeAttr_documentTypeId = documentTypeId;//标题/菜单类型
        String documentTypeAttr_attrName = title;//标题/菜单名称
        String documentTypeAttr_description = "";//标题/菜单描述


        // 创建 document
        Document document = new Document();
        document.setDocumentId(document_documentId); // 内容ID
        document.setDocumentTypeId(document_documentTypeId);//内容类型ID
        document.setDateCreated(document_dateCreated);//创建日期
        document.setComments(document_comments);//总结
        document.setDocumentLocation(document_documentLocation);//文档地址
        document.setDocumentText(document_documentText);//标题
        document.setImageData(document_imageData);//内容
        documentMapper.insertSelective(document);

        // 创建 documentAttribute
        DocumentAttribute documentAttribute = new DocumentAttribute();
        documentAttribute.setDocumentId(documentAttribute_documentId);
        documentAttribute.setAttrName(documentAttribute_attrName);
        documentAttribute.setAttrValue(documentAttribute_attrValue);
        documentAttribute.setAttrDescription(documentAttribute_attrDescription);
        documentAttributeMapper.insertSelective(documentAttribute);

        // 创建 documentType
        DocumentType documentType = new DocumentType();
        documentType.setDocumentTypeId(documentType_documentTypeId);
        documentType.setParentTypeId(documentType_parentTypeId);
        documentType.setHasTable(documentType_hasTable);
        documentType.setDescription(documentType_description);
        documentTypeMapper.insertSelective(documentType);

        // 创建 documentTypeAttr
        DocumentTypeAttr documentTypeAttr = new DocumentTypeAttr();
        documentTypeAttr.setDocumentTypeId(documentTypeAttr_documentTypeId);
        documentTypeAttr.setAttrName(documentTypeAttr_attrName);
        documentTypeAttr.setDescription(documentTypeAttr_description);
        documentTypeAttrMapper.insertSelective(documentTypeAttr);

        Map<String,Object> returnMap = new HashMap<String,Object>();
        returnMap.put("status","0000");
        return returnMap;
    }


}
