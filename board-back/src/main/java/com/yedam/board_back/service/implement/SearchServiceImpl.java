package com.yedam.board_back.service.implement;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

import com.yedam.board_back.dto.response.ResponseDto;
import com.yedam.board_back.dto.response.search.GetPopularListResponseDto;
import com.yedam.board_back.repository.SearchLogRepository;
import com.yedam.board_back.repository.resultSet.GetPopularListResultSet;
import com.yedam.board_back.service.SearchService;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class SearchServiceImpl implements SearchService {
    
    private final SearchLogRepository searchLogRepository;

    @Override
    public ResponseEntity<? super GetPopularListResponseDto> getPopularList() { 

        List<GetPopularListResultSet> resultSets = new ArrayList<>();

        try {
            resultSets = searchLogRepository.getPopularList();
        } catch(Exception exception) {
            exception.printStackTrace();
            return ResponseDto.databaseError();
        }

        // 결과 데이터를 반환할 때 resultSets를 성공 응답에 포함
        return GetPopularListResponseDto.success(resultSets);
    }
    
}
