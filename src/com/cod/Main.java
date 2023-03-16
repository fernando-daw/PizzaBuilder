package com.cod;

public class Main {

    public static void main(String[] args) {

        Pizzas PizzaJamon=new Pizzas();
        Pizzas PizzaMargarita=new Pizzas();
        /*Para hacer uso del builder vamos a crear una serie de pizzas a nuestro gusto. Una pizza Margarita
        y una pizza JamonYork*/

    BuilderPizzas cocina  = new BuilderPizzas();

   cocina.setSize(Pizzas.grande);
   cocina.setRelleno(false);
   cocina.setRecojida(1);
   cocina.setSalsa(true);
   PizzaJamon=cocina.build();
        System.out.println(String.valueOf(PizzaJamon));

        BuilderPizzas cocina2 = new BuilderPizzas();
        cocina.setSize(Pizzas.peque);
        cocina.setRelleno(true);
        cocina.setRecojida(0);
        cocina.setSalsa(true);
        PizzaMargarita=cocina2.build();
        System.out.println(String.valueOf(PizzaMargarita));



    }
}
