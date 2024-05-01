package com.answer;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "${feign.client.question-service.name}", configuration = RetryConfig.class)
public interface QuestionServiceClient {
    @GetMapping("/question/getQuestion")
    String getQuestion();
}
