package com.board.boardExample;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication

@MapperScan(basePackages="com.board.boardexample")
public class BoardExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(BoardExampleApplication.class, args);
	}

}
