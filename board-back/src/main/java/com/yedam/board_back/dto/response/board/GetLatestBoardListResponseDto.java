package com.yedam.board_back.dto.response.board;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.yedam.board_back.common.ResponseCode;
import com.yedam.board_back.common.ResponseMessage;
import com.yedam.board_back.dto.object.BoardListItem;
import com.yedam.board_back.dto.response.ResponseDto;
import com.yedam.board_back.entity.BoardListViewEntity;

import lombok.Getter;

@Getter 
public class GetLatestBoardListResponseDto extends ResponseDto{

    private List<BoardListItem> latesList;

    private GetLatestBoardListResponseDto(List<BoardListViewEntity> boardEntities){
        super(ResponseCode.SUCCESS, ResponseMessage.SUCCESS);
        this.latesList = BoardListItem.getList(boardEntities);
    }

    public static ResponseEntity<GetLatestBoardListResponseDto> success(List<BoardListViewEntity> boardEntities){
        GetLatestBoardListResponseDto result = new GetLatestBoardListResponseDto(boardEntities);
        return ResponseEntity.status(HttpStatus.OK).body(result);
    }
}
