package com.beepig.Models;

/**
 * Created by hungnguyen on 20/03/2017.
 */
public class Test {
    private final int id;
    private final String content;

    public Test(int id, String content) {
        this.id = id;
        this.content = content;
    }

    public int getId() {
        return id;
    }

    public String getContent() {
        return content;
    }
}
