
/**
 * Classe Funcionario
 */
public class Funcionario
{
    // Faça a classe Funcionario com os atributos nome, depto (do tipo Departamento) e salario
    private String nome;
    private Departamento depto;
    private double salario;

    /**
     * A classe deve oferecer um construtor
     */
    public Funcionario(String nom, Departamento dep, double sal)
    {
        // atribui o valor dos parâmetros para os atributos
        nome = nom;
        depto = dep;
        salario = sal;
    }
    
    /**
     * A classe deve oferecer algumas funcionalidades através dos métodos abaixo especificados:
        getNome : devolve o nome do funcionário.
     */
    public String getNome()  // método retorna o nome do Funcionario que é String
    {
        return nome;
    }

    /**
     * A classe deve oferecer algumas funcionalidades através dos métodos abaixo especificados:
        getSalario: devolve o salário do funcionário.
     */
    public double getSalario()  // método retorna o salario do Funcionario que é double
    {
        return salario;
    }

    /**
     * A classe deve oferecer algumas funcionalidades através dos métodos abaixo especificados:
        getDepartamento: devolve o departamento (do tipo departamento) do funcionário
     */
    public Departamento getDepartamento()  // método retorna o depto do Funcionario que é Departamento
    {
        return depto;
    }
    
    /**
     * A classe deve oferecer algumas funcionalidades através dos métodos abaixo especificados:
        reajustaSalario: recebe um código de reajuste (1, 2 ou 3) e:
         se código = 1, reajuste de 20%.
         se código = 2, reajuste de 5% mais um bônus de 57,00 reais. 
         se código = 3, reajuste de 13%. 
     */
    public void reajustaSalario(int codigo) //método não retorna nada então é void
    {
        System.out.println("Salário atual: "+ salario);
        
        //verifica o codigo recebido com o switch case
        switch(codigo){
            case 1:// se codigo 1, então reajusta o salário em 20%
                salario = ((salario*20)/100)+salario;
                System.out.println("Reajuste aplicado: 20%");
                break;
            case 2:// se codigo 2, então reajusta o salário em 5% + bonus de 57,00
                salario = ((salario*5)/100)+salario+57;
                System.out.println("Reajuste aplicado: 5% + bônus de 57,00");
                break;
            case 3:// se codigo 2, então reajusta o salário em 13%
                salario = ((salario*13)/100)+salario;
                System.out.println("Reajuste aplicado: 13%");
                break;
        }
        
        System.out.println("Novo Salário: "+ salario);
    }
}
