public class Gerente extends Empregado {

    public Gerente(double salarioFixo) {
        super(salarioFixo);
    }

    @Override
    public double calcularBonus(Departamento departamento) {
        double calcularBonus = 0;
        if(departamento.alcancouMeta(departamento.getValorMeta(), departamento.getValorAtingidoMeta())) {
            return calcularBonus = ((salarioFixo * 0.20) + ((departamento.getValorAtingidoMeta() - departamento.getValorMeta()) * 0.01));
        } else {
            return calcularBonus;
        }
    }
}
