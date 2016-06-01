package ahorcado;

/**
 *
 * @author alumno2
 */
public class Jugador {
    String nombre;
    int puntos;
    int fallos;
    char [] palabraGuion;
    
    Jugador(){
        nombre=Pantalla.pideString("Introduce el nombre del jugador: ");
        puntos=0;
        fallos=0;
    }
    
    String getNombre(){
        return this.nombre;
    }
    
    void reset(){
        puntos=0;
        fallos=0;
    }
    
    void muestraDatos(){
        System.out.println("******************************************************");
        System.out.println("Nombre: " + nombre + "\tPuntos: " + puntos + "\tFallos: " + fallos);
        System.out.print("Palabra: ");
        Pantalla.imprimeArray(this.palabraGuion);
        System.out.println("******************************************************");
    }
    
    boolean haGanado(){
        for(int x=0;x<palabraGuion.length;x++){
            if(palabraGuion[x]=='-'){
                return false;
            }
        }
        return true;
    }
    
    boolean muere(){
        return fallos==5;
    }
}
