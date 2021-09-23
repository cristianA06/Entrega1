/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package udem.edu.co.ejb;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import udem.edu.co.entities.Ordenes;

/**
 *
 * @author Cristian Avila
 */
@Stateless
public class OrdenesFacade extends AbstractFacade<Ordenes> {

    @PersistenceContext(unitName = "Entregable1PU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public OrdenesFacade() {
        super(Ordenes.class);
    }
    
}
