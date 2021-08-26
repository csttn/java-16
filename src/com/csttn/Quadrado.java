package com.csttn;

public final class Quadrado extends FiguraGeometrica {

    private Double lado;

    public Double getLado() {
        return lado;
    }

    public void setLado(Double lado) {
        this.lado = lado;
    }

    public Quadrado(Double lado) {
        this.lado = lado;
    }

    @Override
    public double calcularArea() {
        return 0;
    }
}
