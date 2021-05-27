package com.adityasonthi.springcrudapi.controller;

import com.adityasonthi.springcrudapi.RailSystemException;
import com.adityasonthi.springcrudapi.model.Passenger;
import com.adityasonthi.springcrudapi.service.PassengerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.logging.*;

@RestController
@RequestMapping("/api")
public class PassengerController
{
    private static final Logger LOG= Logger.getLogger(PassengerController.class.getName());

    @Autowired
    private PassengerService passengerService;

    @PostMapping("/passenger")
    public void save(@RequestBody Passenger passengerObj) {
        passengerService.save(passengerObj);
    }

    @PutMapping("/passenger")
    public void save(@RequestBody List<Passenger> passengers) {
        passengerService.save(passengers);
    }

    @GetMapping("/passenger")
    public List<Passenger> get()
    {
        return passengerService.get();
    }

    @GetMapping("/passenger/{id}")
    public Passenger get(@PathVariable int id) throws RailSystemException {
        Passenger passengerObj = passengerService.get(id);
        if(passengerObj == null)
            throw new RailSystemException("Passenger not found for the Id: "+id);
        LOG.info(()-> "Passenger Details" + passengerObj.toString());

        return passengerObj;
    }

    @DeleteMapping("/passenger/{id}")
    public String delete(@PathVariable int id) {
        passengerService.delete(id);
        return "Passenger has been deleted with Id: "+id;
    }

    @DeleteMapping("/passenger")
    public String deleteAll() {
        passengerService.deleteAll();
        return "All Passenger records have been deleted";
    }
}
