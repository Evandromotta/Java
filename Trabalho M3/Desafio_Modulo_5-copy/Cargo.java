public class Cargo extends Funcionario{
//Atributo
private String cargo;
private double salario;

//Construtor
Cargo(String nome, int idade, int matricula, String cargo, double salario){
super(nome,idade,matricula);
this.cargo = cargo;
this.salario = salario;
}

//Método Get
public String getCargo(){
return cargo;
}

public double getSalario(){
return salario;
}

//Método SET
public void setCargo(String cargo){
this.cargo = cargo;
}

public void setSalario(double salario){
this.salario = salario;
}

//Método exibeDados
public void exibeDados(){
super.exibeDados();
System.out.println("Cargo: " + getCargo());
System.out.println("Salário: R$ " + getSalario() + " reais");

}
}