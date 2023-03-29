# Patrón Builder

---

## PREGUNTAS EXAMEN

¿Cual es la función de este patrón? (En caso de creacion de bocadillos)

El patrón Builder es un patrón de diseño creacional que se utiliza para separar la creación de un objeto complejo. Con este patron construimos objetos de nivel complejo paso a paso, podemos decir que vamos creando el objeto de forma gradual. En el patrón Builder, el objeto a construir se divide en partes o componentes, cada una de las cuales tiene un constructor asociado.



¿Como es su Diagrama de clases de este ejemplo que has hecho? Realiza en el readme el diagrama

+-----------------+           +-----------------------+
|   Bocadillo     |<>---------|  Bocadillo.BocadilloBuilder |
+-----------------+           +-----------------------+
|                 |           | +addIngredientes()       |
|                 |           | +addMayonesa()          |
|                 |           | +addKetchup()           |
+-----------------+           | +build()                |
                               +-----------------------+
                                       ^
                                       |
                                       |
+-----------------------+              |
|    BocadilloFactory    |              |
+-----------------------+              |
| +crearBocadillo()      |              |
+-----------------------+              |
                   |                   |
                   |                   |
                   |implements         |
                   |                   |
                   |                   |
+-------------------------+            |
|  BocadilloFactoryImpl    |            |
+-------------------------+            |
| +crearBocadillo()        |            |
+-------------------------+            |


¿Podríamos combinarlo con el patrón Factory? Explícalo con algo de código como lo harías

Si tomo el builder para la creacion de bocadillos, creo un Factory que haga que reciba los parametros que considere oportuno y esos sean recibidos en el Main, asi llame al builder y se genere el bocadillo.

--Ejemplo de la clase Factory--

public class BocadilloFactoryImpl implements BocadilloFactory {
    @Override
    public Bocadillo crearBocadillo() {
        String[] ingredientes = {"jamón", "queso", "lechuga"};
        return new Bocadillo.BocadilloBuilder("pan de molde")
                        .addIngredientes(ingredientes)
                        .addMayonesa(false)
                        .addKetchup(false)
                        .build();
    }
}
BocadilloFactory fabrica = new BocadilloFactoryImpl();
Bocadillo miBocadillo = fabrica.crearBocadillo();
