package com.example.api_tomateiro.service;

import com.example.api_tomateiro.model.Produtor;
import com.example.api_tomateiro.model.Safra;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import com.example.api_tomateiro.repository.SafraRepository;

@Service
public class SafraService {

    @Autowired
    SafraRepository safraRepository;

    public Safra salvar(Safra safra) {
        //validações e etcS
        return safraRepository.save(safra);
    }

    public void delete(Safra safra) {

        safraRepository.delete(safra);
    }

    public Safra buscaPorID(Long id) throws Exception {
        return safraRepository.findById(id).orElseThrow(Exception::new);
    }

    public List buscarTodos() {
        return safraRepository.findAll();
    }

    public List<Safra> BuscarSafraPorProdutorAtivo(Produtor produtor, String estado) {
       
     
        return  safraRepository.findSafraByProdutor_id(estado, produtor.getId());

    }

}
