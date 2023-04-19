package com.quicky.contentcalendar.repository;

import com.quicky.contentcalendar.model.Content;
import com.quicky.contentcalendar.model.Status;
import com.quicky.contentcalendar.model.Type;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class ContentCollectionRepository {
    private final List<Content> contentList = new ArrayList<>();

    public ContentCollectionRepository() {
    }

    public List<Content> findAll(){
        return contentList;
    }
    public Optional<Content> findById(Integer id){
        return contentList.stream().filter(content1 -> content1.id().equals(id)).findFirst();
    }
    public void save(Content content){
        contentList.removeIf(content1 -> content1.id().equals(content.id()));
        contentList.add(content);
    }
    @PostConstruct
    private void init(){
        Content c = new Content(1,
                "My first Post",
                "description is my post",
                Status.IDEA,
                Type.ARTICLE,
                LocalDateTime.now(),
                null,
                "");
        contentList.add(c);
    }

    public boolean existsById(Integer id) {
        return contentList.stream().filter(content -> content.id().equals(id)).count() ==1;
    }

    public void deleteById(Integer id) {
        contentList.removeIf(content -> content.id().equals(id));
    }
}
