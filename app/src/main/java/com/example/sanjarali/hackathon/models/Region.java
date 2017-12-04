package com.example.sanjarali.hackathon.models;

/**
 * Created by Sanjarali on 02.12.2017.
 */

public class Region {
    private String region;
    private int worksNumber;

    public Region(String region, int worksNumber) {
        this.region = region;
        this.worksNumber = worksNumber;
    }

    public int getWorksNumber() {
        return worksNumber;
    }

    public void setWorksNumber(int worksNumber) {
        this.worksNumber = worksNumber;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }
}
