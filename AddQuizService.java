package com.bhu.learnspring;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

@Service
public class AddQuizService {
    String[] ans = {"Windows","mac","Linux","Chrome"};
    private List<Question> questions= Arrays.asList(

            new Question("odd man out", ans )
    );


    //private List<Question> addQuestions= new ArrayList<>();

    public List<Question> getQuestions(){
        return questions;
    }
    public boolean validateQ(Question question){
        if(question.getQues().isEmpty() || question.getAns().length==0){
            return true;
        }
        return false;

    }

    public void addQuestion(Question question){

        questions.add(question);
    }
}
