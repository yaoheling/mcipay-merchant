/*
 Navicat Premium Data Transfer

 Source Server         : localhost
 Source Server Type    : MySQL
 Source Server Version : 50717
 Source Host           : localhost
 Source Database       : merchant

 Target Server Type    : MySQL
 Target Server Version : 50717
 File Encoding         : utf-8

 Date: 06/15/2018 21:04:52 PM
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
--  Table structure for `email_black_list`
-- ----------------------------
DROP TABLE IF EXISTS `email_black_list`;
CREATE TABLE `email_black_list` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `email` varchar(64) NOT NULL COMMENT '邮箱地址',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  `update_time` datetime DEFAULT NULL COMMENT '更新时间',
  `status` varchar(2) DEFAULT '1' COMMENT '0：白名单；1：黑名单',
  PRIMARY KEY (`id`),
  UNIQUE KEY `index_email` (`email`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8;

-- ----------------------------
--  Records of `email_black_list`
-- ----------------------------
BEGIN;
INSERT INTO `email_black_list` VALUES ('2', '1234@123.com', '2018-06-12 20:30:32', '2018-06-12 20:30:32', '1'), ('6', '1', '2018-06-12 20:46:13', '2018-06-12 20:46:13', '1'), ('7', '2', '2018-06-12 20:46:13', '2018-06-12 20:46:13', '1'), ('8', '3', '2018-06-12 20:46:13', '2018-06-12 20:46:13', '1'), ('9', '4', '2018-06-12 20:46:13', '2018-06-12 20:46:13', '1');
COMMIT;

-- ----------------------------
--  Table structure for `right`
-- ----------------------------
DROP TABLE IF EXISTS `right`;
CREATE TABLE `right` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(32) DEFAULT NULL,
  `parent_id` int(11) DEFAULT NULL,
  `value` varchar(64) DEFAULT NULL COMMENT 'url',
  `type` int(1) DEFAULT NULL COMMENT '1：菜单；2：按钮',
  `status` int(1) DEFAULT NULL COMMENT '1：启用，2：禁用，3：删除',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='权限';

-- ----------------------------
--  Table structure for `role`
-- ----------------------------
DROP TABLE IF EXISTS `role`;
CREATE TABLE `role` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(64) DEFAULT NULL COMMENT '角色名称',
  `user_id` int(11) NOT NULL COMMENT '所属用户ID',
  `status` int(1) DEFAULT NULL COMMENT '1：启用，2：禁用，3：删除',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  PRIMARY KEY (`id`),
  UNIQUE KEY `index_name` (`name`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='角色';

-- ----------------------------
--  Table structure for `role_right`
-- ----------------------------
DROP TABLE IF EXISTS `role_right`;
CREATE TABLE `role_right` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `role_id` int(11) DEFAULT NULL COMMENT '角色ID',
  `right_id` int(11) DEFAULT NULL COMMENT '权限ID',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='角色和功能菜单关系';

-- ----------------------------
--  Table structure for `user_role`
-- ----------------------------
DROP TABLE IF EXISTS `user_role`;
CREATE TABLE `user_role` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `user_id` int(11) DEFAULT NULL COMMENT '用户ID',
  `role_id` int(11) DEFAULT NULL COMMENT '角色ID',
  PRIMARY KEY (`id`),
  UNIQUE KEY `index_user_role_id` (`user_id`,`role_id`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='用户和角色关系';

-- ----------------------------
--  Table structure for `users`
-- ----------------------------
DROP TABLE IF EXISTS `users`;
CREATE TABLE `users` (
  `id` int(20) NOT NULL AUTO_INCREMENT,
  `username` varchar(32) NOT NULL COMMENT '登陆用户名',
  `password` varchar(64) NOT NULL COMMENT '密码',
  `name` varchar(64) NOT NULL COMMENT '名称',
  `email` varchar(64) DEFAULT NULL COMMENT '邮箱',
  `phone` varchar(16) DEFAULT NULL COMMENT '手机号码',
  `status` int(1) DEFAULT NULL COMMENT '1：启用，2：禁用，3：删除',
  `parent_id` int(11) NOT NULL COMMENT '子账户的父级账户id；-1：主账户；',
  `type` int(1) NOT NULL COMMENT '用户类型，1：管理员；2：商户',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  `login_ip` varchar(32) DEFAULT NULL COMMENT '登录IP',
  `login_address` varchar(256) DEFAULT NULL COMMENT '登录所在地',
  `login_time` datetime DEFAULT NULL COMMENT '登录时间',
  `last_login_time` datetime DEFAULT NULL COMMENT '上次登录时间',
  PRIMARY KEY (`id`),
  UNIQUE KEY `index_username` (`username`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='用户';

SET FOREIGN_KEY_CHECKS = 1;
