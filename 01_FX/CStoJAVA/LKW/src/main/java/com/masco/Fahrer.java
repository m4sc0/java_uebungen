package com.masco;

public class Fahrer {
    private int nr;
    private String name;

    public Fahrer(int nr, String name) {
        this.nr = nr;
        this.name = name;
    }

    public int getNr() {
        return nr;
    }

    public String getName() {
        return name;
    }

    public void setNr(int nr) {
        this.nr = nr;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Fahrer{nr=" + nr + ", name=" + name + "}";
    }
}
