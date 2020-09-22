import java.util.Scanner;

public class ExercicioUm
{
    public static void main(String args[])
    {
        Scanner leia = new Scanner(System.in);
        
        System.out.print("Digite um número inteiro: ");
        int num = leia.nextInt();
        
        if(num > 100){
            System.out.println("\nMaior do que 100.");
        } else {
            System.out.println("\nMenor do que 100.");
        }
    }
}
