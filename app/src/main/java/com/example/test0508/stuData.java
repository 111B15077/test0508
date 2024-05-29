package com.example.test0508;

public class StuData {

    private int id;
    private String name;
    private String height;
    private String imageUrl;

    public StuData(int id, String name, String height) {
        this.id = id;
        this.name = name;
        this.height = height;
    }

    public StuData(String imageUrl, String name, String height) {
        this.name = name;
        this.height = height;
        this.imageUrl = imageUrl;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }
}
