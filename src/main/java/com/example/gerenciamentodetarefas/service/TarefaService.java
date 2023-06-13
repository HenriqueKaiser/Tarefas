package com.example.gerenciamentodetarefas.service;

import com.example.gerenciamentodetarefas.entity.Tarefa;
import com.example.gerenciamentodetarefas.repository.TarefaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TarefaService {
    @Autowired

    private TarefaRepository tarefaRepository;
    public List<Tarefa> buscarTarefas(){
        return tarefaRepository.buscarTarefas();

    }
    public Tarefa buscarTarefaPorId(Long id){
        return tarefaRepository.buscarTarefaPorId(id);


    }
    public Tarefa atualizaTarefa(Long id, Tarefa tarefa){
        return tarefaRepository.atualizarTarefa(id, tarefa);
    }
        public Tarefa adicioTarefa(Tarefa tarefa){
            return tarefaRepository.salvarTarefa(tarefa);
        }
}
