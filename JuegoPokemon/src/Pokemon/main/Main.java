/*
@version 1.0.0
@author Dilson Hincapie
*/
package Pokemon.main;
//// las importaciones necesarias para su correcto funcionamiento /////
import Pokemon.models.Bulbasaur;
import Pokemon.models.Charmander;
import Pokemon.models.Pikachu;
import Pokemon.models.Squirtle;

//// ejecuta el programa de batalla pokemon5 ////
//// crea instancias de pokemones y ejecuta sus ataques///
    public class Main { 
    public static void main(String[] args) {
        Pikachu pikachu = new Pikachu(1, "Pikachu", 7.0, "Primera");
        Charmander charmander = new Charmander(2, "Charmander", 9.5, "Primera");
        Bulbasaur bulbasaur = new Bulbasaur(3, "Bulbasaur", 4.9, "Primera");
        Squirtle squirtle = new Squirtle(4, "Squirtle", 6.0, "Primera") {
            @Override
            public void atacarHidropulso() {
                throw new UnsupportedOperationException("Not supported yet."); 
            }
        };
////ejecucion de los ataques pokemon//
        pikachu.atacarImpactrueno();
        charmander.atacarLanzallamas();
        bulbasaur.atacarDrenadoras();  
        squirtle.atacarHidrobomba();
       
    }
}


