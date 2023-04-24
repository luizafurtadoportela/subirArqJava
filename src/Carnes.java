public class Carnes extends Alimentos{
    private String sexo;
    private String regiao;
    private boolean saudavel;

    public Carnes(String sexo, String nome, double peso, String tipo){
        super(nome, peso, tipo);
        this.sexo = sexo;
    }

    public Carnes(String sexo, String regiao, boolean saudavel, String nome, double peso, String tipo){
        super(nome, peso, tipo);
        this.sexo = sexo;
        this.regiao = regiao;
        this.saudavel = saudavel;
    }

    public String getSexo(){
        return this.sexo;
    }
    public String getRegiao(){
        return this.regiao;
    }
    public boolean getSaudavel(){
        return this.saudavel;
    }

    public String toString(String sexo, String regiao, boolean saudavel, String nome, double peso, String tipo){
        return "Sexo: " + sexo + ". Região: " + regiao + "Saudavel: " + saudavel + ". Nome: " + nome + ". Peso: " + peso + ". Tipo: " + tipo;
    }

    public void calcularPeso(){

    }

}
