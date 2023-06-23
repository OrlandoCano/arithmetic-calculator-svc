package com.calculator.arithmetic_calculator.v1.division.strategy;

import static com.calculator.arithmetic_calculator.v1.constants.OperationType.DIVISION;

import com.calculator.arithmetic_calculator.v1.request.BaseOperationRequest;
import com.calculator.arithmetic_calculator.v1.strategy.OperationStrategy;
import org.springframework.stereotype.Component;

@Component
public class DivisionStrategy implements OperationStrategy {
  @Override
  public boolean isApplicable(BaseOperationRequest request) {
    return DIVISION == request.getOperationType();
  }

  @Override
  public String performOperation(BaseOperationRequest request) {
    return "" + (request.getFirstOperand() / request.getSecondOperand());
  }
}
