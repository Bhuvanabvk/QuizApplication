package com.bhu.learnspring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class QaController {
    @Autowired
    private AddQuizService addquizService;
    @RequestMapping(method = RequestMethod.POST,value = "/addQuiz",headers="Accept=application/json")
    private void addQuiz(@RequestBody Question question){
        addquizService.addQuestion(question);
    }
    @RequestMapping(method = RequestMethod.GET,value = "/readQuiz")
    @ResponseBody
    private List<Question> getQuiz(){
        return addquizService.getQuestions();
    }
}
