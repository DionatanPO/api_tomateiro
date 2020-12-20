package com.example.api_tomateiro.repository;

import com.example.api_tomateiro.model.Safra;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SafraRepository extends JpaRepository<Safra, Long> {



}
