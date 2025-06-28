package SegundaAtividade;

import java.time.LocalDate;

public class ContaDeLuz {
    private LocalDate data;
    private double valor;

    public ContaDeLuz(LocalDate data, double valor){
        this.data = data;
        this.valor = valor;
    }
    public double getValor() {
        return valor;
    }
    public LocalDate getData() {
        return data;
    }
}
