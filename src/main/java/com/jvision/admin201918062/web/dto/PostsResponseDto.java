package com.jvision.admin201918062.web.dto;

import com.jvision.admin201918062.domain.posts.Posts;
import lombok.Getter;

@Getter
public class PostsResponseDto {
    private String id;
    private String name;
    private String tel;
    private String address;
    private String intro;

    public PostsResponseDto(Posts entity)
    {
        this.id = entity.getId();
        this.name = entity.getName();
        this.tel = entity.getTel();
        this.address = entity.getAddress();
        this.intro = entity.getIntro();
    }

}
