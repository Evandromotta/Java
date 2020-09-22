public class Professor {
    
        private String nome;
        private String materia;
        private int sala;
        private double salario;
    
    public Professor(String nome, String materia, int sala, double salario) {
        this.nome = nome;
        this.materia = materia;
        this.sala = sala;
        this.salario = salario;
}

public String getName() {
    return nome;
}

public void setName(String name) {
    this.nome = name;
}

public String getMateria() {
    return materia;
}

public void setMateria(String materia) {
    this.materia = materia;
}

public int getSala() {
    return sala;
}

public void setSala(int sala) {
    this.sala = sala;
}

public double getSalario() {
    return salario;
}

public void setSalario(double salario) {
    this.salario = salario;
}

    public void apresentacao() {
    System.out.printf("Olá, meu nome é %s  e dou aula de %s, caso alguém possua alguma dúvida, \nme procure na sala %d . \n", nome, materia,sala);
    }
}