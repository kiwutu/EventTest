package ru.kiwutu.eventtest.domain.usecases;

import androidx.lifecycle.MutableLiveData;

import ru.kiwutu.eventtest.domain.entity.event.Event;
import ru.kiwutu.eventtest.domain.repository.EventDomainRepository;

public class EventGetByIdUseCase {

    private final EventDomainRepository repository;

    public EventGetByIdUseCase(EventDomainRepository repository) {
        this.repository = repository;
    }

    public MutableLiveData<Event> eventGetById(String _id) {
        return repository.eventGetById(_id);
    }
}