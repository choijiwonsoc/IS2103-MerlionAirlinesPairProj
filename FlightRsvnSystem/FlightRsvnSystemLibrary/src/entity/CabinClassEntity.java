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
public class CabinClassEntity implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long cabinClassId;
    private String cabinClassName;
    private int numberAisles;
    private int numberRows;
    private int seatsAbreast;
    private String seatingConfigPerColumn;

    public CabinClassEntity() {
    }

    public CabinClassEntity(String cabinClassName, int numberAisles, int numberRows, int seatsAbreast, String seatingConfigPerColumn) {
        this.cabinClassName = cabinClassName;
        this.numberAisles = numberAisles;
        this.numberRows = numberRows;
        this.seatsAbreast = seatsAbreast;
        this.seatingConfigPerColumn = seatingConfigPerColumn;
    }
    
    public Long getCabinClassId() {
        return cabinClassId;
    }

    public void setCabinClassId(Long cabinClassId) {
        this.cabinClassId = cabinClassId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (cabinClassId != null ? cabinClassId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the cabinClassId fields are not set
        if (!(object instanceof CabinClassEntity)) {
            return false;
        }
        CabinClassEntity other = (CabinClassEntity) object;
        if ((this.cabinClassId == null && other.cabinClassId != null) || (this.cabinClassId != null && !this.cabinClassId.equals(other.cabinClassId))) {
            return false;
        }
        return true;
    }
    
    public String getCabinClassName() {
        return cabinClassName;
    }

    public void setCabinClassName(String cabinClassName) {
        this.cabinClassName = cabinClassName;
    }

    public int getNumberAisles() {
        return numberAisles;
    }

    public void setNumberAisles(int numberAisles) {
        this.numberAisles = numberAisles;
    }

    public int getNumberRows() {
        return numberRows;
    }

    public void setNumberRows(int numberRows) {
        this.numberRows = numberRows;
    }

    public int getSeatsAbreast() {
        return seatsAbreast;
    }

    public void setSeatsAbreast(int seatsAbreast) {
        this.seatsAbreast = seatsAbreast;
    }

    public String getSeatingConfigPerColumn() {
        return seatingConfigPerColumn;
    }

    public void setSeatingConfigPerColumn(String seatingConfigPerColumn) {
        this.seatingConfigPerColumn = seatingConfigPerColumn;
    }
    
    @Override
    public String toString() {
        return "entity.CabinClassEntity[ id=" + cabinClassId + " ]";
    }

    
}
