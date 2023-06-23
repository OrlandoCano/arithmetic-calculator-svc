package com.calculator.arithmetic_calculator.v1.squareroot.strategy;

import static com.calculator.arithmetic_calculator.v1.constants.OperationType.SQUARE_ROOT;

import com.calculator.arithmetic_calculator.v1.request.BaseOperationRequest;
import com.calculator.arithmetic_calculator.v1.strategy.OperationStrategy;
import org.springframework.stereotype.Component;

@Component
public class SquareRootStrategy implements OperationStrategy {
  @Override
  public boolean isApplicable(BaseOperationRequest request) {
    return SQUARE_ROOT == request.getOperationType();
  }

  @Override
  public String performOperation(BaseOperationRequest request) {
    return "" + (Math.sqrt(request.getFirstOperand()));
  }
}
