package test.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import test.model.Person;
import test.dao.PersonRepository;
import java.util.Optional;


@Service

public class PersonService
{
    @Autowired
    PersonRepository repository;

    public Optional<Person> findPerson(Integer id)
    {
        return repository.findById(id);
    }

    public void savePerson(Person person)
    {
        repository.save(person);
    }

    public void deletePerson(Integer id)
    {
        repository.deleteById(id);
    }

    public void checkPerson(){}

    public Iterable<Person> getAllPersons() {
        // This returns a JSON or XML with the users
        return repository.findAll();
    }



}
