/*
@version 1.0.0
@author Dilson Hincapie
*/
package Pokemon.models;


public class Charmander extends Pokemon implements PokemonFuego {
    public Charmander(int numPokedex, String nombre, double peso, String temporada) {
        super(numPokedex, nombre, peso, temporada);
    }

    @Override
    public void atacarLanzallamas() {
        System.out.println(nombre + " ataque Lanzallamas!");
    }

    @Override
    public void atacarAscuas() {
        System.out.println(nombre + " ataque Ascuas!");
    }
    public void atacarInfierno() {
        System.out.println(nombre + " ataque Infierno! ");
    }

    @Override
    public void atacarPunioFuego() {
        System.out.println(nombre + " ataque Puño Fuego!");
    }
}


