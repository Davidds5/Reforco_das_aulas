package PrimeiraAtividadefeita;

import java.time.LocalDate;

public class Assinatura {
    private LocalDate data;
    private String nomePlano;
    private double valor;

    public Assinatura(LocalDate data, String nomePlano, double valor){
        this.data = data;
        this.nomePlano = nomePlano;
        this.valor = valor;
    }
    public LocalDate getData(){
        return data;
    }
    public String getNomePlano(){
        return nomePlano;
    }

    public double getValor() {
        return valor;
    }
}
