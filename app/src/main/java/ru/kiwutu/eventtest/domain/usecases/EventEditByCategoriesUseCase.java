package ru.kiwutu.eventtest.domain.usecases;


import ru.kiwutu.eventtest.domain.entity.event.Event;
import ru.kiwutu.eventtest.domain.repository.EventDomainRepository;

public class EventEditByCategoriesUseCase {
    private EventDomainRepository repository;

    public EventEditByCategoriesUseCase(EventDomainRepository repository) {
        this.repository = repository;
    }

    public void eventEditByCategories(Event event) {
        repository.eventEditByCategories(event);
    }

}
