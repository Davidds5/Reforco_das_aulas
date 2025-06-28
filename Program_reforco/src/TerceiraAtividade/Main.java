package TerceiraAtividade;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Vendedor vendedor = new Vendedor("David" );

        vendedor.adicionarVendas(new Venda(LocalDate.of(2026, 2, 12), "Teclado", 120));
        vendedor.adicionarVendas(new Venda(LocalDate.of(2023, 6, 20), "mouse", 90));
        vendedor.adicionarVendas(new Venda(LocalDate.of(2026, 2, 21), "fone", 200));
        vendedor.adicionarVendas(new Venda(LocalDate.of(2026, 12,3 ), "pc", 5000));
        vendedor.adicionarVendas(new Venda(LocalDate.of(2026, 4, 12), "notebook", 2700));
        vendedor.adicionarVendas(new Venda(LocalDate.of(2026, 2, 12), "manga", 50));


        System.out.println("Total em fevereiro: R$ " + vendedor.totalVendas(2026, 2));
        System.out.println("Quantidade de vendas: " + vendedor.quantidadeVendas(2026, 2));




    }
}
