package com.calculator.arithmetic_calculator.v1.multiplication.model.request;

import static com.calculator.arithmetic_calculator.v1.constants.OperationType.MULTIPLICATION;

import com.calculator.arithmetic_calculator.v1.request.BaseOperationRequest;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class MultiplicationRequest extends BaseOperationRequest {

  public MultiplicationRequest(double firstOperand, double secondOperand) {
    super(firstOperand, secondOperand, MULTIPLICATION);
  }
}
