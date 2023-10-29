/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/J2EE/EJB30/SessionRemote.java to edit this template
 */
package ejb.session.stateless;

import entity.EmployeeEntity;
import java.util.List;
import javax.ejb.Remote;

/**
 *
 * @author choijiwon
 */
@Remote
public interface EmployeeSessionBeanRemote {
    
    public Long createNewEmployee(EmployeeEntity newEmployee);
    
    public List<EmployeeEntity> retrieveAllEmployee();
    
}
