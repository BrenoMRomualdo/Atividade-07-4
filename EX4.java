public class EX4 {
    public static void main(String[] args) {
        EX3 Seta = new EX3();
        EX3 Marcha = new EX3();

        Seta.setMudarSetaCarro("Ligou");
        Marcha.setMudarMarchaCarro(1);

        System.out.println(Seta.getMudarSetaCarro());
        System.out.println(Marcha.getMudarMarchaCarro());

        Seta.Mensagemum();
        Marcha.Mensagemdois();
    }
}