package nico.spring.puremvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;

@Controller
@RequestMapping("/rest/persons")
public class PersonsRestResource {


    @RequestMapping(value = "/{id}",
            method = RequestMethod.GET,
            headers = {"Accept=application/json"})
    public @ResponseBody Person getPerson(@PathVariable("id") String id) {

        System.out.println ("PersonsRestResource.getPerson("+id+")");

        Person p = new Person("Nicolas", "Gandriau", new Date());

        return p;
    }

}
