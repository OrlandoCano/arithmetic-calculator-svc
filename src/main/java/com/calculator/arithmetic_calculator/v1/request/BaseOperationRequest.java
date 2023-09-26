package com.calculator.arithmetic_calculator.v1.request;

import com.calculator.arithmetic_calculator.v1.constants.OperationType;
import lombok.Data;
import lombok.Getter;

@Getter
@Data
public abstract class BaseOperationRequest {
  protected final double firstOperand;
  protected final double secondOperand;
  protected final OperationType operationType;

  protected BaseOperationRequest(
      double firstOperand, double secondOperand, OperationType operationType) {
    this.firstOperand = firstOperand;
    this.secondOperand = secondOperand;
    this.operationType = operationType;
  }
}
