package com.example.gerenciamentotarefas.Service;

import com.example.gerenciamentotarefas.Entity.Tarefa;
import com.example.gerenciamentotarefas.Repository.TarefaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TarefaService {

   @Autowired
   private TarefaRepository tarefaRepository;


    public List<Tarefa> buscarTarefas() {
        return tarefaRepository.buscarTarefas();

    }

    public Tarefa buscarTarefaPorId(int id) {
        return tarefaRepository.buscarTarefaPorId(id);
    }

    public Tarefa atualizarTarefa(int id, Tarefa tarefa) {
      return   tarefaRepository.atualizarTarefa(id, tarefa);

    }
    public Tarefa adicionarTarefa(Tarefa tarefa){
        return tarefaRepository.adicionarTarefa(tarefa);
    }
    }
