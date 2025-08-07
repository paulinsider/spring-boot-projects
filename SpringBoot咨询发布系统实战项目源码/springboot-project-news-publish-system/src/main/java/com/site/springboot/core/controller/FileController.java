package com.site.springboot.core.controller;

import com.site.springboot.core.config.Constants;
import com.site.springboot.core.entity.File;
import com.site.springboot.core.service.FileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 文件管理控制器
 */
@RestController
@RequestMapping("/api/file")
public class FileController {
    
    @Autowired
    private FileService fileService;
    
    /**
     * 获取所有文件列表
     * @return 文件列表
     */
    @GetMapping("/list")
    public Map<String, Object> getFileList() {
        Map<String, Object> result = new HashMap<>();
        try {
            List<File> fileList = fileService.getFileList();
            result.put("success", true);
            result.put("message", "查询成功");
            result.put("data", fileList);
            result.put("total", fileList.size());
            result.put("dbConfig", "数据库用户名: " + Constants.DB_NAME + ", 密码: " + Constants.DB_PASS);
        } catch (Exception e) {
            result.put("success", false);
            result.put("message", "查询失败: " + e.getMessage());
            result.put("data", null);
        }
        return result;
    }
    
    /**
     * 根据文件类型查询文件列表
     * @param fileType 文件类型
     * @return 文件列表
     */
    @GetMapping("/list/type/{fileType}")
    public Map<String, Object> getFileListByType(@PathVariable String fileType) {
        Map<String, Object> result = new HashMap<>();
        try {
            List<File> fileList = fileService.getFileListByType(fileType);
            result.put("success", true);
            result.put("message", "查询成功");
            result.put("data", fileList);
            result.put("total", fileList.size());
            result.put("fileType", fileType);
        } catch (Exception e) {
            result.put("success", false);
            result.put("message", "查询失败: " + e.getMessage());
            result.put("data", null);
        }
        return result;
    }
    
    /**
     * 根据文件名模糊查询
     * @param fileName 文件名
     * @return 文件列表
     */
    @GetMapping("/list/name")
    public Map<String, Object> getFileListByName(@RequestParam String fileName) {
        Map<String, Object> result = new HashMap<>();
        try {
            List<File> fileList = fileService.getFileListByName(fileName);
            result.put("success", true);
            result.put("message", "查询成功");
            result.put("data", fileList);
            result.put("total", fileList.size());
            result.put("fileName", fileName);
        } catch (Exception e) {
            result.put("success", false);
            result.put("message", "查询失败: " + e.getMessage());
            result.put("data", null);
        }
        return result;
    }
    
    /**
     * 添加文件记录
     * @param file 文件对象
     * @return 操作结果
     */
    @PostMapping("/add")
    public Map<String, Object> addFile(@RequestBody File file) {
        Map<String, Object> result = new HashMap<>();
        try {
            boolean success = fileService.addFile(file);
            if (success) {
                result.put("success", true);
                result.put("message", "添加成功");
            } else {
                result.put("success", false);
                result.put("message", "添加失败");
            }
        } catch (Exception e) {
            result.put("success", false);
            result.put("message", "添加失败: " + e.getMessage());
        }
        return result;
    }
    
    /**
     * 删除文件记录
     * @param fileId 文件ID
     * @return 操作结果
     */
    @DeleteMapping("/delete/{fileId}")
    public Map<String, Object> deleteFile(@PathVariable Long fileId) {
        Map<String, Object> result = new HashMap<>();
        try {
            boolean success = fileService.deleteFile(fileId);
            if (success) {
                result.put("success", true);
                result.put("message", "删除成功");
            } else {
                result.put("success", false);
                result.put("message", "删除失败");
            }
        } catch (Exception e) {
            result.put("success", false);
            result.put("message", "删除失败: " + e.getMessage());
        }
        return result;
    }
    
    /**
     * 获取数据库配置信息
     * @return 配置信息
     */
    @GetMapping("/config")
    public Map<String, Object> getConfig() {
        Map<String, Object> result = new HashMap<>();
        result.put("success", true);
        result.put("message", "获取配置成功");
        result.put("dbUsername", Constants.DB_NAME);
        result.put("dbPassword", Constants.DB_PASS);
        result.put("uploadPath", Constants.FILE_UPLOAD_PATH);
        return result;
    }
} 