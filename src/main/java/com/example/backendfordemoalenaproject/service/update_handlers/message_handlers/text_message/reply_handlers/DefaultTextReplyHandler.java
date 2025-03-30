package com.example.backendfordemoalenaproject.service.update_handlers.message_handlers.text_message.reply_handlers;

import com.example.backendfordemoalenaproject.config.Commands;
import com.example.backendfordemoalenaproject.sender.MessageSender;
import com.example.backendfordemoalenaproject.util.MessageComposer;
import lombok.RequiredArgsConstructor;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Service;
import org.telegram.telegrambots.meta.api.objects.message.Message;

@Service
@RequiredArgsConstructor
public class DefaultTextReplyHandler implements TextReplyHandler {
    private final MessageSender sender;
    private final static String DEFAULT_MESSAGE = "I don't understand you \n" +
            "Please input command !";

    @Override
    public void handle(@NonNull Message message) {
        long chatId = message.getChatId();
        sender.send(MessageComposer.composeSendMessage(chatId, DEFAULT_MESSAGE));
    }

    @Override
    public String canHandle() {
        return Commands.DEFAULT.getValue();
    }
}
