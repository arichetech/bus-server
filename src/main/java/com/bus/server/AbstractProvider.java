/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bus.server;

import com.bus.server.entity.Buses;
import com.bus.server.entity.Locations;
import com.bus.server.entity.Schedules;
import com.bus.server.entity.Tickets;
import com.bus.server.entity.Users;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

/**
 *
 * @author whip
 */
public abstract class AbstractProvider {

    @PersistenceContext
    private EntityManager em;

    AbstractProvider() {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("com_bus-server_jar_1.0-SNAPSHOTPU");
        em = emf.createEntityManager();
    }

    //find all buses
    public List<Buses> findAllBuses() {
        TypedQuery<Buses> query = em.createNamedQuery("Buses.findByAll", Buses.class);
        List<Buses> busList = query.getResultList();
        return busList;
    }

    //find all locations
    public List<Locations> findAllLocations() {
        TypedQuery<Locations> query = em.createNamedQuery("Locations.findByAll", Locations.class);
        List<Locations> locationList = query.getResultList();
        return locationList;
    }

    //find all schedules
    private List<Schedules> findAllSchedules() {
        TypedQuery<Schedules> query = em.createNamedQuery("Schedules.findByAll", Schedules.class);
        List<Schedules> scheduleList = query.getResultList();
        return scheduleList;
    }

    //find all tickets
    public List<Tickets> findAllTickets() {
        TypedQuery<Tickets> query = em.createNamedQuery("Tickets.findByAll", Tickets.class);
        List<Tickets> ticketList = query.getResultList();
        return ticketList;
    }

    //find all users
    public List<Users> findAllUsers() {
        TypedQuery<Users> query = em.createNamedQuery("Users.findByAll", Users.class);
        List<Users> userList = query.getResultList();
        return userList;
    }
}
