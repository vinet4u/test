package com.jvision.admin201918062.web;

import com.jvision.admin201918062.service.PostsService;
import com.jvision.admin201918062.web.dto.PostsResponseDto;
import com.jvision.admin201918062.web.dto.PostsSaveRequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
public class PostsApiController {

    private final PostsService postsService;

    @PostMapping("/api/v1/posts")
    public String save(@RequestBody PostsSaveRequestDto requestDto)
    {
        return postsService.save(requestDto);
    }
    @GetMapping("/api/v1/posts/{id}")
    public PostsResponseDto findById(@PathVariable String id)
    {
        return postsService.findById(id);
    }

}
