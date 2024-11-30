package softuni.exam.service;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import softuni.exam.models.entity.Attraction;

import java.io.IOException;


public interface AttractionService {

    boolean areImported();

    String readAttractionsFileContent() throws IOException;

    String importAttractions() throws IOException;

    String exportAttractions();

}
