package com.project.VehicleManagementService.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.VehicleManagementService.Entity.ServiceRequest;
import com.project.VehicleManagementService.Repository.ServiceRequestRepository;

@Service
public class ServiceRequestService {
    @Autowired
    private ServiceRequestRepository serviceRepo;

    public List<ServiceRequest> getAllRequests() {
        return serviceRepo.findAll();
    }

    public ServiceRequest saveRequest(ServiceRequest request) {
        return serviceRepo.save(request);
    }
}
