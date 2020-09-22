import java.io.*;
/**
 * A classe Cidade orientará o cadastro concilhando 
 * as quantidades de aluno por unidade de educação.
 * Evandro Silveira da Motta) 
 *
 * @version (29/04/2020)
 */
public class Cidade extends TesteFun4Study{
    // variáveis de instânciação
    private int codigoCidade;
    private String descricao;
    private String uf;
    private int quantidadeAluno;

    //Construtores para objetos da classe Cidade
    public Cidade(int codigoCidade, String descricao, String uf){
        this.codigoCidade = codigoCidade;
        this.descricao = descricao;
        this.uf = uf;
        quantidadeAluno = 0;
        
    }
    //Metodos
    public int getCodigoCidade(){
        return codigoCidade;
    }
    public void setCodigoCidade (int novoCodigoCidade){
        codigoCidade = novoCodigoCidade;
    }
    
    public void setDescricao(String novaDescricao){
        descricao = novaDescricao;
    }
    public String getDescricao(){
        return descricao;
    }
    
    public void setUf(String novaUf){
        uf = novaUf;
    }
    public String getUf(){
        return uf;
    }
 
    public void novoEstudante(){
        quantidadeAluno =  quantidadeAluno + 1;
    }
    
    //exibe dados retornará em tela os dados inseridos pelo usuário.
    public void exibeDados(){
        System.out.printf("Código da Cidade: %d\n" , this.codigoCidade);
        System.out.println("Nome da Cidade: " + this.descricao);
        System.out.println("UF: " + this.uf);
        System.out.println("Quantidade de Alunos desta cidade: " + this.quantidadeAluno);
    
    }
}   