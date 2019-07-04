package test;

import org.springframework.data.repository.CrudRepository;


// CRUD :  Create, Read, Update, Delete

public interface PersonRepository extends CrudRepository<Person, Integer>
{

}
