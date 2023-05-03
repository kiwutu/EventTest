package com.example.eventtest.domain.usecases;

import androidx.lifecycle.MutableLiveData;

import com.example.eventtest.domain.entity.event.Event;
import com.example.eventtest.domain.repository.EventDomainRepository;

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