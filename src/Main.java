public class Main {
    public static void main(String[] args) {
        Professor p = new Professor();
        Aluno a = new Aluno();
        Aluno a2 = new Aluno("João", 123);

        Professor p2 = new Professor ("Maria");
        Disciplina d = new Disciplina("POO");

        d.matricular(a);
        d.associar(p);
        d.mostrarDisciplina();


    }
}
