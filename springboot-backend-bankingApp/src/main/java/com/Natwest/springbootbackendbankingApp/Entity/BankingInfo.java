package com.Natwest.springbootbackendbankingApp.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name="children_bank")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class BankingInfo {
    @Id
    @GeneratedValue(strategy =  GenerationType.AUTO)
    private int id;
    private String name;
    private String email;
    private String accountNumber;
    private String dob;
    private String address;
    private String aadhar;
    private String mobile;
}
