package com.calculator.arithmetic_calculator.v1.subtraction.strategy;

import static com.calculator.arithmetic_calculator.v1.constants.OperationType.SUBTRACTION;

import com.calculator.arithmetic_calculator.v1.request.BaseOperationRequest;
import com.calculator.arithmetic_calculator.v1.strategy.OperationStrategy;
import org.springframework.stereotype.Component;

@Component
public class SubtractionStrategy implements OperationStrategy {
  @Override
  public boolean isApplicable(BaseOperationRequest request) {
    return SUBTRACTION == request.getOperationType();
  }

  @Override
  public String performOperation(BaseOperationRequest request) {
    return "" + (request.getFirstOperand() - request.getSecondOperand());
  }
}
