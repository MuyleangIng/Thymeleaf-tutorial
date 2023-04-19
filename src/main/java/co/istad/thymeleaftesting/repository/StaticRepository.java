package co.istad.thymeleaftesting.repository;

import co.istad.thymeleaftesting.model.Article;
import com.github.javafaker.Faker;
import jakarta.annotation.PostConstruct;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
@Getter
public class StaticRepository {

    private Faker faker;
    @Autowired
    public
    private List<Article> article;

    @PostConstruct
    void init(){
        article = new ArrayList<>() {{
            add(new Article(UUID.randomUUID(),));
            add(new Article());
            add(new Article());
            add(new Article());
            add(new Article());


        }};
    }
}
