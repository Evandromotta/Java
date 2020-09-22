public class Carga {
    private String produto;
    private boolean carregar;

    public Carga(String p, boolean c){
         produto = p;
         carregar = c;
        }
        
        public void setProduto(String p) {
            produto = p;
    }
    
        public String getProduto() {
            return produto;
    }
    
        public void setCarregar(boolean d) {
            carregar = d;
    }
    
        public boolean getCarregar() {
            return carregar;
    }
    
        public void deveCarregar() {
            carregar = true;
    }
    
        public void naoCarregar() {
            carregar = false;
    }
} 