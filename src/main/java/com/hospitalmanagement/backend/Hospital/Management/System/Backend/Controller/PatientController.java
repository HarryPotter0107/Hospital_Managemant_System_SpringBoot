package com.hospitalmanagement.backend.Hospital.Management.System.Backend.Controller;

import com.hospitalmanagement.backend.Hospital.Management.System.Backend.Models.Patients;
import com.hospitalmanagement.backend.Hospital.Management.System.Backend.Services.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController  
public class PatientController {
    @Autowired
    PatientService patientService;

    @GetMapping("/api/patient")
    public Patients getPatientById(@RequestParam String patientId){
        return patientService.getPatientById(patientId);
    }

    @PostMapping("/api/patient/addpatient")
    public String addPatientToDatabase(@RequestBody Patients obj){
        patientService.addPatientToDatabase(obj);
        return "Patient added successfully into the database";
    }

    @DeleteMapping("/api/patient")
    public String dischargePatient(@RequestParam String patientId){
        patientService.dischargePatient(patientId);
        return "Patient got successfully deleted from the database";
    }

}
