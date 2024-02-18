package com.app.test.dto;

import com.app.test.entity.PassengerInfo;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class FlightBookingAcknowledgement {
    private String status;
    private Double totalFare;
    private String pnrNo;
    private PassengerInfo passengerInfo;
}