package com.poo.springbootwithchatgpt.controller;

import com.poo.springbootwithchatgpt.model.request.ChatRequest;
import com.poo.springbootwithchatgpt.model.response.ChatGPTResponse;
import com.poo.springbootwithchatgpt.service.OpenAIClientService;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;





import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1")
public class OpenAIClientController {

    private final OpenAIClientService openAIClientService;

    @PostMapping(value = "/chat", consumes = MediaType.APPLICATION_JSON_VALUE)
    public ChatGPTResponse chat(@RequestBody ChatRequest chatRequest) {
        return openAIClientService.chat(chatRequest);
    }

}
