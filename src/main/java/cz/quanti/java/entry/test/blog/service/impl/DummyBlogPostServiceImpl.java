package cz.quanti.java.entry.test.blog.service.impl;

import com.github.javafaker.Faker;
import cz.quanti.java.entry.test.blog.domain.BlogPost;
import cz.quanti.java.entry.test.blog.service.BlogPostService;
import org.springframework.stereotype.Service;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Dummy implementation of the {@link BlogPostService} which returns a
 * pre-defined set of fake blog posts.
 *
 * @author Tsimafei Raro
 */
@Service
public class DummyBlogPostServiceImpl implements BlogPostService {

    private static final int POST_COUNT = 5;
    private List<BlogPost> posts = new ArrayList<>();

    private final int FAKER_SEED = 1111;
    private final Faker faker = new Faker(new Random(FAKER_SEED));

    public DummyBlogPostServiceImpl() {
        final var GMT = ZoneId.of("GMT");

        for (int i = 1; i <= POST_COUNT; i++) {
            var post = BlogPost.builder()
                    .id((long) i)
                    .title(faker.book().title())
                    .authorName(faker.princessBride().character())
                    .summary(faker.princessBride().quote() + " " + faker.princessBride().quote())
                    .created(ZonedDateTime.of(2020, i, 10, 12, 0, 0, 0, GMT))
                    .updated(ZonedDateTime.of(2021, i, 2, 14, 15, 35, 0, GMT))
                    .build();
            posts.add(post);
        }
    }

    @Override
    public List<BlogPost> getAllPosts() {
        return posts;
    }
}
