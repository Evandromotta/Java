import java.util.Scanner;

public class ExercicioSeis
{
    public static void main(String args[])
    {
        Scanner leia = new Scanner(System.in);
        
        System.out.print("Digite um número inteiro: ");
        int num = leia.nextInt();
        
        if(num % 5 == 0){
            System.out.println("\nNúmero divisível por 5!");
        } else {
            System.out.println("\nNúmero não divisível por 5!");
        }
    }
}
