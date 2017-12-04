package com.example.sanjarali.hackathon.models;

/**
 * Created by Sanjarali on 02.12.2017.
 */

public class Nogiron {
    private int id;
    private String g1;
    private String g2;
    private String g3;
    private String g4;
    private String g5;
    private String g6;
    private String g7;
    private String date;

    @Override
    public String toString() {
        return "Nogiron{" +
                "id=" + id +
                ", g1='" + g1 + '\'' +
                ", g2='" + g2 + '\'' +
                ", g3='" + g3 + '\'' +
                ", g4='" + g4 + '\'' +
                ", g5='" + g5 + '\'' +
                ", g6='" + g6 + '\'' +
                ", g7='" + g7 + '\'' +
                ", date='" + date + '\'' +
                '}';
    }

    public Nogiron(int id, String g1, String g2, String g3, String g4, String g5, String g6, String g7, String date) {
        this.id = id;
        this.g1 = g1;
        this.g2 = g2;
        this.g3 = g3;
        this.g4 = g4;
        this.g5 = g5;
        this.g6 = g6;
        this.g7 = g7;
        this.date = date;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getG1() {
        return g1;
    }

    public void setG1(String g1) {
        this.g1 = g1;
    }

    public String getG2() {
        return g2;
    }

    public void setG2(String g2) {
        this.g2 = g2;
    }

    public String getG3() {
        return g3;
    }

    public void setG3(String g3) {
        this.g3 = g3;
    }

    public String getG4() {
        return g4;
    }

    public void setG4(String g4) {
        this.g4 = g4;
    }

    public String getG5() {
        return g5;
    }

    public void setG5(String g5) {
        this.g5 = g5;
    }

    public String getG6() {
        return g6;
    }

    public void setG6(String g6) {
        this.g6 = g6;
    }

    public String getG7() {
        return g7;
    }

    public void setG7(String g7) {
        this.g7 = g7;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
