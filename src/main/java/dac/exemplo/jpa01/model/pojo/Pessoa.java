/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dac.exemplo.jpa01.model.pojo;

import com.sun.istack.internal.NotNull;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author Antonio Junior
 */
@Entity
public class Pessoa {
    
    @Id
    private long id;
    @NotNull
    private String nome;

    public Pessoa() {
    }

    public Pessoa(long id, String nome) {
        this.id = id;
        this.nome = nome;
    }
    
    /**
     * @return the id
     */
    public long getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(long id) {
        this.id = id;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }
}
