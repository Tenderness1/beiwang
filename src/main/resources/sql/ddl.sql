SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for note
-- ----------------------------
DROP TABLE IF EXISTS `note`;
CREATE TABLE `note` (
  `note_id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `note_title` varchar(255) DEFAULT NULL,
  `begin_timing` date DEFAULT NULL,
  `end_timing` date DEFAULT NULL,
  `record_status` varchar(20) DEFAULT '0' COMMENT '记录状态 0未删除|1已删除',
  PRIMARY KEY (`note_id`)
) ENGINE=InnoDB AUTO_INCREMENT=62 DEFAULT CHARSET=utf8;