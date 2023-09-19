package com.masco;

public class BE {
    private String barCode;
    private int gewicht;
    private int nummer;

    public BE(String barCode, int gewicht, int nummer) {
        this.barCode = barCode;
        this.gewicht = gewicht;
        this.nummer = nummer;
    }

    public String getBarCode() {
        return barCode;
    }

    public int getGewicht() {
        return gewicht;
    }

    public int getNummer() {
        return nummer;
    }

    public void setBarCode(String barCode) {
        this.barCode = barCode;
    }

    public void setGewicht(int gewicht) {
        this.gewicht = gewicht;
    }

    public void setNummer(int nummer) {
        this.nummer = nummer;
    }

    @Override
    public String toString() {
        return "BE{" + "barCode=" + barCode + ", gewicht=" + gewicht + ", nummer=" + nummer + '}';
    }
}
