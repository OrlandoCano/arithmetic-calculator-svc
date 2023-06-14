package com.calculator.arithmetic_calculator.v1.record.service;

import com.calculator.arithmetic_calculator.v1.record.model.RecordDto;
import com.calculator.arithmetic_calculator.v1.record.repository.RecordRepository;
import java.util.List;
import java.util.stream.Collectors;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class RecordServiceImpl implements RecordService {
  private final RecordRepository repository;

  @Override
  public List<RecordDto> loadRecords() {
    return repository.findAll().stream()
        .map(
            userRecord ->
                RecordDto.builder()
                    .withId(userRecord.getId())
                    .withOperationId(userRecord.getOperationId())
                    .withUserId(userRecord.getUserId())
                    .withAmount(userRecord.getAmount())
                    .withUserBalance(userRecord.getUserBalance())
                    .withOperationResponse(userRecord.getOperationResponse())
                    .withCreatedDate(userRecord.getCreatedDate())
                    .build())
        .collect(Collectors.toList());
  }
}
