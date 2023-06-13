package com.calculator.arithmetic_calculator.v1.controller;

import com.calculator.arithmetic_calculator.v1.constants.OperationType;

public abstract class BaseController {
  protected final double firstOperand;
  protected final double secondOperand;
  protected final OperationType operationType;

  protected BaseController(double firstOperand, double secondOperand, OperationType operationType) {
    this.firstOperand = firstOperand;
    this.secondOperand = secondOperand;
    this.operationType = operationType;
  }

  public abstract double performOperation();
}
