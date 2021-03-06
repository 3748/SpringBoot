
CREATE TABLE `m_cart` (
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

