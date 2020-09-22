public class Teste
{
    public static void main(String args[]){
       Porta p1 = new Porta(2,false);
       Porta p2 = new Porta(4,false);
       
       Sala s1 = new Sala("Reunião", p1, p2, 4);
       
       int lugaresDisponiveis;
       
       s1.exibeDadosSala();
       if(s1.entra()){
           System.out.println("Pessoa 1 entrou na Sala!");
       }
       
       lugaresDisponiveis = s1.getMaximo() - s1.getQuantos();
       
       System.out.println();
       System.out.println("Quantas pessoas na sala? " + s1.getQuantos());
       System.out.println("Quantas lugares estão disponíveis? " + lugaresDisponiveis);
       System.out.println();
       s1.exibeDadosSala();
       
       if(s1.entra()){
           System.out.println("Pessoa 2 entrou na Sala!");
       }
       if(s1.entra()){
           System.out.println("Pessoa 3 entrou na Sala!");
       }
       if(s1.entra()){
           System.out.println("Pessoa 4 entrou na Sala!");
       }
       
       lugaresDisponiveis = s1.getMaximo() - s1.getQuantos();
       System.out.println();
       System.out.println("Quantas pessoas na sala? " + s1.getQuantos());
       System.out.println("Quantas lugares estão disponíveis? " + lugaresDisponiveis);
       System.out.println();
       s1.exibeDadosSala();
       
       if(s1.sai()){
           System.out.println("Pessoa 1 saiu da Sala!");
           System.out.println();
           s1.exibeDadosSala();
       }
       if(s1.sai()){
           System.out.println("Pessoa 2 saiu da Sala!");
       }
       if(s1.sai()){
           System.out.println("Pessoa 3 saiu da Sala!");
       }
       if(s1.sai()){
           System.out.println("Pessoa 4 saiu da Sala!");
       }
       
       System.out.println();
       s1.exibeDadosSala();
    
    }
}
