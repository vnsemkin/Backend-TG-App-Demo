package com.example.backendfordemoalenaproject.config;

import com.example.backendfordemoalenaproject.service.update_handlers.message_handlers.text_message.command_handlers.CommandHandler;
import com.example.backendfordemoalenaproject.service.update_handlers.message_handlers.text_message.command_handlers.MenuCommandHandler;
import com.example.backendfordemoalenaproject.service.update_handlers.message_handlers.text_message.reply_handlers.TextReplyHandler;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.lang.NonNull;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Configuration
public class AppConfig {
    @Bean
    @Qualifier("commandHandlers")
    public Map<String, CommandHandler> commandHandlersMap(@NonNull List<CommandHandler> commandHandlers,
                                                          MenuCommandHandler menuCommandHandler) {
        Map<String, CommandHandler> collect = commandHandlers
                .stream().collect(Collectors.toMap(CommandHandler::canHandle,
                        commandHandler -> commandHandler));
        menuCommandHandler.setCommandHandlerMap(collect);
        return collect;
    }

    @Bean
    @Qualifier("replyHandlers")
    public Map<String, TextReplyHandler> replyHandlers(@NonNull List<TextReplyHandler> textReplyHandlers) {
        return textReplyHandlers.stream().collect(Collectors.toMap(TextReplyHandler::canHandle,
                textHandler -> textHandler));
    }
}
