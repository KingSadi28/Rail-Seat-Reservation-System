package com.adityasonthi.springcrudapi.model;

import javax.persistence.*;

@Entity
@Table (name = "rail_passenger")
public class Passenger
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "pnr_id")
    private int pnrId;
    @Column
    private String name;
    @Column
    private int age;
    @Column
    private String gender;
    @Column
    private String aadhaar;
    @Column(name = "mobile_number")
    private String mobileNumber;

    public int getPnrId() {
        return pnrId;
    }

    public void setPnrId(int id) {
        this.pnrId = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAadhaar() {
        return aadhaar;
    }

    public void setAadhaar(String aadhaar) {
        this.aadhaar = aadhaar;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    @Override
    public String toString() {
        return "Passenger{" +
                "PNR Number=" + pnrId +
                ", Name='" + name + '\'' +
                ", Age='" + age + '\'' +
                ", Gender='" + gender + '\'' +
                ", Aadhaar='" + aadhaar + '\'' +
                ", Mobile Number='" + mobileNumber + '\'' +
                '}';
    }
}
