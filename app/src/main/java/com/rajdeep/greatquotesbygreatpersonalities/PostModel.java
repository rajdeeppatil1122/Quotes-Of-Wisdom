package com.rajdeep.greatquotesbygreatpersonalities;

public class PostModel {
    String img;
    int text, like, flag;

    public PostModel(String img, int text, int flag){
        this.img = img;
        this.text = text;
        this.flag = flag;
    }
}
