package com.gdedu.system.domain;

/**
 * 课程表
 */
public class Course {
    //课程号
    private int cno;
    //课程名
    private String cname;
    //课程学分
    private int ccredit;
    //课程已选人数
    private int cselected;
    //课程可选总人数
    private int ctotal;
    //任课教师
    private int tno;

    public Course() {
    }

    public Integer getCno() {
        return cno;
    }

    public void setCno(int cno) {
        this.cno = cno;
    }

    public void setCno(Integer cno) {
        this.cno = cno;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public int getCcredit() {
        return ccredit;
    }

    public void setCcredit(int ccredit) {
        this.ccredit = ccredit;
    }

    public int getCselected() {
        return cselected;
    }

    public void setCselected(int cselected) {
        this.cselected = cselected;
    }

    public int getCtotal() {
        return ctotal;
    }

    public void setCtotal(int ctotal) {
        this.ctotal = ctotal;
    }

    public int getTno() {
        return tno;
    }

    public void setTno(int tno) {
        this.tno = tno;
    }

    @Override
    public String toString() {
        return "Course{" +
                "cno=" + cno +
                ", cname='" + cname + '\'' +
                ", ccredit=" + ccredit +
                ", cselected=" + cselected +
                ", ctotal=" + ctotal +
                ", tno=" + tno +
                '}';
    }
}
