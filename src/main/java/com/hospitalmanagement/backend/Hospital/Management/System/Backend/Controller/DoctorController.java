package com.hospitalmanagement.backend.Hospital.Management.System.Backend.Controller;

import com.hospitalmanagement.backend.Hospital.Management.System.Backend.Models.Doctor;
import com.hospitalmanagement.backend.Hospital.Management.System.Backend.Repositories.DoctorRepositiory;
import com.hospitalmanagement.backend.Hospital.Management.System.Backend.Services.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class DoctorController {
    @Autowired
    DoctorService docService;

    @PostMapping("/api/doctor/adddoctor")
    public String addDoctorToDatabase(@RequestBody Doctor obj){
        docService.addDoctorToDatabase(obj);
        return "Doctor got added into my database";
    }

    @GetMapping("/api/doctor")
    public Doctor getDoctorById(@RequestParam String docId){
        return docService.getDoctorByDocId(docId);
    }

    @PutMapping("/api/doctor")
     public String updateDoctorById(@RequestParam String docId, @RequestBody Doctor obj){
        docService.updateDocDetailsByDocId(docId,obj);
        return "Doctor details with doc id " + docId + " got updated";
    }

}
