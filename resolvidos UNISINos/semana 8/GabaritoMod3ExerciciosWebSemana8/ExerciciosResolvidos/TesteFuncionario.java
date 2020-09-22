
/**
 * Classe de Teste
 */
public class TesteFuncionario
{
    
    public static void main(String[] args){
        
        System.out.println("######################################");
        System.out.println("CRIA O FUNCIONÁRIO");
        System.out.println("######################################");
        System.out.println("");//deixa uma linha em branco
        
        //i) crie (instancie) um funcionário com dados lidos do teclado
        //como o segundo parâmetro do funcionário é um objeto do tipo Departamento, pode-se criar o objeto durante a criação do objeto Funcionário
        Funcionario func = new Funcionario( Teclado.leString("Digite o nome do Funcionário: "),
                                            new Departamento(   Teclado.leInt("Digite o código do Departamento do Funcionário: "),
                                                                Teclado.leString("Digite a descrição do Departamento do Funcionário: ")
                                                            ),
                                            Teclado.leDouble("Digite o salário do Funcionário: ")
                                          );
                                          
        System.out.println("");//deixa uma linha em branco
        System.out.println("######################################");
        System.out.println("REAJUSTA O SALÁRIO DO FUNCIONÁRIO");
        System.out.println("######################################");
        System.out.println("");//deixa uma linha em branco
        
        //ii) leia, do teclado um código de reajuste. Se código inválido, exiba uma mensagem de erro e
        //encerre o programa.
        int codigoReajuste;//declara uma variável local para auxiliar na verificação do código digitado
        do{//enquanto o código digitado for diferente do valor permitido, pede para o usuário informar o código
            codigoReajuste = Teclado.leInt("Informe um código de reajuste (1,2 ou 3): ");
        } while(codigoReajuste<1 ||codigoReajuste>3); // faz a verificação e mantém a repetição enquanto o valor diferente do permitido
        
        //iii) chame os métodos adequados para aplicar o reajuste e exiba os dados do funcionário na tela
        
        //cria uma variável local para armazenar o valor anterior do salário do funcionário
        double salarioAnterior = func.getSalario();
        
        //reajusta o salário do funcionário
        func.reajustaSalario(codigoReajuste);
        
        System.out.println("");//deixa uma linha em branco
        System.out.println("######################################");
        System.out.println("APRESENTA OS DADOS DO FUNCIONÁRIO");
        System.out.println("######################################");
        System.out.println("");//deixa uma linha em branco
        
        //apresenta os dados do funcionário na tela
        System.out.println("Nome do funcionário: " + func.getNome());
        System.out.println("Departamento do funcionário: "+ func.getDepartamento().getNumero() + " - " + func.getDepartamento().getNome());
        System.out.println("Salário anterior do funcionário: " + salarioAnterior);
        System.out.println("Salário do funcionário: " + func.getSalario());
        
    }
}
