package ru.kiwutu.eventtest.domain.usecases;


import ru.kiwutu.eventtest.domain.repository.EventDomainRepository;

public class EventDeleteByIdUseCase {
    private EventDomainRepository repository;

    public EventDeleteByIdUseCase(EventDomainRepository repository) {
        this.repository = repository;
    }

    public void peopleDeleteById(String _id) {
        repository.eventDeleteById(_id);
    }

}
