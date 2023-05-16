package aulas;

public class Aula_07 {

    public static void main(String[] args) {
        
        //NÚMEROS INTEIROS
        byte a = 127;
        // byte é para numeros pequenos;
        //armazena até  8 bits, no positivo até 127 ou no negativo até -128;
        short b = 256;
        //armazena até 16 bits;
        int c = 1540;
        // armazena até 32 bits;
        long d = 1350234;
        // armazena números grandes;

        //NÚMEROS DECIMAIS - QUEBRADO, COM CASAS DEPOIS DA VÍRGULA
        float e = 1;
        // valores decimais;
        double f = 1.44;
        // valores decimais com maior precisão;

        //OUTROS
        boolean g = true;
        // F ou V sendo: false or true
        char h = '!';
        // um caractere '?'
        String i = null;

        System.out.println(a + " " + b + " " + c + " " + d + " " + e + " " + f + " " + g + " " + h + " " + i);

    }
    
}
