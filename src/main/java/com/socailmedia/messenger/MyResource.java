package com.socailmedia.messenger;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Application;
import javax.ws.rs.core.MediaType;











import com.socialmedia.model.Message;
import com.socialmedia.model.Profiles;
import com.socialmedia.service.MessageServices;
import com.socialmedia.service.ProfileService;

/**
 * Root resource (exposed at "myresource" path)
 */
@Path("messages")
public class MyResource {

	
	
	MessageServices ml = new MessageServices();

	ProfileService pl = new ProfileService();
    /**
     * Method handling HTTP GET requests. The returned object will be sent
     * to the client as "text/plain" media type.
     *
     * @return String that will be returned as a text/plain response.
     */
	    @Path("message")
	 	@GET
	    @Produces(MediaType.APPLICATION_XML)
	    public List<Message> getAllMessages() {
	    	
	    	
	        return    ml.getAllMessages();
	    }
	    @Path("kingdoms")
	 	@GET
	    @Produces(MediaType.APPLICATION_JSON)
	    public List<Profiles> getAllKingdoms() {
	    	
	        return    pl.getAllKingdoms();
	    }
	    
	    
	    @Path("sendmessage")
	    @POST
	    @Consumes(MediaType.APPLICATION_JSON)
	    @Produces(MediaType.APPLICATION_JSON)
	    public List<Profiles> postmessage(Profiles kingdom)
	    {
	    	
	    	return  pl.addkingdom(kingdom);
	    }
	 	
}
