public abstract class Pessoa {
    protected String nome;

    public abstract void quemSouEu();

    public abstract void responsabilidade();


    public Pessoa() {
    }

    public Pessoa(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


}
