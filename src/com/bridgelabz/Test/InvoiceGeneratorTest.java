package com.bridgelabz.Test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.bridgelabz.InvoiceGenerator;
import com.bridgelabz.InvoiceSummary;
import com.bridgelabz.Ride;

public class InvoiceGeneratorTest {
	 InvoiceGenerator invoiceGenerator = new InvoiceGenerator();
	    @Test
	    void given_DistanceAndTime_ShouldReturn_TotalFare() {
	        double distance = 5.0; //distance in kilometers
	        int time = 10;         //time in minutes
	        double fare = invoiceGenerator.calculateFare(distance, time); //Total fare calculations
	        Assertions.assertEquals(60 , fare);                   //5*10 + 1*10
	    }

	    @Test
	    void givenLessDistanceOrTime_ShouldReturnMinFare() {
	        double distance = 0.1; //distance in kilometers
	        int time = 1;          //time in minutes
	        double fare = invoiceGenerator.calculateFare(distance, time); //Total fare calculations
	        Assertions.assertEquals(5 , fare);                    //0.1*10 + 1*1
	    }

	    @Test
	    void givenMultipleRides_shouldReturnInvoiceSummary() {
	        Ride[] rides = {new Ride(2.0 , 5),
	                new Ride(0.1 , 1)};
	        double summary = invoiceGenerator.calculateFare(rides);
	        InvoiceSummary ExpectedInvoiceSummary = new InvoiceSummary(2, 3.0);
	        Assertions.assertEquals(ExpectedInvoiceSummary , summary);
	    }
	}
