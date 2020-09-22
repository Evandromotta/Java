    public class teste {
    
    public static void main(String args[]){ma
    Carga c1 = new Carga("Soja",true);
    Carga c2 = new Carga("Trigo",false);
    
    Frota f1 =new Frota("Vw 15000", c1, c2, 300);
    
    f1.exibeInformacoesFrota();
    f1.setQuantidade(2);
    f1.carrega();
    
    System.out.println(" Quantidade de Carga do veículo: " + f1.getQuantidade());
    f1.carrega();
    f1.descarrega();
    f1.exibeInformacoesFrota();
    
    }    
    
}

