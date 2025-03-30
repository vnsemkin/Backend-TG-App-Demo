package com.example.backendfordemoalenaproject.service.update_handlers.message_handlers;

import com.example.backendfordemoalenaproject.sender.MessageSender;
import com.example.backendfordemoalenaproject.util.MessageComposer;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.telegram.telegrambots.meta.api.objects.message.Message;

@Service
@RequiredArgsConstructor
public class DefaultMessageHandler{
    private final MessageSender sender;
    private final static String DEFAULT_MESSAGE = "I don't understand you \n" +
            "Please input command !";

    public void handle(@NonNull Message message) {
        sender.send(MessageComposer.composeSendMessage(message.getChatId(), DEFAULT_MESSAGE));
    }
}
