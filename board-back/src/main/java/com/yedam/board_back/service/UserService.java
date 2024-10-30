package com.yedam.board_back.service;

import org.springframework.http.ResponseEntity;
import com.yedam.board_back.dto.response.user.GetSignInUserResponseDto;
import com.yedam.board_back.dto.response.user.GetUserResponseDto;

public interface UserService {
    
    ResponseEntity<? super GetUserResponseDto> getUser(String email);

    ResponseEntity<? super GetSignInUserResponseDto> getSignInUser(String email);
}
