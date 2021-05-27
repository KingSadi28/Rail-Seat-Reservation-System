package com.adityasonthi.springcrudapi.service;

import com.adityasonthi.springcrudapi.model.Passenger;

import java.util.List;

public interface PassengerService
{
    List<Passenger> get();
    Passenger get(int pnr_id);
    void save(Passenger passenger);
    void save(List<Passenger> passengers);
    void delete(int pnr_id);
    void deleteAll();
}
