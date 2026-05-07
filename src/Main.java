import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Professor p = new Professor();
        CadastroProfessor cp = new CadastroProfessor();

        System.out.println("Menu");

        int opção = sc.nextInt();

        while (opção !=0 ){
            switch (opção) {
                case 1:
                    // --- CADASTRAR ---
                    System.out.print("Nome: ");
                    p.setNome(sc.next());
                    System.out.print("Idade: ");
                    p.setIdade(sc.nextInt());
                    cp.cadastrar(p);
                    break;
                case 2:
                    // --- LISTAR ---
                    cp.listar();
                    break;
                case 3:
                    // --- ATUALIZAR ---
                    System.out.print("Informe o nome que deseja atualizar a idade: ");
                    p.setNome(sc.next());
                    System.out.print("Nova idade: ");
                    p.setIdade(sc.nextInt());
                    cp.atualizar(p.getNome(), p.getIdade());
                    break;
                case 4:
                    // --- DELETAR ---
                    System.out.print("Informe o nome para deletar: ");
                    p.setNome(sc.next());
                    cp.deletar(p.getNome());
                    break;

                default:
                    System.out.println("Inválido");

                    sc.close();


            }

        }

    }
}
