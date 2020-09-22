import java.util.Scanner;

public class Teste
{
    public static void main(String args[]){
        
        System.out.println();
        System.out.println("-- TESTANDO CLASSE MATH --");
        //Classe Math
        System.out.println("Valor Absoluto de um double: " + Math.abs(-3.5));//double 
        System.out.println("Valor Absoluto de um inteiro: " + Math.abs(-3));//int
        System.out.println("Exponencial: " + (int)Math.pow(3,2));
        System.out.printf("Sorteio do valor randômico: %.1f \n", Math.random());
        
        double num = 400;
        System.out.printf("Raíz quadrada: %.1f \n", Math.sqrt(num));
        System.out.printf("PI: %f \n", 2*Math.PI);
       
        //Classe String
        System.out.println();
        System.out.println("-- TESTANDO CLASSE STRING --");
        System.out.println();
        
        System.out.println();
        System.out.println("->Testando equalsIgnoreCase");
        String str1= new String("abc");
        String str2 = new String("ABC");
        int x = str1.compareTo(str2);
        System.out.printf("compareTo é igual a: %d\n", x);
        int y = str1.compareToIgnoreCase(str2);
        System.out.printf("compareToIgnoreCase é igual a:%d\n", y);
        
        System.out.println();
        System.out.println("->Testando equalsIgnoreCase");
        String plv1= Teclado.leString("Digite a palavra 1:" );
        String plv2= new String(Teclado.leString("Digite a palavra 2:" ));
        boolean compara = plv1.equalsIgnoreCase(plv2);
        if(compara){
            System.out.println("As palavras são iguais!");
        }else{
            System.out.println("As palavras não são iguais!");
        }
        System.out.println("As palavras são iguais? " + compara);
 
        System.out.println();
        System.out.println("->Testando contains e substring");
        //Busca um ou uma sequência de caracteres
        String buscar = new String("ana");
        boolean compara2 = plv1.contains(buscar);
        System.out.println("A palavra 1 contém o caractere? " + compara2);
        System.out.println("Substring 0,1: " + plv1.substring(0,1));//Silvana S
        System.out.println("Substring 0,2: " + plv1.substring(0,2));//0123456  Si
        System.out.println("Substring 1,2: " + plv1.substring(1,2));// i
        System.out.println("Tamanho da Palavra 1: " + plv1.length());
       
        System.out.println();
        System.out.println("->Testando toUpperCase e toLowerCase");
        String nome = new String(Teclado.leString("Digite seu nome: " ));
        System.out.println("Nome em maiúsculo: " + nome.toUpperCase());
        String nomeMin = nome.toLowerCase();
        System.out.println("Nome em minúsculo: " + nomeMin);
        
        System.out.println();
        System.out.println("->Testando comparação de Objetos com equals");
        Pessoa p1 = new Pessoa("Silvana", 31); 
        Pessoa p2 = new Pessoa("SILVANA", 31); 
        System.out.println();
        p1.exibeDados();
        p2.exibeDados();
        System.out.println("OBJETOS p1 e p2 são iguais? " + p1.equals(p2));
        Pessoa p3;
        //p3 = new Pessoa(Teclado.leString("Digite seu nome: "),Teclado.leInt("Digite sua idade: ") ); 
        //p3.exibeDados();
        
        System.out.println();
        System.out.println("->Testando métodos classe Pessoa após fazer Aniversário");
        p2.fazAniversario();
        p2.exibeDados();
        System.out.println("Objetos p1 e p2 são iguais? " + p1.equals(p2));
    }

}
