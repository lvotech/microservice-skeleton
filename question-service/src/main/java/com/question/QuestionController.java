package com.question;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/question")
public class QuestionController {
    @GetMapping("/getQuestion")
    public String getQuestion() {
        return "This is a question.";
    }
}
