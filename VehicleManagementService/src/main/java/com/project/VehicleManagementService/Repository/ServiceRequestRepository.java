package com.project.VehicleManagementService.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.VehicleManagementService.Entity.ServiceRequest;

public interface ServiceRequestRepository extends JpaRepository<ServiceRequest, Long> {}
