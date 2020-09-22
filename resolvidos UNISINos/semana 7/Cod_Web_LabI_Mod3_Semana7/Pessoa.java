 

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
     
     public String verificaIdadeParImpar(){
        if(idade%2 == 0){
           return "Par";
        }else{
           return "�?mpar";
        }
     }
     
     public int verificaMaiorIdade(Pessoa p1, Pessoa p2){
        if(p1.getIdade() > p2.getIdade()){
            return p1.getIdade();
        }else if(p2.getIdade() > p1.getIdade()){
            return p2.getIdade();
        }
        return 0;
     }
     
     public String verificaFaixaEtaria(){
        String faixa = "Infantil";
        if(idade<18 && idade>=14){ //14-17
           faixa = "Adolescente";
        }else if (idade>=18 && idade<=25){ //18-25
           faixa = "Jovem";
        }else if (idade>25 && idade<=70){ //26-70
            faixa = "Adulto";
        }else if (idade>70){ //maior que 70
            faixa = "Terceira Idade";
        }
        return faixa;
     }
     
     //método que exibe os dados da pessoa, na tela 
     public void exibeDados( )  {
         System.out.println("Nome: " + nome);
         System.out.println("Idade: " + idade);
     }

}//fim da classe
