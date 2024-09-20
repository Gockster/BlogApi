package com.springboot.blog.service.impl;

import com.springboot.blog.payload.PostDto;
import org.springframework.stereotype.Service;


public interface PostService {

    PostDto createPost(PostDto postDto);
}
