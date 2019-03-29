/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dao;

import com.bean.Picklist;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

/**
 *
 * @author thiago.napoleao
 */
public class PicklistJpaDAO {
      private static PicklistJpaDAO instance;
    protected EntityManager entityManager;
    
    public static PicklistJpaDAO getInstance(){
    	if (instance == null){
    		instance = new PicklistJpaDAO();
        }
    	return instance;
    }

    public PicklistJpaDAO() {
    	entityManager = getEntityManager();
    }

    private EntityManager getEntityManager() {
    	EntityManagerFactory factory = Persistence.createEntityManagerFactory("crudHibernatePU");
        if (entityManager == null) {
        	entityManager = factory.createEntityManager();
        }

        return entityManager;
    }
  
    public Picklist getById(final int id) {
        return entityManager.find(Picklist.class, id);
    }

    @SuppressWarnings("unchecked")
    public List<Picklist> findAll() {
        entityManager.clear();
      return entityManager.createQuery("FROM " + Picklist.class.getName()).getResultList();
       
    }

    public void persist(Picklist picklist) {
    	try {
                entityManager.clear();
    		entityManager.getTransaction().begin();
    		entityManager.persist(picklist);
            entityManager.getTransaction().commit();
        } catch (Exception ex) {
        	ex.printStackTrace();
            entityManager.getTransaction().rollback();
        }
    }

    public void merge(Picklist produto) {
    	try {
            entityManager.clear();
            entityManager.getTransaction().begin();
            entityManager.merge(produto);
            entityManager.getTransaction().commit();
        } catch (Exception ex) {
        	ex.printStackTrace();
            entityManager.getTransaction().rollback();
        }
    }

    public void remove(Picklist produto) {
    	try {
    		entityManager.getTransaction().begin();
            produto = entityManager.find(Picklist.class, produto.getId());
            entityManager.remove(produto);
            entityManager.getTransaction().commit();
    	} catch (Exception ex) {
    		ex.printStackTrace();
            entityManager.getTransaction().rollback();
        }
    }

      
     public void removeById(final int id) {
        try {
           Picklist produto = getById(id);
    		remove(produto);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    
    
    
     public void removeAll() {
        try {
            entityManager.getTransaction().begin();
            entityManager.createNativeQuery("TRUNCATE picklist").executeUpdate();
            entityManager.getTransaction().commit();
        }catch(Exception e) {
            e.printStackTrace();
            entityManager.getTransaction().rollback();
        }
    }
    
   
     
    public List<Picklist> findByCodigo(String codigo) {
        try {
            entityManager.clear();
            Query query = entityManager.createQuery("from Picklist e where e.codigo = :codigo");
            query.setParameter("codigo", codigo);
            List<Picklist> produtos = query.getResultList();
            return produtos; 
        }catch(Exception e) {
            e.printStackTrace();
            return null;
        }
    }
       
      public List<Picklist> findByPicklist(String picklist) {
        try {
            entityManager.clear();
            Query query = entityManager.createQuery("from Picklist e where e.picklist = :picklist");
            query.setParameter("picklist", picklist);
            List<Picklist> produtos = query.getResultList();
            return produtos; 
        }catch(Exception e) {
            e.printStackTrace();
            return null;
        }
    }
    
      public List<Picklist> findByPick(String picklislido) {
        try {
            entityManager.clear();
            Query query = entityManager.createQuery("from Picklist e where e.picklislido = :picklislido");
            query.setParameter("picklislido", picklislido);
            List<Picklist> produtos = query.getResultList();
            return produtos; 
        }catch(Exception e) {
            e.printStackTrace();
            return null;
        }
    }
      
        public List<Picklist> findByRota(String rota) {
        try {
            entityManager.clear();
            Query query = entityManager.createQuery("from Picklist e where e.rota = :rota");
            query.setParameter("rota", rota);
            List<Picklist> produtos = query.getResultList();
            return produtos; 
        }catch(Exception e) {
            e.printStackTrace();
            return null;
        }
    }
        
        
        public List<Picklist> findByDataRota(String dataauditada, String rota) {
        try {
            Query query = entityManager.createQuery("from Picklist e where e.dataauditada = :dataauditada and e.rota = :rota");
            query.setParameter("dataauditada", dataauditada); 
            query.setParameter("rota", rota); 
            List<Picklist> rt = query.getResultList();
            return rt;
        }catch(Exception e) {
            e.printStackTrace();
            return null;
        }
    }
        
          public List<Picklist> findByConsulta(String data, String rota, String picklist, String volume) {
        try {
            Query query = entityManager.createQuery("from Picklist e where e.data = :data and e.rota = :rota and e.picklist = :picklist and e.volume = :volume");
            query.setParameter("data", data); 
            query.setParameter("rota", rota); 
            query.setParameter("picklist", picklist);
            query.setParameter("volume", volume);
            List<Picklist> rt = query.getResultList();
            return rt;
        }catch(Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
