public final class Professor extends Pessoa implements Remuneravel{
    private double salario;

    public Professor() {
    }

    public Professor(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public void quemSouEu() {
        System.out.println("Sou o professor");
    }

    @Override
    public void responsabilidade() {
        System.out.println("Ensinar");
    }

    public void calcularSalario(){
        System.out.println(salario);
    }

    public void aplicarBonus(){
        System.out.println(salario*1.20);
    }


}

