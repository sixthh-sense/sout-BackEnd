package com.seongend.sout.entity;

import com.seongend.sout.dto.PostRequestDto;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PostTest {

    @Nested
    @DisplayName("회원 전용 게시글 생성 기능_객체 생성")
    class CreateUserPosts {
        private Long userId;
        private String content;
        private String url;

        @BeforeEach
        void setup() {
            userId = 100L;
            content = "Github에서 제공하는 코드 삽입 기능";
            url = "https://gist.github.com/";
        }
    }


    @Test
    @DisplayName("정상 케이스 #1")
    void createPosts_Normal() {
        //given
        Long userId = 100L;
        String content = "Github에서 제공하는 코드 삽입 기능";
        String url = "https://gist.github.com/";

        PostRequestDto requestDto = new PostRequestDto(
                content,
                url
        );

        //when
        Post post = new Post(requestDto, userId);

        //then
        assertNull(post.getId());
        assertEquals(userId, post.getUserId());
        assertEquals(content, post.getContent());
        assertEquals(url, post.getUrl());
    }

}