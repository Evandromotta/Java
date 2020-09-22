import java.util.Scanner;

public class ExercicioQuatro
{
    public static void main(String args[])
    {
        Scanner leia = new Scanner(System.in);
        
        System.out.print("Digite um número inteiro: ");
        int num = leia.nextInt();
        
        if(num % 2 == 0){
            System.out.println("\nO número é PAR!");
        } else {
            System.out.println("\nO número é ÍMPAR!");
        }
    }
}
