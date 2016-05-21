package domain.services;

import domain.Person;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Leszek Karwacki <s7918@pjwstk.edu.pl>
 */
public class PersonService {

    private static final List<Person> db = new ArrayList<Person>();
    private static int currentId = 1;

    public List<Person> getAll() {
        return db;
    }
    
    public Person get(int id) {
        for(Person p : db){
            if(p.getId()==id)
                return p;
        }
        return null;
    }
    
    public void add(Person p) {
        p.setId(++currentId);
        db.add(p);
    }
    
    public void delete(Person p) {
        db.remove(p);
    }

}
