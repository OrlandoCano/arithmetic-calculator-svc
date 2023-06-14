package com.calculator.arithmetic_calculator.v1.record.service;

import com.calculator.arithmetic_calculator.v1.record.model.RecordDto;
import java.util.List;

public interface RecordService {
  List<RecordDto> loadRecords();
}
