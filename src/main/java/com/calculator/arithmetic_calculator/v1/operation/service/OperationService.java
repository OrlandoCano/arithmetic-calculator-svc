package com.calculator.arithmetic_calculator.v1.operation.service;

import com.calculator.arithmetic_calculator.v1.operation.model.OperationDto;
import java.util.List;

public interface OperationService {
  List<OperationDto> loadOperations();
}
