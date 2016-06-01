  package ahorcado;
import java.util.*;
/**
 *
 * @author alumno2
 */
public class Pantalla {
    public static void muestraDibujo(Jugador jugador){
        switch(jugador.fallos){
            case 1:
                System.out.println("             .---.\n" +
"            /     \\\n" +
"            : O  O:\n" +
"            \\  <> /\n" +
"            .-----.\n" +
"           /Y . . Y\\\n" +
"          // |   | \\\\\n" +
"         //  | . |  \\\\\n" +
"        ')   |   |   (`\n" +
"             ||'||\n" +
"             || ||\n" +
"             || ||\n" +
"             || ||\n" +
"            / | | \\\n" +
"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"|\n" +
"|\"|\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"|\"|\n" +
"| |                   | |\n" +
": :                   : :\n" +
": :                   : :");
                break;
            case 2:
                System.out.println(" _                  \n" +
"| |     \n" +
"| |            ¿? \n" +
"| |          .---.\n" +
"| |         /     \\\n" +
"| |         :O  O :\n" +
"| |         \\   · /\n" +
"| |         .-----.\n" +
"| |        /Y . . Y\\\n" +
"| |       // |   | \\\\\n" +
"| |      //  | . |  \\\\\n" +
"| |     ')   |   |   (`\n" +
"| |          ||'||\n" +
"| |          || ||\n" +
"| |          || ||\n" +
"| |          || ||\n" +
"| |         / | | \\\n" +
"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"|\n" +
"|\"|\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"|\"|\n" +
"| |                   | |\n" +
": :                   : :\n" +
": :                   : :");
                break;
            case 3:
                System.out.println(" ____________________\n" +
"| .__________________|\n" +
"| | / /      \n" +
"| |/ /         ¡!\n" +
"| | /        .---.\n" +
"| |/        /     \\\n" +
"| |         : O O :\n" +
"| |         \\  .  /\n" +
"| |         .-----.\n" +
"| |        /Y . . Y\\\n" +
"| |       // |   | \\\\\n" +
"| |      //  | . |  \\\\\n" +
"| |     ')   |   |   (`\n" +
"| |          ||'||\n" +
"| |          || ||\n" +
"| |          || ||\n" +
"| |          || ||\n" +
"| |         / | | \\\n" +
"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"|\n" +
"|\"|\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"|\"|\n" +
"| |                   | |\n" +
": :                   : :\n" +
": :                   : :");
                break;
            case 4:
                System.out.println(" ___________.._______\n" +
"| .__________))______|__________\n" +
"| | / /      ||      /          \\\n" +
"| |/ /       ||      | Espabila!|\n" +
"| | /        ||.---. \\__________/\n" +
"| |          |/     \\    ||\n" +
"| |          |: O O :   ( )\n" +
"| |          (\\  .  /   //\n" +
"| |          .-----.___//\n" +
"| |         /Y . . .---·\n" +
"| |        // |   | \n" +
"| |       //  | . | \n" +
"| |      ')   |   | \n" +
"| |           ||'||\n" +
"| |           || ||\n" +
"| |           || ||\n" +
"| |           || ||\n" +
"| |          / | | \\\n" +
"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"|\n" +
"|\"|\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"|\"|\n" +
"| |                   | |\n" +
": :                   : :\n" +
": :                   : :");
                break;
            case 5:
                System.out.println(" ___________.._______\n" +
"| .__________))______|\n" +
"| | / /      ||\n" +
"| |/ /       ||\n" +
"| | /        ||.---.\n" +
"| |/         |/     \\\n" +
"| |          || X X :\n" +
"| |          (\\\\ ~~ /\n" +
"| |         .-`---.\n" +
"| |        /Y . . Y\\\n" +
"| |       // |   | \\\\\n" +
"| |      //  | . |  \\\\\n" +
"| |     ')   |   |   (`\n" +
"| |          ||'||\n" +
"| |          || ||\n" +
"| |          || ||\n" +
"| |          || ||\n" +
"| |         / | | \\\n" +
"\"\"\"\"\"\"\"\"\"\"|_`-' `-' |\"\"\"|\n" +
"|\"|\"\"\"\"\"\"\"\\ \\       '\"|\"|\n" +
"| |        \\ \\        | |\n" +
": :         \\ \\       : : \n" +
". .          `'       . .");
        }
    }
    public static int pideJugadores(String texto){
        Scanner teclado=new Scanner(System.in);
        int num;
        do{
            try{
                do{
                    System.out.println(texto);
                    num=teclado.nextInt();
                }while(num<1|num>10);
                return num;
                
            }
            catch(InputMismatchException e){
                teclado.nextLine();
            }
        }while(true);
    }
    public static String pideString(String texto){
        Scanner teclado=new Scanner(System.in);
        System.out.println(texto);
        return teclado.nextLine();
    }
    
    static boolean soloLetras(String texto){
        return texto.matches("([a-z]|[A-Z]|\\s)+");
    }
    
    public static void imprimeArray(char[] array){
        for(int x=0;x<array.length;x++){
            System.out.print(array[x]);
        }
        System.out.println("");
    }
    public static char pideLetra(){
        String letra;
        do{
            letra=pideString("Introduce una letra: ");
            if(soloLetras(letra)&letra.length()==1){
                return letra.toLowerCase().charAt(0);
            }
            System.out.println("Entrada incorrecta, introduce un único caracter que sea una letra.");
        }while(true);
    }
}
