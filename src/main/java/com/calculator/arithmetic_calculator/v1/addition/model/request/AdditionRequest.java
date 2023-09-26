package com.calculator.arithmetic_calculator.v1.addition.model.request;

import static com.calculator.arithmetic_calculator.v1.constants.OperationType.ADDITION;

import com.calculator.arithmetic_calculator.v1.request.BaseOperationRequest;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class AdditionRequest extends BaseOperationRequest {
  public AdditionRequest(double firstOperand, double secondOperand) {
    super(firstOperand, secondOperand, ADDITION);
  }
}
