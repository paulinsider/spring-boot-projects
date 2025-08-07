package com.site.springboot.core.service.impl;

import com.site.springboot.core.dao.FileDao;
import com.site.springboot.core.entity.File;
import com.site.springboot.core.service.FileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 文件服务实现类
 */
@Service
public class FileServiceImpl implements FileService {
    
    @Autowired
    private FileDao fileDao;
    
    @Override
    public List<File> getFileList() {
        return fileDao.selectFileList();
    }
    
    @Override
    public List<File> getFileListByType(String fileType) {
        return fileDao.selectFileListByType(fileType);
    }
    
    @Override
    public List<File> getFileListByName(String fileName) {
        return fileDao.selectFileListByName(fileName);
    }
    
    @Override
    public boolean addFile(File file) {
        return fileDao.insertFile(file) > 0;
    }
    
    @Override
    public boolean deleteFile(Long fileId) {
        return fileDao.deleteFileById(fileId) > 0;
    }
} 