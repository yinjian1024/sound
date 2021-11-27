package entity;

import java.io.Serializable;
import java.util.Date;

public class Document implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column document.DOCUMENT_ID
     *
     * @mbg.generated
     */
    private String documentId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column document.DOCUMENT_TYPE_ID
     *
     * @mbg.generated
     */
    private String documentTypeId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column document.DATE_CREATED
     *
     * @mbg.generated
     */
    private Date dateCreated;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column document.COMMENTS
     *
     * @mbg.generated
     */
    private String comments;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column document.DOCUMENT_LOCATION
     *
     * @mbg.generated
     */
    private String documentLocation;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column document.DOCUMENT_TEXT
     *
     * @mbg.generated
     */
    private String documentText;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column document.LAST_UPDATED_STAMP
     *
     * @mbg.generated
     */
    private Date lastUpdatedStamp;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column document.LAST_UPDATED_TX_STAMP
     *
     * @mbg.generated
     */
    private Date lastUpdatedTxStamp;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column document.CREATED_STAMP
     *
     * @mbg.generated
     */
    private Date createdStamp;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column document.CREATED_TX_STAMP
     *
     * @mbg.generated
     */
    private Date createdTxStamp;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column document.IMAGE_DATA
     *
     * @mbg.generated
     */
    private byte[] imageData;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table document
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column document.DOCUMENT_ID
     *
     * @return the value of document.DOCUMENT_ID
     *
     * @mbg.generated
     */
    public String getDocumentId() {
        return documentId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column document.DOCUMENT_ID
     *
     * @param documentId the value for document.DOCUMENT_ID
     *
     * @mbg.generated
     */
    public void setDocumentId(String documentId) {
        this.documentId = documentId == null ? null : documentId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column document.DOCUMENT_TYPE_ID
     *
     * @return the value of document.DOCUMENT_TYPE_ID
     *
     * @mbg.generated
     */
    public String getDocumentTypeId() {
        return documentTypeId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column document.DOCUMENT_TYPE_ID
     *
     * @param documentTypeId the value for document.DOCUMENT_TYPE_ID
     *
     * @mbg.generated
     */
    public void setDocumentTypeId(String documentTypeId) {
        this.documentTypeId = documentTypeId == null ? null : documentTypeId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column document.DATE_CREATED
     *
     * @return the value of document.DATE_CREATED
     *
     * @mbg.generated
     */
    public Date getDateCreated() {
        return dateCreated;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column document.DATE_CREATED
     *
     * @param dateCreated the value for document.DATE_CREATED
     *
     * @mbg.generated
     */
    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column document.COMMENTS
     *
     * @return the value of document.COMMENTS
     *
     * @mbg.generated
     */
    public String getComments() {
        return comments;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column document.COMMENTS
     *
     * @param comments the value for document.COMMENTS
     *
     * @mbg.generated
     */
    public void setComments(String comments) {
        this.comments = comments == null ? null : comments.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column document.DOCUMENT_LOCATION
     *
     * @return the value of document.DOCUMENT_LOCATION
     *
     * @mbg.generated
     */
    public String getDocumentLocation() {
        return documentLocation;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column document.DOCUMENT_LOCATION
     *
     * @param documentLocation the value for document.DOCUMENT_LOCATION
     *
     * @mbg.generated
     */
    public void setDocumentLocation(String documentLocation) {
        this.documentLocation = documentLocation == null ? null : documentLocation.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column document.DOCUMENT_TEXT
     *
     * @return the value of document.DOCUMENT_TEXT
     *
     * @mbg.generated
     */
    public String getDocumentText() {
        return documentText;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column document.DOCUMENT_TEXT
     *
     * @param documentText the value for document.DOCUMENT_TEXT
     *
     * @mbg.generated
     */
    public void setDocumentText(String documentText) {
        this.documentText = documentText == null ? null : documentText.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column document.LAST_UPDATED_STAMP
     *
     * @return the value of document.LAST_UPDATED_STAMP
     *
     * @mbg.generated
     */
    public Date getLastUpdatedStamp() {
        return lastUpdatedStamp;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column document.LAST_UPDATED_STAMP
     *
     * @param lastUpdatedStamp the value for document.LAST_UPDATED_STAMP
     *
     * @mbg.generated
     */
    public void setLastUpdatedStamp(Date lastUpdatedStamp) {
        this.lastUpdatedStamp = lastUpdatedStamp;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column document.LAST_UPDATED_TX_STAMP
     *
     * @return the value of document.LAST_UPDATED_TX_STAMP
     *
     * @mbg.generated
     */
    public Date getLastUpdatedTxStamp() {
        return lastUpdatedTxStamp;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column document.LAST_UPDATED_TX_STAMP
     *
     * @param lastUpdatedTxStamp the value for document.LAST_UPDATED_TX_STAMP
     *
     * @mbg.generated
     */
    public void setLastUpdatedTxStamp(Date lastUpdatedTxStamp) {
        this.lastUpdatedTxStamp = lastUpdatedTxStamp;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column document.CREATED_STAMP
     *
     * @return the value of document.CREATED_STAMP
     *
     * @mbg.generated
     */
    public Date getCreatedStamp() {
        return createdStamp;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column document.CREATED_STAMP
     *
     * @param createdStamp the value for document.CREATED_STAMP
     *
     * @mbg.generated
     */
    public void setCreatedStamp(Date createdStamp) {
        this.createdStamp = createdStamp;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column document.CREATED_TX_STAMP
     *
     * @return the value of document.CREATED_TX_STAMP
     *
     * @mbg.generated
     */
    public Date getCreatedTxStamp() {
        return createdTxStamp;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column document.CREATED_TX_STAMP
     *
     * @param createdTxStamp the value for document.CREATED_TX_STAMP
     *
     * @mbg.generated
     */
    public void setCreatedTxStamp(Date createdTxStamp) {
        this.createdTxStamp = createdTxStamp;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column document.IMAGE_DATA
     *
     * @return the value of document.IMAGE_DATA
     *
     * @mbg.generated
     */
    public byte[] getImageData() {
        return imageData;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column document.IMAGE_DATA
     *
     * @param imageData the value for document.IMAGE_DATA
     *
     * @mbg.generated
     */
    public void setImageData(byte[] imageData) {
        this.imageData = imageData;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table document
     *
     * @mbg.generated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", documentId=").append(documentId);
        sb.append(", documentTypeId=").append(documentTypeId);
        sb.append(", dateCreated=").append(dateCreated);
        sb.append(", comments=").append(comments);
        sb.append(", documentLocation=").append(documentLocation);
        sb.append(", documentText=").append(documentText);
        sb.append(", lastUpdatedStamp=").append(lastUpdatedStamp);
        sb.append(", lastUpdatedTxStamp=").append(lastUpdatedTxStamp);
        sb.append(", createdStamp=").append(createdStamp);
        sb.append(", createdTxStamp=").append(createdTxStamp);
        sb.append(", imageData=").append(imageData);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}