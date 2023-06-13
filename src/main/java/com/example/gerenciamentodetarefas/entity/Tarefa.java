package com.example.gerenciamentodetarefas.entity;

import com.example.gerenciamentodetarefas.entity.Enum.Prioridade;
import com.example.gerenciamentodetarefas.entity.Enum.Status;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Builder
@AllArgsConstructor
@Setter
@Getter

public class Tarefa {
    private Long id;
    private String titulo;
    private String descricao;
    private LocalDateTime dataDeNascimento;
    private Status status;
    private Prioridade prioridade;
    private String responsavel;
    private  LocalDateTime dataDaCriacao;
    private  LocalDateTime dataDaConclusao;


}
