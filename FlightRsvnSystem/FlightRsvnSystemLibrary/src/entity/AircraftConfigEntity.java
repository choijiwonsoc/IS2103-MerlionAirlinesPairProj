/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author choijiwon
 */
@Entity
public class AircraftConfigEntity implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long aircraftConfigId;
    private String aircraftConfigName;
    private int cabinClass;
    private List<CabinClassEntity> cabinClassDetails;

    public AircraftConfigEntity() {
    }

    public AircraftConfigEntity(String aircraftConfigName, int cabinClass, List<CabinClassEntity> cabinClassDetails) {
        this.aircraftConfigName = aircraftConfigName;
        this.cabinClass = cabinClass;
        this.cabinClassDetails = cabinClassDetails;
    }

    public Long getAircraftConfigId() {
        return aircraftConfigId;
    }

    public void setAircraftConfigId(Long aircraftConfigId) {
        this.aircraftConfigId = aircraftConfigId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (aircraftConfigId != null ? aircraftConfigId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the aircraftConfigId fields are not set
        if (!(object instanceof AircraftConfigEntity)) {
            return false;
        }
        AircraftConfigEntity other = (AircraftConfigEntity) object;
        if ((this.aircraftConfigId == null && other.aircraftConfigId != null) || (this.aircraftConfigId != null && !this.aircraftConfigId.equals(other.aircraftConfigId))) {
            return false;
        }
        return true;
    }

    public String getAircraftConfigName() {
        return aircraftConfigName;
    }

    public void setAircraftConfigName(String aircraftConfigName) {
        this.aircraftConfigName = aircraftConfigName;
    }

    public int getCabinClass() {
        return cabinClass;
    }

    public void setCabinClass(int cabinClass) {
        this.cabinClass = cabinClass;
    }

    public List<CabinClassEntity> getCabinClassDetails() {
        return cabinClassDetails;
    }

    public void setCabinClassDetails(List<CabinClassEntity> cabinClassDetails) {
        this.cabinClassDetails = cabinClassDetails;
    }

    
    @Override
    public String toString() {
        return "entity.AircraftConfigEntity[ id=" + aircraftConfigId + " ]";
    }
    
}
