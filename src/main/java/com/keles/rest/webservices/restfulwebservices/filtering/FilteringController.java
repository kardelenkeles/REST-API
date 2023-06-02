package com.keles.rest.webservices.restfulwebservices.filtering;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FilteringController {

    @GetMapping("/filtering")
    public SomeBean filtering() {
        SomeBean v = new SomeBean();
        v.setField1("v1");
        v.setField2("v2");
        v.setField3("v3");
        return v;
    }

}
