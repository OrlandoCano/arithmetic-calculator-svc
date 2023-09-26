package com.calculator.arithmetic_calculator.v1.division.model.request;

import static com.calculator.arithmetic_calculator.v1.constants.OperationType.DIVISION;

import com.calculator.arithmetic_calculator.v1.request.BaseOperationRequest;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class DivisionRequest extends BaseOperationRequest {

  public DivisionRequest(double firstOperand, double secondOperand) {
    super(firstOperand, secondOperand, DIVISION);
  }
}
