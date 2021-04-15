package com.range.demo.entity;

public class PathInfo {
    private int type;
    private String path;

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    @Override
    public String toString() {
        return "PathInfo[path]:" + path;
    }
}
