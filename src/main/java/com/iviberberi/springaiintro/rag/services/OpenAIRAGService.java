package com.iviberberi.springaiintro.rag.services;

import com.iviberberi.springaiintro.rag.model.Answer;
import com.iviberberi.springaiintro.rag.model.Question;

public interface OpenAIRAGService {
    Answer getAnswer(Question question);
}
