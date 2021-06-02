/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gdminvest.gdmInvest.repository;

import com.gdminvest.gdmInvest.models.Empresa;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author deibi
 */
public interface EmpresaRepository extends JpaRepository<Empresa, Long>{
    
}
