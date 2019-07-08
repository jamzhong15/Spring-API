package test.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import test.model.Person;


// CRUD :  Create, Read, Update, Delete

@Repository

public interface PersonRepository extends CrudRepository<Person, Integer>
{

}
