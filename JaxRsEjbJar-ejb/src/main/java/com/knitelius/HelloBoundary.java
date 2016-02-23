/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.knitelius;

import javax.ejb.Stateless;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;


@Path("hello")
@Stateless
public class HelloBoundary {

  @GET
  @Produces(MediaType.TEXT_PLAIN)
  public String businessMethod(@QueryParam("name") String name) {
    return "Hello " + name + "!";
  }

}
