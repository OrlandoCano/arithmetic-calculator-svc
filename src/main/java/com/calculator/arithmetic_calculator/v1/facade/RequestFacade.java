package com.calculator.arithmetic_calculator.v1.facade;

import com.calculator.arithmetic_calculator.v1.record.service.RecordService;
import com.calculator.arithmetic_calculator.v1.request.BaseOperationRequest;
import com.calculator.arithmetic_calculator.v1.strategy.OperationStrategy;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpHeaders;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class RequestFacade {
  private final RecordService recordService;
  private final List<OperationStrategy> operationStrategies;

  public String processRequest(HttpHeaders httpHeaders, BaseOperationRequest request) {
    return operationStrategies.stream()
        .filter(operationStrategy -> operationStrategy.isApplicable(request))
        .findFirst()
        .orElseThrow()
        .performOperation(request);
  }
}
