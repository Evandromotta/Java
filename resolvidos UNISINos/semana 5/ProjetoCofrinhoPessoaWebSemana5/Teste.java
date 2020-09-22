public class Teste
{
    public static void main(String args[]){
         Pessoa p1 = new Pessoa("Silvana", 31);
         
         //usa o contrutor 1 para criar o objeto c1
         Cofrinho c1 = new Cofrinho(p1);
         System.out.println(c1.mensagemTotal() + " 1");
         c1.mostraQuantCadaMoedas();
         
         //usa o contrutor 2 para criar o objeto c2
         Cofrinho c2 = new Cofrinho(p1, 10, 2, 5);
         System.out.println(c2.mensagemTotal() + " 2");
         c2.mostraQuantCadaMoedas();
         
    }
}
