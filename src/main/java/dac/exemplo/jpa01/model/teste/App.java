/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dac.exemplo.jpa01.model.teste;

import dac.exemplo.jpa01.model.pojo.Pessoa;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Antonio Junior
 */
public class App {
    public static void main(String[] args) {
        
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("JpaBDDerby");
        EntityManager em = emf.createEntityManager();
        
        Pessoa pessoa = new Pessoa(2l, "Antonio Junior");
        
        em.getTransaction().begin();
        em.persist(pessoa);
        em.getTransaction().commit();
       
        em.close();
    }
}
