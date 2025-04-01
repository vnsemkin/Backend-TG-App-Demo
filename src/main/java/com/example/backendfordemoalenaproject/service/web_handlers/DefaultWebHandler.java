package com.example.backendfordemoalenaproject.service.web_handlers;

import com.example.backendfordemoalenaproject.sender.MessageSender;
import com.example.backendfordemoalenaproject.util.MessageComposer;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class DefaultWebHandler {
    private final MessageSender sender;

    public void  send(long chatId) {
        MessageComposer.composeSendMessage(chatId, "Hello from frontend");
    }
}
