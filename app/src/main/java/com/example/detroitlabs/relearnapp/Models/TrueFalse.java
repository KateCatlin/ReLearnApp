package com.example.detroitlabs.relearnapp.Models;

/**
 * Created by DetroitLabs on 9/25/15.
 */
public class TrueFalse {
    private int question;
    private boolean trueQuestion;

    public TrueFalse (int iNt, boolean bOolean) {
        question = iNt;
        trueQuestion = bOolean;
    }

    public int getQuestion() {
        return question;
    }

    public void setQuestion(int question) {
        this.question = question;
    }

    public boolean isTrueQuestion() {
        return trueQuestion;
    }

    public void setTrueQuestion(boolean trueQuestion) {
        this.trueQuestion = trueQuestion;
    }
}
