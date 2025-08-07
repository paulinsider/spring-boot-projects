package com.site.springboot.core.entity;

import java.util.Date;

/**
 * 文件实体类
 */
public class File {
    
    private Long fileId;
    private String fileName;
    private String filePath;
    private String fileUrl;
    private String fileType;
    private Long fileSize;
    private Date createTime;
    private Date updateTime;
    
    public File() {}
    
    public File(String fileName, String filePath, String fileUrl, String fileType, Long fileSize) {
        this.fileName = fileName;
        this.filePath = filePath;
        this.fileUrl = fileUrl;
        this.fileType = fileType;
        this.fileSize = fileSize;
    }
    
    // Getters and Setters
    public Long getFileId() {
        return fileId;
    }
    
    public void setFileId(Long fileId) {
        this.fileId = fileId;
    }
    
    public String getFileName() {
        return fileName;
    }
    
    public void setFileName(String fileName) {
        this.fileName = fileName;
    }
    
    public String getFilePath() {
        return filePath;
    }
    
    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }
    
    public String getFileUrl() {
        return fileUrl;
    }
    
    public void setFileUrl(String fileUrl) {
        this.fileUrl = fileUrl;
    }
    
    public String getFileType() {
        return fileType;
    }
    
    public void setFileType(String fileType) {
        this.fileType = fileType;
    }
    
    public Long getFileSize() {
        return fileSize;
    }
    
    public void setFileSize(Long fileSize) {
        this.fileSize = fileSize;
    }
    
    public Date getCreateTime() {
        return createTime;
    }
    
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
    
    public Date getUpdateTime() {
        return updateTime;
    }
    
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
    
    @Override
    public String toString() {
        return "File{" +
                "fileId=" + fileId +
                ", fileName='" + fileName + '\'' +
                ", filePath='" + filePath + '\'' +
                ", fileUrl='" + fileUrl + '\'' +
                ", fileType='" + fileType + '\'' +
                ", fileSize=" + fileSize +
                ", createTime=" + createTime +
                ", updateTime=" + updateTime +
                '}';
    }
} 