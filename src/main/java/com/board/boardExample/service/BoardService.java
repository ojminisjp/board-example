package com.board.boardExample.service;

import com.board.boardExample.domain.Board;
import com.board.boardExample.mapper.BoardMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service // サービス役割を意味
@RequiredArgsConstructor // Mapperのコンストラクタを使用できる
@Transactional(readOnly = true)
public class BoardService {

    private final BoardMapper boardMapper;

    public int boardCount() {
        return boardMapper.boardCount(); // 掲示板件数を返却
    }

    public List<Board> boardList() {
        return boardMapper.getList(); // 掲示板のリスト返却
    }

    public Board getBoard (Long boardId) {
        return boardMapper.getBoard(boardId); // 掲示板のリスト返却
    }

    @Transactional(rollbackFor = Exception.class) // @TransactionalはSpringで支援するトランザクション処理アノテーションで、問題発生時rollback実施
    public void uploadBoard(Board board) {
        boardMapper.uploadBoard(board); // 掲示板にアップロード
    }

    @Transactional(rollbackFor = Exception.class)
    public void updateBoard(Board board) {
        boardMapper.updateBoard(board);
    }

    @Transactional(rollbackFor = Exception.class)
    public void deleteBoard(Long boardId) {
        boardMapper.deleteBoard(boardId);
    }

    public void viewCount(Long boardId) {
        boardMapper.viewCount(boardId);
    }
}
