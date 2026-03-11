package com.klef.fsad.exam.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.time.LocalDate;

@Entity
@Table(name = "shipments")
public class Shipment {
    
    @Id
    @Column(name = "shipment_id", nullable = false)
    private Long shipmentId;
    
    @Column(name = "name", nullable = false)
    private String name;
    
    @Column(name = "date", nullable = false)
    private LocalDate date;
    
    @Column(name = "status", nullable = false)
    private String status;
    
    @Column(name = "source_location")
    private String sourceLocation;
    
    @Column(name = "destination_location")
    private String destinationLocation;
    
    @Column(name = "weight")
    private Double weight;
    
    @Column(name = "description")
    private String description;
    
    // Default constructor
    public Shipment() {
    }
    
    // Getters and Setters
    public Long getShipmentId() {
        return shipmentId;
    }
    
    public void setShipmentId(Long shipmentId) {
        this.shipmentId = shipmentId;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public LocalDate getDate() {
        return date;
    }
    
    public void setDate(LocalDate date) {
        this.date = date;
    }
    
    public String getStatus() {
        return status;
    }
    
    public void setStatus(String status) {
        this.status = status;
    }
    
    public String getSourceLocation() {
        return sourceLocation;
    }
    
    public void setSourceLocation(String sourceLocation) {
        this.sourceLocation = sourceLocation;
    }
    
    public String getDestinationLocation() {
        return destinationLocation;
    }
    
    public void setDestinationLocation(String destinationLocation) {
        this.destinationLocation = destinationLocation;
    }
    
    public Double getWeight() {
        return weight;
    }
    
    public void setWeight(Double weight) {
        this.weight = weight;
    }
    
    public String getDescription() {
        return description;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }
}

