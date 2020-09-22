public class Funcionario{
//Atributo
private String nome;
private int idade;
private int matricula;

//Construtor
Funcionario(String nome,int idade, int matricula){
this.nome = nome;
this.idade = idade;
this.matricula = matricula;
}
//Método GET
public String getNome(){
return nome;
}

public int getIdade(){
return idade;
}

public int getMatricula(){
return matricula;
}

//Método SET
public void setNome(String nome){
this.nome = nome;
}

public void setIdade(int idade){
this.idade = idade;
}

public void setMatricula(int matricula){
this.matricula = matricula;
}

//Método exibeDados
public void exibeDados(){
System.out.println("Nome: " + getNome());
System.out.println("Idade: " + getIdade());
System.out.println("Matrícula: " + getMatricula());
}

}