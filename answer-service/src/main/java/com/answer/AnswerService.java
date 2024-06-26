package com.answer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AnswerService {
    @Autowired
    private QuestionServiceClient questionServiceClient;

    public String getQuestion() {
        return questionServiceClient.getQuestion();
    }
}
