package com.keles.rest.webservices.restfulwebservices.versioning;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VersioningPersonController {
    private Name name;

    public VersioningPersonController() {
        name = new Name();
        name.setFirstName("Kardelen");
        name.setLastName("Keleş");
    }
    @GetMapping(path = "/v1/person")
    public PersonV1 getFirstVersionOfPerson() {
        Name name = new Name();
        name.setFirstName("Sponge");
        name.setLastName("Bob");

        PersonV1 person = new PersonV1();
        person.setName(name);
        return person;
    }

    @GetMapping(path = "/v2/person")
    public PersonV2 getSecondVersionOfPerson() {
        Name name = new Name();
        name.setFirstName("Patrick");
        name.setLastName("Star");

        PersonV2 person = new PersonV2();
        person.setName(name);
        return person;
    }

    @GetMapping(path = "/person/header", headers = "X-API-VERSION=1")
    public PersonV1 getFirstVersionOfPersonRequestHeader(){
        Name name = new Name();
        name.setFirstName("Squidward Tentacles");
        PersonV1 person = new PersonV1();
        person.setName(name);
        return person;
    }

    @GetMapping(path = "/person/header", headers = "X-API-VERSION=2")
    public PersonV1 getSecondVersionOfPersonRequestHeader(){
        Name name = new Name();
        name.setFirstName("Sandy");
        name.setLastName("Cheeks");

        PersonV1 person = new PersonV1();
        person.setName(name);
        return person;
    }

    @GetMapping(path = "/person/accept", produces = "application/vnd.company.app-v1+json")
    public PersonV1 getFirstVersionOfPersonAcceptHeader(){
        Name name = new Name();
        name.setFirstName("Squidward Tentacles");
        PersonV1 person = new PersonV1();
        person.setName(name);
        return person;
    }

    @GetMapping(path = "/person/accept", produces = "application/vnd.company.app-v2+json")
    public PersonV1 getSecondVersionOfPersonAcceptHeader(){
        Name name = new Name();
        name.setFirstName("Sandy");
        name.setLastName("Cheeks");

        PersonV1 person = new PersonV1();
        person.setName(name);
        return person;
    }


}
