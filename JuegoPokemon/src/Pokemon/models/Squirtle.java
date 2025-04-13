/*
@version 1.0.0
@author Dilson Hincapie
*/
package Pokemon.models;

public abstract class Squirtle extends Pokemon implements PokemonAgua {
    public Squirtle(int numPokedex, String nombre, double peso, String temporada) {
        super(numPokedex, nombre, peso, temporada);
    }

    @Override
    public void atacarHidrobomba() {
        System.out.println(nombre + " ataque Hidrobomba!");
    }

    @Override
    public void atacarPistolaAgua() {
        System.out.println(nombre + " ataque Pistola Agua!");
    }

    @Override
    public void atacarBurbuja() {
        System.out.println(nombre + " ataque Burbuja!");
    }

    public void atacarSurf() {
        System.out.println(nombre +" ataque Surf!");
    }
}


