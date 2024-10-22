package com.poo.springbootwithchatgpt.service;

import java.util.Collections;

import com.poo.springbootwithchatgpt.config.OpenAIClientConfig;


import com.poo.springbootwithchatgpt.interfaces.OpenAIClient;
import com.poo.springbootwithchatgpt.model.Message;
import com.poo.springbootwithchatgpt.model.request.ChatGPTRequest;
import com.poo.springbootwithchatgpt.model.request.ChatRequest;
import com.poo.springbootwithchatgpt.model.response.ChatGPTResponse;
import org.springframework.stereotype.Service;




import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class OpenAIClientService {

    private final OpenAIClient openAIClient;
    private final OpenAIClientConfig openAIClientConfig;

    private final static String ROLE_USER = "user";

    public ChatGPTResponse chat(ChatRequest chatRequest) {

        Message message = Message.builder().role(ROLE_USER).content(chatRequest.getQuestion()).build();

        ChatGPTRequest chatGPTRequest = ChatGPTRequest.builder().model(openAIClientConfig.getModel())
                .messages(Collections.singletonList(message)).build();

        return openAIClient.chat(chatGPTRequest);
    }

}
