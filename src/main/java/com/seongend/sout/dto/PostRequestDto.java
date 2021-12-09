package com.seongend.sout.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor // test용으로 추가
@Getter
public class PostRequestDto {
    private String content;
    private String url;
}
