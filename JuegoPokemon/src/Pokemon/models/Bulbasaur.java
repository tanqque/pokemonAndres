/*
@version 1.0.0
@author Dilson Hincapie
*/
package Pokemon.models;


public class Bulbasaur extends Pokemon implements PokemonPlanta {
    public Bulbasaur(int numPokedex, String nombre, double peso, String temporada) {
        super(numPokedex, nombre, peso, temporada);
    }

    public void atacarDrenadoras() {
        System.out.println(nombre + " ataque Drenadoras!");
    }

    @Override
    public void atacarLatigoCepa() {
        System.out.println(nombre + " ataque Látigo Cepa!");
    }

    @Override
    public void atacarHojaAfilada() {
        System.out.println(nombre + " ataque Hoja Afilada!");
    }

    public void atacarRayoSolar() {
        System.out.println(nombre + " ataque Rayo Solar!");
    }

    @Override
    public void atacarParalizar() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    @Override
    public void atacarDrenaje() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
}


