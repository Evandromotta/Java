import java.util.Scanner;

public class ExercicioDois
{
    public static void main(String args[])
    {
        Scanner leia = new Scanner(System.in);
        
        System.out.print("Digite um número inteiro: ");
        int A = leia.nextInt();
        System.out.print("Digite outro número inteiro: ");
        int B = leia.nextInt();
        int X = A + B;
        
        if(X > 10) {
            System.out.println("\nValor da soma maior que 10: " + X);
        } else {
            System.out.println("\nERRO");
        }
    }
}
