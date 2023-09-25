package com.Natwest.springbootbackendbankingApp.Repository;

import com.Natwest.springbootbackendbankingApp.Entity.BankingInfo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BankingRepo extends JpaRepository<BankingInfo, Integer> {
}
