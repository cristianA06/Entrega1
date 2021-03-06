/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package udem.edu.co.ejb;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import udem.edu.co.entities.Pizzas;

/**
 *
 * @author Cristian Avila
 */
@Stateless
public class PizzasFacade extends AbstractFacade<Pizzas> {

    @PersistenceContext(unitName = "Entregable1PU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public PizzasFacade() {
        super(Pizzas.class);
    }
    
}
