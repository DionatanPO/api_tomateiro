package com.example.api_tomateiro.repository;

import com.example.api_tomateiro.model.Safra;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface SafraRepository extends JpaRepository<Safra, Long> {

    @Modifying
    @Transactional
    @Query(value = "SELECT * FROM Safra s WHERE s.estado=?1 AND s.produtor_id=?2", nativeQuery = true)
    List<Safra> findSafraByProdutor_id(String estado, long produtor_id);

}
