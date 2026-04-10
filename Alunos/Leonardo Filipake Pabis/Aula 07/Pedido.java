
import java.util.ArrayList;

public class Pedido {
    private int id;
    private Date dataCriacao;
    private Date dataPagamento;
    private Date dataVencimentoReserva;
    private Clientes cliente;
    private Vendedor vendedor;
    private Lojas loja;
    public ArrayList<Item> itens = new ArrayList<>();


    public double calcularValorTotal() {
        double soma = 0;
        for (int i = 0; i < itens.size(); i++) {
            soma += itens.get(i).getValor();
        }
        return soma;
    }

    public void gerarDescricaoVenda() {
        System.out.println("Criação: " + dataCriacao + " | Total: " + calcularValorTotal());
    }
}
