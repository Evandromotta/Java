 

import java.util.Scanner;

public class Teste
{
    public static void main(String args[]){
      
        System.out.println("-- Testando Comandos de Seleção... --"); 
        Pessoa p1 = new Pessoa("Silvana", 31); 
        Pessoa p2 = new Pessoa("Maria", 78); 
        
        System.out.println("Pessoa 1 idade " + p1.verificaIdadeParImpar());
        System.out.println("Pessoa 2 idade " + p2.verificaIdadeParImpar());
        System.out.println("Idade da Pessoa mais velha é: " + p1.verificaMaiorIdade(p1, p2));
        System.out.println("A faixa etária da Pessoa 1 é: " + p1.verificaFaixaEtaria());
        System.out.println("A faixa etária da Pessoa 2 é: " + p2.verificaFaixaEtaria());
        
        int dia = Teclado.leInt("Digite um valor: " );
        switch(dia){
           case 1: 
                 System.out.println("Domingo");
                 break;
           case 2: 
                 System.out.println("Segunda-feira");
                 break;
           case 3: 
                 System.out.println("Terça-feira");
                 break;
           case 4: 
                 System.out.println("Quarta-feira");
                 break;
           case 5: 
                 System.out.println("Quinta-feira");
                 break;
           case 6: 
                 System.out.println("Sexta-feira");
                 break;
           case 7: 
                 System.out.println("Sábado");
                 break;
           default: 
                 System.out.println("Dia inválido!");
        }  
        
        char letra = Teclado.leChar("Digite uma letra: " );
        switch(letra){
           case 'a': 
           case 'e': 
           case 'i': 
           case 'o': 
           case 'u': 
                 System.out.println("Vogal!");
                 break;
           default: 
                 System.out.println("Consoante!");
        }
        /* || = OR && = AND
        if(letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u'){
           System.out.println("Vogal!");
        }else{
           System.out.println("Consoante!");
        }
        */
       int n1 = Teclado.leInt("Digite o valor 1: " );//4 10 34
       int n2 = Teclado.leInt("Digite o valor 2: " );//8  5 34
       int result = 0;
       if(n1 > n2){
         result = n1 - n2;
       }else if(n2 > n1){
         result = n2 - n1;
       }else{
         System.out.println("Valores são iguais!");
       }
       
       System.out.println("Resultado da Subtração = " + result);
    }
    
}
