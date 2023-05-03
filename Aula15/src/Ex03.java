import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite uma senha: ");
        String senha = entrada.nextLine();

        boolean resultado = verificarSenha(senha);

        System.out.println("A senha digitada é válida? " + resultado);
    }

    public static boolean verificarSenha(String senha){
        boolean letraNumero = true;
        int quantidadeDigitos = 0;

        for(int i = 0; i < senha.length(); i++){
            if(Character.isLetterOrDigit(senha.charAt(i)) == false){
                letraNumero = false;
            }

            if(Character.isDigit(senha.charAt(i)) == true){
                quantidadeDigitos++;
            }
        }

        return (senha.length() >= 10) && (letraNumero == true) && (quantidadeDigitos >= 2 );
    }
}
