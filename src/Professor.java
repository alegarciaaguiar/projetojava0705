public final class Professor extends Pessoa{
    private double salario;


    public Professor() {
    }

    public Professor(String nome) {
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


}

