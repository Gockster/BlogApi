package com.springboot.blog.payload;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Schema(
        description = "PostDto Model Information"
)
public class PostDto {

    private Long id;
    @Schema(
            description = "Blog post title"
    )
    private String title;
    @Schema(
            description = "Blog post description"
    )
    private String description;
    @Schema(
            description = "Blog post content"
    )
    private String content;
    @Schema(
            description = "Blog post category"
    )
    private Long categoryId;
}
