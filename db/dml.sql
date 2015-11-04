--INSERT INTO sec_user(realname, loginname, pw, email, phone, lastlogintime,usergroup)VALUES('amar', 'sam', PASSWORD('123456'), 'qq.com', '139', CURRENT_TIMESTAMP,2);
INSERT INTO sec_user(realname, loginname, pw, email, phone, lastlogintime,usergroup)VALUES('amar', 'sam', '123456', 'qq.com', '139', CURRENT_TIMESTAMP,2);

insert into sec_group values(1,'common user','');
insert into sec_group values(2,'admin user','');
insert into sec_group values(3,'edit user','');
