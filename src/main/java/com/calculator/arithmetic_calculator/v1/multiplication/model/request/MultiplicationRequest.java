package com.calculator.arithmetic_calculator.v1.multiplication.model.request;

import com.calculator.arithmetic_calculator.v1.constants.OperationType;
import com.calculator.arithmetic_calculator.v1.request.BaseRequest;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonDeserialize(builder = MultiplicationRequest.Builder.class)
public class MultiplicationRequest extends BaseRequest {

  @lombok.Builder(setterPrefix = "with", builderMethodName = "multiplicationControllerBuilder")
  public MultiplicationRequest(
      double firstOperand, double secondOperand, OperationType operationType) {
    super(firstOperand, secondOperand, operationType);
  }
}
