package com.calculator.arithmetic_calculator.v1.subtraction.model.request;

import static com.calculator.arithmetic_calculator.v1.constants.OperationType.SUBTRACTION;

import com.calculator.arithmetic_calculator.v1.request.BaseOperationRequest;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class SubtractionRequest extends BaseOperationRequest {
  public SubtractionRequest(double firstOperand, double secondOperand) {
    super(firstOperand, secondOperand, SUBTRACTION);
  }
}
