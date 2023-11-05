package com.hospitalmanagement.backend.Hospital.Management.System.Backend.Services;

import com.hospitalmanagement.backend.Hospital.Management.System.Backend.Models.Doctor;
import com.hospitalmanagement.backend.Hospital.Management.System.Backend.Repositories.DoctorRepositiory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DoctorService {
    @Autowired
    DoctorRepositiory docterRepo;
    public void addDoctorToDatabase(Doctor obj){
        String docId = "Doctor" + (docterRepo.getOverAllDoctors() + 1);
        obj.setDocId(docId);
        docterRepo.addDoctorToDatabase(obj);
    }
    public Doctor getDoctorByDocId(String docId){
        return docterRepo.getDoctorByDocId(docId);
    }

    public void updateDocDetailsByDocId(String docId, Doctor obj){
        docterRepo.updateDocDetailsByDocId(docId,obj) ;
    }
}
