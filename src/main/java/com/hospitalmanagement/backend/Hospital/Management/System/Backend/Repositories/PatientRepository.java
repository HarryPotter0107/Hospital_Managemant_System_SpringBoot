package com.hospitalmanagement.backend.Hospital.Management.System.Backend.Repositories;

import com.hospitalmanagement.backend.Hospital.Management.System.Backend.Models.Patients;
import org.springframework.stereotype.Repository;

import java.util.HashMap;


@Repository
public class PatientRepository {
    private HashMap<String, Patients> patientsDatabase;
    private  int overallPatient;

    public PatientRepository(){
        this.overallPatient = 0;
        this.patientsDatabase = new HashMap<>();
    }
    public Patients getPatientById(String patientId){
        return this.patientsDatabase.get(patientId);
    }

    public void addPatientToDatabase(Patients obj){
        this.overallPatient += 1;
        this.patientsDatabase.put(obj.getpId(),obj);
    }

    public void dischargePatientByPatientId(String pId){
        this.patientsDatabase.remove(pId);
    }

    public int getOverallPatient(){
        return this.overallPatient;
    }
    public  int totalpatients(){
        return patientsDatabase.size();
    }
}
