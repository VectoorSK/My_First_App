package com.example.myapplication.model;

import com.google.gson.annotations.SerializedName;

public class RetroPokemon {

    @SerializedName("name")
    private String name;
    @SerializedName("url")
    private String url;

    public RetroPokemon(String name, String url) {
        this.name = name;
        this.url = url;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = "https://via.placeholder.com/150/92c952";
    }
}
