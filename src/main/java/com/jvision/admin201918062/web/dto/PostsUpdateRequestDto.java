package com.jvision.admin201918062.web.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class    PostsUpdateRequestDto {
    private String id;
    private String name;
    private String tel;

    @Builder
    public PostsUpdateRequestDto(String id,String name, String tel)
    {
        this.id = id;
        this.name = name;
        this.tel = tel;
    }
}
