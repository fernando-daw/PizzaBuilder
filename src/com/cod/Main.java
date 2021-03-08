package com.cod;

public class Main {

    public static void main(String[] args) {

	    Pizzas basica = new Pizzas();

	    Pizzas personalizada = new Pizzas(Pizzas.FINA, Pizzas.BIG, true, true, true, Pizzas.PARALLEVAR);

	    // aunque el toSpring no está definida, nos valen estas lineas para poner
        // un punto de ruptura y hacer debug
        // asi podemos ver los objetos creados
        System.out.println(basica.toString());
        System.out.println(personalizada.toString());
    }
}
