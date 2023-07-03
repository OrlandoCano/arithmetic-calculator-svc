package com.calculator.arithmetic_calculator.v1.logout;

import com.calculator.arithmetic_calculator.v1.login.util.JwtUtil;
import java.util.Date;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class LogoutController {

  private final JwtUtil jwtUtil;
  private final UserDetailsService userDetailsService;

  @PostMapping("/logout")
  public void logout() {
    Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
    String username = authentication.getName();
    UserDetails userDetails = userDetailsService.loadUserByUsername(username);
    String token = jwtUtil.generateToken(userDetails);

    jwtUtil.extractAllClaims(token).put("exp", new Date(0));
  }
}
