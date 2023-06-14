package com.example.gerenciamentotarefas.Controller;

import com.example.gerenciamentotarefas.Entity.Tarefa;
import com.example.gerenciamentotarefas.Service.TarefaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1")
public class TarefaController {


    @Autowired
    private TarefaService tarefaService;

    @GetMapping("tarefa")
    public List<Tarefa> listarTarefas() {
        return tarefaService.buscarTarefas();
    }

    @GetMapping("tarefa/{id}")
    public Tarefa buscarTarefaPorId(@PathVariable int id) {
        return tarefaService.buscarTarefaPorId(id);
    }

    @PostMapping("tarefa")
    public Tarefa salvarTarefa(@RequestBody Tarefa tarefa) {
        return tarefaService.adicionarTarefa(tarefa);
    }
    @PutMapping("tarefa/atualizar/{id}")
    public Tarefa atualizarTarefa(@PathVariable int id, @RequestBody Tarefa tarefa){
        return tarefaService.atualizarTarefa(id, tarefa);
    }
}

