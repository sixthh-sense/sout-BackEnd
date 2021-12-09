package com.seongend.sout.entity;

import com.seongend.sout.dto.CommentRequestDto;
import com.seongend.sout.dto.PostRequestDto;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CommentTest {
    @Test
    @DisplayName("정상 케이스 #1")
    void createComments_Normal() {
        //given
        Post post;
        String content;
        Long userId;

        CommentRequestDto requestDto = new CommentRequestDto(
                content
        );

        //when
        Comment comment = new Comment(post, requestDto, userId);

        //then
        assertNull(comment.getId());
        assertEquals(post, comment.getPost());
        assertEquals(content, comment.getContent());
        assertEquals(userId, comment.getUserId());
    }

}