package com.example.gerenciamentodetarefas.controller;

import com.example.gerenciamentodetarefas.entity.Tarefa;
import com.example.gerenciamentodetarefas.service.TarefaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1")
public class GerenciamentoController {
    @Autowired
    private TarefaService tarefaService;
    @GetMapping("/tarefas")

    public List <Tarefa> listarTarefas(){
        return tarefaService.buscarTarefas();
    }
@PostMapping ("tarefa")
    public Tarefa salvarTarefa (@RequestBody Tarefa tarefa){
        return tarefaService.adicioTarefa(tarefa);

    }
    @GetMapping("/tarefa/{id}")
    public Tarefa buscarTarefaPorId (@PathVariable Long id){
        return tarefaService.buscarTarefaPorId(id);
    }
    @PutMapping("atualizar/{id}")
    public Tarefa atualizarTarefa (@PathVariable Long id, @RequestBody Tarefa tarefa){
        return tarefaService.atualizaTarefa(id, tarefa);
    }



}
