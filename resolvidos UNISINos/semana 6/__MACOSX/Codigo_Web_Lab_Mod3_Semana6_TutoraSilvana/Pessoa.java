public class Pessoa{

     //atributos
     private String nome;   
     private int idade;

     //construtor
     public Pessoa (String n, int i){
         nome = n;
         idade = i;
     }
      
     public String getNome(){
         return nome;
     }
     
     public int getIdade(){
         return idade;
     }
     
     //método que atualiza a idade quando a pessoa faz aniversário
     public void fazAniversario( ){
          idade = idade + 1;
     }

     public boolean equals(Object o) {
         Pessoa aux = (Pessoa) o;
    
         if(this.nome.equalsIgnoreCase(aux.nome) && this.idade == aux.getIdade()){
             return true;
         }
         else{
             return false;
         }
     }
     
     //método que exibe os dados da pessoa, na tela 
     public void exibeDados( )  {
         System.out.println("-- Dados Pessoais --");
         System.out.println("Nome: " + nome);
         System.out.println("Idade: " + idade);
     }

}//fim da classe
