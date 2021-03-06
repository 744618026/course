
drop table if exists chapter;
create table chapter(
    id char(8) not null comment 'ID',
    course_id char(8) not null comment '课程ID',
    name varchar(64) comment '名称',
    primary key (id)
) engine=innodb default charset=utf8mb4 comment='大章';

use course;
insert into chapter (id, course_id, name) values ('00000000','00000000','测试大章一');
insert into chapter(id, course_id, name) VALUES ('00000001','00000000','测试大章二');