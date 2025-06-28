package TerceiraAtividade;

import java.util.ArrayList;
import java.util.List;

public class Vendedor {
    private String nome;
    private List<Venda> vendasList = new ArrayList<>();

    public Vendedor(String nome) {
        this.nome = nome;
    }

    public void adicionarVendas(Venda venda) {
        vendasList.add(venda);
    }

    public double totalVendas(int ano, int mes) {
        double total = 0.0;
        for (Venda venda : vendasList) {
            if (venda.getData().getYear() == ano && venda.getData().getMonthValue() == mes) {
                total += venda.getValor();
            }
        }
        return total;
    }

    public int quantidadeVendas(int ano, int mes) {
        int cont = 0;
        for (Venda venda : vendasList) {
            if (venda.getData().getYear() == ano && venda.getData().getMonthValue() == mes) {
                cont++;

            }
        }
        return cont;
    }
}
