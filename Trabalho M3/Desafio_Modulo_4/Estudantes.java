import java.io.*;
/**
 * A classe Estudantes orientará o cadastro concilhando 
 * fornecendo os parâmetros adequados para a realização do  cadastro dos Alunos.
 * Evandro Silveira da Motta) 
 *
 * @version (29/04/2020)
 */
public class Estudantes{
    // variáveis de instânciação
    private int codigo;
    private String nome;
    private String nasc;
    private String email;
    private String senha;
    private Cidade cidade;
    
    //contrutores para objetos da classe Estudantes
    public Estudantes(int codigo, String nome, String nasc, String email, String senha, Cidade cidade){
        this.codigo = codigo;
        this.nome = nome;
        this.nasc = nasc;
        this.email = email;
        this.senha = senha;
        this.cidade = cidade;
        cidade.novoEstudante();
    }
    //Metodos 
    public void setCodigo(int novoCodigo){
        this.codigo = novoCodigo;
    }
    
    public int getCodigo(){
        return codigo;
    } 
    
    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return nome;
    }
    
    public void setNasc(String nasc){
        this.nasc = nasc;
    }
    public String getNasc(){
        return nasc;
    }
    
    public void setEmail(String email){
        this.email = email;
    }
    public String getEmail(){
        return email;
    }
    
    public void setSenha(String senha){
        this.senha = senha;
    }
    public String getSenha(){
        return senha;
    }
    //exibe dados retornará em tela os dados inseridos pelo usuário.
    public void exibeDados(){
        System.out.println("Código do Aluno: " + this.codigo);
        System.out.println("Nome: " + this.nome);
        System.out.println("Data de nascimento: " + this.nasc);
        System.out.println("E-mail: " + this.email);
        System.out.println("Senha: " + this.senha);
        System.out.println("Cidade: " + cidade.getDescricao());
    }
}

