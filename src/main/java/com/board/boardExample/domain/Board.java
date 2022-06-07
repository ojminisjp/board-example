package com.board.boardExample.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Board {
    // 掲示板番号
    private Long boardId;
    // タイトル
    private String title;
    // 内容
    private String content;
    // 作成者
    private String name;
    // 作成日
    private LocalDateTime createDate;
    // ビュー
    private int read;
    // メンバーID
    private Long memberId;
}

