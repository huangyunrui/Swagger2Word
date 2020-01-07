package org.word.entity;

import java.io.Serializable;

public class Page implements Serializable {
    private String url;
    private int num;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }
}
