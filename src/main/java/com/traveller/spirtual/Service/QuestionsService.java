package com.traveller.spirtual.Service;

import com.traveller.spirtual.Repository.QuestionsRepository;
import com.traveller.spirtual.dao.QuestionsEntity;
import com.traveller.spirtual.dao.StudentsEntity;
import com.traveller.spirtual.dto.Questions;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static org.springframework.data.jpa.domain.AbstractPersistable_.id;

@Service
@Slf4j
public class QuestionsService {

    @Autowired
    QuestionsRepository questionsRepository;

    public void enterQuestions(Questions question){
        QuestionsEntity quiz1 = new QuestionsEntity();
        quiz1.setDescQuiz(question.getDescQuiz());
        quiz1.setAnswer1(question.getAnswer1());
        quiz1.setAnswer2(question.getAnswer2());
        quiz1.setAnswer3(question.getAnswer3());
        quiz1.setAnswer4(question.getAnswer4());
        quiz1.setAnswer5(question.getAnswer5());
        quiz1.setCorrectAnswer(question.getCorrectAnswer());
        questionsRepository.save(quiz1);
        log.debug(quiz1.toString());

    }

    public List<Questions> retrieveQuiz() {
        ArrayList<Questions> list = new ArrayList();
        Questions question1 = new Questions();
        question1.setId(1001);
        question1.setDescQuiz("What is the most popular game in the world?");
        question1.setAnswer1("Cricket");
        question1.setAnswer2("Soccer");
        question1.setAnswer3("American Football");
        question1.setAnswer4("Chess");
        question1.setAnswer5("Volleyball");
        question1.setCorrectAnswer("Soccer");

        Questions question2 = new Questions();
        question2.setId(1002);
        question2.setDescQuiz("What is the biggest country in the world?");
        question2.setAnswer1("America");
        question2.setAnswer2("England");
        question2.setAnswer3("India");
        question2.setAnswer4("China");
        question2.setAnswer5("Canada");
        question2.setCorrectAnswer("China");

        list.add(question1);
        list.add(question2);

        return list;
    }

    public List<QuestionsEntity> retrieveAllQuestions() {
        // Use the findAll() method provided by JpaRepository
        return (List<QuestionsEntity>) questionsRepository.findAll();
    }

    public void deleteQuestionsById(Long id){
        questionsRepository.deleteById(id);
    }

    public void updateQuestions(Long id, QuestionsEntity updateQuestions) {
        Optional<QuestionsEntity> optionalQuestions = questionsRepository.findById(id);

        if(optionalQuestions.isPresent()){
            QuestionsEntity questions = optionalQuestions.get();
            questions.setDescQuiz(updateQuestions.getDescQuiz() != null ? updateQuestions.getDescQuiz():questions.getDescQuiz());
            questions.setAnswer1(updateQuestions.getAnswer1()!= null ? updateQuestions.getAnswer1():questions.getAnswer1());
            questions.setAnswer2(updateQuestions.getAnswer2()!= null ? updateQuestions.getAnswer2():questions.getAnswer2());
            questions.setAnswer3(updateQuestions.getAnswer3()!= null ? updateQuestions.getAnswer3():questions.getAnswer3());
            questions.setAnswer4(updateQuestions.getAnswer4()!= null ? updateQuestions.getAnswer4():questions.getAnswer4());
            questions.setAnswer5(updateQuestions.getAnswer5()!= null ? updateQuestions.getAnswer5():questions.getAnswer5());
            questions.setCorrectAnswer(updateQuestions.getCorrectAnswer()!= null ? updateQuestions.getCorrectAnswer():questions.getCorrectAnswer());

            questionsRepository.save(questions);

        }

    }

}
