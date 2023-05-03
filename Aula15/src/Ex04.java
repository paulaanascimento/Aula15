import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite as polegadas: ");
        double polegadas = entrada.nextDouble();

        converterParaMetros(polegadas);
    }

    public static void converterParaMetros(double polegadas){
        double metros = polegadas * 0.0254;
        System.out.println("Convertido para metros fica " + metros);
    }
}
