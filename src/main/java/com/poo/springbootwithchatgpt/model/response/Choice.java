package com.poo.springbootwithchatgpt.model.response;

import java.io.Serializable;


import com.fasterxml.jackson.annotation.JsonProperty;

import com.poo.springbootwithchatgpt.model.Message;
import lombok.Data;

@Data
public class Choice implements Serializable {

    private Integer index;
    private Message message;
    private String finishReason;

}
