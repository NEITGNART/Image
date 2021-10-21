package com.company;

public class OpNode implements Node {

    private String operator;
    private Node right;
    private Node left;

    public OpNode(String operator) {
        this.operator = operator;
    }

    public void addLeft(Node left) {
        this.left = left;
    }

    public void addRight(Node right) {
        this.right = right;
    }

    @Override
    public double evaluate() {
        double l = left.evaluate();
        double r = right.evaluate();

        return switch (operator) {
            case "+" -> l + r;
            case "-" -> l - r;
            case "*" -> l * r;
            default -> l / r;
        };
    }
}
