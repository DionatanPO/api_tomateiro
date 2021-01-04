package com.example.api_tomateiro.repository;

import com.example.api_tomateiro.model.Produtor;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface ProdutorRepository extends JpaRepository<Produtor, Long> {

    @Modifying
    @Transactional
    @Query(value = "SELECT * FROM Produtor p WHERE p.estado='Ativo' AND p.cod_identificacao=?1 AND p.senha =?2", nativeQuery = true)
    List<Produtor> findProdutorByCodIdentificacaoAndSenha(String cod_identificacao, String senha);

     @Modifying
    @Transactional
    @Query(value = "SELECT * FROM Produtor p WHERE p.cod_identificacao=?1", nativeQuery = true)
    List<Produtor> findProdutorByCodIdentificacao(Long cod_identificacao);
    
}
