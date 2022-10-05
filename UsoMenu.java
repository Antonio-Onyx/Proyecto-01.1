import java.util.Scanner;

public class UsoMenu{

    public static void main(String[] args){
        String usuario = "Miguel";
        String contraseña = "yomero";
        String usuario2 = "icc";
        String contraseña2 = "profesor";
        Scanner entrada = new Scanner(System.in);
        int choice;

        System.out.print("Usuario: ");
        String usr = entrada.nextLine();
        System.out.print("Contraseña: ");
        String pass = entrada.nextLine();

        if(usuario.equals(usr) && contraseña.equals(pass) || usuario2.equals(usr) && contraseña2.equals(pass)){

            if(usr.equals("Miguel") && pass.equals("yomero")){
                System.out.println("Presione 1 para jugar a las canicas ");
                System.out.println("Presione 2 para usar la Calculadora");
                choice = entrada.nextInt();
            } else {
                choice = 2;
            }
            
            

            if(choice == 1){

                System.out.println("canicas");

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
                        System.out.println(p1.BinarioDecimal(valorBinario));
                        break;

                    case 5:
                        System.out.print("Introduzca el valor del que cambiara base: ");
                        int var = entrada.nextInt();
                        int binDec = p1.BinarioDecimal(var);
                        System.out.println(p1.DecimalToOctal(binDec));
                        break;

                    case 6:
                        System.out.print("Introduzca el valor del que cambiara la base: ");
                        int binario = entrada.nextInt();
                        int decimal = p1.BinarioDecimal(binario);
                        System.out.println(p1.DecimalToHexadecimal(decimal));
                        break;

                    case 7:
                        System.out.print("Introduzca el valor del que cambiara base: ");
                        int valorOctal = entrada.nextInt();
                        System.out.println(p1.OctalDecimal(valorOctal));
                        break;

                    case 8:
                        System.out.print("Introduzca el valor del que cambiara base: ");
                        int octal = entrada.nextInt();
                        int decimal2 = p1.OctalDecimal(octal);
                        System.out.println(p1.DecimalToBinario(decimal2));
                        break;

                    case 9:
                        System.out.print("Introduzca el valor del que cambiara base: ");
                        int octal2 = entrada.nextInt();
                        int decimal3 = p1.OctalDecimal(octal2);
                        System.out.println(p1.DecimalToHexadecimal(decimal3));
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