package com.example.backendfordemoalenaproject.service.update_handlers.message_handlers.text_message.command_handlers;


import org.springframework.lang.NonNull;
import org.telegram.telegrambots.meta.api.objects.message.Message;

public interface CommandHandler {
    void handle(@NonNull Message message);
    String canHandle();
}