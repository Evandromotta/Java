 

public class Exe04RevCond
{
    public String verificaQuadrante(double x, double y){
       if(x>0 && y>0){
          return "Primeiro Quadrante"; 
       }else if(x<0 && y>0){
          return "Segundo Quadrante"; 
       }else if(x<0 && y<0){
          return "Terceiro Quadrante"; 
       }else if(x>0 && y<0){
          return "Quarto Quadrante"; 
       }else if(x==0 && y==0){
          return "Origem";        
       }
       return "Coordenadas inválidas!";
    }
}