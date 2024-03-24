public class Pessoa {
    public String nome;
    public String sexo;
    public int idade;
    public String saude;

    public Pessoa(String nome, String sexo, int idade, String saude) {
        this.nome = nome;
        this.sexo = sexo;
        this.idade = idade;
        this.saude = saude;
    }

    public boolean estaApto() {
        return sexo == "M" && idade >= 18 && idade <= 25 && saude.equalsIgnoreCase("boa");
    }

    public String getNome() {
        return nome;
    }
}
