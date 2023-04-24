public class Ovos extends Alimentos {
    private double tipoAnimal;
    private String raca;
    private int diasPassados;

    public Ovos(double tipoAnimal, String raca, int diasPassados, String nome, double peso, String tipo) {
        super(nome, peso, tipo);
        this.tipoAnimal = tipoAnimal;
        this.raca = raca;
        this.diasPassados = diasPassados;
    }
    public Ovos(double tipoAnimal, String nome, double peso, String tipo) {
        super(nome, peso, tipo);
        this.tipoAnimal = tipoAnimal;
    }

    public double getTipoAnimal(){
        return this.tipoAnimal;
    }
    public String getRaca(){
        return this.raca;
    }
    public int getDiasPassados(){
        return this.diasPassados;
    }

    public String toString(double tipoAnimal, String raca, int diasPassados, String nome, double peso, String tipo){
        return "Tipo animal: " + tipoAnimal + ". Raça: " + raca + "Dias Passados: " + diasPassados + ". Nome: " + nome + ". Peso: " + peso + ". Tipo: " + tipo;
    }


}
