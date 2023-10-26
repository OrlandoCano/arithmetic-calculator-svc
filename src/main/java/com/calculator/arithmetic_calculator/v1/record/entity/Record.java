package com.calculator.arithmetic_calculator.v1.record.entity;

import java.time.LocalDateTime;
import java.util.UUID;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
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
