/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dao;

import com.bean.Roteiros;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

/**
 *
 * @author thiago.napoleao
 */
public class RoteirosJpaDAO {
       private static RoteirosJpaDAO instance;
    protected EntityManager entityManager;
    
    public static RoteirosJpaDAO getInstance(){
    	if (instance == null){
    		instance = new RoteirosJpaDAO();
        }
    	return instance;
    }

    public RoteirosJpaDAO() {
    	entityManager = getEntityManager();
    }

    private EntityManager getEntityManager() {
    	EntityManagerFactory factory = Persistence.createEntityManagerFactory("crudHibernatePU");
        if (entityManager == null) {
        	entityManager = factory.createEntityManager();
        }

        return entityManager;
    }

    public Roteiros getById(final Long id) {
    	return getById(id);
    }

    public Roteiros getById(final int id) {
        return entityManager.find(Roteiros.class, id);
    }

    @SuppressWarnings("unchecked")
    public List<Roteiros> findAll() {
        entityManager.clear();
      return entityManager.createQuery("FROM " + Roteiros.class.getName()).getResultList();
       
    }

    public void persist(Roteiros roteiros) {
    	try {
                entityManager.clear();
    		entityManager.getTransaction().begin();
    		entityManager.persist(roteiros);
            entityManager.getTransaction().commit();
        } catch (Exception ex) {
        	ex.printStackTrace();
            entityManager.getTransaction().rollback();
        }
    }

    public void merge(Roteiros roteiros) {
    	try {
            entityManager.clear();
            entityManager.getTransaction().begin();
            entityManager.merge(roteiros);
            entityManager.getTransaction().commit();
        } catch (Exception ex) {
        	ex.printStackTrace();
            entityManager.getTransaction().rollback();
        }
    }

    public void remove(Roteiros roteiros) {
    	try {
    		entityManager.getTransaction().begin();
            roteiros= entityManager.find(Roteiros.class, roteiros.getId());
            entityManager.remove(roteiros);
            entityManager.getTransaction().commit();
    	} catch (Exception ex) {
    		ex.printStackTrace();
            entityManager.getTransaction().rollback();
        }
    }

    public void removeById(final int id) {
        try {
            Roteiros erroLinha = getById(id);
            remove(erroLinha);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    
     public void removeAll() {
        try {
            entityManager.getTransaction().begin();
            entityManager.createNativeQuery("TRUNCATE roteiros").executeUpdate();
            entityManager.getTransaction().commit();
        }catch(Exception e) {
            e.printStackTrace();
            entityManager.getTransaction().rollback();
        }
    }
    
   
     
     public List<Roteiros> findByCodigo(String codigo) {
        try {
            entityManager.clear();
            Query query = entityManager.createQuery("from Roteiros e where e.codigo = :codigo");
            query.setParameter("codigo", codigo);
            List<Roteiros> produtos = query.getResultList();
            return produtos; 
        }catch(Exception e) {
            e.printStackTrace();
            return null;
        }
}
    
}