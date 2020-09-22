public class Cofrinho{
     //Associação entre a classe Cofrinho e a classe Pessoa
     private Pessoa dono; //atributo dono do tipo Pessoa
     private int qt50;
     private int qt25;
     private int qt10;

     //construtor 1
     public Cofrinho (Pessoa umaPessoa){
        dono = umaPessoa;
        qt50 = 0;
        qt25 = 0;
        qt10 = 0;
     }
     
     //construtor 2
     public Cofrinho (Pessoa umaPessoa, int q50, int q25, int q10){
        dono = umaPessoa;
        qt50 = q50;
        qt25 = q25;
        qt10 = q10;
     }
     
     //construtor 3
     public Cofrinho (int id, String n){
         dono = new Pessoa(n, id); //criando um objeto do tipo Pessoa
         qt50 = 0;
         qt25 = 0;
         qt10 = 0;        
     }
     
     //Permite alterar o objeto que é dono do cofrinho
     public void setDono (Pessoa novoDono){
        dono = novoDono;
     }
    
     //Permite retornar/obter o objeto que é dono do cofrinho
     public Pessoa getDono (){
        return dono;
     }
     
     public void depositaUmaMoedaCinquentaCentavos ( ){
        qt50 = qt50 +1;
     }
     
     public void depositaUmaMoedaDezCentavos ( ){
        qt10 = qt10 +1;
     }
     
     public void depositaUmaMoedaVinteCincoCentavos ( ){
        qt25 = qt25 +1;
     }
     
     public void depositaMoeda50 (int qtm50){
        qt50 = qt50 + qtm50;
     }
 
     public double calculaTotal (){
        double total; 
        total = qt50*0.5 + qt25*0.25 + qt10*0.10; 
        return total;
     }
     
     public String mensagemTotal(){
        String msgT;
        msgT = dono.getNome() + " tem um total de R$" + calculaTotal() + " reais no cofrinho";
        return msgT;
     }
     
     public void mostraQuantCadaMoedas(){
        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$");
        System.out.println(" Moedas 50 centavos: " + qt50);
        System.out.println(" Moedas 25 centavos: " + qt25);
        System.out.println(" Moedas 10 centavos: " + qt10);
        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$\n");
     }
     
}
