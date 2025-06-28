package PrimeiraAtividadefeita;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("David", "david@gmail.com");

        cliente.adicionarAssinatura(new Assinatura(LocalDate.of(2024, 4, 25), "Netflix", 50));
        cliente.adicionarAssinatura(new Assinatura(LocalDate.of(2029, 6, 30), "Amazon", 19.90));
        cliente.adicionarAssinatura(new Assinatura(LocalDate.of(2023, 3, 2), "Prime video", 20.90));

        System.out.println("Total pago em  4/2024: " + cliente.valorPagoNoMes(2024, 4
        ));
    }

}
