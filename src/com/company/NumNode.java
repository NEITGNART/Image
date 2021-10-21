package com.company;

public class NumNode implements Node{
    private double num;

    public NumNode(double num) {
        this.num = num;
    }

    @Override
    public double evaluate() {
        return num;
    }

}