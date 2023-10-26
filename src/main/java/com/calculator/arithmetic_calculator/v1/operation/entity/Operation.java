package com.calculator.arithmetic_calculator.v1.operation.entity;

import com.calculator.arithmetic_calculator.v1.constants.OperationType;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "OPERATIONS")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Operation {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;

  @Enumerated(EnumType.STRING)
  private OperationType type;

  private Double cost;
}
