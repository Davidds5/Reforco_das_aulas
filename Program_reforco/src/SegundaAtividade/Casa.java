package SegundaAtividade;

import java.util.ArrayList;
import java.util.List;

public class Casa {
    private String nomeDoDono;
    private List<ContaDeLuz> contaDeLuzs = new ArrayList<>();


    public Casa(String nomeDoDono){
        this.nomeDoDono = nomeDoDono;
    }
    public void adicionarConta(ContaDeLuz conta){
        contaDeLuzs.add(conta);
    }

    // medi o total gasto em 1 mes
    public double totalGastos(int ano, int mes){
        double total = 0.0;
        for (ContaDeLuz c : contaDeLuzs){
            // getMonthValue retorna um valor int ex 6 retorna 6
            // ao contrario do getMonth que retorna um enum ex 6 retorna junho
            if(c.getData().getYear() == ano && c.getData().getMonthValue() == mes){
                total += c.getValor();
            }
        }
        return total;
    }
    public double mediaUltimosMeses(int[] mes, int ano){
        double soma = 0.0;
        int cont = 0;
        for (int m : mes){
            double gasto = totalGastos(ano, m);
            if (gasto > 0){
                soma += gasto;
                cont ++;
            }

        }
        return cont > 0 ? soma/ cont : 0.0;

    }

}
