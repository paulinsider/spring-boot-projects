package com.site.springboot.core.dao;

import com.site.springboot.core.entity.File;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 文件DAO接口
 */
@Mapper
public interface FileDao {
    
    /**
     * 查询所有文件列表
     * @return 文件列表
     */
    List<File> selectFileList();
    
    /**
     * 根据文件类型查询文件列表
     * @param fileType 文件类型
     * @return 文件列表
     */
    List<File> selectFileListByType(@Param("fileType") String fileType);
    
    /**
     * 根据文件名模糊查询
     * @param fileName 文件名
     * @return 文件列表
     */
    List<File> selectFileListByName(@Param("fileName") String fileName);
    
    /**
     * 插入文件记录
     * @param file 文件对象
     * @return 影响行数
     */
    int insertFile(File file);
    
    /**
     * 根据ID删除文件记录
     * @param fileId 文件ID
     * @return 影响行数
     */
    int deleteFileById(@Param("fileId") Long fileId);
} 