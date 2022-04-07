package com.apprecipe.Model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "kitchenTips")
public class KitchenTips {

    @Id
    private String tipNo;
    private String name;
    private String description;

    public KitchenTips(String tipNo, String name, String description) {
        this.tipNo = tipNo;
        this.name = name;
        this.description = description;
    }

    public String getTipNo() {
        return tipNo;
    }

    public void setTipNo(String tipNo) {
        this.tipNo = tipNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
