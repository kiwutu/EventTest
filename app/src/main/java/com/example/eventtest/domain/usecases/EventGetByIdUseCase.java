package com.example.eventtest.domain.usecases;

import androidx.lifecycle.MutableLiveData;

import com.example.eventtest.domain.entity.event.Event;
import com.example.eventtest.domain.repository.EventDomainRepository;

public class EventGetByIdUseCase {

    private final EventDomainRepository repository;

    public EventGetByIdUseCase(EventDomainRepository repository) {
        this.repository = repository;
    }

    public MutableLiveData<Event> eventGetById(String _id) {
        return repository.eventGetById(_id);
    }
}