/**
 * Classe de Teste TresNumerosInteiros
 */

import java.util.Scanner;
public class TesteTresNumerosInteiros
{
    
    /**
     * Método main 
     */
    public static void main(String[] args)
    {
        
        System.out.println("##########################################");
        System.out.println("CRIAR OBJETO 1");
        System.out.println("##########################################");
        
        //usando a classe Scanner
        Scanner leia = new Scanner(System.in);
        System.out.print("Digite o primeiro número: ");
        int auxPri = leia.nextInt();
        System.out.print("Digite o segundo número: ");
        int auxSeg = leia.nextInt();
        System.out.print("Digite o terceiro número: ");
        int auxTer = leia.nextInt();
        
        //Criando o objeto t2
        TresNumerosInteiros t2 = new TresNumerosInteiros(auxPri,auxSeg,auxTer);
        
        //exibir o maior e o menor, chamando os métodos adequados.
        System.out.println("Maior valor: " + t2.getMaior());
        System.out.println("Menor valor: " + t2.getMenor());
        //exibir os 3 números em ordem crescente
        t2.classificaOrdemCrescente();
        
        //i) ler 3 números inteiros do teclado com a seguinte tela de entrada
        //ii) criar um objeto da classe TresNumerosInteiros com os números lidos do teclado.
        /*TresNumerosInteiros tni = new TresNumerosInteiros(  Teclado.leInt("Digite o primeiro número: "),
                                                            Teclado.leInt("Digite o segundo número: "),
                                                            Teclado.leInt("Digite o terceiro número: ")
                                                         );
                                                         

        //iii) exibir o maior e o menor, chamando os métodos adequados.
        System.out.println("Maior valor: " + tni.getMaior());
        System.out.println("Menor valor: " + tni.getMenor());
        tni.classificaOrdemCrescente();
        
        //iv) alterar o segundo atributo para 999.
        //tni.setSegundoNumero(999);
        
        //v) exibir os 3 números em ordem crescente, chamando os métodos adequados.
        tni.classificaOrdemCrescente();
        
        System.out.println("##########################################");
        System.out.println("CRIAR OBJETO 2");
        System.out.println("##########################################");
        
        //vi) criar outro objeto da classe TresNumerosInteiros com números quaisquer.
        TresNumerosInteiros tni2 = new TresNumerosInteiros(34,68,90);
        
        //vii) alterar o segundo atributo, para que este fique igual à diferença do primeiro pelo segundo, 
        //chamando o método setSegundoNumero.
        tni2.setSegundoNumero(34);
        
        //viii) exibir os 3 números.
        System.out.println("Primeiro Número: " + tni2.getPrimeiroNumero());
        System.out.println("Segundo Número: " + tni2.getSegundoNumero());
        System.out.println("Terceiro Número: " + tni2.getTerceiroNumero());
        
        //ix) trocar, entre si, os valores do terceiro atributo dos dois objetos, 
        //chamando os métodos adequados.
        tni.setTerceiroNumero(tni2.getTerceiroNumero()); // seta o valor do terceiro do objeto 2 no atributo terceiro do objeto 1
        tni2.setTerceiroNumero(tni.getTerceiroNumero()); // seta o valor do terceiro do objeto 1 no atributo terceiro do objeto 2
        
        //x) exibir os valores dos atributos dos dois objetos e o maior valor (entre os 6 valores), 
        //chamando os métodos adequados.
        System.out.println("##########################################");
        System.out.println("APRESENTAR OS VALORES DOS DOIS OBJETOS");
        System.out.println("##########################################");
        
        System.out.println("Primeiro Número OBJ 1: " + tni.getPrimeiroNumero());
        System.out.println("Segundo Número OBJ 1: " + tni.getSegundoNumero());
        System.out.println("Terceiro Número OBJ 1: " + tni.getTerceiroNumero());
        System.out.println("##########################################");
        System.out.println("Primeiro Número OBJ 2: " + tni2.getPrimeiroNumero());
        System.out.println("Segundo Número OBJ 2: " + tni2.getSegundoNumero());
        System.out.println("Terceiro Número OBJ 2: " + tni2.getTerceiroNumero());
                                          
        System.out.println("##########################################");
        
        //busca o maior valor do objeto 1 e compara com o maior valor do objeto 2
        if(tni.getMaior() > tni2.getMaior()){
            System.out.println("Maior Número dos 6 : " + tni.getMaior());
        }else{
            System.out.println("Maior Número dos 6 : " + tni2.getMaior());
        }
        
       */                                               
    }
}
