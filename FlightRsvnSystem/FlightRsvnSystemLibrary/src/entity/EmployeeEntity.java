/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import util.enumeration.EmployeeAccessRightEnum;

/**
 *
 * @author choijiwon
 */
@Entity
public class EmployeeEntity implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long employeeId;
    private String employeeName;
    private EmployeeAccessRightEnum employeeAccessRightEnum;
    private String username;
    private String password;

    public EmployeeEntity() {
    }

    public EmployeeEntity(String employeeName, EmployeeAccessRightEnum employeeAccessRightEnum, String username, String password) {
        this.employeeName = employeeName;
        this.employeeAccessRightEnum = employeeAccessRightEnum;
        this.username = username;
        this.password = password;
    } 

    public Long getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Long employeeId) {
        this.employeeId = employeeId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (employeeId != null ? employeeId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the employeeId fields are not set
        if (!(object instanceof EmployeeEntity)) {
            return false;
        }
        EmployeeEntity other = (EmployeeEntity) object;
        if ((this.employeeId == null && other.employeeId != null) || (this.employeeId != null && !this.employeeId.equals(other.employeeId))) {
            return false;
        }
        return true;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String firstName) {
        this.employeeName = employeeName;
    }

    public EmployeeAccessRightEnum getEmployeeAccessRightEnum() {
        return employeeAccessRightEnum;
    }

    public void setEmployeeAccessRightEnum(EmployeeAccessRightEnum employeeAccessRightEnum) {
        this.employeeAccessRightEnum = employeeAccessRightEnum;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    

    @Override
    public String toString() {
        return "entity.EmployeeEntity[ id=" + employeeId + " ]";
    }
    
}
