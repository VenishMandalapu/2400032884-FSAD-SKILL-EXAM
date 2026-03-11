package com.klef.fsad.exam.service;

import com.klef.fsad.exam.model.Shipment;
import java.util.List;

public interface ShipmentService {
    
    // POST - Add Shipment
    public Shipment addShipment(Shipment shipment);
    
    // PUT - Update Shipment
    public Shipment updateShipment(Long id, Shipment shipment);
    
    // Get all shipments
    public List<Shipment> getAllShipments();
    
    // Get shipment by ID
    public Shipment getShipmentById(Long id);
    
    // Delete shipment
    public void deleteShipment(Long id);
}

