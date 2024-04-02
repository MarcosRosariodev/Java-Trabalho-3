import java.util.Scanner;

public class IMCv2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {  
            System.out.println("Insira o seu sexo (M para masculino, F para feminino):");
            String sexo = scanner.next();

            System.out.println("Insira a sua idade:");
            int idade = scanner.nextInt();

            System.out.println("Insira o seu peso em quilogramas:");
            double peso = scanner.nextDouble();

            System.out.println("Insira a sua altura em metros:");
            double altura = scanner.nextDouble();

            double imc = peso / Math.pow(altura, 2);

         
            System.out.printf("Seu IMC é: %.2f%n", imc);
            System.out.println("Seu sexo é: " + sexo);
            System.out.println("Sua idade é: " + idade);

           
            if (imc < 18.5) {
                System.out.println("Você está abaixo do peso.");
            } else if (imc >= 18.5 && imc < 25) {
                System.out.println("Você está com peso normal.");
            } else if (imc >= 25 && imc < 30) {
                System.out.println("Você está com sobrepeso.");
            } else {
                System.out.println("Você está obeso.");
            }
        } catch (Exception e) {
            
            System.out.println("Erro: Entrada inválida. Certifique-se de que você está inserindo números válidos para a idade, o peso e a altura, e M ou F para o sexo.");
        } finally {
           
            scanner.close();
        }
    }
}
