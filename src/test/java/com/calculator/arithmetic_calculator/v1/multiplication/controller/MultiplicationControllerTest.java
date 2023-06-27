package com.calculator.arithmetic_calculator.v1.multiplication.controller;

import static com.calculator.arithmetic_calculator.v1.constants.ArithmeticCalculatorConstants.ARITHMETIC_CALCULATOR_PATH;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;
import static org.springframework.http.HttpHeaders.CONTENT_TYPE;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import com.calculator.arithmetic_calculator.v1.exception.InsufficientCreditsException;
import com.calculator.arithmetic_calculator.v1.facade.RequestFacade;
import java.io.IOException;
import java.util.Objects;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

@WebMvcTest(MultiplicationController.class)
@AutoConfigureMockMvc(addFilters = false)
class MultiplicationControllerTest {

  @MockBean private RequestFacade requestFacade;
  @Autowired private MockMvc mockMvc;
  private String request;

  @BeforeEach
  void init() {
    MockitoAnnotations.openMocks(this);
    request = getResourceAsString("operation_request.json");
  }

  @Test
  void shouldReturnValidOperationResponse() throws Exception {
    when(requestFacade.processRequest(any(), any())).thenReturn("4.5");
    mockMvc
        .perform(
            post(ARITHMETIC_CALCULATOR_PATH + "multiplication")
                .header(CONTENT_TYPE, "application/json")
                .content(request))
        .andExpect(status().isCreated());
  }

  @Test
  void shouldFailDueInsufficientCredits() throws Exception {
    when(requestFacade.processRequest(any(), any())).thenThrow(InsufficientCreditsException.class);
    mockMvc
        .perform(
            post(ARITHMETIC_CALCULATOR_PATH + "multiplication")
                .header(CONTENT_TYPE, "application/json")
                .content(request))
        .andExpect(status().isBadRequest());
  }

  private String getResourceAsString(String fileName) {
    try {
      return new String(
          Objects.requireNonNull(this.getClass().getClassLoader().getResourceAsStream(fileName))
              .readAllBytes());
    } catch (IOException e) {
      return "";
    }
  }
}
