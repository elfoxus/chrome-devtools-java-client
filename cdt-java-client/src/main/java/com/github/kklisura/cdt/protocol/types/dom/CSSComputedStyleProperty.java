package com.github.kklisura.cdt.protocol.types.dom;

public class CSSComputedStyleProperty {

  private String name;

  private String value;

  /** Computed style property name. */
  public String getName() {
    return name;
  }

  /** Computed style property name. */
  public void setName(String name) {
    this.name = name;
  }

  /** Computed style property value. */
  public String getValue() {
    return value;
  }

  /** Computed style property value. */
  public void setValue(String value) {
    this.value = value;
  }
}
