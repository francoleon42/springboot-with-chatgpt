package com.poo.springbootwithchatgpt.model.request;

import java.io.Serializable;

import lombok.Data;

@Data
public class ChatRequest implements Serializable {

    private String question;

}
