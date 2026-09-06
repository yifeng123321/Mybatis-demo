-- ============================================================
-- Mybatis 入门案例 —— 数据库初始化脚本
-- 执行方式：在 MySQL 命令行或客户端（Navicat/DataGrip/IDEA）中整体执行本脚本
-- 说明：脚本可重复执行，会先删除旧表再重建
-- ============================================================

-- 1. 创建数据库（不存在时创建）
CREATE DATABASE IF NOT EXISTS `User_db`
  DEFAULT CHARACTER SET utf8mb4;

USE `User_db`;

-- 2. 删除旧表（便于重复执行本脚本）
DROP TABLE IF EXISTS `user`;

-- 3. 创建用户表
CREATE TABLE `user` (
  `id`         int(11)      NOT NULL AUTO_INCREMENT,
  `username`   varchar(255) NOT NULL,
  `password`   varchar(255) NOT NULL,
  `email`      varchar(255) NOT NULL,
  `created_at` datetime     NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `updated_at` datetime     NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`),
  UNIQUE KEY `username` (`username`),
  UNIQUE KEY `email` (`email`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- 4. 添加测试数据 10 条
INSERT INTO `user` (`username`, `password`, `email`) VALUES
 ('testuser1',  'password123', 'testuser1@example.com'),
 ('testuser2',  'password456', 'testuser2@example.com'),
 ('testuser3',  'password789', 'testuser3@example.com'),
 ('testuser4',  'password123', 'testuser4@example.com'),
 ('testuser5',  'password123', 'testuser5@example.com'),
 ('testuser6',  'password456', 'testuser6@example.com'),
 ('testuser7',  'password789', 'testuser7@example.com'),
 ('testuser8',  'password123', 'testuser8@example.com'),
 ('testuser9',  'password456', 'testuser9@example.com'),
 ('testuser10', 'password123', 'testuser10@example.com');
