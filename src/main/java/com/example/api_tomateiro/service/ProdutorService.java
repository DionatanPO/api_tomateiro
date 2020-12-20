package com.example.api_tomateiro.service;

import com.example.api_tomateiro.model.Produtor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import com.example.api_tomateiro.repository.ProdutorRepository;

@Service
public class ProdutorService {

    @Autowired
    ProdutorRepository produtorRepository;

    public Produtor salvar(Produtor produtor) {
        //validações e etcS
        return produtorRepository.save(produtor);
    }

    public void delete(Produtor produtor) {

        produtorRepository.delete(produtor);
    }

    public Produtor buscaPorID(Long id) throws Exception {
        return produtorRepository.findById(id).orElseThrow(Exception::new);
    }

    public List buscarTodos() {
        return produtorRepository.findAll();
    }

    public Produtor login(Produtor  produtor) {
        produtor = produtorRepository.findProdutorByCodIdentificacaoAndSenha(
                produtor.getCodIdentificacao(),produtor.getSenha()).get(0);
        produtor.setSenha("");
        return produtor;
    }

}
