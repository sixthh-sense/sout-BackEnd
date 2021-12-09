package com.seongend.sout.controller;

import com.seongend.sout.entity.Post;
import com.seongend.sout.service.PostService;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.skyscreamer.jsonassert.JSONAssert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.junit.jupiter.api.Assertions.*;
import static org.springframework.test.web.client.match.MockRestRequestMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(PostController.class)
class PostControllerTest {

    @Autowired
    MockMvc mvc;

    @MockBean
    PostService postService;

    @Test
    @DisplayName("포스트 작성 - 로그인 필요")
    void createPosts() throws Exception {
        //given

        //when

        // create request
        RequestBuilder request = MockMvcRequestBuilders
                .get("/newpost")
                .accept(MediaType.APPLICATION_JSON);

        // call from url
        MvcResult result = mvc
                .perform(request)
                .andExpect(status().isOk())
                .andReturn();

        String actualResponse = "{\"id\":1, \"userId\":1, \"content\": \"something\", \"url\": \"somewhere good\"}"


        //then : verify, assertEquals
        JSONAssert.assertEquals(result.getResponse().getContentAsString(), actualResponse, true);
    }

    @Test
    @DisplayName("포스트 수정 - 로그인 필요")
    void updatePosts() {
    }

    @Test
    @DisplayName("포스트 삭제 - 로그인 필요")
    void deletePosts() {
    }
}