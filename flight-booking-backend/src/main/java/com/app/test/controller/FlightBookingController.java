package com.app.test.controller;

import com.app.test.dto.FlightBookingAcknowledgement;
import com.app.test.dto.FlightBookingRequest;
import com.app.test.service.FlightBookingService;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableTransactionManagement
public class FlightBookingController {
    private FlightBookingService service;
    @PostMapping("/bookFlightTicket")
    public FlightBookingAcknowledgement bookFlightTicket(@RequestBody FlightBookingRequest request){
        return service.bookFlightTicket(request);
    }
}