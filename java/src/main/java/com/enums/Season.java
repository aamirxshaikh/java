package com.enums;

public enum Season {
  WINTER("Cold"),
  SPRING("Moderate"),
  SUMMER("Hot"),
  FALL("Cool");

  private final String temperature;

  Season(String temperature) {
    this.temperature = temperature;
  }

  public String getTemperature() {
    return temperature;
  }
}
