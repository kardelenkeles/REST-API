package com.keles.rest.webservices.restfulwebservices.controller;


import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Locale;

@RestController
public class Controller {
    private MessageSource messageSource;

    public Controller(MessageSource messageSource) {
        super();
        this.messageSource = messageSource;
    }

    @GetMapping(path = "/inter")
    public String internationalized() {
        Locale locale = LocaleContextHolder.getLocale();
        return messageSource.getMessage("good.morning.message", null,
                "Default Message", locale);
    }
}
