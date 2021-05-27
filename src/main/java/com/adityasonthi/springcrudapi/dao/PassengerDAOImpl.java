package com.adityasonthi.springcrudapi.dao;

import com.adityasonthi.springcrudapi.model.Passenger;
import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import java.util.List;

@Repository
public class PassengerDAOImpl implements PassengerDAO
{
    @Autowired
    private EntityManager entityManager;

    @Override
    public void save(Passenger passengerObj)
    {
        Session currentSession = entityManager.unwrap(Session.class);
        currentSession.saveOrUpdate(passengerObj);
    }

    @Override
    public void save(List<Passenger> passengers) {
        Session currentSession = entityManager.unwrap(Session.class);
        for(int i = 0;i < passengers.size();i++)
            currentSession.saveOrUpdate(passengers.get(i));

    }

    @Override
    public List<Passenger> get()
    {
        Session currentSession = entityManager.unwrap(Session.class);
        Query<Passenger> query = currentSession.createQuery("from Passenger",Passenger.class);
        return query.getResultList();
    }

    @Override
    public Passenger get(int pnrId) {
        Session currentSession = entityManager.unwrap(Session.class);
        return currentSession.get(Passenger.class, pnrId);
    }

    @Override
    public void delete(int pnrId) {
        Session currentSession = entityManager.unwrap(Session.class);
        Passenger passengerObj = currentSession.get(Passenger.class, pnrId);
        currentSession.delete(passengerObj);
    }

    @Override
    public void deleteAll() {
        Session currentSession = entityManager.unwrap(Session.class);
        List<Passenger> passengerList = currentSession
                                            .createQuery("from Passenger",Passenger.class)
                                            .getResultList();

        int k;
        for(int i = 0;i < passengerList.size();i++)
        {
            k = passengerList.get(i).getPnrId();
            currentSession.delete(currentSession.get(Passenger.class,k));
        }
    }
}
