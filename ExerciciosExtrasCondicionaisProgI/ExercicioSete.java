import java.util.Scanner;

public class ExercicioSete
{
    public static void main(String args[])
    {
        Scanner leia = new Scanner(System.in);
        
        System.out.print("Digite um valor para N1: ");      
        double n1 = leia.nextDouble();
        System.out.print("Digite um valor para N2: ");
        double n2 = leia.nextDouble();
        double maior = 0;
        double menor = 0;
    
        if(n1 > n2){
            maior = n1;
            menor = n2;
        } else if(n2 > n1){
            maior = n2;
            menor = n1;
        } else {
            System.out.println("\nValores iguais!");
        }
        System.out.printf("\nO quadradado de %.2f é: %.2f \n", menor, Math.pow(menor,2));
        System.out.printf("A raíz quadradada de %.2f é: %.2f \n", maior, Math.sqrt(maior));
    }
}
