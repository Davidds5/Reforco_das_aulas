package TerceiraAtividade;

import java.time.LocalDate;
;

public class Venda {
    private LocalDate data;
    private String produto;
    private double valor;

    public Venda(LocalDate data, String produto, double valor){
        this.data = data;
        this.produto = produto;
        this.valor = valor;

    }

    public double getValor() {
        return valor;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public LocalDate getData() {
        return data;
    }
}
