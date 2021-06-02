
package com.gdminvest.gdmInvest.models;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import lombok.Data;

@Data
@Entity
public class Ativo implements Serializable {
    @Id
    @GeneratedValue
    private Long id;
    
    @NotBlank(message = "Não pode ser nulo! (Ticket)")
    @Column(length = 9)
    private String ticket;
    
    private String setor;
    private String empresa;
    
    @Column(length = 20)
    private String cnpj;
   
}
