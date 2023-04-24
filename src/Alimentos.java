public class Alimentos {
    private String nome;
    private double peso;
    private String tipo;

    public Alimentos(String nome, double peso, String tipo) {
        this.nome = nome;
        this.peso = peso;
        this.tipo = tipo;
    }

    public Alimentos(String nome, String tipo) {
        this.nome = nome;
        this.tipo = tipo;
    }

    public String getNome(){
        return this.nome;
    }
    public double getPeso(){
        return this.peso;
    }
    public String getTipo(){
        return this.tipo;
    }

    public String toString(String nome, double peso, String tipo){
        return "Nome: " + nome + ". Peso: " + peso + "Tipo: " + tipo;
    }

    public void calcularPeso(){
        if(peso <= 1000){
            peso += 10;
        } else {
            peso = peso;
        }
    }

}
