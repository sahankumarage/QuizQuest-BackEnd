package com.traveller.spirtual.Service.QuistionPapersService;

import com.traveller.spirtual.Repository.QuistionPapersRepo.QuizSheetRepository;
import com.traveller.spirtual.dao.QuistionPapersDao.QuizSheetsEntity;
import com.traveller.spirtual.dto.QuistionPapersDto.QuizSheets;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Slf4j
public class QuizSheetService {

    @Autowired
    QuizSheetRepository quizRepository;

    public List<QuizSheetsEntity> retrieveAllQuizSheets() {
        // Use the findAll() method provided by JpaRepository
        return (List< QuizSheetsEntity>) quizRepository.findAll();
    }

    public void enterQuizSheet(QuizSheets quizSheets) {
        QuizSheetsEntity quizSheetEntity = QuizSheetsEntity.builder()
                .sheetsSubject(quizSheets.getSheetsSubject())
                .sheetLevel(quizSheets.getSheetLevel())
                .postedBy(quizSheets.getPostedBy())
                .build();

        quizRepository.save(quizSheetEntity);
    }

    public void deleteQuizById(Long id){quizRepository.deleteById(id);}

    public void updateSheetById(Long id, QuizSheets updateQuizSheets){
        Optional<QuizSheetsEntity> optionalSheets = quizRepository.findById(id);

        if (optionalSheets.isPresent()) {
            QuizSheetsEntity sheets = optionalSheets.get();

            sheets.setSheetsSubject(updateQuizSheets.getSheetsSubject()!= null ? updateQuizSheets.getSheetsSubject() : sheets.getSheetsSubject());
            sheets.setSheetLevel(updateQuizSheets.getSheetLevel() != null ? updateQuizSheets.getSheetLevel()  : sheets.getSheetLevel() );
            sheets.setPostedBy(updateQuizSheets.getPostedBy() != null ? updateQuizSheets.getPostedBy()  : sheets.getPostedBy() );
            sheets.setSheetLevel(updateQuizSheets.getSheetLevel() != null ? updateQuizSheets.getSheetLevel()  : sheets.getSheetLevel() );

            quizRepository.save(sheets);

        }

    }


}
