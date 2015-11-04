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

CREATE TABLE `news` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `editorid` int(11) NOT NULL COMMENT '谁编辑的',
  `starttime` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '第一次保存时间',
  `releasetime` datetime DEFAULT NULL COMMENT '发布时间',
  `lastedittime` datetime DEFAULT CURRENT_TIMESTAMP COMMENT '最后编辑时间',
  `status` int(11) NOT NULL DEFAULT '1' COMMENT '1草稿;2审核中;3正在发布;4下架',
  `title` varchar(200) NOT NULL COMMENT '标题',
  `content` varchar(10000) NOT NULL COMMENT '正文',
  `categoryid` int(11) NOT NULL DEFAULT '1' COMMENT '类别表,预留,1热门',
  `titlepic` varchar(200) NOT NULL COMMENT '标题缩略图路径',
  `sourceby` varchar(200) DEFAULT NULL COMMENT '出处，原创，转载自',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8