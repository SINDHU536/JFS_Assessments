package com.project.VehicleManagementService.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.VehicleManagementService.Entity.Vehicle;

public interface VehicleRepository extends JpaRepository<Vehicle, Long> {}
