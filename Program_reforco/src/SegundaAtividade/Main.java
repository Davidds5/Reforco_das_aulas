package SegundaAtividade;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Casa casa = new Casa("David");

        casa.adicionarConta(new ContaDeLuz(LocalDate.of(2023, 5,3), 120));
        casa.adicionarConta(new ContaDeLuz(LocalDate.of(2020, 5, 2), 70));
        casa.adicionarConta(new ContaDeLuz(LocalDate.of(2027, 3, 1), 30));
        casa.adicionarConta(new ContaDeLuz(LocalDate.of(2023, 9, 10), 159));


        System.out.println("Total em maio: " + casa.totalGastos(2023, 5));
        int [] ultimosMeses = {5, 3, 9};
        System.out.println("Media ultimos meses: " + casa.mediaUltimosMeses(ultimosMeses, 2025));
    }
}
