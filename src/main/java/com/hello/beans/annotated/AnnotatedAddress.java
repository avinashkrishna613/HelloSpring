package com.hello.beans.annotated;

import org.springframework.stereotype.Component;

@Component(value="Address")
public class AnnotatedAddress {

    private int id;
    private String cityName;
    private String landMark;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getLandMark() {
        return landMark;
    }

    public void setLandMark(String landMark) {
        this.landMark = landMark;
    }

    public AnnotatedAddress() {
    }

    public AnnotatedAddress(int id, String cityName, String landMark) {
        this.id = id;
        this.cityName = cityName;
        this.landMark = landMark;
    }

    @Override
    public String toString() {
        return "Address{" +
                "id=" + id +
                ", cityName='" + cityName + '\'' +
                ", landMark='" + landMark + '\'' +
                '}';
    }
}
