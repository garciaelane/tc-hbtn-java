public class Pedido {

    private double percentualDesconto;
    private ItemPedido[] itens;
    private double total;


    public Pedido(int percentualDesconto, ItemPedido[] itens) {
        super();
        this.percentualDesconto = percentualDesconto;
        this.itens = itens;
    }

    public double calcularTotal() {
        double sum = 0;
        for (ItemPedido itemPedido : itens) {
            sum += itemPedido.getQuantidade() * itemPedido.getProduto().obterPrecoLiquido();

        }
        return sum * (1 - (this.percentualDesconto / 100));

    }

}



