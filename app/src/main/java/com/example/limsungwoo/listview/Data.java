package com.example.limsungwoo.listview;

public class Data {

    String bigTitle;
    String smallTitle;

    Data(String bigTitle, String smallTitle) {
        this.bigTitle = bigTitle;
        this.smallTitle = smallTitle;
    }

    public String getBigTitle() {
        return bigTitle;
    }

    public void setBigTitle(String bigTitle) {
        this.bigTitle = bigTitle;
    }

    public String getSmallTitle() {
        return smallTitle;
    }

    public void setSmallTitle(String smallTitle) {
        this.smallTitle = smallTitle;
    }

}