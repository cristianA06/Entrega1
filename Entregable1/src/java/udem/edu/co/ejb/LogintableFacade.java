/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package udem.edu.co.ejb;

import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import udem.edu.co.entities.Logintable;

/**
 *
 * @author Cristian Avila
 */
@Stateless
public class LogintableFacade extends AbstractFacade<Logintable> {

    @PersistenceContext(unitName = "Entregable1PU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public LogintableFacade() {
        super(Logintable.class);
    }
    public Logintable loginWeb(Logintable login){
        Logintable loginResponse=null;
        String queryLogin;
        try{
            queryLogin= "FROM logintable l WHERE l.usuario = ?1 and l.password = ?2";//Busqueda de los datos que se ingresan en la base de datos
            Query query= em.createQuery(queryLogin);
            query.setParameter(1, login.getUsuario());
            query.setParameter(2, login.getPassword());
            List<Logintable> lista = query.getResultList();
 //           LOG.error("User: "+login.getUser());
 //           LOG.error("Password: "+login.getPassword());
            if (lista.isEmpty()) {
                return null;
            }else{
                System.out.println("encontrado");
                return lista.get(0);
            }            
            
        }catch(Exception e){
//            LOG.error("error "+e.getMessage());
        }
        return loginResponse;
    }
    
}
