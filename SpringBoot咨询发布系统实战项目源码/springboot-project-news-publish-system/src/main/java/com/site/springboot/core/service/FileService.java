package com.site.springboot.core.service;

import com.site.springboot.core.entity.File;

import java.util.List;

/**
 * 文件服务接口
 */
public interface FileService {
    
    /**
     * 获取所有文件列表
     * @return 文件列表
     */
    List<File> getFileList();
    
    /**
     * 根据文件类型获取文件列表
     * @param fileType 文件类型
     * @return 文件列表
     */
    List<File> getFileListByType(String fileType);
    
    /**
     * 根据文件名模糊查询文件列表
     * @param fileName 文件名
     * @return 文件列表
     */
    List<File> getFileListByName(String fileName);
    
    /**
     * 添加文件记录
     * @param file 文件对象
     * @return 是否成功
     */
    boolean addFile(File file);
    
    /**
     * 删除文件记录
     * @param fileId 文件ID
     * @return 是否成功
     */
    boolean deleteFile(Long fileId);
} 