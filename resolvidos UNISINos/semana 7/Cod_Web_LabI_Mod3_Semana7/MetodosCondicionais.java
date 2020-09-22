 

public class MetodosCondicionais
{
    public String verificaParOuImpar(int num)
    {
        if(num%2 == 0){
            return "Par";
        }else{
            return "Ã?mpar";
        }
    }
    
    public double maiorDosDois(double a, double b)
    {
        if(a > b){
           return a;
        }else{
           return b;
        }
    }
    
    public boolean iguais(String umNome, String outroNome){
        if(umNome.equalsIgnoreCase(outroNome)){
            return true;
        }else{
            return false;
        }
    }
    
}
