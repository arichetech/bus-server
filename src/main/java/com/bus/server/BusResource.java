/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bus.server;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import java.util.logging.Logger;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

/**
 *
 * @author whip
 */
@Api(value = "bus-server")
@Path("/")
public class BusResource {

    @Inject
    BusProvider provider;
    
    @GET
    @ApiOperation(value= "get buses")
    @Path("bus/all")
    public Response findAllBuses() {
        return Response.ok(provider.getAllBuses()).build();
    }

}
