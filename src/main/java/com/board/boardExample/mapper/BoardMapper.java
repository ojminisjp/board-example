package com.board.boardExample.mapper;

import com.board.boardExample.domain.Board;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BoardMapper {

    // 戻り値がintタイプのメソッド
    int boardCount();

    // 戻り値がListタイプのメソッド
    List<Board> getList();

    // パラメータがLongタイプ、戻り値がBoardタイプのメソッド
    Board getBoard(Long boardId);

    // パラメータがBoardタイプ、アップロードして終わるため、戻り値はないメソッド
    void uploadBoard(Board board);

    void updateBoard(Board board);

    void deleteBoard(Long boardId);

    void viewCount(Long boardId);
}
