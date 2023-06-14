package com.calculator.arithmetic_calculator.v1.operation.service;

import com.calculator.arithmetic_calculator.v1.operation.model.OperationDto;
import com.calculator.arithmetic_calculator.v1.operation.repository.OperationRepository;
import java.util.List;
import java.util.stream.Collectors;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class OperationServiceImpl implements OperationService {
  private final OperationRepository repository;

  @Override
  public List<OperationDto> loadOperations() {
    return repository.findAll().stream()
        .map(
            operation ->
                OperationDto.builder()
                    .withId(operation.getId())
                    .withCost(operation.getCost())
                    .withType(operation.getType())
                    .build())
        .collect(Collectors.toList());
  }
}
