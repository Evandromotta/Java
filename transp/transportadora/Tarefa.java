public class Tarefa {
    public static void main (String [] args){
       System.out.println("Digite 3 números inteiros");
       int a = Teclado.leInt("Digite o primeiro valor: ");
       int b = Teclado.leInt("Digite o segundo valor: ");
       int c = Teclado.leInt("Digite o terceiro valor: ");
        
       if( a < b && a < c) {
            System.out.printf(" O menor número é %d \n", a);
       }
         else if ( n2 < n1 && n2 < n3) {
             System.out.printf(" O menor número é %d \n", n2);
             } 
       else {
                 System.out.printf(" O menor número é %d \n", n3);       }   }}