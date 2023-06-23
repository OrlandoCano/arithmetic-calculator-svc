package com.calculator.arithmetic_calculator.v1.squareroot.controller;

import static com.calculator.arithmetic_calculator.v1.constants.ArithmeticCalculatorConstants.ARITHMETIC_CALCULATOR_PATH;

import com.calculator.arithmetic_calculator.v1.facade.RequestFacade;
import com.calculator.arithmetic_calculator.v1.squareroot.model.request.SquareRootRequest;
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
public class SquareRootController {
  private final RequestFacade requestFacade;

  @PostMapping("square-root")
  public ResponseEntity<String> doOperation(
      @RequestHeader HttpHeaders httpHeaders, @RequestBody SquareRootRequest request) {
    String result = requestFacade.processRequest(httpHeaders, request);

    return ResponseEntity.ok(result);
  }
}
