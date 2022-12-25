package com.example.sheroshayri;

public class PoetryModel {
    int id;
    String data;
    String poet_name;
    String date_time;

    public PoetryModel(int id,String data,String poet_name,String date_time) {
        this.id = id;
        this.data = data;
        this.poet_name = poet_name;
        this.date_time = date_time;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPoet_name() {
        return poet_name;
    }

    public void setPoet_name(String poet_name) {
        this.poet_name = poet_name;
    }

    public String getDate_time() {
        return date_time;
    }

    public void setDate_time(String date_time) {
        this.date_time = date_time;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
}
