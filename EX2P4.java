public class EX2P4 {
    public static void main(String[] args) {
        EX1 Seta = new EX1();
        EX1 Marcha = new EX1();

        Seta.setMudarSetaCarro("Ligou");
        Marcha.setMudarMarchaCarro(1);

        System.out.println(Seta.getMudarSetaCarro());
        System.out.println(Marcha.getMudarMarchaCarro());

        Seta.Mensagemum();
        Marcha.Mensagemdois();
    }
}