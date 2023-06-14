package com.calculator.arithmetic_calculator.v1.record.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.time.LocalDateTime;
import java.util.UUID;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "RECORDS")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Record {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;

  private UUID operationId;
  private Long userId;
  private Double amount;
  private Double userBalance;
  private String operationResponse;
  private LocalDateTime createdDate;
}