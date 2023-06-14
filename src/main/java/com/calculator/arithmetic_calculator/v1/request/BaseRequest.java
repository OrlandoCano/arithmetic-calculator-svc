package com.calculator.arithmetic_calculator.v1.request;

import com.calculator.arithmetic_calculator.v1.constants.OperationType;

public abstract class BaseRequest {
  protected final double firstOperand;
  protected final double secondOperand;
  protected final OperationType operationType;

  protected BaseRequest(double firstOperand, double secondOperand, OperationType operationType) {
    this.firstOperand = firstOperand;
    this.secondOperand = secondOperand;
    this.operationType = operationType;
  }
}
