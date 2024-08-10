package com.iviberberi.springaiintro.rag.controllers;

import com.iviberberi.springaiintro.rag.model.Answer;
import com.iviberberi.springaiintro.rag.model.Question;
import com.iviberberi.springaiintro.rag.services.OpenAIRAGService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
public class QuestionController {

    private final OpenAIRAGService openAIService;

    @PostMapping("/ask")
    public Answer askQuestion(@RequestBody Question question) {
        return openAIService.getAnswer(question);
    }

}
