
package com.gdminvest.gdmInvest.models;

import java.io.Serializable;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import lombok.Data;


@Data
@Entity
public class Carteira implements Serializable {
    @Id
    @GeneratedValue
    private Long id;
    private String descricao;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "ativoID")
    private List<Ativo> ativos;
    private String criacao;
    
    
}
