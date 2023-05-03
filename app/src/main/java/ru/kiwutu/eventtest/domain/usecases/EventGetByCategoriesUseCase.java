package ru.kiwutu.eventtest.domain.usecases;

import androidx.lifecycle.MutableLiveData;

import ru.kiwutu.eventtest.domain.entity.event.Event;
import ru.kiwutu.eventtest.domain.repository.EventDomainRepository;

public class EventGetByCategoriesUseCase {

    private final EventDomainRepository repository;

    public EventGetByCategoriesUseCase(EventDomainRepository repository) {
        this.repository = repository;
    }

    public MutableLiveData<Event> eventGetByCategories(String categories) {
        return repository.eventGetByCategories(categories);
    }
}