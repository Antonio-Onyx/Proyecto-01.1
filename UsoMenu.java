import java.util.Scanner;
import java.util.Random;

public class UsoMenu{

    public static void main(String[] args){
        //variables para la calculadora
        String usuario = "miguel";
        String contraseña = "yomero";
        String usuario2 = "icc";
        String contraseña2 = "profesor";
        //variables para el jeugo de canicas
        Random sortea = new Random();
        int canicasMiguel = 10;
        int canicasComputadora = 10;
        int nuevasCanicasComputadora = 0;
        int nuevasCanicasMiguel = 0;
        boolean bandera = true;

        Scanner entrada = new Scanner(System.in);
        int choice;

        System.out.print("Usuario: ");
        String usr = entrada.nextLine().toLowerCase();
        System.out.print("Contraseña: ");
        String pass = entrada.nextLine();

        //aceptamos cualquiera de los dos usuarios "icc" o "miguel"
        if(usuario.equals(usr) && contraseña.equals(pass) || usuario2.equals(usr) && contraseña2.equals(pass)){

            if(usr.equals("miguel") && pass.equals("yomero")){ //si el usuario es icc y la contraseña profesor, pasa directo a la calculadora
                System.out.println("Presione 1 para jugar a las canicas ");
                System.out.println("Presione 2 para usar la Calculadora");
                choice = entrada.nextInt();
            } else { //de lo contrario presenta el menu de opciones
                choice = 2;
            }
            //Aqui empezamos ya bien nuetro menu
            if(choice == 1){
                System.out.println("canicas");
                while(bandera){
                    System.out.println("Tines " + canicasMiguel + " canicas.");
                    System.out.print("Miguel, cuantas canicas quieres apostar?: ");
                    //String apuesta = entrada.nextLine();
                    //int canicasApostadas = Integer.parseInt(apuesta);
                    int canicasApostadas = entrada.nextInt();

                    int soretoComp = sortea.nextInt(canicasComputadora+1);
                    //System.out.println("la computadora apuesta " + soretoComp + " canicas");
                    System.out.println("La computadora ya ha apostado. Las canicas de la computadora serán par o impar?: ");
                    String adivina = entrada.next();


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

            //Aqui empeiza nuestra calculadora
            } else if(choice == 2){

                System.out.println("calculadora");
                System.out.println("Elije una opcion: ");
                System.out.println("1.- Realizar cambio de base de DECIMAL A BINARIO");
                System.out.println("2.- Realizar un cambio de base de DECIMAL A OCTAL");
                System.out.println("3.- Realizar in cambio de base DECIMAL A HEXADECIMAL");
                System.out.println("4.- Realizar cambio de base de BINARIO A DECIMAL");
                System.out.println("5.- Realizar cambio de base de BINARIO A OCTAL");
                System.out.println("6.- Realizar cambio de base de BINARIO A HEXADECIMAL");
                System.out.println("7.- Realizar cambio de base de OCTAL A DECIMAL");
                System.out.println("8.- Realizar cambio de base de OCTAL A BINARIO");
                System.out.println("9.- Realizar cambio de base de OCTAL A HEXADECIMAL");
                System.out.println("10.- Realizar cambio de base de HEXADECIMAL A DECIMAL");
                System.out.println("11.- Realizar cambio de base de HEXADECIMAL A BINARIO");
                System.out.println("12.- Realizar cambio de base de HEXADECIMAL A OCTAL");
                int opcion = entrada.nextInt();
                

                Calculadora p1 = new Calculadora();

                switch(opcion){
                    case 1:
                        System.out.print("Introduzca el valor del que cambiara base: ");
                        int valorDecimal = entrada.nextInt();
                        System.out.println(p1.DecimalToBinario(valorDecimal));
                        break;

                    case 2:
                        System.out.print("Introduza el valor del que cambiara la base: ");
                        int valorDecimalOctal = entrada.nextInt();
                        System.out.println(p1.DecimalToOctal(valorDecimalOctal));
                        break;

                    case 3:
                        System.out.print("Introduzca el valor del que cambiara la base: ");
                        int valorDecimal2 = entrada.nextInt();
                        System.out.println(p1.DecimalToHexadecimal(valorDecimal2));
                        break;

                    case 4:
                        System.out.print("Introduzca el valor del que cambiara base: ");
                        int valorBinario = entrada.nextInt();
                        //con c1 checarom si el numero introducido es binario o no, y así con 5, 6, 7, 8 y 9
                        String c1 = String.valueOf(valorBinario);
                        if(c1.contains("2") || c1.contains("3") || c1.contains("4") || c1.contains("5") || c1.contains("6") || c1.contains("7") || c1.contains("8") || c1.contains("9")){
                            System.out.println("Error");
                        } else {
                            System.out.println(p1.BinarioDecimal(valorBinario));
                        }
                        break;

                    case 5:
                        System.out.print("Introduzca el valor del que cambiara base: ");
                        int var = entrada.nextInt();
                        int binDec = p1.BinarioDecimal(var);
                        String c2 = String.valueOf(var);
                        if(c2.contains("2") || c2.contains("3") || c2.contains("4") || c2.contains("5") || c2.contains("6") || c2.contains("7") || c2.contains("8") || c2.contains("9")){
                            System.out.println("Error");
                        } else {
                            System.out.println(p1.DecimalToOctal(binDec));
                        }
                        break;

                    case 6:
                        System.out.print("Introduzca el valor del que cambiara la base: ");
                        int binario = entrada.nextInt();
                        int decimal = p1.BinarioDecimal(binario);
                        String c3 = String.valueOf(binario);
                        if(c3.contains("2") || c3.contains("3") || c3.contains("4") || c3.contains("5") || c3.contains("6") || c3.contains("7") || c3.contains("8") || c3.contains("9")){
                            System.out.println("Error");
                        } else {
                            System.out.println(p1.DecimalToHexadecimal(decimal));
                        }
                        break;

                    case 7:
                        System.out.print("Introduzca el valor del que cambiara base: ");
                        int valorOctal = entrada.nextInt();
                        String c4 = String.valueOf(valorOctal);
                        if(c4.contains("8") || c4.contains("9")){
                            System.out.println("Error");
                        } else {
                            System.out.println(p1.OctalDecimal(valorOctal));
                        }
                        break;

                    case 8:
                        System.out.print("Introduzca el valor del que cambiara base: ");
                        int octal = entrada.nextInt();
                        int decimal2 = p1.OctalDecimal(octal);
                        String c5 = String.valueOf(octal);
                        if(c5.contains("8") || c5.contains("9")){
                            System.out.println("Error");
                        } else {
                            System.out.println(p1.DecimalToBinario(decimal2));
                        }
                        break;

                    case 9:
                        System.out.print("Introduzca el valor del que cambiara base: ");
                        int octal2 = entrada.nextInt();
                        int decimal3 = p1.OctalDecimal(octal2);
                        String c6 = String.valueOf(octal2);
                        if(c6.contains("8") || c6.contains("9")){
                            System.out.println("Error");
                        } else {
                            System.out.println(p1.DecimalToHexadecimal(decimal3));
                        }
                        break;

                    case 10:
                        System.out.print("Introduzca el valor del que cambiara base: ");
                        String valorHexadecimal = entrada.next();
                        System.out.println(p1.HexadecimalToDecimal(valorHexadecimal));
                        break;
                    
                    case 11:
                        System.out.print("Introduzca el valor del que cambiara base: ");
                        String hexa = entrada.next();
                        int decimal4 = p1.HexadecimalToDecimal(hexa);
                        System.out.println(p1.DecimalToBinario(decimal4));
                        break;

                    case 12:
                        System.out.print("Introduzca el valor del que cambiara base: ");
                        String hexa2 = entrada.next();
                        int decimal5 = p1.HexadecimalToDecimal(hexa2);
                        System.out.println(p1.DecimalToOctal(decimal5));
                        break;
                }

            } else {
                System.out.println("Error");
            }
    } else {
        System.out.println("ERROR");
    }
}
}