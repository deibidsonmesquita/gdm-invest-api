
package com.gdminvest.gdmInvest.models;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Empresa implements Serializable {
    @Id
    @GeneratedValue
    private Long id;
    private String ticket;
    private String nome;
    private String setor;
    private String cnpj;
}
