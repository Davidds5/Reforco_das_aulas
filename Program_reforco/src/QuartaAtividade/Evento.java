package QuartaAtividade;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Evento {
    private String nome;
    private LocalDate date;

    public Evento(String nome, LocalDate date){
        this.nome = nome;
        this.date = date;
    }

    public String getNome() {
        return nome;
    }

    public LocalDate getDate() {
        return date;
    }

        }


