package com.adityasonthi.springcrudapi.service;

import com.adityasonthi.springcrudapi.dao.PassengerDAO;
import com.adityasonthi.springcrudapi.model.Passenger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class PassengerServiceImpl implements PassengerService
{
    @Autowired
    private PassengerDAO passengerDAO;

    @Transactional
    @Override
    public void save(Passenger passenger)
    {
        passengerDAO.save(passenger);
    }

    @Transactional
    @Override
    public void save(List<Passenger> passengers) {
        passengerDAO.save(passengers);
    }

    @Transactional
    @Override
    public List<Passenger> get()
    {
        return passengerDAO.get();
    }

    @Transactional
    @Override
    public Passenger get(int pnr_id) {
        return passengerDAO.get(pnr_id);
    }

    @Transactional
    @Override
    public void delete(int pnr_id) {
        passengerDAO.delete(pnr_id);
    }

    @Transactional
    @Override
    public void deleteAll() {
        passengerDAO.deleteAll();
    }
}
