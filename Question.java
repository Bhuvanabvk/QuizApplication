package com.bhu.learnspring;

import java.util.Arrays;
import java.util.List;

public class Question {
    private String ques;
    private String[] ans;


    public Question(String ques, String[] ans) {
        this.ques = ques;
        this.ans = ans;
    }



    public String[] getAns() {
        return ans;
    }

    public void setAns(String[] ans) {
        this.ans = ans;

    }

    public String getQues() {
        return ques;
    }

    public void setQues(String ques) {
        this.ques = ques;
    }
}
