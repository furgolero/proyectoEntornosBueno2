package ahorcado;
import java.util.*;

public class Partida {
    static String[] palabras= {"arbol", "coche", "piruleta", "pajaro", 
        "supercalifragilisticoespialidoso", "maraca", "guitarra", "lapicero", 
        "esternocleidomastoideo", "pamplinas", "tolerancia", "agazapado", 
        "pandereta", "macuto", "chancleta", "anacardo",
        "terremoto", "aerodinamico", "benemerita", "picaporte"};
    Jugador[] jugadores;
    String palabra;
    
    Partida(){
        jugadores=new Jugador[Pantalla.pideJugadores("Introduce el numero de jugadores (1-10): ")];
        for(int x=0;x<jugadores.length;x++){
            System.out.println("Jugador " + (x+1) + ": ");
            jugadores[x]=new Jugador();
        }
        
    }
    
    void nuevaPartida(){
        escogePalabra();
        for(int x=0;x<jugadores.length;x++){            
            jugadores[x].reset();
            jugadores[x].palabraGuion=palabraGuiones(palabra);
        }
    }
    
    void escogePalabra(){
       Random azar=new Random();
       palabra=palabras[azar.nextInt(palabras.length)];
    }
    
    char[] palabraGuiones(String palabra){
        char[] guiones= new char[palabra.length()];
        for(int x=0; x<palabra.length(); x++){
            guiones[x]='-';
        }
        return guiones;
    }
    
    void sustituyeLetras (Jugador jugador, char letra){
        for(int x=0;x<jugador.palabraGuion.length;x++){
            if(palabra.charAt(x)==letra){
                String antes=Arrays.toString(jugador.palabraGuion);
                jugador.palabraGuion[x]=letra;
                if(!antes.equals(Arrays.toString(jugador.palabraGuion)))
                    jugador.puntos++;
            }
        }
    }
    
    void turno(){//¿Cambiar a boolean?
        for(int x=0;x<jugadores.length;x++){
            System.out.println("\t\tJUGADOR " + (x+1) + ": ");
            jugadores[x].muestraDatos();
            Pantalla.muestraDibujo(jugadores[x]);
            if(jugadores[x].muere()){
                System.out.println("RIP");
            } else{
                char letra=Pantalla.pideLetra();
                if(palabra.contains(letra+"")){
                    sustituyeLetras(jugadores[x],letra);
                    System.out.println("Letra correcta");
                } else{
                    jugadores[x].fallos++;
                    System.out.println("Letra incorrecta");
                    Pantalla.muestraDibujo(jugadores[x]);
                }
            jugadores[x].muestraDatos();
            System.out.println("");
            }
        }
    }
    
    boolean todosMueren(){
        for(int x=0;x<jugadores.length;x++){
            if(!jugadores[x].muere()){
                return false;
            }
        }
        return true;
    }
    
    boolean sigueJugando(){
        if(todosMueren()){
            return false;
        } else{
            for(int x=0;x<jugadores.length;x++){
                if(jugadores[x].haGanado()){
                    return false;    
                }
            } 
        }
        return true;        
    }
}
