package com.apprecipe.Model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "kitchenTips")
public class KitchenTips {

    @Id
    private String tipNo;
    private String description;

    public KitchenTips(String tipNo, String description) {
        this.tipNo = tipNo;
        this.description = description;
    }

    public String getTipNo() {
        return tipNo;
    }

    public void setTipNo(String tipNo) {
        this.tipNo = tipNo;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
