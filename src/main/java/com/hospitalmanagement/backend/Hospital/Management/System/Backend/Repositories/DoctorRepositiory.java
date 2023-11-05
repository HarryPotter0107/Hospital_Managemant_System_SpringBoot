package com.hospitalmanagement.backend.Hospital.Management.System.Backend.Repositories;

import com.hospitalmanagement.backend.Hospital.Management.System.Backend.Models.Doctor;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
@Repository
public class DoctorRepositiory {
    private HashMap<String, Doctor> docDatabase;
    private int overAllDoctors;

    public DoctorRepositiory(){
        this.docDatabase = new HashMap<>();
        this.overAllDoctors = 0;
    }

    public void addDoctorToDatabase(Doctor obj){
        this.overAllDoctors += 1;
//        docDatabase.put(obj.getDocDegree(), obj);
        docDatabase.put(obj.getDocId(),obj);
    }

    public Doctor getDoctorByDocId(String docId){
        return docDatabase.get(docId);
    }
    public int getTotalDoctors(){
        return docDatabase.size();
    }
    public  int getOverAllDoctors(){
        return this.overAllDoctors;
    }

    public void updateDocDetailsByDocId(String docId, Doctor obj){
        this.docDatabase.put(docId,obj);
    }
}
