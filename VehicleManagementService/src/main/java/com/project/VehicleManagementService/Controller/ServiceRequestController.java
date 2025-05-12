package com.project.VehicleManagementService.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.VehicleManagementService.Entity.ServiceRequest;
import com.project.VehicleManagementService.Service.ServiceRequestService;

@RestController
@RequestMapping("/api/servicerequests")
public class ServiceRequestController {
    @Autowired
    private ServiceRequestService requestService;

    @GetMapping
    public List<ServiceRequest> getRequests() {
        return requestService.getAllRequests();
    }

    @PostMapping
    public ServiceRequest addRequest(@RequestBody ServiceRequest request) {
        return requestService.saveRequest(request);
    }
}
