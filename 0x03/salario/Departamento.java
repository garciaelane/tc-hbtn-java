public class Departamento {

    double valorMeta;
    double valorAtingidoMeta;

    public double getValorMeta() {
        return valorMeta;
    }

    public double getValorAtingidoMeta() {
        return valorAtingidoMeta;
    }

    public Departamento(double valorMeta, double valorAtingidoMeta) {
        this.valorMeta = valorMeta;
        this.valorAtingidoMeta = valorAtingidoMeta;
    }

    public boolean alcancouMeta(double valorMeta, double valorAtingidoMeta) {
        boolean meta;

        if (valorAtingidoMeta >= valorMeta) {
            meta = true;
            return meta;
        } else {
            meta = false;
            return meta;
        }
    }
}
