package com.calculator.arithmetic_calculator.v1.division.controller;

import static com.calculator.arithmetic_calculator.v1.constants.ArithmeticCalculatorConstants.ARITHMETIC_CALCULATOR_PATH;

import com.calculator.arithmetic_calculator.v1.division.model.request.DivisionRequest;
import com.calculator.arithmetic_calculator.v1.facade.RequestFacade;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@Validated
@RequestMapping(ARITHMETIC_CALCULATOR_PATH)
public class DivisionController {
  private final RequestFacade requestFacade;

  @PostMapping("division")
  public ResponseEntity<String> doOperation(
      @RequestHeader HttpHeaders httpHeaders, @RequestBody DivisionRequest request) {
    String result = requestFacade.processRequest(httpHeaders, request);

    return ResponseEntity.ok(result);
  }
}
