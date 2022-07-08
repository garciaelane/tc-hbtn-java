package provedores;

public class Frete {
    private TipoProvedorFrete tipoProvedorFrete;
    private double valor;

    public Frete(double valor, TipoProvedorFrete tipoProvedorFrete) {
        this.valor = valor;
        this.tipoProvedorFrete = tipoProvedorFrete;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public TipoProvedorFrete getTipoProvedorFrete() {
        return tipoProvedorFrete;
    }

    public void TipoProvedorFrete (TipoProvedorFrete tipoProvedorFrete) {
        this.tipoProvedorFrete = tipoProvedorFrete;
    }

}

