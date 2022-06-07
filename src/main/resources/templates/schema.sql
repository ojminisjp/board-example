CREATE TABLE tbl_board(
boardId Long auto_increment,
title varchar (30) not null,
content varchar (100) not null,
name varchar (30) not null,
read number (30) not null default 0,
primary key(boardId)
);
INSERT INTO tbl_board( title, content, name, read) VALUES ('title1', 'content1', 'name1', 0);
INSERT INTO tbl_board( title, content, name, read) VALUES ('title2', 'content2', 'name2', 0);
INSERT INTO tbl_board( title, content, name, read) VALUES ('title3', 'content3', 'name3', 0);
INSERT INTO tbl_board( title, content, name, read) VALUES ('title4', 'content4', 'name4', 0);
INSERT INTO tbl_board( title, content, name, read) VALUES ('title5', 'content5', 'name5', 0);
INSERT INTO tbl_board( title, content, name, read) VALUES ('title6', 'content6', 'name6', 0);
INSERT INTO tbl_board( title, content, name, read) VALUES ('title7', 'content7', 'name7', 0);
INSERT INTO tbl_board( title, content, name, read) VALUES ('title8', 'content8', 'name8', 0);
INSERT INTO tbl_board( title, content, name, read) VALUES ('title9', 'content9', 'name9', 0);
INSERT INTO tbl_board( title, content, name, read) VALUES ('title10', 'content10', 'name10', 0);

SELECT * FROM tbl_board;