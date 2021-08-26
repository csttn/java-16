package com.csttn;

public final class Retangulo extends  FiguraGeometrica{

    private Double lado;
    private Double altura;

    public Double getLado() {
        return lado;
    }

    public Double getAltura() {
        return altura;
    }

    public Retangulo(Double lado, Double altura) {
        this.lado = lado;
        this.altura = altura;
    }

    public void setLado(Double lado) {
        this.lado = lado;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        return 0;
    }
}
