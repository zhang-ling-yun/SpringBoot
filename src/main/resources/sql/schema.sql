CREATE TABLE student (
  `sno`   INT          NOT NULL
  COMMENT '学号',
  `sname` VARCHAR(120) NOT NULL
  COMMENT '姓名',
  `ssex`  VARCHAR(10)  NOT NULL
  COMMENT '性别',
  `sage`  INT          NOT NULL
  COMMENT '年龄',
  `spwd`  VARCHAR(120) NOT NULL DEFAULT '123456'
  COMMENT '登陆密码',
  PRIMARY KEY (sno),
  KEY idx_student_sname(sname)
)
  ENGINE = InnoDB
  DEFAULT CHARSET = utf8
  COMMENT ='学生信息表';


CREATE TABLE teacher (
  `tno`     INT          NOT NULL
  COMMENT '教工号',
  `tname`   VARCHAR(120) NOT NULL
  COMMENT '教师姓名',
  `ttitle`  VARCHAR(30)  NOT NULL
  COMMENT '职称',
  `tsalary` DOUBLE       NOT NULL
  COMMENT '工资',
  `tpwd`    VARCHAR(120) NOT NULL DEFAULT '123456'
  COMMENT '登陆密码',
  PRIMARY KEY (tno),
  KEY idx_teacher_tname(tname)
)
  ENGINE = InnoDB
  DEFAULT CHARSET = utf8
  COMMENT ='教师信息表';

##删除一个索引
##DROP INDEX idx_teacher_tno ON manager;
##添加一个索引
##ALTER TABLE manager ADD INDEX idx_teacher_tname(tname);

CREATE TABLE manager (
  `tno`  INT          NOT NULL
  COMMENT '教工号',
  `tpwd` VARCHAR(120) NOT NULL
  COMMENT '登陆密码',
  PRIMARY KEY (tno),
  KEY (tno),
  CONSTRAINT fk_manager_tno FOREIGN KEY (tno) REFERENCES teacher (tno)
);


CREATE TABLE course (
  `cno`       INT          NOT NULL AUTO_INCREMENT
  COMMENT '课程号',
  `cname`     VARCHAR(120) NOT NULL
  COMMENT '课程名',
  `ccredit`   INT          NOT NULL
  COMMENT '学分',
  `cselected` INT          NOT NULL DEFAULT 0
  COMMENT '已选人数',
  `ctotal`    INT          NOT NULL
  COMMENT '可选总人数',
  `tno`       INT COMMENT '任课教师',
  PRIMARY KEY (cno),
  CONSTRAINT fk_course_tno FOREIGN KEY (tno) REFERENCES teacher (tno),
  KEY idx_cname(cname)
)
  ENGINE = InnoDB
  AUTO_INCREMENT = 1000
  DEFAULT CHARSET = utf8
  COMMENT ='课程信息表';


CREATE TABLE sc (
  `sno`         INT                                 NOT NULL
  COMMENT '学号',
  `cno`         INT                                 NOT NULL
  COMMENT '课程号',
  `score`       DOUBLE                              NOT NULL
  COMMENT '成绩',
  `create_time` TIMESTAMP DEFAULT CURRENT_TIMESTAMP NOT NULL
  COMMENT '创建时间',
  PRIMARY KEY (sno, cno),
  KEY idx_sc_sno (sno),
  KEY idx_sc_cno (cno),
  CONSTRAINT fk_sc_sno FOREIGN KEY (sno) REFERENCES student (sno),
  CONSTRAINT fk_sc_cno FOREIGN KEY (cno) REFERENCES course (cno)
)
  ENGINE = InnoDB
  DEFAULT CHARSET = utf8
  COMMENT ='选课表';