package com.github.kklisura.cdt.protocol.types.media;

/** Corresponds to kMediaPropertyChange */
public class PlayerProperty {

  private String name;

  private String value;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }
}
