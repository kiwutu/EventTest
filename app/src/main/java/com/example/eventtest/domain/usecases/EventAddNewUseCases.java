package com.example.eventtest.domain.usecases;


import com.example.eventtest.domain.entity.event.Event;
import com.example.eventtest.domain.repository.EventDomainRepository;

public class EventAddNewUseCases {
    private final EventDomainRepository repository;

    public EventAddNewUseCases(EventDomainRepository repository) {
        this.repository = repository;
    }

    public void peopleAddNew(Event event) {
        repository.eventAddNew(event);
    }
}
