package com.gdedu.system.domain;

public class TeacherStatistic {
    private String ttitle;//职称
    private int count;//人数
    private double avgTsalary;//平均工资

    public String getTtitle() {
        return ttitle;
    }

    public void setTtitle(String ttitle) {
        this.ttitle = ttitle;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public double getAvgTsalary() {
        return avgTsalary;
    }

    public void setAvgTsalary(double avgTsalary) {
        this.avgTsalary = avgTsalary;
    }

    @Override
    public String toString() {
        return "TeacherStatistic{" +
                "ttitle='" + ttitle + '\'' +
                ", count=" + count +
                ", avgTsalary=" + avgTsalary +
                '}';
    }
}
