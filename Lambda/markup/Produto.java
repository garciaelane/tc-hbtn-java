import java.util.function.Consumer;
import java.util.function.Supplier;

public class Produto {

    private String nome;
    private double preco, percentualMarkup;

    public Produto(double preco, String nome) {
        this.nome = nome;
        this.preco = preco;
        this.percentualMarkup = 10;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPercentualMarkup(double percentualMarkup) {
        this.percentualMarkup = percentualMarkup;
    }

    public Supplier<Double> precoComMarkup = () -> this.preco * (1 + (this.percentualMarkup / 100));

    Consumer<Double> atualizarMarkup = (Double v) -> this.setPercentualMarkup(v);

}
