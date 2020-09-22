
/**
 * Classe de Teste JogoAzar
 */
public class TesteJogoAzar
{
    /**
     * Método main 
     */
    public static void main(String[] args)
    {
        System.out.println("$$$$$$$$$$$$$$$$$$$$$ JOGO DO AZAR $$$$$$$$$$$$$$$$$$$$$");
        System.out.println(""); //deixa uma linha em branco
        
        //cria o jogo e pede o valor da aposta
        JogoAzar ja = new JogoAzar(Teclado.leDouble("QUANTO VOCÊ APOSTA ? "));
        
        System.out.println(""); //deixa uma linha em branco
        
        System.out.println("$$$$$$$$$$$$$$$$$$$$$ SORTEIO $$$$$$$$$$$$$$$$$$$$$");
        System.out.println(""); //deixa uma linha em branco
        ja.sorteio();
        
    }
}
