package PrimeiraAtividadefeita;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Cliente {
    private String nome;
    private String email;
    private List<Assinatura> assinaturas = new ArrayList<>();

    public Cliente(String nome, String email){
        this.nome = nome;
        this.email = email;
    }
    public void adicionarAssinatura(Assinatura a ){
        assinaturas.add(a);
    }

    public double valorPagoNoMes(int ano, int mes){
        double soma = 0.0;
        for (Assinatura a : assinaturas){
            if (a.getData().getYear() ==ano && a.getData().getMonthValue() == mes){
                soma += a.getValor();
            }
        }
        return soma;
    }

}
