
/**
 * Classe JogoAzar
 */
public class JogoAzar
{
    // atributo valor da aposta em reais
    private double valorAposta;

    /**
     * Construtor recebe o valor da aposta
     */
    public JogoAzar(double valor)
    {
        // atribui o parâmetro valor para o atributo valorAposta
        valorAposta = valor;
    }

    /**
     * Método Sorteio 
     */
    public void sorteio()
    {
        // sorteia o primeiro numero no intervalo [0,1]
        int num1 = (int)(Math.random()*2);
        
        // sorteia o segundo numero no intervalo [0,1]
        int num2 = (int)(Math.random()*2);
        
        //Se sortear 0 e 0 : ganha de volta o valor apostado.
        if(num1==0 && num2==0)
            System.out.println("Você ganhou o valor apostado: " + valorAposta);
        //Se sortear 1 e 1 : ganha a metade do valor apostado.
        else if(num1==1 && num2==1)
            System.out.println("Você ganhou a metade do valor apostado: " + valorAposta/2);
        //Se sortear 1 e 0 : não ganha nada.
        else if(num1==1 && num2==0)
            System.out.println("Você ganhou não ganhou nada!");
        //Se sortear 0 e 1 : ganha o dobro do valor apostado.
        else if(num1==0 && num2==1)
            System.out.println("Você ganhou o dobro do valor apostado: " + valorAposta*2);
        
        
    }
}
