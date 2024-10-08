package com.springboot.blog.service;

import com.springboot.blog.payload.PostDto;
import org.springframework.stereotype.Service;

import java.util.List;


public interface PostService {

    PostDto createPost(PostDto postDto);

    List<PostDto> getAllPosts();

    PostDto getPostById(long id);


    PostDto updatePost(PostDto postDto, long id);

    void deletePostById(long id);

    List<PostDto> getPostsByCategory(Long categoryId);
}
