package com.csttn;

public non-sealed class Circulo extends FiguraGeometrica {


    private Double raio;

    public Double getRaio() {
        return raio;
    }

    public void setRaio(Double raio) {
        this.raio = raio;
    }

    public Circulo(Double raio) {
        this.raio = raio;
    }

    @Override
    public double calcularArea() {
        return 0;
    }
}
