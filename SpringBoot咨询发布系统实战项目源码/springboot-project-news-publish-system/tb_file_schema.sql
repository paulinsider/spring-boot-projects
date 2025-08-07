-- 创建文件表
CREATE TABLE IF NOT EXISTS `tb_file` (
  `file_id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '文件主键id',
  `file_name` varchar(200) NOT NULL DEFAULT '' COMMENT '文件名',
  `file_path` varchar(500) NOT NULL DEFAULT '' COMMENT '文件路径',
  `file_url` varchar(500) NOT NULL DEFAULT '' COMMENT '文件访问URL',
  `file_type` varchar(50) NOT NULL DEFAULT '' COMMENT '文件类型',
  `file_size` bigint(20) NOT NULL DEFAULT '0' COMMENT '文件大小(字节)',
  `create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `update_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '修改时间',
  PRIMARY KEY (`file_id`),
  KEY `idx_file_type` (`file_type`),
  KEY `idx_create_time` (`create_time`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8 COMMENT='文件信息表';

-- 插入一些测试数据
INSERT INTO `tb_file` (`file_name`, `file_path`, `file_url`, `file_type`, `file_size`) VALUES
('test-image-1.jpg', '/home/project/upload/images/test-image-1.jpg', 'http://localhost:8080/files/test-image-1.jpg', 'image/jpeg', 1024000),
('test-image-2.png', '/home/project/upload/images/test-image-2.png', 'http://localhost:8080/files/test-image-2.png', 'image/png', 2048000),
('test-document-1.pdf', '/home/project/upload/documents/test-document-1.pdf', 'http://localhost:8080/files/test-document-1.pdf', 'application/pdf', 512000),
('test-video-1.mp4', '/home/project/upload/videos/test-video-1.mp4', 'http://localhost:8080/files/test-video-1.mp4', 'video/mp4', 10485760),
('test-audio-1.mp3', '/home/project/upload/audios/test-audio-1.mp3', 'http://localhost:8080/files/test-audio-1.mp3', 'audio/mpeg', 3072000); 