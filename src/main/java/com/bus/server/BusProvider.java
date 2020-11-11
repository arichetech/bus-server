/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bus.server;

import com.bus.server.entity.Buses;
import java.util.List;
import javax.ejb.Stateless;


/**
 *
 * @author whip
 */

@Stateless
public class BusProvider extends AbstractProvider{
    
    public List<Buses> getAllBuses(){
        System.out.println("In Buses");
        return findAllBuses();
    }
    
}
