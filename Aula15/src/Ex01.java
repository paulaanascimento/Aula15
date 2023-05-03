import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite um número inteiro: ");
        int numero = entrada.nextInt();

        boolean resultado = verificarDigitos(numero);

        System.out.println("Todos os dígitos do número são pares? " + resultado);
    }

    public static boolean verificarDigitos(int numero){
        String auxiliar = Integer.toString(numero);
        List<Integer> numerosLista = new ArrayList<>();

        for(int i = 0; i < auxiliar.length(); i++){
            numerosLista.add((int) auxiliar.charAt(i) - '0');
            if(numerosLista.get(i)%2 != 0){
                return false;
            }
        }

        return true;
    }
}
