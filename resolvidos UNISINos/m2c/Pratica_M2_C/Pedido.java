public class Pedido
{
    // atributos da classe
    private int codigo;
    private String data;
    private Cliente cliente;
    private Computador computador;

    /**
     * Construtor
     */
    public Pedido(int cd, String da, Cliente cl, Computador co)
    {
        codigo = cd;
        data = da;
        cliente = cl;
        computador = co;
    }
}
