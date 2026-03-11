package com.klef.fsad.exam.service;

import com.klef.fsad.exam.model.Shipment;
import com.klef.fsad.exam.repository.ShipmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class ShipmentServiceImpl implements ShipmentService {
    
    @Autowired
    private ShipmentRepository shipmentRepository;
    
    // POST - Add Shipment
    @Override
    @Transactional
    public Shipment addShipment(Shipment shipment) {
        if (shipment.getShipmentId() == null) {
            throw new IllegalArgumentException("Shipment ID cannot be null");
        }
        
        Optional<Shipment> existingShipment = shipmentRepository.findById(shipment.getShipmentId());
        if (existingShipment.isPresent()) {
            throw new IllegalArgumentException("Shipment with ID " + shipment.getShipmentId() + " already exists");
        }
        
        return shipmentRepository.save(shipment);
    }
    
    // PUT - Update Shipment
    @Override
    @Transactional
    public Shipment updateShipment(Long id, Shipment shipment) {
        Optional<Shipment> existingShipment = shipmentRepository.findById(id);
        
        if (existingShipment.isEmpty()) {
            throw new IllegalArgumentException("Shipment with ID " + id + " not found");
        }
        
        Shipment existing = existingShipment.get();
        
        // Update fields if provided
        if (shipment.getName() != null) {
            existing.setName(shipment.getName());
        }
        if (shipment.getDate() != null) {
            existing.setDate(shipment.getDate());
        }
        if (shipment.getStatus() != null) {
            existing.setStatus(shipment.getStatus());
        }
        if (shipment.getSourceLocation() != null) {
            existing.setSourceLocation(shipment.getSourceLocation());
        }
        if (shipment.getDestinationLocation() != null) {
            existing.setDestinationLocation(shipment.getDestinationLocation());
        }
        if (shipment.getWeight() != null) {
            existing.setWeight(shipment.getWeight());
        }
        if (shipment.getDescription() != null) {
            existing.setDescription(shipment.getDescription());
        }
        
        return shipmentRepository.save(existing);
    }
    
    // Get all shipments
    @Override
    public List<Shipment> getAllShipments() {
        return shipmentRepository.findAll();
    }
    
    // Get shipment by ID
    @Override
    public Shipment getShipmentById(Long id) {
        return shipmentRepository.findById(id).orElse(null);
    }
    
    // Delete shipment
    @Override
    @Transactional
    public void deleteShipment(Long id) {
        shipmentRepository.deleteById(id);
    }
}

