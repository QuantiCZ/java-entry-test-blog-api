package cz.quanti.java.entry.test.blog.controller;

import cz.quanti.java.entry.test.blog.domain.BlogPost;
import cz.quanti.java.entry.test.blog.service.BlogPostService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author Tsimafei Raro
 */
@RestController
@RequestMapping("/posts")
@RequiredArgsConstructor
public class BlogPostController {

    private final BlogPostService blogPostService;

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<BlogPost> getAllPosts() {
        return blogPostService.getAllPosts();
    }
}
