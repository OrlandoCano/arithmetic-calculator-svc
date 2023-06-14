package com.calculator.arithmetic_calculator.v1.record.repository;

import com.calculator.arithmetic_calculator.v1.record.entity.Record;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RecordRepository extends JpaRepository<Record, Long> {}
