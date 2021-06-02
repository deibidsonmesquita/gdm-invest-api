
package com.gdminvest.gdmInvest.repository;

import com.gdminvest.gdmInvest.models.Ativo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;


public interface AtivoRepository extends JpaRepository<Ativo, Long>{
   
    @Query("FROM Ativo a WHERE a.ticket = :ticket")
    Ativo getAtivoByTicket(@Param("ticket") String ticket);
}
