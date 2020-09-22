
public class Sala
{
    private String nome;
    private Porta portaDeEntrada;
    private Porta portaDeSaida;
    private int maximo;
    private int quantos;
    
    //variável que conta a quantidade de pessoas que sairam da sala
    private int contPess = 0;
    
    public Sala(String n, Porta pE, Porta pS, int mx)
    {
       nome = n;
       portaDeEntrada = pE;
       portaDeSaida = pS;
       maximo = mx;
    }
    
    public void setNome(String n){
       nome = n;
    }
    public String getNome(){
       return nome;
    }
    
    public void setMaximo(int max){
       maximo = max;
    }
    public int getMaximo(){
       return maximo;
    }
    
    public void setQuantos(int qt){
       quantos = qt;
    }
    public int getQuantos(){
       return quantos;
    }
    
    public boolean estaCheia(){
       if(maximo == quantos){
          return true;
       }
       return false;
    }
    
    public boolean entra(){
       if(maximo > quantos){
          quantos = quantos + 1;
          
          if(quantos == 1){
              portaDeEntrada.abre();
          }else if(quantos == maximo){
              portaDeEntrada.fecha();
          }
          
          return true;
       }
       return false;
    }
    
    public boolean sai(){
        //Só pode sair, se há alguém na sala. 
        if(quantos >= 1){
            quantos = quantos - 1;
            
            //Quando sair o primeiro, a porta de saída deve ser aberta. 
            contPess++;
            if(contPess == 1){
                portaDeSaida.abre();
                
            //Quando  sair o último, as duas portas devem ser fechadas e pintadas.
            }else if(contPess == quantos){
                portaDeEntrada.fecha();
                portaDeSaida.fecha();
                
                portaDeEntrada.pinta(3); //pintará com amarelo
                portaDeSaida.pinta(4);  //pintará com vermelho
            }
            
            //quando sair de uma sala cheia, abrir a porta de entrada
            if (maximo == (quantos+1)){
                portaDeEntrada.abre();
            }
            //retorna true se saiu 
            return true;
        }
        //retorna false se não foi possível sair
        return false;
    }
    
    public void exibeDadosSala(){
        System.out.println("Nome: " + nome);
        System.out.println("Cor Porta de Entrada: " + portaDeEntrada.getDescricaoCor());
        System.out.println("Porta de Entrada aberta: " + portaDeEntrada.isAberta());
        System.out.println("Cor Porta de Saída: " + portaDeSaida.getDescricaoCor());
        System.out.println("Porta de Saída aberta: " + portaDeSaida.isAberta());
        System.out.println("Capacidade Máxima: " + maximo);
        System.out.println("Quantidade atual de pessoas: " + quantos);
    }
}
