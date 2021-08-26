package com.csttn;


// construtor com todos atributos pq os atributos são finais.
//recod é como uma classe com soemnte metodos gets, ela não pode extender ennhuam outra classe, porém, pode implementar qualquer interface

import java.io.Serializable;

public record Produto(Long id, String nome, String desc)  implements Serializable {


//     é permitido declarar atributos staticos

    public static int COUNT;

    public void meuMetodo(){
    }
}
//    essa declaração de record é equivalente a classe Product2

