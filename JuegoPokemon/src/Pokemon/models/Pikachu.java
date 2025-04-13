/*
@version 1.0.0
@author Dilson Hincapie
*/
package Pokemon.models;

    public class Pikachu extends Pokemon implements PokemonEletrico {
    public Pikachu(int numPokedex, String nombre, double peso, String temporada) {
        super(numPokedex, nombre, peso, temporada);
    }

    @Override
    public void atacarImpactrueno() {
        System.out.println(nombre + " ataque Impactrueno!");
    }

    @Override
    public void atacarPunioTrueno() {
        System.out.println(nombre + " ataque Puño Trueno!");
    }

    @Override
    public void atacarRayo() {
        System.out.println(nombre + " ataque Rayo!");
    }

    @Override
    public void atacarRayoCarga() {
        System.out.println(nombre + " ataque Rayo Carga!");
    }
}

