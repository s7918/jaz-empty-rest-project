package rest;

import domain.Person;
import domain.services.PersonService;
import java.util.List;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;



/**
 *
 * @author Leszek Karwacki <s7918@pjwstk.edu.pl>
 */
@Path("/people")
public class PeopleResources {
    
    private PersonService db = new PersonService();
    
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Person> getAll() {
        return db.getAll();
    }
    
}
