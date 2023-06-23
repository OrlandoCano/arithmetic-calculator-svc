package com.calculator.arithmetic_calculator.v1.randomstring.strategy;

import static com.calculator.arithmetic_calculator.v1.constants.OperationType.RANDOM_STRING;

import com.calculator.arithmetic_calculator.v1.request.BaseOperationRequest;
import com.calculator.arithmetic_calculator.v1.strategy.OperationStrategy;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
@RequiredArgsConstructor
public class RandomStringStrategy implements OperationStrategy {
  private final String RANDOM_STRING_URL =
      "https://www.random.org/strings/?num=1&len=20&digits=on&upperalpha=on&loweralpha=on&unique=on&format=plain&rnd=new";

  @Override
  public boolean isApplicable(BaseOperationRequest request) {
    return RANDOM_STRING == request.getOperationType();
  }

  @Override
  public String performOperation(BaseOperationRequest request) {
    RestTemplate restTemplate = new RestTemplate();
    ResponseEntity<String> response = restTemplate.getForEntity(RANDOM_STRING_URL, String.class);
    return response.getBody();
  }
}
