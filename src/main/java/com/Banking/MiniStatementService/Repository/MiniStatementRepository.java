package com.Banking.MiniStatementService.Repository;

import com.Banking.MiniStatementService.Entity.MiniStatement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MiniStatementRepository extends JpaRepository<MiniStatement, Long>{
}
