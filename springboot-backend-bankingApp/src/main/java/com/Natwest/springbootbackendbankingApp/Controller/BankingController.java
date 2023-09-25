package com.Natwest.springbootbackendbankingApp.Controller;
import com.Natwest.springbootbackendbankingApp.Entity.BankingInfo;
import com.Natwest.springbootbackendbankingApp.Services.BankingServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/childrenbank")
public class BankingController {

    @Autowired
    BankingServices bankingServices;

    @CrossOrigin(origins = "http://localhost:3000")
    @PostMapping("/selfregister")
    public BankingInfo registerEmployee(@RequestBody BankingInfo bankingInfo){
        return bankingServices.registerEmployee(bankingInfo);
    }

    @CrossOrigin(origins = "http://localhost:3000")
    @GetMapping("/bankingasservice/{accountNumber}")
    public BankingInfo bankingAsService(@PathVariable String accountNumber){
        return bankingServices.bankingAsService(accountNumber);
    }

    @CrossOrigin(origins = "http://localhost:3000")
    @GetMapping("/userdetails/{id}")
    public BankingInfo userDetails(@PathVariable int id){
        return bankingServices.userDetails(id);
    }

}
