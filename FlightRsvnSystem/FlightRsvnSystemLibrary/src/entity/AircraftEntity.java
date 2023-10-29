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

/**
 *
 * @author choijiwon
 */
@Entity
public class AircraftEntity implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long aircraftId;
    private String aircraftType;
    private int maxseatingcapacity;

    public AircraftEntity() {
    }

    public AircraftEntity(String aircraftType, int maxseatingcapacity) {
        this.aircraftType = aircraftType;
        this.maxseatingcapacity = maxseatingcapacity;
    }
    
    public Long getAircraftId() {
        return aircraftId;
    }

    public void setAircraftId(Long aircraftId) {
        this.aircraftId = aircraftId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (aircraftId != null ? aircraftId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the aircraftId fields are not set
        if (!(object instanceof AircraftEntity)) {
            return false;
        }
        AircraftEntity other = (AircraftEntity) object;
        if ((this.aircraftId == null && other.aircraftId != null) || (this.aircraftId != null && !this.aircraftId.equals(other.aircraftId))) {
            return false;
        }
        return true;
    }

    public String getAircraftType() {
        return aircraftType;
    }

    public void setAircraftType(String aircraftType) {
        this.aircraftType = aircraftType;
    }

    public int getMaxseatingcapacity() {
        return maxseatingcapacity;
    }

    public void setMaxseatingcapacity(int maxseatingcapacity) {
        this.maxseatingcapacity = maxseatingcapacity;
    }
    
    
    @Override
    public String toString() {
        return "entity.AircraftEntity[ id=" + aircraftId + " ]";
    }

    
    
}
