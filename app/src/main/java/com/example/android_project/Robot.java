package com.example.android_project;

import java.io.Serializable;

public class Robot implements Serializable {
    String teamName;
    int teamNumber;
    double averageScore;

    public Robot(String teamName, int teamNumber, double averageScore) {
        this.teamName = teamName;
        this.teamNumber = teamNumber;
        this.averageScore = averageScore;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public int getTeamNumber() {
        return teamNumber;
    }

    public void setTeamNumber(int teamNumber) {
        this.teamNumber = teamNumber;
    }

    public double getAverageScore() {
        return averageScore;
    }

    public void setAverageScore(double averageScore) {
        this.averageScore = averageScore;
    }
}