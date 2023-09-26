package com.calculator.arithmetic_calculator.v1.squareroot.model.request;

import static com.calculator.arithmetic_calculator.v1.constants.OperationType.SQUARE_ROOT;

import com.calculator.arithmetic_calculator.v1.request.BaseOperationRequest;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class SquareRootRequest extends BaseOperationRequest {
  public SquareRootRequest(double firstOperand, double secondOperand) {
    super(firstOperand, 0, SQUARE_ROOT);
  }
}
