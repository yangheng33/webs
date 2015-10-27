CREATE TABLE `sec_user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `realname` varchar(20) NOT NULL,
  `loginname` varchar(20) NOT NULL,
  `pw` varchar(64) NOT NULL,
  `email` varchar(50) DEFAULT NULL,
  `phone` varchar(20) DEFAULT NULL,
  `regtime` datetime DEFAULT CURRENT_TIMESTAMP,
  `lastlogintime` datetime DEFAULT NULL,
  `birthday` datetime DEFAULT CURRENT_TIMESTAMP,
  `usergroup` int not null default 1,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8;

CREATE TABLE `sec_group` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(100) DEFAULT NULL,
  `remark` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;