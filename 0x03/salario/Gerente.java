public class Gerente extends Empregado {

    public Gerente(double salarioFixo) {
        super(salarioFixo);
    }

    @Override
    public double calcularBonus(Departamento departamento) {
        double calcularBonus = 0;
        if (departamento.alcancouMeta(departamento.getValorMeta(), departamento.getValorAtingidoMeta()) == true) {
            return calcularBonus = ((salarioFixo * 0.20 + ((departamento.getValorAtingidoMeta() * 0.001);
        } else {
            return calcularBonus;
        }
    }
}
