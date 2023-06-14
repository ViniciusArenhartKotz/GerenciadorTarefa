package com.example.gerenciamentotarefas.Entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Tarefa {
    private int id;
    private String Titulo;
    private String Descricao;
    private LocalDateTime DataDeVencimento;
    private Status status;

    private Prioridade prioridade;
    private String Responsavel;
    private LocalDateTime DataDeCriacao;
    private LocalDateTime DataDeConclusao;



}
