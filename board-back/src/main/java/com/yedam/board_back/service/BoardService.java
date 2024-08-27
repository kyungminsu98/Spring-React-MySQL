package com.yedam.board_back.service;

import org.springframework.http.ResponseEntity;

import com.yedam.board_back.dto.request.board.PostBoardRequestDto;
import com.yedam.board_back.dto.response.board.GetBoardResponseDto;
import com.yedam.board_back.dto.response.board.GetFavoriteListResponseDto;
import com.yedam.board_back.dto.response.board.PostBoardResponseDto;
import com.yedam.board_back.dto.response.board.PutFavoriteResponseDto;

public interface BoardService {
    ResponseEntity<? super PostBoardResponseDto> postBoard(PostBoardRequestDto dto, String email);

    ResponseEntity<? super GetBoardResponseDto> getBoard(Integer boardNumber);

    ResponseEntity<? super PutFavoriteResponseDto> putFavorite(Integer boardNumber, String email);

    ResponseEntity<? super GetFavoriteListResponseDto> getFavoriteList(Integer boardNumber);
}
