package cz.quanti.java.entry.test.blog.domain;

import lombok.Builder;
import lombok.Data;

import java.time.ZonedDateTime;

/**
 * @author Tsimafei Raro
 */
@Data
@Builder
public class BlogPost {
    private Long id;
    private String title;
    private String authorName;
    private String summary;
    private ZonedDateTime created;
    private ZonedDateTime updated;
}
