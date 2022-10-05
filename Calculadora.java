

public class Calculadora{

    String representacionOctal;
    String representacionBinaria;
    int representacionDecimal;
    String cadena;
    String cadenaInvertida;
    int m, rem;

    //public int getRepresentacionDecimal(){
    //    return representacionDecimal;
    //}
    public Calculadora(){
        
    }

    //Metodo que convierte octales a decimales
    public int OctalDecimal(int input){
        representacionOctal = String.valueOf(input);
        int n = representacionOctal.length()-1;
        representacionDecimal = 0;
        boolean sePudo = true;

        for(int i = 0; i<representacionOctal.length(); i++){
            char c = representacionOctal.charAt(i);
            if(c == '8' || c == '9'){
                sePudo = false;
            }
            int var = Integer.parseInt(String.valueOf(c));

            representacionDecimal += var*Math.pow(8,n);
            n--;
        }
        if(sePudo){
            return representacionDecimal;
        }
        return n; 
        }

    //Metodo que convierte binarios a decimal    
    public int BinarioDecimal(int input){
        representacionBinaria = String.valueOf(input);
        int n = representacionBinaria.length()-1;
        representacionDecimal = 0;
        boolean sePudo = true;

        for(int i = 0; i < representacionBinaria.length(); i++){
            char c = representacionBinaria.charAt(i);
            if(c == '2' || c == '3' || c == '4' || c == '5' || c == '6' || c == '7' || c == '8' || c == '9'){
                sePudo = false;
            }
            int var = Integer.parseInt(String.valueOf(c));

            representacionDecimal += var*Math.pow(2,n);
            n--;
        }
        if(sePudo){
            return representacionDecimal;
        }
        return n;
    }
    //Metodo que convierte hexadecimales a decimales
    public int HexadecimalToDecimal(String input){
        String cadena = "0123456789ABCDEF";
        input = input.toUpperCase();
        int num =0;
        for(int i = 0; i < input.length(); i++){
            char  c = input.charAt(i);
            int n = cadena.indexOf(c);
            num = 16*num + n;
        }
        return num;
    }
    //Metodo que convierte decimales a binario
    public int DecimalToBinario(int input){
        int num = input;
        int binario = 0;
        int i = 1;
        while(num > 0){
            rem = num % 2;
            binario += i*rem;
            num = num/2;
            i = i*10;
        }
        return binario;
    }
    //Metodo que convierte decimales a octales
    public int DecimalToOctal(int input){
        int num = input;
        int octal = 0;
        int i = 1;
        while(num > 0){
            rem = num % 8;
            octal += i*rem;
            num = num/8;
            i = i*10;
        }
        return octal;
    }
    //Metodo que convierte decimales a hexadecimal
    public String DecimalToHexadecimal(int input){
        String hexadecimal = "";
        String cadena = "0123456789ABCDEF";
        while(input > 0){
            int rem = input%16;
            hexadecimal = cadena.charAt(rem) + hexadecimal;
            input /= 16;
        }
        return hexadecimal;
    }

    }
