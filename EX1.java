public class EX1{
    private String SetaDoCarro;
    private int MarchaDoCarro;

    public void setMudarSetaCarro(String SetaDoCarro){
        this.SetaDoCarro = SetaDoCarro;
    }   
    public String getMudarSetaCarro(){
        return SetaDoCarro;
    }
    
    public void setMudarMarchaCarro(int MarchaDoCarro){
        this.MarchaDoCarro = MarchaDoCarro;
    }
    public int getMudarMarchaCarro(){
        return MarchaDoCarro;
    }

    public void Mensagemum(){
        System.out.printf("Você %s a seta do carro!\n", this.SetaDoCarro);
    }
    public void Mensagemdois(){
        System.out.printf("você mudou para a marcha %s\n", getMudarMarchaCarro());
    }
}
