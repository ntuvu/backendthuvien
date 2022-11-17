//package com.example.btltute.services;
//
//import com.example.btltute.domains.User;
//import com.example.btltute.repositories.UserRepository;
//import lombok.RequiredArgsConstructor;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.core.userdetails.UsernameNotFoundException;
//import org.springframework.stereotype.Service;
//
//@Service
//@RequiredArgsConstructor
//public class CustomUserDetailService implements UserDetailsService {
//
//  private final UserRepository userRepository;
//
//  @Override
//  public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
//    User user =
//        userRepository
//            .findUserByUsername(username)
//            .orElseThrow(
//                () -> new UsernameNotFoundException("Không tìm thấy username " + username));
//    return new CustomUserDetails(user);
//  }
//
//  public UserDetails loadUserById(Integer userId) {
//    User user =
//        userRepository
//            .findById(userId)
//            .orElseThrow(() -> new UsernameNotFoundException("Không tìm thấy username với id " + userId));
//    return new CustomUserDetails(user);
//  }
//}
