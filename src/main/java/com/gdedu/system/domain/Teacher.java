package com.gdedu.system.domain;

/**
 * 教师表
 */
public class Teacher {
    //教工号
    private int tno;
    //教师姓名
    private String tname;
    //职称
    private String ttitile;
    //工资
    private double tsalary;
    //登陆密码
    private String tpwd;

    public Teacher() {
    }

    public void setTno(int tno) {
        this.tno = tno;
    }

    public Integer getTno() {
        return tno;
    }

    public void setTno(Integer tno) {
        this.tno = tno;
    }

    public String getTname() {
        return tname;
    }

    public void setTname(String tname) {
        this.tname = tname;
    }

    public String getTtitile() {
        return ttitile;
    }

    public void setTtitile(String ttitile) {
        this.ttitile = ttitile;
    }

    public double getTsalary() {
        return tsalary;
    }

    public void setTsalary(double tsalary) {
        this.tsalary = tsalary;
    }

    public String getTpwd() {
        return tpwd;
    }

    public void setTpwd(String tpwd) {
        this.tpwd = tpwd;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "tno=" + tno +
                ", tname='" + tname + '\'' +
                ", ttitile='" + ttitile + '\'' +
                ", tsalary=" + tsalary +
                ", tpwd='" + tpwd + '\'' +
                '}';
    }
}
