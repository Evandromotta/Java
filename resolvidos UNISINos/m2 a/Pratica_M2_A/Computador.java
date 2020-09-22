//assinatura da classe:
//public = identificador da classe, esta classe eh publica
//class = identifica a classe
//Computador = identifica o nome da classe
public class Computador
{// o simbolo "{" simboliza o inicio do corpo da classe
  
    //atributos da classe:
    private String modeloProcessador;
    private double capacidadeProcessador;
    private int quantidadeMemoriaRAM;
    private int tamanhoHD;
    
    //construtor da classe Computador que recebe como parametros (dentro das chaves):
    //mod = parametro do tipo String que ira receber o valor para o atributo: modeloProcessador
    //cap = parametro do tipo double que ira receber o valor para o atributo: capacidadeProcessador
    //qua = parametro do tipo int que ira receber o valor para o atributo: quantidadeMemoriaRAM
    //tam = parametro do tipo int que ira receber o valor para o atributo: tamanhoHD
    public Computador(String mod, double cap, int qua, int tam){
        //cada parametro sera utilizado para atribuir valor para os atributos, conforme exemplo abaixo
        modeloProcessador = mod;
        capacidadeProcessador = cap;
        quantidadeMemoriaRAM = qua;
        tamanhoHD = tam;
    }
      
}// o simbolo "}" simboliza o fim do corpo da classe
