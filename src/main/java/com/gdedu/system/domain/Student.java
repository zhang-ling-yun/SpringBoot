package com.gdedu.system.domain;

/**
 * 学生表
 */
public class Student {
    //学号
    private int sno;
    //学生姓名
    private String sname;
    //性别
    private String ssex;
    //年龄
    private int sage;
    //登陆密码
    private String spwd;

    public Student() {
    }

    public int getSno() {
        return sno;
    }

    public void setSno(int sno) {
        this.sno = sno;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public String getSsex() {
        return ssex;
    }

    public void setSsex(String ssex) {
        this.ssex = ssex;
    }

    public int getSage() {
        return sage;
    }

    public void setSage(int sage) {
        this.sage = sage;
    }

    public String getSpwd() {
        return spwd;
    }

    public void setSpwd(String spwd) {
        this.spwd = spwd;
    }

    @Override
    public String toString() {
        return "Student{" +
                "sno=" + sno +
                ", sname='" + sname + '\'' +
                ", ssex='" + ssex + '\'' +
                ", age=" + sage +
                ", spwd='" + spwd + '\'' +
                '}';
    }
}
