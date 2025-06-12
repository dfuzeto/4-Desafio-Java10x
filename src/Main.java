//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Shinobi konohamaru = new Shinobi("Konohamaru", 5, "Shurikens");
        Anbu itachi = new Anbu("Ịtachi", 18, "Furtividade", "Genjutsu");

        konohamaru.mostrarInformacoes();
        itachi.mostrarInformacoes();
    }
}