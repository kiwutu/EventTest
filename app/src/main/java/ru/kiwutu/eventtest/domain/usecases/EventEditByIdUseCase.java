package ru.kiwutu.eventtest.domain.usecases;


import ru.kiwutu.eventtest.domain.entity.event.Event;
import ru.kiwutu.eventtest.domain.repository.EventDomainRepository;

public class EventEditByIdUseCase {
    private EventDomainRepository repository;

    public EventEditByIdUseCase(EventDomainRepository repository) {
        this.repository = repository;
    }

    public void eventEditById(Event event) {
        repository.eventEditById(event);
    }

}
