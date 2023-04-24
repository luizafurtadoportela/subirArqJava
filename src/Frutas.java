public class Frutas extends Alimentos{
    private String cor;
    private String tamanho;
    private double tempoDura;

    public Frutas(String cor, String tamanho, String nome, double peso, String tipo) {
        super(nome, peso, tipo);
        this.cor = cor;
        this.tamanho = tamanho;
    }
    public Frutas(String cor, String tamanho, double tempoDura, String nome, double peso, String tipo) {
        super(nome, peso, tipo);
        this.cor = cor;
        this.tamanho = tamanho;
        this.tempoDura = tempoDura;
    }

    public String getCor(){
        return this.cor;
    }
    public String getTamanho(){
        return this.tamanho;
    }
    public double getTempoDura(){
        return this.tempoDura;
    }

    public String toString(String cor, String tamanho, double tempoDura, String nome, double peso, String tipo){
        return "Cor: " + cor + ". Tamanho: " + tamanho + "Durabilidade: " + tempoDura + ". Nome: " + nome + ". Peso: " + peso + ". Tipo: " + tipo;
    }
}
