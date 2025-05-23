package com.example.backendfordemoalenaproject.config;

import lombok.Getter;

@Getter
public enum Commands {
  START("/start"),
  MENU("/menu"),
  DEFAULT("");
  private final String value;

  Commands(String value) {
    this.value = value;
  }
}
