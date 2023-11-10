package umc.blog.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import umc.blog.domain.Article;
import umc.blog.dto.AddArticleRequest;
import umc.blog.repository.BlogRepository;

import java.util.List;

@RequiredArgsConstructor
@Service
public class BlogService {
    private final BlogRepository blogRepository;

    //블로그 그 추가 메서드 (데이터베이스에 Article 엔티티 저장)
    public Article save(AddArticleRequest request){
        return blogRepository.save(request.toEntity());
    }

    public List<Article> findAll(){
        return blogRepository.findAll();
    }

    public Article findById(Long id){
        return blogRepository.findById(id)
                .orElseThrow(()->new IllegalArgumentException("not found: "+ id));
    }

}
