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
    
    //metodo de configuracao de valor para o atributo: modeloProcessador
    public void setModeloProcessador(String mod){
        modeloProcessador = mod;
    }
    
    //metodo de acesso ao valor do atributo: modeloProcessador
    public String getModeloProcessador(){
        return modeloProcessador;
    }

    //metodo de configuracao de valor para o atributo: capacidadeProcessador
    public void setCapacidadeProcessador(double cap){
        capacidadeProcessador = cap;
    }
    
    //metodo de acesso ao valor do atributo: capacidadeProcessador
    public double getCapacidadeProcessador(){
        return capacidadeProcessador;
    }

    //metodo de configuracao de valor para o atributo: quantidadeMemoriaRAM
    public void setQuantidadeMemoriaRAM(int qua){
        quantidadeMemoriaRAM = qua;
    }
    
    //metodo de acesso ao valor do atributo: quantidadeMemoriaRAM
    public int getQuantidadeMemoriaRAM(){
        return quantidadeMemoriaRAM;
    }

    //metodo de configuracao de valor para o atributo: tamanhoHD
    public void setTamanhoHD(int tam){
        tamanhoHD = tam;
    }
    
    //metodo de acesso ao valor do atributo: tamanhoHD
    public int getTamanhoHD(){
        return tamanhoHD;
    }
    
}// o simbolo "}" simboliza o fim do corpo da classe
