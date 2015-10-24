CREATE TABLE `user_info` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `realname` varchar(20) NOT NULL,
  `loginname` varchar(20) NOT NULL,
  `pw` varchar(64) NOT NULL,
  `email` varchar(50) DEFAULT NULL,
  `phone` varchar(20) DEFAULT NULL,
  `regtime` datetime DEFAULT CURRENT_TIMESTAMP,
  `lastlogintime` datetime DEFAULT NULL,
  `birthday` datetime DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;


