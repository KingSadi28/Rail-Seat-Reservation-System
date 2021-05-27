package com.adityasonthi.springcrudapi.dao;

import com.adityasonthi.springcrudapi.model.Passenger;

import java.util.List;

public interface PassengerDAO
{
    List<Passenger> get();
    Passenger get(int pnrId);
    void save(Passenger passenger);
    void save(List<Passenger> passengers);
    void delete(int pnrId);
    void deleteAll();
}
