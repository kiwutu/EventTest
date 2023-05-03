package com.example.eventtest.domain.usecases;

import androidx.lifecycle.MutableLiveData;

import com.example.eventtest.domain.entity.event.Event;
import com.example.eventtest.domain.repository.EventDomainRepository;

public class EventGetByCategoriesUseCase {

    private final EventDomainRepository repository;

    public EventGetByCategoriesUseCase(EventDomainRepository repository) {
        this.repository = repository;
    }

    public MutableLiveData<Event> eventGetByCategories(String categories) {
        return repository.eventGetByCategories(categories);
    }
}