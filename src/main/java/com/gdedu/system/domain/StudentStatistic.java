package com.gdedu.system.domain;

public class StudentStatistic {
    private String sname;//姓名
    private int totalCredit;//总学分

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public int getTotalCredit() {
        return totalCredit;
    }

    public void setTotalCredit(int totalCredit) {
        this.totalCredit = totalCredit;
    }

    @Override
    public String toString() {
        return "StudentStatistic{" +
                ", sname='" + sname + '\'' +
                ", totalCredit=" + totalCredit +
                '}';
    }
}
