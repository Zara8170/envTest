package com.example.awstest;

import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api")
public class MainController {
  private final UserRepository userRepository;

  @GetMapping("/userlist")
  public ResponseEntity<List<User>> getUserList() {
    List user = userRepository.findAll();
    return ResponseEntity.ok(user);
  }
}
