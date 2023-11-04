package com.hospitalmanagement.backend.Hospital.Management.System.Backend.Services;

import com.hospitalmanagement.backend.Hospital.Management.System.Backend.Models.Patients;
import com.hospitalmanagement.backend.Hospital.Management.System.Backend.Repositories.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PatientService {
    @Autowired
    PatientRepository patientRepo;

    public void addPatientToDatabase(Patients obj){
        String pId = "Patient" + (patientRepo.getOverallPatient() + 1);
        obj.setpId(pId);
        patientRepo.addPatientToDatabase(obj);
    }

    public void dischargePatient(String pId){
        patientRepo.dischargePatientByPatientId(pId);
    }

    public Patients getPatientById(String pId){
        return patientRepo.getPatientById(pId);
    }

}
