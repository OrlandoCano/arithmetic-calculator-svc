package com.calculator.arithmetic_calculator.v1.randomstring.model.request;

import static com.calculator.arithmetic_calculator.v1.constants.OperationType.RANDOM_STRING;

import com.calculator.arithmetic_calculator.v1.request.BaseOperationRequest;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class RandomStringRequest extends BaseOperationRequest {
  public RandomStringRequest() {
    super(0, 0, RANDOM_STRING);
  }
}
