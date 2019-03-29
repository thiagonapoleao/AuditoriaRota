/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bean;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author thiago.napoleao
 */
@Entity
@Table(name="roteiros")

public class Roteiros implements Serializable {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
   
   private int id;
   private String codigo;
   private String roteiro;
   private String sequencia;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

  

    public String getRoteiro() {
        return roteiro;
    }

    public void setRoteiro(String roteiro) {
        this.roteiro = roteiro;
    }

    public String getSequencia() {
        return sequencia;
    }

    public void setSequencia(String sequencia) {
        this.sequencia = sequencia;
    }
   
   
   
   
    
}
