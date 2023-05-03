package ru.kiwutu.eventtest.domain.usecases;


import ru.kiwutu.eventtest.domain.entity.event.Event;
import ru.kiwutu.eventtest.domain.repository.EventDomainRepository;

public class EventAddNewUseCases {
    private final EventDomainRepository repository;

    public EventAddNewUseCases(EventDomainRepository repository) {
        this.repository = repository;
    }

    public void peopleAddNew(Event event) {
        repository.eventAddNew(event);
    }
}
