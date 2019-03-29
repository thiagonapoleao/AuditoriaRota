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
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author thiago.napoleao
 */
@Entity
@Table(name="picklist")
public class Picklist implements Serializable {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    
    private int id; 
    private String picklislido;
    private String picklist;
    private String volume;
    private String rota;
    private String roteiro;
    private String data;
    private String hora;
    private String auditor;
    private String rotaauditada;
    private String dataauditada;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public String getPicklist() {
        return picklist;
    }

    public void setPicklist(String picklist) {
        this.picklist = picklist;
    }

    public String getVolume() {
        return volume;
    }

    public void setVolume(String volume) {
        this.volume = volume;
    }

    public String getRota() {
        return rota;
    }

    public void setRota(String rota) {
        this.rota = rota;
    }

    public String getRoteiro() {
        return roteiro;
    }

    public void setRoteiro(String roteiro) {
        this.roteiro = roteiro;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getAuditor() {
        return auditor;
    }

    public void setAuditor(String auditor) {
        this.auditor = auditor;
    }

    public String getPicklislido() {
        return picklislido;
    }

    public void setPicklislido(String picklislido) {
        this.picklislido = picklislido;
    }

    public String getRotaauditada() {
        return rotaauditada;
    }

    public void setRotaauditada(String rotaauditada) {
        this.rotaauditada = rotaauditada;
    }

    public String getDataauditada() {
        return dataauditada;
    }

    public void setDataauditada(String dataauditada) {
        this.dataauditada = dataauditada;
    }

  
   
   
    
}
