package test.model;

import lombok.Data;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@Entity

public class Person
{

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)

    private Integer id;

    private String first;
    private String last;
    private Integer age;


    public Person(String first, String last, Integer age)
    {
        this.first = first;
        this.last = last;
        this.age = age;
    }

    Person()
    {

    }

}