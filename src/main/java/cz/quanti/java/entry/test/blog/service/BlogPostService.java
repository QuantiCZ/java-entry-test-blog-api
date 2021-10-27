package cz.quanti.java.entry.test.blog.service;

import cz.quanti.java.entry.test.blog.domain.BlogPost;

import java.util.List;

/**
 * @author Tsimafei Raro
 */
public interface BlogPostService {
    List<BlogPost> getAllPosts();
}
