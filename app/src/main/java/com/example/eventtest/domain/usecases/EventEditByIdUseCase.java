package com.example.eventtest.domain.usecases;


import com.example.eventtest.domain.entity.event.Event;
import com.example.eventtest.domain.repository.EventDomainRepository;

public class EventEditByIdUseCase {
    private EventDomainRepository repository;

    public EventEditByIdUseCase(EventDomainRepository repository) {
        this.repository = repository;
    }

    public void eventEditById(Event event) {
        repository.eventEditById(event);
    }

}
