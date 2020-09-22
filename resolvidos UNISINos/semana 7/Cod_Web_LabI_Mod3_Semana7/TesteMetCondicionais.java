 

import java.util.Scanner;

public class TesteMetCondicionais
{
    public static void main(String args[]){   
        System.out.println("-- Testando Comandos de Seleção... --");
        Scanner leia = new Scanner(System.in);
        System.out.println("Digite um número inteiro: ");
        int n = leia.nextInt();
        
        MetodosCondicionais objMC = new MetodosCondicionais();
        System.out.println(objMC.verificaParOuImpar(n));
        
        System.out.println("Digite um número: ");
        double n1 = leia.nextDouble();
        System.out.println("Digite outro número: ");
        double n2 = leia.nextDouble();
        System.out.println(objMC.maiorDosDois(n1, n2));
        
        leia.nextLine(); //capturar o enter digitado após a leitura de n2
        System.out.println("Digite a primeira palavra: ");
        String s1 = leia.nextLine();
        System.out.println("Digite a segunda palavra: ");
        String s2 = leia.nextLine();
        if(objMC.iguais(s1, s2)){
            System.out.println("As Palavras são IGUAIS");
        }else{
            System.out.println("As Palavras são DIFERENTES");
        }
    }
}
