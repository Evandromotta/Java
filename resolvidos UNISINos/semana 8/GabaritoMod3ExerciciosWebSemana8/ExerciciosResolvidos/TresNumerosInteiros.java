
/**
 * Classe TrêsNúmerosInteiros
 */
public class TresNumerosInteiros
{
    //Programe a classe TresNumerosInteiros com 3 atributos inteiros positivos (primeiro, segundo e terceiro).
    private int primeiro;
    private int segundo;
    private int terceiro;

    /**
     * A classe deve oferecer um construtor com os 3 parâmetros
     */                       //3        2         1
    public TresNumerosInteiros(int pri, int seg,int ter)
    {
        // atribui os valores dos parâmetros para os atributos da classe
        primeiro = pri; //3
        segundo = seg;  //2
        terceiro = ter; //1
    }

    /**
     * A classe deve oferecer os seguintes métodos:
        - setPrimeiroNumero: configura o primeiro atributo. Aceita somente positivo. Se valor inválido,
        atribui 1.
     */
    public void setPrimeiroNumero(int pri) // método não devolde nada por isso é void
    {
        // verifica se o valor do parâmetro é positivo
        if(pri>=0) {
            // atribui o valor do parâmetro para o primeiro atributo
            primeiro = pri;
        } else { //é valor inválido
            primeiro = 1;
        }
    }
    
    /**
     * A classe deve oferecer os seguintes métodos:
        - setSegundoNumero: configura o segundo atributo. Aceita somente positivo. Se valor inválido,
        atribui 1.
     */
    public void setSegundoNumero(int seg) // método não devolde nada por isso é void
    {
        // verifica se o valor do parâmetro é positivo
        if(seg>=0) {
            // atribui o valor do parâmetro para o segundo atributo
            segundo = seg;
        } else { //é valor inválido
            segundo = 1;
        }
    }

    /**
     * A classe deve oferecer os seguintes métodos:
        - setTerceiroNumero: configura o terceiro atributo. Aceita somente positivo. Se valor inválido,
        atribui 1.
     */
    public void setTerceiroNumero(int ter) // método não devolde nada por isso é void
    {
        // verifica se o valor do parâmetro é positivo
        if(ter>=0) {
            // atribui o valor do parâmetro para o terceiro atributo
            terceiro = ter;
        } else { //é valor inválido
            terceiro = 1;
        }
    }

    /**
     * A classe deve oferecer os seguintes métodos:
        - getPrimeiroNumero: devolve o primeiro atributo.
     */
    public int getPrimeiroNumero() // método retorna o valor do primeiro atributo que é do tipo int, portanto o retorno do método é int
    {
        return primeiro;
    }
    
    /**
     * A classe deve oferecer os seguintes métodos:
        - getSegundoNumero: devolve o segundo atributo.
     */
    public int getSegundoNumero() // método retorna o valor do segundo atributo que é do tipo int, portanto o retorno do método é int
    {
        return segundo;
    }

    /**
     * A classe deve oferecer os seguintes métodos:
        - getTerceiroNumero: devolve o terceiro atributo.
     */
    public int getTerceiroNumero() // método retorna o valor do terceiro atributo que é do tipo int, portanto o retorno do método é int
    {
        return terceiro;
    }

    /**
     * A classe deve oferecer os seguintes métodos:
        - getMaior: retorna (devolve) o maior número. Se iguais, devolve qualquer um.
        obs. o método deve executar o menor número possível de testes.
     */
    public int getMaior() // método retorna o maior valor, portanto o retorno do método é int
    {
        //verifica se todos os números são iguais
        if(primeiro == segundo && primeiro == terceiro) {
            return primeiro; // retorna qualquer um deles, neste caso o primeiro
        } else {
           //verifica se o primeiro é maior que o segundo
            if((primeiro>segundo) && (primeiro>terceiro)){// se for maior, verifica se o primeiro é maior que o terceiro
               return primeiro; // se for maior retorna o primeiro e encerra a execução do método
            } else if((segundo>primeiro) && (segundo>terceiro)){ // se o primeiro não é maior que o segundo, então verifica se o segundo é maior que o terceiro
               return segundo; // se for maior, então retorna o segundo e encerra a execução do método
	    }
	}
        //porém se as verificações acima forem falsas, então é porque o maior é o terceiro
        return terceiro; //portanto retorna o terceiro e encerra a execução do método
    }

    /**
     * A classe deve oferecer os seguintes métodos:
        - getMenor: retorna (devolve) o menor número. Se iguais, devolve qualquer um. 
        obs. o método deve executar o menor número possível de testes
     */
    public int getMenor() // método retorna o menor valor, portanto o retorno do método é int
    {
        //verifica se todos os números são iguais
        if(primeiro == segundo && primeiro == terceiro)
            return primeiro; // retorna qualquer um deles, neste caso o primeiro
        
        else //senão verifica se o primeiro é menor que o segundo 
            if(primeiro<segundo)
                if(primeiro<terceiro) // se for menor, verifica se o primeiro é menor que o terceiro
                    return primeiro; // se for menor retorna o primeiro e encerra a execução do método
            
            else if(segundo<terceiro) // se o primeiro não é menor que o segundo, então verifica se o segundo é menor que o terceiro
                return segundo; // se for menor, então retorna o segundo e encerra a execução do método
        
        //porém se as verificações acima forem falsas, então é porque o menor é o terceiro
        return terceiro; //portanto retorna o terceiro e encerra a execução do método
    }
    
    /**
     * A classe deve oferecer os seguintes métodos:
        - classificaOrdemCrescente: classifica os 3 números em ordem crescente. 
        Observe que os atributos devem ficar classificados, na memória.
     */
    public void classificaOrdemCrescente() // método que classifica a ordem dos números, não retorna nada por isso é void
    {
        int auxiliar; // variável auxiliar para possibilitar a classificação
        //etapa 1 da classificação
        //3 2 1
        if (primeiro > segundo){ // verifica se o primeiro é maior que o segundo
            //em caso afirmativo, atribui o valor do primeiro para a variável auxiliar (pois ele é um número maior e não é o primeiro pela ordem crescente)
            auxiliar=primeiro; //3
            primeiro=segundo; // 2 atribui o valor do segundo para o primeiro, para ir ordenando 
            segundo=auxiliar; // 3 atribui o valor da variável auxiliar para o segundo, neste momento temos dois números ordenados
        }//2 3 1
        //etapa 2 da classificação
        if (segundo > terceiro){ // verifica se o segundo é maior que o terceiro
            //em caso afirmativo, atribui o valor do segundo para a variável auxiliar (pois ele é um número maior e não é o primeiro pela ordem crescente)
            auxiliar=segundo; //3
            segundo=terceiro;// 1 atribui o valor do terceiro para o segundo, para ir ordenando 
            terceiro=auxiliar; // 3 atribui o valor da variável auxiliar para o terceiro, neste momento temos mais dois números ordenados
            //2 1 3
            //por fim, na etapa 3 e última verificação
            if (primeiro > segundo){ // verifica se o primeiro é maior que o segundo novamente, pois o segundo recebeu o valor do terceiro
                //em caso afirmativo, atribui o valor do primeiro para a variável auxiliar (pois ele é um número maior e não é o primeiro pela ordem crescente)
                auxiliar = primeiro; //2
                primeiro=segundo; // 1 atribui o valor do segundo para o primeiro, para ir ordenando 
                segundo=auxiliar; // 2 atribui o valor da variável auxiliar para o segundo, neste momento temos dois números ordenados
            }//1 2 3
        }
                            //1                2                3
        System.out.println (primeiro + " " + segundo + " " + terceiro);
    }
    
}
