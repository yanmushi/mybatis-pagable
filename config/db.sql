-- 使用mysql测试数据库
USE test;

-- 创建数据库表，测试使用
CREATE TABLE goods (
	id  int NULL AUTO_INCREMENT ,
	store  int NULL ,
	sn  varchar(128) NULL ,
	PRIMARY KEY (id)
);

-- 插入测试数据
insert into goods(store, sn) 
	values(111,'123123'), 
		  (222,'321321');