package ru.kiwutu.eventtest.domain.usecases;

import androidx.lifecycle.MutableLiveData;

import ru.kiwutu.eventtest.domain.entity.event.Event;
import ru.kiwutu.eventtest.domain.repository.EventDomainRepository;

import java.util.ArrayList;

public class EventGetByAllUseCase {

    private final EventDomainRepository repository;

    public EventGetByAllUseCase(EventDomainRepository repository) {
        this.repository = repository;
    }

    public MutableLiveData<ArrayList<Event>> EventGetByAll() {
        return repository.eventGetAll();
    }
}