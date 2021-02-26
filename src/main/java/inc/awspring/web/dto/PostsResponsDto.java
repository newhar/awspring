package inc.awspring.web.dto;

import inc.awspring.domain.posts.Posts;
import lombok.Getter;

@Getter
public class PostsResponsDto {

    private Long id;
    private String title;
    private String content;
    private String author;

    public PostsResponsDto(Posts entity) {
        this.id = entity.getId();
        this.title = entity.getTitle();
        this.content = entity.getContent();
        this.author = entity.getAuthor();
    }
}
