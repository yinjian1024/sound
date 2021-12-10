package com.sound.service.article;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.sound.dao.DocumentAttributeMapper;
import com.sound.dao.DocumentMapper;
import com.sound.dao.DocumentTypeAttrMapper;
import com.sound.dao.DocumentTypeMapper;
import com.sound.entity.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.*;

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
        List<Object> platforms = (List) params.get("platforms");
        Integer importance = (Integer) params.get("importance");
        String image_uri = (String) params.get("image_uri");
        Long id = (Long) params.get("id");
        String display_time = (String) params.get("display_time");
        Boolean comment_disabled = (Boolean) params.get("comment_disabled");

        String uuid = String.valueOf(id);

        // document
        String document_documentId = uuid; // 内容ID
        String document_documentTypeId = classify; //内容类型ID
        Date document_dateCreated = new Date(); //创建日期
        String document_comments = content_short;//总结
        String document_documentLocation = source_uri;//文档地址
        String document_documentText = title;//标题
        String document_imageData = content;//内容

        // documentAttribute_author
        String documentAttribute_documentId_author = uuid;//内容ID
        String documentAttribute_attrName_author = "author";//属性名称-作者
        String documentAttribute_attrValue_author = author;//属性值
        String documentAttribute_attrDescription_author = "作者";//属性描述

        // documentAttribute_importance
        String documentAttribute_documentId_importance = uuid;//内容ID
        String documentAttribute_attrName_importance = "importance";//属性名称-作者
        String documentAttribute_attrValue_importance = String.valueOf(importance);//属性值
        String documentAttribute_attrDescription_importance = "重要性";//属性描述

        // documentAttribute_status
        String documentAttribute_documentId_status = uuid;//内容ID
        String documentAttribute_attrName_status = "status";//属性名称-作者
        String documentAttribute_attrValue_status = status;//属性值
        String documentAttribute_attrDescription_status = "文章状态";//属性描述

        // documentAttribute_display_time
        String documentAttribute_documentId_display_time = uuid;//内容ID
        String documentAttribute_attrName_display_time = "display_time";//属性名称-作者
        String documentAttribute_attrValue_display_time = display_time;//属性值
        String documentAttribute_attrDescription_display_time = "发布时间";//属性描述

        // documentAttribute_display_comment_disabled
        String documentAttribute_documentId_display_comment_disabled = uuid;//内容ID
        String documentAttribute_attrName_display_comment_disabled = "comment_disabled";//属性名称-作者
        String documentAttribute_attrValue_display_comment_disabled = String.valueOf(comment_disabled);//属性值
        String documentAttribute_attrDescription_display_comment_disabled = "是否上传";//属性描述


//        // documentType
//        String documentType_documentTypeId = documentTypeId;//标题/菜单类型
//        String documentType_parentTypeId = "ROOT";//父级标题
//        String documentType_hasTable = "0";//状态：0-保存、1-发布、2-上传
//        String documentType_description = "1";//菜单类型：1-标题、2-文章
//
//        // documentTypeAttr
//        String documentTypeAttr_documentTypeId = documentTypeId;//标题/菜单类型
//        String documentTypeAttr_attrName = classify;//标题/菜单名称
//        String documentTypeAttr_description = "";//标题/菜单描述


        // 创建 document
        Document document = new Document();
        document.setDocumentId(document_documentId); // 内容ID
        document.setDocumentTypeId(document_documentTypeId);//内容类型ID
        document.setDateCreated(document_dateCreated);//创建日期
        document.setComments(document_comments);//总结
        document.setDocumentLocation(document_documentLocation);//文档地址
        document.setDocumentText(document_documentText);//标题
        document.setImageData(document_imageData);//内容

        if(null == documentMapper.selectByPrimaryKey(document_documentId)){
            documentMapper.insertSelective(document);
        } else {
            DocumentExample documentExample = new DocumentExample();
            documentExample.createCriteria().andDocumentIdEqualTo(document_documentId);
            documentMapper.updateByExampleWithBLOBs(document,documentExample);
        }



        // 创建 documentAttribute_author
        DocumentAttribute documentAttribute_author = new DocumentAttribute();
        documentAttribute_author.setDocumentId(documentAttribute_documentId_author);
        documentAttribute_author.setAttrName(documentAttribute_attrName_author);
        documentAttribute_author.setAttrValue(documentAttribute_attrValue_author);
        documentAttribute_author.setAttrDescription(documentAttribute_attrDescription_author);


        DocumentAttributeKey documentAttributeKey_author = new DocumentAttributeKey();
        documentAttributeKey_author.setDocumentId(documentAttribute_documentId_author);
        documentAttributeKey_author.setAttrName(documentAttribute_attrName_author);
        if(null == documentAttributeMapper.selectByPrimaryKey(documentAttributeKey_author)){
            documentAttributeMapper.insertSelective(documentAttribute_author);
        } else {
            DocumentAttributeExample documentAttributeExample_author = new DocumentAttributeExample();
            documentAttributeExample_author.createCriteria().andDocumentIdEqualTo(documentAttribute_documentId_author).andAttrNameEqualTo(documentAttribute_attrName_author);
            documentAttributeMapper.updateByExampleSelective(documentAttribute_author,documentAttributeExample_author);
        }

        // 创建 documentAttribute_importance
        DocumentAttribute documentAttribute_importance = new DocumentAttribute();
        documentAttribute_importance.setDocumentId(documentAttribute_documentId_importance);
        documentAttribute_importance.setAttrName(documentAttribute_attrName_importance);
        documentAttribute_importance.setAttrValue(documentAttribute_attrValue_importance);
        documentAttribute_importance.setAttrDescription(documentAttribute_attrDescription_importance);


        DocumentAttributeKey documentAttributeKey_importance = new DocumentAttributeKey();
        documentAttributeKey_importance.setDocumentId(documentAttribute_documentId_importance);
        documentAttributeKey_importance.setAttrName(documentAttribute_attrName_importance);
        if(null == documentAttributeMapper.selectByPrimaryKey(documentAttributeKey_importance)){
            documentAttributeMapper.insertSelective(documentAttribute_importance);
        } else {
            DocumentAttributeExample documentAttributeExample_importance = new DocumentAttributeExample();
            documentAttributeExample_importance.createCriteria().andDocumentIdEqualTo(documentAttribute_documentId_importance).andAttrNameEqualTo(documentAttribute_attrName_importance);
            documentAttributeMapper.updateByExampleSelective(documentAttribute_importance,documentAttributeExample_importance);
        }

        // 创建 documentAttribute_status
        DocumentAttribute documentAttribute_status = new DocumentAttribute();
        documentAttribute_status.setDocumentId(documentAttribute_documentId_status);
        documentAttribute_status.setAttrName(documentAttribute_attrName_status);
        documentAttribute_status.setAttrValue(documentAttribute_attrValue_status);
        documentAttribute_status.setAttrDescription(documentAttribute_attrDescription_status);


        DocumentAttributeKey documentAttributeKey_status = new DocumentAttributeKey();
        documentAttributeKey_status.setDocumentId(documentAttribute_documentId_status);
        documentAttributeKey_status.setAttrName(documentAttribute_attrName_status);
        if(null == documentAttributeMapper.selectByPrimaryKey(documentAttributeKey_status)){
            documentAttributeMapper.insertSelective(documentAttribute_status);
        } else {
            DocumentAttributeExample documentAttributeExample_status = new DocumentAttributeExample();
            documentAttributeExample_status.createCriteria().andDocumentIdEqualTo(documentAttribute_documentId_status).andAttrNameEqualTo(documentAttribute_attrName_status);
            documentAttributeMapper.updateByExampleSelective(documentAttribute_status,documentAttributeExample_status);
        }

        // 创建 documentAttribute_display_time
        DocumentAttribute documentAttribute_display_time = new DocumentAttribute();
        documentAttribute_display_time.setDocumentId(documentAttribute_documentId_display_time);
        documentAttribute_display_time.setAttrName(documentAttribute_attrName_display_time);
        documentAttribute_display_time.setAttrValue(documentAttribute_attrValue_display_time);
        documentAttribute_display_time.setAttrDescription(documentAttribute_attrDescription_display_time);


        DocumentAttributeKey documentAttributeKey_display_time = new DocumentAttributeKey();
        documentAttributeKey_display_time.setDocumentId(documentAttribute_documentId_display_time);
        documentAttributeKey_display_time.setAttrName(documentAttribute_attrName_display_time);
        if(null == documentAttributeMapper.selectByPrimaryKey(documentAttributeKey_display_time)){
            documentAttributeMapper.insertSelective(documentAttribute_display_time);
        } else {
            DocumentAttributeExample documentAttributeExample_display_time = new DocumentAttributeExample();
            documentAttributeExample_display_time.createCriteria().andDocumentIdEqualTo(documentAttribute_documentId_display_time).andAttrNameEqualTo(documentAttribute_attrName_display_time);
            documentAttributeMapper.updateByExampleSelective(documentAttribute_display_time,documentAttributeExample_display_time);
        }

        // 创建 documentAttribute_display_comment_disabled
        DocumentAttribute documentAttribute_display_comment_disabled = new DocumentAttribute();
        documentAttribute_display_comment_disabled.setDocumentId(documentAttribute_documentId_display_comment_disabled);
        documentAttribute_display_comment_disabled.setAttrName(documentAttribute_attrName_display_comment_disabled);
        documentAttribute_display_comment_disabled.setAttrValue(documentAttribute_attrValue_display_comment_disabled);
        documentAttribute_display_comment_disabled.setAttrDescription(documentAttribute_attrDescription_display_comment_disabled);


        DocumentAttributeKey documentAttributeKey_display_comment_disabled = new DocumentAttributeKey();
        documentAttributeKey_display_comment_disabled.setDocumentId(documentAttribute_documentId_display_comment_disabled);
        documentAttributeKey_display_comment_disabled.setAttrName(documentAttribute_attrName_display_comment_disabled);
        if(null == documentAttributeMapper.selectByPrimaryKey(documentAttributeKey_display_comment_disabled)){
            documentAttributeMapper.insertSelective(documentAttribute_display_comment_disabled);
        } else {
            DocumentAttributeExample documentAttributeExample_display_comment_disabled = new DocumentAttributeExample();
            documentAttributeExample_display_comment_disabled.createCriteria().andDocumentIdEqualTo(documentAttribute_documentId_display_comment_disabled).andAttrNameEqualTo(documentAttribute_attrName_display_comment_disabled);
            documentAttributeMapper.updateByExampleSelective(documentAttribute_display_comment_disabled,documentAttributeExample_display_comment_disabled);
        }


//
//        // 创建 documentType
//        DocumentType documentType = new DocumentType();
//        documentType.setDocumentTypeId(documentType_documentTypeId);
//        documentType.setParentTypeId(documentType_parentTypeId);
//        documentType.setHasTable(documentType_hasTable);
//        documentType.setDescription(documentType_description);
//
//        if(null == documentTypeMapper.selectByPrimaryKey(documentType_documentTypeId)){
//            documentTypeMapper.insertSelective(documentType);
//        } else {
//            documentTypeMapper.updateByPrimaryKey(documentType);
//        }
//
//
//        // 创建 documentTypeAttr
//        DocumentTypeAttr documentTypeAttr = new DocumentTypeAttr();
//        documentTypeAttr.setDocumentTypeId(documentTypeAttr_documentTypeId);
//        documentTypeAttr.setAttrName(documentTypeAttr_attrName);
//        documentTypeAttr.setDescription(documentTypeAttr_description);
//
//        DocumentTypeAttrKey documentTypeAttrKey = new DocumentTypeAttrKey();
//        documentTypeAttrKey.setDocumentTypeId(documentTypeAttr_documentTypeId);
//        documentTypeAttrKey.setAttrName(documentTypeAttr_attrName);
//
//        if(null == documentTypeAttrMapper.selectByPrimaryKey(documentTypeAttrKey)){
//            documentTypeAttrMapper.insertSelective(documentTypeAttr);
//        } else {
//            documentTypeAttrMapper.updateByPrimaryKey(documentTypeAttr);
//        }


        Map<String,Object> returnMap = new HashMap<String,Object>();
        returnMap.put("code",20000);
        returnMap.put("data","success");
        return returnMap;
    }


    public Map<String,Object> listArticle(Map<String,Object> params){


        Integer page = (Integer) params.get("page");
        Integer limit = (Integer) params.get("limit");
        String documentId = (String) params.get("documentId");

        //开启分页
        PageHelper.startPage(page,limit);


        DocumentExample documentExample = new DocumentExample();
        DocumentExample.Criteria criteria = documentExample.createCriteria();

//        documentExample.setOrderByClause("TO_NUMBER(DOCUMENT_ID) DESC");

        if(null != documentId){
            criteria.andDocumentIdEqualTo(documentId);
        }


        List<Document> documents = documentMapper.selectByExample(documentExample);

        //添加分页信息
        PageInfo<Document> pageInfo = new PageInfo<Document>(documents);

        long total = pageInfo.getTotal();

        List<Document> pageList = pageInfo.getList();


        List<Map<String,Object>> items = new ArrayList<Map<String,Object>>();


        for (Document document : pageList) {

            Map<String,Object> articleMap = new HashMap<String,Object>();

            articleMap.put("id",document.getDocumentId());

            // 查询文章属性表
            DocumentAttributeExample documentAttributeExample = new DocumentAttributeExample();
            documentAttributeExample.createCriteria().andDocumentIdEqualTo(document.getDocumentId());
            List<DocumentAttribute> documentAttributes = documentAttributeMapper.selectByExample(documentAttributeExample);
            // 动态添加属性
            for (DocumentAttribute documentAttribute : documentAttributes) {
                String attrName = documentAttribute.getAttrName();
                String attrValue = documentAttribute.getAttrValue();
                articleMap.put(attrName,attrValue);
            }
            articleMap.put("timestamp",document.getDateCreated().getTime());
            articleMap.put("title",document.getDocumentText());

            items.add(articleMap);

        }


        Map<String,Object> data = new HashMap<String,Object>();
        data.put("items",items);
        data.put("total",total);

        Map<String,Object> returnMap = new HashMap<String,Object>();
        returnMap.put("code",20000);
        returnMap.put("data",data);
        return returnMap;


    }

    public Map<String,Object> detailArticle(Long id){

        Document document = documentMapper.selectByPrimaryKey(String.valueOf(id));



        Map<String,Object> articleMap = new HashMap<String,Object>();
        // 查询文章属性表
        DocumentAttributeExample documentAttributeExample = new DocumentAttributeExample();
        documentAttributeExample.createCriteria().andDocumentIdEqualTo(document.getDocumentId());
        List<DocumentAttribute> documentAttributes = documentAttributeMapper.selectByExample(documentAttributeExample);
        // 动态添加属性
        for (DocumentAttribute documentAttribute : documentAttributes) {
            String attrName = documentAttribute.getAttrName();
            if("importance".equals(attrName)){
                Integer attrValue = Integer.valueOf(documentAttribute.getAttrValue());
                articleMap.put(attrName,attrValue);
            } else if("comment_disabled".equals(attrName)){
                Boolean attrValue = Boolean.valueOf(documentAttribute.getAttrValue());
                articleMap.put(attrName,attrValue);
            } else {
                String attrValue = documentAttribute.getAttrValue();
                articleMap.put(attrName,attrValue);
            }
        }


        articleMap.put("id",Long.valueOf(document.getDocumentId()));
        articleMap.put("classify",document.getDocumentTypeId());
        articleMap.put("title",document.getDocumentText());
        articleMap.put("content",document.getImageData());
        articleMap.put("content_short",document.getComments());
        articleMap.put("timestamp",document.getDateCreated().getTime());
        articleMap.put("source_uri",document.getDocumentLocation());


//                "comment_disabled": true,
//                "display_time": "1992-10-23 15:24:24",
//                "forecast": 46.26,
//                "image_uri": "https://wpimg.wallstcn.com/e4558086-631c-425c-9430-56ffb46e70b3",
//                "pageviews": 824,
//                "platforms": [
//        "a-platform"
//        ],
//        "reviewer": "Brian",
//                "type": "US"





        Map<String,Object> returnMap = new HashMap<String,Object>();
        returnMap.put("code",20000);
        returnMap.put("data",articleMap);
        return returnMap;
    }
}
