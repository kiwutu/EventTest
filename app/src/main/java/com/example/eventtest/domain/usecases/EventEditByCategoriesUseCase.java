package com.example.eventtest.domain.usecases;


import com.example.eventtest.domain.entity.event.Event;
import com.example.eventtest.domain.repository.EventDomainRepository;

public class EventEditByCategoriesUseCase {
    private EventDomainRepository repository;

    public EventEditByCategoriesUseCase(EventDomainRepository repository) {
        this.repository = repository;
    }

    public void eventEditByCategories(Event event) {
        repository.eventEditByCategories(event);
    }

}
