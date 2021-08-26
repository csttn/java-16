package com.csttn;

import java.util.Objects;

public class Product2 {

    private final Long id;
    private final String nome;
    private final  String desc;

    public Product2(Long id, String nome, String desc) {
        this.id = id;
        this.nome = nome;
        this.desc = desc;
    }

    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getDesc() {
        return desc;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product2 product2 = (Product2) o;
        return Objects.equals(id, product2.id) && Objects.equals(nome, product2.nome) && Objects.equals(desc, product2.desc);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nome, desc);
    }

    @Override
    public String toString() {
        return "Product2{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", desc='" + desc + '\'' +
                '}';
    }
}
