package com.calculator.arithmetic_calculator.v1.addition.strategy;

import static com.calculator.arithmetic_calculator.v1.constants.OperationType.ADDITION;

import com.calculator.arithmetic_calculator.v1.operation.service.OperationService;
import com.calculator.arithmetic_calculator.v1.request.BaseOperationRequest;
import com.calculator.arithmetic_calculator.v1.strategy.OperationStrategy;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class AdditionStrategy implements OperationStrategy {
  private final OperationService operationService;

  @Override
  public boolean isApplicable(BaseOperationRequest request) {
    return ADDITION == request.getOperationType();
  }

  @Override
  public String performOperation(BaseOperationRequest request) {
    boolean hasCredits = operationService.sufficientCredits(request);
    return "" + (request.getFirstOperand() + request.getSecondOperand());
  }
}
