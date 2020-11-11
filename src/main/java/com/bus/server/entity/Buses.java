/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bus.server.entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author whip
 */
@Entity
@Table(name = "buses")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Buses.findByAll", query = "SELECT b FROM Buses b")
    , @NamedQuery(name = "Buses.findById", query = "SELECT b FROM Buses b WHERE b.id = :id")
    , @NamedQuery(name = "Buses.findByType", query = "SELECT b FROM Buses b WHERE b.type = :type")
    , @NamedQuery(name = "Buses.findBySeats", query = "SELECT b FROM Buses b WHERE b.seats = :seats")
    , @NamedQuery(name = "Buses.findByLocationId", query = "SELECT b FROM Buses b WHERE b.locationId = :locationId")})
public class Buses implements Serializable {

    
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Short id;
    @Basic(optional = false)
    @Column(name = "type")
    private String type;
    @Basic(optional = false)
    @Column(name = "seats")
    private short seats;
    @Basic(optional = false)
    @Column(name = "location_id")
    private short locationId;

    public Buses() {
    }

    public Buses(Short id) {
        this.id = id;
    }

    public Buses(Short id, String type, short seats, short locationId) {
        this.id = id;
        this.type = type;
        this.seats = seats;
        this.locationId = locationId;
    }

    public Short getId() {
        return id;
    }

    public void setId(Short id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public short getSeats() {
        return seats;
    }

    public void setSeats(short seats) {
        this.seats = seats;
    }

    public short getLocationId() {
        return locationId;
    }

    public void setLocationId(short locationId) {
        this.locationId = locationId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Buses)) {
            return false;
        }
        Buses other = (Buses) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.server.entity.Buses[ id=" + id + " ]";
    }
    
}
