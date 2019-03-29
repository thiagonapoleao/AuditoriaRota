/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dao;

import com.bean.Senha;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

/**
 *
 * @author thiago.napoleao
 */
public class SenhaJpaDAO {
    private static SenhaJpaDAO instance;
    protected EntityManager entityManager;
    
    public static SenhaJpaDAO getInstance(){
    	if (instance == null){
    		instance = new SenhaJpaDAO();
        }
    	return instance;
    }

    public SenhaJpaDAO() {
    	entityManager = getEntityManager();
    }

    private EntityManager getEntityManager() {
    	EntityManagerFactory factory = Persistence.createEntityManagerFactory("crudHibernatePU");
        if (entityManager == null) {
        	entityManager = factory.createEntityManager();
        }

        return entityManager;
    }

    public Senha getById(final Long id) {
    	return entityManager.find(Senha.class, id);
    }

    @SuppressWarnings("unchecked")
    public List<Senha> findAll() {
        entityManager.clear();
      return entityManager.createQuery("FROM " + Senha.class.getName()).getResultList();
       
    }

    public void persist(Senha senha) {
    	try {
                entityManager.clear();
    		entityManager.getTransaction().begin();
    		entityManager.persist(senha);
            entityManager.getTransaction().commit();
        } catch (Exception ex) {
        	ex.printStackTrace();
            entityManager.getTransaction().rollback();
        }
    }

    public void merge(Senha senha) {
    	try {
            entityManager.clear();
            entityManager.getTransaction().begin();
            entityManager.merge(senha);
            entityManager.getTransaction().commit();
        } catch (Exception ex) {
        	ex.printStackTrace();
            entityManager.getTransaction().rollback();
        }
    }

    public void remove(Senha senha) {
    	try {
    		entityManager.getTransaction().begin();
            senha= entityManager.find(Senha.class, senha.getId());
            entityManager.remove(senha);
            entityManager.getTransaction().commit();
    	} catch (Exception ex) {
    		ex.printStackTrace();
            entityManager.getTransaction().rollback();
        }
    }

    public void removeById(final Long id) {
    	try {
    		Senha senha= getById(id);
    		remove(senha);
    	} catch (Exception ex) {
    		ex.printStackTrace();
    	}
    }   
    
     public void removeAll() {
        try {
            entityManager.getTransaction().begin();
            entityManager.createNativeQuery("TRUNCATE senha").executeUpdate();
            entityManager.getTransaction().commit();
        }catch(Exception e) {
            e.printStackTrace();
            entityManager.getTransaction().rollback();
        }
    }
    
   
     
     public List<Senha> findBySenha(String senha) {
        try {
            entityManager.clear();
            Query query = entityManager.createQuery("from Senha e where e.senha = :senha");
            query.setParameter("senha", senha);
            List<Senha> produtos = query.getResultList();
            return produtos; 
        }catch(Exception e) {
            e.printStackTrace();
            return null;
        }
}
    
}