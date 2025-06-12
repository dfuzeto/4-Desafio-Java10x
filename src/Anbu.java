public class Anbu implements InterNInja {
    String nome, habilidade, especialidade;
    int idade;

    public Anbu(String nome, int idade, String habilidade, String especialidade) {
        this.nome = nome;
        this.idade = idade;
        this.habilidade = habilidade;
        this.especialidade = especialidade;
    }

    @Override
    public String mostrarInformacoes() {
        System.out.println(nome);
        System.out.println("Idade: " + idade);
        System.out.println(habilidade);
        System.out.println(especialidade + " é a especialidade de " + nome);
        return habilidade;
    }


    @Override
    public void executarHabilidade() {
        System.out.println(nome + "Executou a habilidade" + habilidade);
    }
}
