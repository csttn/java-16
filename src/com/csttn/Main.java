package com.csttn;



public class Main {

    public static void main(String[] args) {

//        textBlockExamples();
//        patternMatching(2);
        recordsExample();

        Quadrado quadrado = new Quadrado(2.0);
        Circulo circulo = new Circulo(3.5);
        Retangulo retangulo = new Retangulo(2.0, 1.0);

        System.out.println(sealedClassesCalcularArea(quadrado));
        System.out.println(sealedClassesCalcularArea(circulo));
        System.out.println(sealedClassesCalcularArea(retangulo));



    }

    public static void textBlockExamples(){
        String beforeQuery = "update products\n" + " set quantityInStock = ?\n" + " , modifiedDate = ?\n";

        String query = """
                update products
                set quantityInStock = ?
                 , modifiedDate = ?
                """;

        System.out.println(beforeQuery);
    }

    public static void patternMatching(Object num){

//      forma antiga
        if( num instanceof Integer){
            Integer n = (Integer)num;
            System.out.println(n);
        }
// nova forma
        if(num instanceof Integer n){
            System.out.println(n);
        }
    }

    public static void recordsExample(){
        Produto produto = new Produto(1l, "Café", "desc With record class");
        Product2 produto2 = new Product2(1l, "Café 2","Desc with Class comum ");
        System.out.println(produto);
        System.out.println(produto2);

        record Temporaria(String nome){};

        Temporaria temp = new Temporaria("nome");


    }

    public static double sealedClassesCalcularArea(FiguraGeometrica figura){
        if(figura instanceof Circulo circulo){
            return circulo.getRaio() * circulo.getRaio() * Math.PI;
        }
        if (figura instanceof Quadrado quadrado){
            return quadrado.getLado() * 4;
        }

        if(figura instanceof Retangulo retangulo){
            return retangulo.getLado() * retangulo.getAltura();
        }

        return 0;
    }

}
