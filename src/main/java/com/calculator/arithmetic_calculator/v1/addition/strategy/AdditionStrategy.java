package com.calculator.arithmetic_calculator.v1.addition.strategy;

import static com.calculator.arithmetic_calculator.v1.constants.ArithmeticCalculatorConstants.INSUFFICIENT_CREDITS_ERROR;
import static com.calculator.arithmetic_calculator.v1.constants.OperationType.ADDITION;

import com.calculator.arithmetic_calculator.v1.exception.InsufficientCreditsException;
import com.calculator.arithmetic_calculator.v1.operation.model.OperationDto;
import com.calculator.arithmetic_calculator.v1.operation.service.OperationService;
import com.calculator.arithmetic_calculator.v1.record.model.RecordDto;
import com.calculator.arithmetic_calculator.v1.record.service.RecordService;
import com.calculator.arithmetic_calculator.v1.request.BaseOperationRequest;
import com.calculator.arithmetic_calculator.v1.strategy.OperationStrategy;
import com.calculator.arithmetic_calculator.v1.user.model.UserDto;
import com.calculator.arithmetic_calculator.v1.user.service.UserService;
import java.time.LocalDateTime;
import java.util.UUID;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class AdditionStrategy implements OperationStrategy {
  private final OperationService operationService;
  private final RecordService recordService;
  private final UserService userService;

  @Override
  public boolean isApplicable(BaseOperationRequest request) {
    return ADDITION == request.getOperationType();
  }

  @Override
  public String performOperation(BaseOperationRequest request) {

    double result = request.getFirstOperand() + request.getSecondOperand();
    RecordDto.Builder newRecord = createRecord(result);

    if (!operationService.sufficientCredits(request)) {

      String errorResponse =
          String.format(INSUFFICIENT_CREDITS_ERROR, request.getOperationType().name());
      newRecord.withOperationResponse(errorResponse);
      throw new InsufficientCreditsException(errorResponse);
    }

    newRecord.withOperationResponse("Addition Applied Result=" + result);
    recordService.saveRecord(newRecord.build());

    return "" + result;
  }

  public RecordDto.Builder createRecord(Double result) {
    UserDto currentUser = userService.loadCurrentUser();
    RecordDto latestUserRecord = recordService.loadLatestUserRecord(currentUser.getUsername());
    OperationDto operation = operationService.loadOperation(ADDITION);

    return RecordDto.builder()
        .withCreatedDate(LocalDateTime.now())
        .withOperationId(UUID.randomUUID())
        .withAmount(result)
        .withUserBalance(latestUserRecord.getUserBalance() - operation.getCost())
        .withUserId(currentUser.getUsername());
  }
}
