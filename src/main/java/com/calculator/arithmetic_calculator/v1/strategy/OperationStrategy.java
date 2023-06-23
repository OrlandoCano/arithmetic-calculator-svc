package com.calculator.arithmetic_calculator.v1.strategy;

import com.calculator.arithmetic_calculator.v1.request.BaseOperationRequest;

public interface OperationStrategy {
  boolean isApplicable(BaseOperationRequest request);

  String performOperation(BaseOperationRequest request);
}
