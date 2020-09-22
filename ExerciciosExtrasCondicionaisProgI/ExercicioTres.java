import java.util.Scanner;

public class ExercicioTres
{
    public static void main(String args[])
    {
        Scanner leia = new Scanner(System.in);
        
        System.out.print("Digite sua idade: ");
        int idade = leia.nextInt();
        
        if(idade >= 18){
            System.out.println("\nVocê é Maior de idade!");
        } else {
            System.out.println("\nVocê é Menor de idade!");
        }
    }
}
