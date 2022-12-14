//package com.example.btltute.controllers;
//
//import com.example.btltute.domains.Role;
//import com.example.btltute.domains.User;
//import com.example.btltute.exceptions.CustomException;
//import com.example.btltute.exceptions.ExceptionUtils;
//import com.example.btltute.jwt.JwtTokenProvider;
//import com.example.btltute.models.LoginDTO;
//import com.example.btltute.models.SignUpDTO;
//import com.example.btltute.repositories.RoleRepository;
//import com.example.btltute.repositories.UserRepository;
//import com.example.btltute.services.CustomUserDetails;
//import java.util.Collections;
//import lombok.RequiredArgsConstructor;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.security.authentication.AuthenticationManager;
//import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
//import org.springframework.security.core.Authentication;
//import org.springframework.security.core.context.SecurityContextHolder;
//import org.springframework.security.crypto.password.PasswordEncoder;
//import org.springframework.web.bind.annotation.CrossOrigin;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//@CrossOrigin("*")
//@RestController
//@RequestMapping("/api/auth")
//@RequiredArgsConstructor
//public class AuthController {
//
//  private final AuthenticationManager authenticationManager;
//  private final UserRepository userRepository;
//  private final RoleRepository roleRepository;
//  private final PasswordEncoder passwordEncoder;
//  private final JwtTokenProvider tokenProvider;
//
//  @PostMapping("/signin")
//  public ResponseEntity<String> authenticateUser(@RequestBody LoginDTO loginDto) {
//    Authentication authentication =
//        authenticationManager.authenticate(
//            new UsernamePasswordAuthenticationToken(
//                loginDto.getUsername(), loginDto.getPassword()));
//
//    SecurityContextHolder.getContext().setAuthentication(authentication);
//    String jwt = tokenProvider.generateToken((CustomUserDetails) authentication.getPrincipal());
//    return new ResponseEntity<>(jwt, HttpStatus.OK);
//  }
//
//  @PostMapping("/signup")
//  public ResponseEntity<?> registerUser(@RequestBody SignUpDTO signUpDto) throws CustomException {
//    if (!signUpDto.getUsername().matches("^[a-z0-9_-]{3,15}$")) {
//      throw new CustomException(
//          ExceptionUtils.USER_NAME_NOT_VALID,
//          ExceptionUtils.messages.get(ExceptionUtils.USER_NAME_NOT_VALID));
//    }
//    // add check for username exists in a DB
//    if (userRepository.existsByUsername(signUpDto.getUsername())) {
//      return new ResponseEntity<>("Username is already taken!", HttpStatus.BAD_REQUEST);
//    }
//
//    User user = new User();
//    user.setUsername(signUpDto.getUsername());
//    user.setPassword(passwordEncoder.encode(signUpDto.getPassword()));
//
//    Role roles = roleRepository.findRoleByName("ROLE_USER").get();
//    user.setRoles(Collections.singleton(roles));
//
//    userRepository.save(user);
//
//    return new ResponseEntity<>("User registered successfully", HttpStatus.OK);
//  }
//}
