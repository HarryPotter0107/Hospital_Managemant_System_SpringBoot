package com.hospitalmanagement.backend.Hospital.Management.System.Backend.Models;

public class Patients {
    private String pId;
    private String patientName;
    private String patientGender;
    private int age;
    private  String patientAddress;
    private String patientDisease;

    public Patients(String pId, String patientName, String patientGender, int age, String patientAddress, String patientDisease) {
        this.pId = pId;
        this.patientName = patientName;
        this.patientGender = patientGender;
        this.age = age;
        this.patientAddress = patientAddress;
        this.patientDisease = patientDisease;
    }

    public String getpId() {
        return pId;
    }

    public void setpId(String pId) {
        this.pId = pId;
    }

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public String getPatientGender() {
        return patientGender;
    }

    public void setPatientGender(String patientGender) {
        this.patientGender = patientGender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPatientAddress() {
        return patientAddress;
    }

    public void setPatientAddress(String patientAddress) {
        this.patientAddress = patientAddress;
    }

    public String getPatientDisease() {
        return patientDisease;
    }

    public void setPatientDisease(String patientDisease) {
        this.patientDisease = patientDisease;
    }
}
