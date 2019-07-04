package test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.MediaType;

import test.Person;
import test.PersonController;


@RestController // This identifies the controller class
@RequestMapping("/") // What the URL ends with

public class PersonController
{
    @Autowired
    private PersonRepository personRepository;

    @GetMapping(path = "/add")
    public @ResponseBody String addPerson(@RequestParam String first, @RequestParam String last)
    {
        Person p = new Person();
        p.setFirst(first);
        p.setLast(last);
        personRepository.save(p);
        return "Saved";
    }

    @PostMapping(path = "/new", consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)

    public String addUser(@RequestBody Person person)
    {
        personRepository.save(person);
        return "Person Added!";
    }

    @DeleteMapping(path = "/delete")

    public String deleteUser(@RequestBody Integer id)
    {
        personRepository.deleteById(id);
        return "Person Deleted!";

    }

    @GetMapping(path="/all")

    public @ResponseBody Iterable<Person> getAllUsers() {
        // This returns a JSON or XML with the users
        return personRepository.findAll();
    }




}
