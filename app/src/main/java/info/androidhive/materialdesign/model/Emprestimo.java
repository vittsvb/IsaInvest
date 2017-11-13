package info.androidhive.materialdesign.model;

/**
 * Created by vvilas on 24/09/2017.
 */

public class Emprestimo {
    private String nome;
    private String valores;
    private String parcelas;
    private String juros;

    public Emprestimo() {
        this.nome = nome;
        this.valores = valores;
        this.parcelas = parcelas;
        this.juros = juros;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getValores() {
        return valores;
    }

    public void setValores(String valores) {
        this.valores = valores;
    }

    public String getParcelas() {
        return parcelas;
    }

    public void setParcelas(String parcelas) {
        this.parcelas = parcelas;
    }

    public String getJuros() {
        return juros;
    }

    public void setJuros(String juros) {
        this.juros = juros;
    }

    @Override
    public String toString() {
        return "Emprestimo{" +
                "nome='" + nome + '\'' +
                ", valores='" + valores + '\'' +
                ", parcelas='" + parcelas + '\'' +
                ", juros='" + juros + '\'' +
                '}';
    }
}
