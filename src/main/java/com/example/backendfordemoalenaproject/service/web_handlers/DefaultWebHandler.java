package com.example.backendfordemoalenaproject.service.web_handlers;

import com.example.backendfordemoalenaproject.sender.MessageSender;
import com.example.backendfordemoalenaproject.util.MessageComposer;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
@Slf4j
@Service
@RequiredArgsConstructor
public class DefaultWebHandler {
    private final MessageSender sender;

    public void  send(long chatId) {
        log.info("Get request data: method send: {}", chatId);
        MessageComposer.composeSendMessage(chatId, "Hello from frontend");
    }
}
