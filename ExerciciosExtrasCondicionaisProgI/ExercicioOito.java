import java.util.Scanner;

public class ExercicioOito
{
    public static void main(String args[])
    {
        Scanner leia = new Scanner(System.in);
        
        System.out.print("Digite um número: ");
        double num = leia.nextDouble();
        
        if(num >= 10 && num <= 100){
            System.out.printf("\n %.2f - Este número está no intervalo de 10 à 100.", num);
        } else {
            System.out.printf("\n %.2f - Este número está fora do intervalo de 10 à 100.",num);
        }
    }
}
