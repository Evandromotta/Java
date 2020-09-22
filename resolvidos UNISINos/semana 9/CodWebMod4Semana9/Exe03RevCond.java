 

import java.util.Scanner;
public class Exe03RevCond
{
    public double contaFinal()
    {
        Scanner leia = new Scanner(System.in);
        
        System.out.print("Digite quantos Hambúrguers: ");
        int qtHamb = leia.nextInt();
        System.out.print("Digite quantos Cheeseburguers: ");
        int qtChe = leia.nextInt();
        System.out.print("Digite quantas Fritas: ");
        int qtFri = leia.nextInt();
        System.out.print("Digite quantos Refrigerantes: ");
        int qtRef = leia.nextInt();
        System.out.print("Digite quantos Milkshakes: ");
        int qtMil = leia.nextInt();
        
        double contaF = (qtHamb * 9.50) + (qtChe * 6.50) + (qtFri * 2.50) + (qtRef * 5) + (qtMil * 8.30);
        
        return contaF;
    }
}
