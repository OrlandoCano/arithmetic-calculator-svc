package com.calculator.arithmetic_calculator.v1.record.repository;

import com.calculator.arithmetic_calculator.v1.record.entity.Record;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RecordRepository extends JpaRepository<Record, Long> {
  List<Record> findByUserIdOrderByCreatedDateDesc(String userId);
}
