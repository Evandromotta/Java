public class Pessoa {
    private String nome;
    private int idade;
    private char sexo;
    private Dado meuDado;
    
    public Pessoa(String n, int i, char s, Dado d){
        nome = n;
        idade = i;
        sexo = s;
        meuDado = d;
    }
    // Visibilidade tipo_de_retorno nome (Parametros)
    public String getNome(){
      return nome;  
    }
    // Visibilidade tipo_de_retorno nome (Parametros)
    public int getIdade(){
        return idade;
    }
    
    public char getSexo(){
        return sexo;    
    }
    
    public void setNome(String novoNome){
        nome = novoNome;
    }
    
    public void setIdade (int novaIdade){
        idade = novaIdade;
    }
    
    public void setSexo (char novoSexo){
        sexo = novoSexo;
    }
    
   
}
