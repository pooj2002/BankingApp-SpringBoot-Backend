package com.Natwest.springbootbackendbankingApp.Services;

import com.Natwest.springbootbackendbankingApp.Entity.BankingInfo;
import com.Natwest.springbootbackendbankingApp.Repository.BankingRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BankingServices {

    @Autowired
    BankingRepo bankingRepo;
    public BankingInfo registerEmployee(BankingInfo bankingInfo) {
        return bankingRepo.save(bankingInfo);
    }

    public BankingInfo bankingAsService(String accountNumber) {

        List<BankingInfo> bankingInfo=bankingRepo.findAll();
        for(BankingInfo bi:bankingInfo){
            if(bi.getAccountNumber().equalsIgnoreCase(accountNumber)){
                return bi;
            }
        }
        return null;
    }

    public BankingInfo userDetails(int id) {
        List<BankingInfo> bankingInfo=bankingRepo.findAll();
        for(BankingInfo bi:bankingInfo){
            if(bi.getId()==id){
                return bi;
            }
        }
        return null;
    }
}
