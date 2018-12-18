package com.example.demo.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity

public class product {

    @Id
    private int id;
    private String titel;
    private String img_txt;
    private String description;
    private String size;
    private String type;
    private String price;


    public product() {
    }

    public product(int id, String titel, String img_txt, String description, String size, String type, String price) {
        this.id = id;
        this.titel = titel;
        this.img_txt = img_txt;
        this.description = description;
        this.size = size;
        this.type = type;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitel() {
        return titel;
    }

    public void setTitel(String titel) {
        this.titel = titel;
    }

    public String getImg_txt() {
        return img_txt;
    }

    public void setImg_txt(String img_txt) {
        this.img_txt = img_txt;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }
}
