import java.util.Scanner;

public class ExercicioNove
{
    public static void main(String args[])
    {
        Scanner leia = new Scanner(System.in);
        
        System.out.print("Digite um número de 1 à 7: ");
        int dia = leia.nextInt();
        
        System.out.println();
        switch(dia){
            case 1: System.out.println("Segunda-feira =(");
                    break;
            case 2: System.out.println("Terça-feira :/");
                    break;
            case 3: System.out.println("Quarta-feira =]");
                    break;
            case 4: System.out.println("Quinta-feira :D");
                    break;
            case 5: System.out.println("Sexta-feira 8)");
                    break;
            case 6: System.out.println("Sábado ;)");
                    break;
            case 7: System.out.println("Domingo =O");
                    break;
            default: System.out.println("Não existe dia da semana para este número! ='(");
        }
    }
}
