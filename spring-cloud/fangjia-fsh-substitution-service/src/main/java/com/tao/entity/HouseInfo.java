package com.tao.entity;

/**
 * @author tao 2018/10/22
 */
public class HouseInfo {
    private Long id;

    private String city;

    private String area;

    private String address;


    public HouseInfo() {
    }

    public HouseInfo(Long id, String city, String area, String address) {
        this.id = id;
        this.city = city;
        this.area = area;
        this.address = address;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
