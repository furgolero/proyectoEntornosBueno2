package ahorcado;

/**
 *
 * @author AdrianAlonso
 */
public class Ahorcado {
    
    public static void main(String[] args) {
        Partida juego=new Partida();
        //System.out.println(juego.palabra); //QUITA ESTE COMENTARIO PARA LEER LA PALABRA SECRETA
        String op;
        do{
            juego.nuevaPartida();
            do{
                juego.turno();
            }while(juego.sigueJugando());
            System.out.println("Victoria para: ");
            if(juego.todosMueren()){
                System.out.println("Nadie. ¡Que malos que sois!");
            } else {
                for(int x=0;x<juego.jugadores.length;x++){
                    if(juego.jugadores[x].haGanado()){
                        System.out.println(juego.jugadores[x].getNombre());
                    }
                }
            }
            op=Pantalla.pideString("Introduce un 0 para salir, otra cosa para jugar otra partida: ");
        } while(!op.equals("0"));
    }
}
