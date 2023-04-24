package io.zipcoder.crudapp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonService {

    @Autowired
    PersonRepository personRepository;

    public Person save(Person p) {
        return personRepository.save(p);
    }

    public List<Person> getPersonList() {
        return (List<Person>) personRepository.findAll();
    }

    public Person getPerson(int id) {
        return personRepository.findOne(id);
    }

    public Person updatePerson(Person p) {
        return personRepository.save(p);
    }

    public void deletePerson(int id) {
        personRepository.delete(id);
    }
}
