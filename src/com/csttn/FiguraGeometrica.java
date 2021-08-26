package com.csttn;

public sealed abstract class FiguraGeometrica permits Circulo, Quadrado, Retangulo {

    protected String cor;
    public abstract double calcularArea();

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }
}
