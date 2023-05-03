import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite uma String: ");
        String cadeia = entrada.nextLine();

        boolean resultado = verificarString(cadeia);

        System.out.println("Todos os caracteres na String são vogais? " + resultado);
    }

    public static boolean verificarString(String cadeia){

        for(int i = 0; i < cadeia.length(); i++){

            if(cadeia.charAt(i) != 'a' && cadeia.charAt(i) != 'A' && cadeia.charAt(i) != 'e' && cadeia.charAt(i) != 'E'
                    && cadeia.charAt(i) != 'i' && cadeia.charAt(i) != 'I' && cadeia.charAt(i) != 'o' && cadeia.charAt(i)
                    != 'O' && cadeia.charAt(i) != 'u' && cadeia.charAt(i) != 'U'){
                return false;
            }
        }

        return true;
    }
}
