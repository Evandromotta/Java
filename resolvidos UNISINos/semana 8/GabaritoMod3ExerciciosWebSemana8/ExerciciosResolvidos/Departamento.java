
/**
 * Classe Departamento
 * @version (a version number or a date)
 */
public class Departamento {
    
    //------ atributos------ 
    private int numero; 
    private String nome;

    //-------- construtor----------------------------------- 
    public Departamento( int num, String nom){
        setNumero(num); 
        setNome(nom);
    }// fim do construtor

    //--------------métodos---------------------- 
    public void setNumero(int n ){
        if (n >0) 
            numero= n;
    }//--fim do método/ setNumero ---------------

    public void setNome(String n ) {
        if (n.length() >0) 
            nome = n;
    }//---fim do método setNome ------------------

    public int getNumero( ) {
        return numero;
    }//---fim do método getNumero -----------------

    public String getNome( ) {
        return nome;
    }//---fim do método getNome -------------------

}//fim da classe