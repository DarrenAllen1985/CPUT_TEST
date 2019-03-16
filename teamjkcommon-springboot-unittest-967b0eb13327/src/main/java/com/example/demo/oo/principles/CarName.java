package com.example.demo.oo.principles;

public class CarName {

    private boolean enforUpperC;
    private String value;

    public String getValue() {
        return enforUpperC ? value.toUpperCase() : value;
    }

    public String getType() {
        return "Lamborgini";
    }

    public void setValue(String value) {
        this.value = value;
    }

    public boolean isenforUpperC() {
        return enforUpperC;
    }

    public void setenforUpperC(boolean enforceUppercase) {
        this.enforUpperC = enforceUppercase;
    }
}
