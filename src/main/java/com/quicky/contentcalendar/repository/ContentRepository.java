package com.quicky.contentcalendar.repository;
import com.quicky.contentcalendar.model.Content;
import com.quicky.contentcalendar.model.Status;
import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.ListCrudRepository;
import org.springframework.data.repository.query.Param;

import javax.swing.plaf.synth.ColorType;
import java.util.List;

public interface ContentRepository extends ListCrudRepository<Content,Integer> {

    List<Content> findAllByTitleContains(String keyword);
    @Query("SELECT * from" +
            " Content where status = :status")
    List<Content> listByStatus(@Param("status") Status status);
}
