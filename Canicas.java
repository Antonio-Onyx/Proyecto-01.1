import java.util.Scanner;
import java.util.Random;

public class Canicas{

    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        Random sortea = new Random();
        int canicasMiguel = 10;
        int canicasComputadora = 10;
        int nuevasCanicasComputadora = 0;
        int nuevasCanicasMiguel = 0;
        boolean bandera = true;


        while(bandera){
            System.out.print("Miguel, cuantas canicas quieres apostar?: ");
            String apuesta = entrada.nextLine();
            int canicasApostadas = Integer.parseInt(apuesta);

            int soretoComp = sortea.nextInt(canicasComputadora+1);
            //System.out.println("la computadora apuesta " + soretoComp + " canicas");
            System.out.println("La computadora ya ha apostado. Las canicas de la computadora serán par o impar?: ");
            String adivina = entrada.nextLine();

            

            if((soretoComp % 2 == 0 &&  adivina.equals("par")) || (soretoComp % 2 != 0 && adivina.equals("impar"))){
                nuevasCanicasMiguel = canicasMiguel + soretoComp;
                nuevasCanicasComputadora = canicasComputadora - soretoComp;
                canicasComputadora = nuevasCanicasComputadora;
                canicasMiguel = nuevasCanicasMiguel;
                System.out.println("***************************************************************************");
                System.out.println("* Ahora tienes " + nuevasCanicasMiguel + " canicas");
                System.out.println("* La computadora ahora tiene " + nuevasCanicasComputadora + " canicas");
                //System.out.println("* Ahora la variable de canicasMiguel vale: " + canicasMiguel);
                //System.out.println("* Ahora la variable de canicasComputadora vale: "+ canicasComputadora);
                System.out.println("***************************************************************************");
                if(canicasMiguel == 20){
                    System.out.println("Juntaste " + canicasMiguel + " canicas");
                    System.out.println("Has ganado!!!");
                    bandera = false;
                }
            } else {
                nuevasCanicasComputadora = canicasComputadora + canicasApostadas;
                nuevasCanicasMiguel = canicasMiguel - canicasApostadas;
                canicasComputadora = nuevasCanicasComputadora;
                canicasMiguel = nuevasCanicasMiguel;
                System.out.println("***************************************************************************");
                System.out.println("* Ahora tienes " + nuevasCanicasMiguel + " canicas");
                System.out.println("* La computadora ahora tiene " + nuevasCanicasComputadora + " canicas.");
                //System.out.println("* Ahora la variable de canicasMiguel vale: " + canicasMiguel);
                //System.out.println("* Ahora la variable de canicasComputadora vale: "+ canicasComputadora);
                System.out.println("***************************************************************************");
                if(canicasComputadora == 20) {
                    System.out.println("Te quedaste con " + canicasMiguel + " canicas y la computadora tiene " + canicasComputadora + " canicas.");
                    System.out.println("Por lo tanto, has perdido...");
                    bandera = false;
                }
            }
        }
    }
    }