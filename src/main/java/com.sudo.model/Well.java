package com.sudo.model;

public class Well {
    private int id;
    private String org;
    private byte type;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getOrg() {
        return org;
    }

    public void setOrg(String org) {
        this.org = org;
    }

    public byte getType() {
        return type;
    }

    public void setType(byte type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Well{" +
                "id=" + id +
                ", org='" + org + '\'' +
                ", type=" + type +
                '}';
    }
}
