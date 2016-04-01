/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demos;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


/**
 *
 * @author JohnSebastian
 */
public class CreatePlayers {
    
public static void main(String[] args) {
EntityManagerFactory emf = Persistence.createEntityManagerFactory("persistenciaPU");
EntityManager em = emf.createEntityManager();

em.getTransaction().begin();
Group01 gr=new Group01();
gr.setId(1);
gr.setName("A");

em.persist(gr);
Team t=new Team();
t.setTeamId(1);
t.setTeamname("America");
t.setLeague("Champions");
t.setIdGroup(gr);
em.persist(t);
Player pl = new Player ();
pl.setId(1);
pl.setLastname("Perez");
pl.setFirstname("pepe");
pl.setJerseynumber(3);
pl.setIdTeam(t);

em.persist(pl);
em.getTransaction().commit();

em.close (); 
emf.close ();

}
 
    
}
