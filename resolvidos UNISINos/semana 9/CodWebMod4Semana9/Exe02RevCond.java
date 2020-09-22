 

import java.util.Scanner;
public class Exe02RevCond
{
    public static void main(String args[])
    {
        Scanner leia = new Scanner(System.in);
        
        System.out.print("Digite um número: ");
        int A = leia.nextInt();
        System.out.print("Digite outro número: ");
        int B = leia.nextInt();
        
        int X = A + B;
        if(X > 10){
            System.out.println("\nSoma: " + X);
        }else{
            System.out.println("\nSomatório dos valores é menor que 10!");
        }
    }
}
