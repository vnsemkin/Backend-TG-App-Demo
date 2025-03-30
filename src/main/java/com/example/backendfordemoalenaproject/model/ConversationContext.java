package com.example.backendfordemoalenaproject.model;

import com.example.backendfordemoalenaproject.service.update_handlers.message_handlers.text_message.reply_handlers.TextReplyHandler;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ConversationContext<T> {
    private long userId;
    private TextReplyHandler handler;
    private T data;
}
