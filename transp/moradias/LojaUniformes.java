public class LojaUniformes { 
    private String nome;
    private int quantidadesMoletom;
    private int quantidadesCamisa;
    private double valorTotal;

    public LojaUniformes (String nome, int quantidadesMoletom, int quantidadesCamisa){
        this.nome = nome;
        this.quantidadesMoletom = quantidadesMoletom;
        this.quantidadesCamisa = quantidadesCamisa;
 
    }
    
       public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return nome;
    }
    
        public void setQuantidadesMoletom(int quantidadesMoletom){
        this.quantidadesMoletom = quantidadesMoletom;
    }
        public int getQuantidadesMoletom(){
        return quantidadesMoletom;
    }
 
        public void setQuantidadesCamisa(int quantidadesCamisa){
        this.quantidadesCamisa = quantidadesCamisa;
    }
        public int getQuantidadesCamisa(){
        return quantidadesCamisa;
    }
 
    public double valorTotal(){
        return valorTotal;
    }
    
    public void exibeInformacoesLojaUniformes(){
        System.out.printf("Boa tarde %s .\n" , nome);
        System.out.println("Quantidade(s) de moletom(s) no carrinho: " + quantidadesMoletom);
        System.out.println("Quantidade(s) de Camisa(s) no carrinho: " + quantidadesCamisa);
        System.out.printf("Valor total a pagar: R$%.2f",valorTotal = (quantidadesMoletom * 120.0 + quantidadesCamisa * 45.0));
        
    }
}

