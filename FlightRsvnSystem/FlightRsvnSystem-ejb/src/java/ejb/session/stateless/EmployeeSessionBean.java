/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/J2EE/EJB30/StatelessEjbClass.java to edit this template
 */
package ejb.session.stateless;

import entity.EmployeeEntity;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author choijiwon
 */
@Stateless
public class EmployeeSessionBean implements EmployeeSessionBeanRemote, EmployeeSessionBeanLocal {

    @PersistenceContext(unitName = "FlightRsvnSystem-ejbPU")
    private EntityManager em;

    @Override
    public Long createNewEmployee(EmployeeEntity newEmployee)
    {
        em.persist(newEmployee);
        em.flush();
        return newEmployee.getEmployeeId();
    }
    
    @Override
    public List<EmployeeEntity> retrieveAllEmployee()
    {
        Query query = em.createQuery("SELECT e from EmployeeEntity e");
        return query.getResultList();
    }
    
    
    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
}
