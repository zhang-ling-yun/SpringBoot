package com.gdedu.system.domain;

import java.util.Date;

/**
 * 选修表
 */
public class SC {
    //学号
    private int sno;
    //课程号
    private int cno;
    //选修成绩
    private double score;
    //选修时间
    private Date create_time;

    public SC() {
    }

    public int getSno() {
        return sno;
    }

    public void setSno(int sno) {
        this.sno = sno;
    }

    public int getCno() {
        return cno;
    }

    public void setCno(int cno) {
        this.cno = cno;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public Date getCreate_time() {
        return create_time;
    }

    public void setCreate_time(Date create_time) {
        this.create_time = create_time;
    }

    @Override
    public String toString() {
        return "SC{" +
                "sno=" + sno +
                ", cno=" + cno +
                ", score=" + score +
                ", create_time=" + create_time +
                '}';
    }
}
