public class Shinobi implements InterNInja{

    String nome, habilidade;
    int idade;

    public Shinobi(String nome, int idade, String habilidade) {
        this.nome = nome;
        this.idade = idade;
        this.habilidade = habilidade;

    }


    @Override
    public String mostrarInformacoes() {
        System.out.println(habilidade);
        return habilidade;
    }

    @Override
    public void executarHabilidade() {
        System.out.println(nome + "Executou a habilidade" + habilidade);
    }
}