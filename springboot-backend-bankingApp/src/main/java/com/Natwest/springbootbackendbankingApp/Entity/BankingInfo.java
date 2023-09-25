package com.Natwest.springbootbackendbankingApp.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;

@Entity
@Table
@Data
@NoArgsConstructor
@AllArgsConstructor
public class BankingInfo {
    @GeneratedValue(strategy =  GenerationType.AUTO)
    private int id;
    private String name;
    private String email;
    private String accountNumber;
    private String dob;
    private String address;
    private String aadhar;
}
