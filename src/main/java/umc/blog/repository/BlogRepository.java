package umc.blog.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import umc.blog.domain.Article;

public interface BlogRepository extends JpaRepository<Article, Long> {
}
