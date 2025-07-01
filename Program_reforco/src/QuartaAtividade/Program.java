package QuartaAtividade;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        List<Evento> lista = Arrays.asList(
                new Evento("Reunião", LocalDate.of(2025, 6, 30)),
                new Evento("Entrevista", LocalDate.of(2025, 6, 15)),
                new Evento("Viagem", LocalDate.of(2025, 7, 1))
        );

        EventoService service = new EventoService();
        int qtdJunho = service.quantidadeNoMes(lista, 2025, 6);
        System.out.println("Eventos em junho de 2025: " + qtdJunho);
    }
}
