public class Porta
{
    private int cor;
    private boolean aberta;
    
    public Porta(int c, boolean a)
    {
        cor = c;
        aberta = a;
    }
    
    public void setCor(int c){
        if(c < 0 || c > 5){
            cor = 5;
        }else{
            cor = c;
        }
    }
    
    public int getCor(){
        return cor;
    }
    //retorna o nome da cor
    public String getDescricaoCor(){
        switch(cor){
            case 1: return "verde";
            case 2: return "azul";
            case 3: return "amarelo";
            case 4: return "vermelho";
            case 5: return "branco";
            default: return "cor inválida";
        }
    }
    
    public void pinta(int codCor){
        //verifica se é um código válido
        if(codCor < 0 || codCor > 5){
            cor = 5;
        }else{
            //verifica se a nova cor recebida é igual a anterior
            if(codCor == cor){
                //verifica se o valor da cor está entre 1 e 4 
                //para poder ir para a próx. cor
                if(cor < 5){
                    cor = cor + 1;
                }else{
                    //se o valor da cor é 5 recomeça a partir da cor 1
                    cor = 1;
                }
            //se a nova cor recebida é diferente da anterior
            //altera o valor atual de cor para a nova recebida
            }else if(codCor != cor){
               cor = codCor;
            }
        }
    }
    
    public void setAberta(boolean b){
        aberta = b;
    }
    //mesma função do getAberta
    public boolean isAberta(){
        return aberta;
    }
    
    public void abre(){
        aberta = true;
    }
    
    public void fecha(){
        aberta = false;
    } 
}
