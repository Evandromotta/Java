 

import java.util.Scanner;
public class Exe01RevCond
{
    public static void main(String args[])
    {
        Scanner leia = new Scanner(System.in);
        
        System.out.print("Digite um número: ");
        int n1 = leia.nextInt();
        
        if(n1 > 100){
            System.out.println("Maior do que 100!");
        }else if (n1 < 100){
            System.out.println("Menor do que 100!");
        }else{
            System.out.println("Igual a 100!");
        }
    }
}
