package test.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RestController;

import test.model.Person;
import test.service.PersonService;

import java.util.Optional;


@RestController // This identifies the controller class
@RequestMapping("/person") // What the URL ends with

public class PersonController
{
    @Autowired
    private PersonService personService;

    @PostMapping(path = "/new", consumes = MediaType.APPLICATION_JSON_VALUE)

    public @ResponseBody String addUser(@RequestBody Person person)
    {
        personService.savePerson(person);
        return "Person Added!";
    }

    @GetMapping(path = "/find", produces = MediaType.APPLICATION_JSON_VALUE)

    public Optional<Person> findUser(@RequestParam Integer id)
    {
        return personService.findPerson(id);
    }



    @DeleteMapping(path = "/delete")

    public String deletePerson(@RequestParam Integer id)
    {
        personService.deletePerson(id);
        return "Person Deleted!";

    }


    @GetMapping(path="/all")

    public Iterable<Person> getAllUsers() {
        // This returns a JSON or XML with the users
        return personService.getAllPersons();
    }




}
