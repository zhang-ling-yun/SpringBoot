package com.gdedu.system.domain;

public class CourseStatistic {
    private String cname;//课程名
    private double avgScore;//平均分
    private double maxScore;//最高分
    private double minScore;//最低分

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public double getAvgScore() {
        return avgScore;
    }

    public void setAvgScore(double avgScore) {
        this.avgScore = avgScore;
    }

    public double getMaxScore() {
        return maxScore;
    }

    public void setMaxScore(double maxScore) {
        this.maxScore = maxScore;
    }

    public double getMinScore() {
        return minScore;
    }

    public void setMinScore(double minScore) {
        this.minScore = minScore;
    }

    @Override
    public String toString() {
        return "CourseStatistic{" +
                "cname='" + cname + '\'' +
                ", avgScore=" + avgScore +
                ", maxScore=" + maxScore +
                ", minScore=" + minScore +
                '}';
    }
}
