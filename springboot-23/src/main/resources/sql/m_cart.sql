/*
Navicat MySQL Data Transfer

Source Server         : Localhost:3306
Source Server Version : 50622
Source Host           : localhost:3306
Source Database       : mall

Target Server Type    : MYSQL
Target Server Version : 50622
File Encoding         : 65001

Date: 2018-12-10 15:29:06
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `m_cart`
-- ----------------------------
DROP TABLE IF EXISTS `m_cart`;
CREATE TABLE `m_cart_sql` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '自增ID',
  `user_id` bigint(20) DEFAULT NULL COMMENT '用户ID',
  `item_id` bigint(20) DEFAULT NULL COMMENT '商品ID',
  `item_title` varchar(100) DEFAULT NULL COMMENT '商品标题',
  `item_image` varchar(500) DEFAULT NULL COMMENT '商品主图',
  `item_price` bigint(20) DEFAULT NULL COMMENT '商品价格，单位为：分',
  `num` int(10) DEFAULT NULL COMMENT '购买数量',
  `create_time` bigint(14) DEFAULT NULL,
  `update_time` bigint(14) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `userId_itemId` (`user_id`,`item_id`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='购物车模块';

-- ----------------------------
-- Records of m_cart
-- ----------------------------
