package com.example.gerenciamentodetarefas.repository;

import com.example.gerenciamentodetarefas.entity.Tarefa;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@Repository
public class TarefaRepository {
    List<Tarefa> tarefas = new ArrayList<>();

    public List<Tarefa> buscarTarefas() {
        return tarefas;
    }

    public Tarefa buscarTarefaPorId(Long id) {
        for (Tarefa t: tarefas){
            if (t.getId()==id){
                return t;
            }
        }
        return null;
    }

    public  Tarefa atualizarTarefa(Long id, Tarefa tarefa){
        Tarefa tarefa1 = buscarTarefaPorId(id);
        if (tarefa1!=null){
            tarefas.remove(tarefa1);
            tarefa.setId(id);
            tarefas.add(tarefa);
            return tarefa1;
        }
       return null;
    }
    public  Tarefa salvarTarefa (Tarefa tarefa){
        tarefas.add(tarefa);
        return tarefa;
    }

}
