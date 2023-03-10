package com.github.kklisura.cdt.protocol.types.deviceaccess;

/** Device information displayed in a user prompt to select a device. */
public class PromptDevice {

  private String id;

  private String name;

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  /** Display name as it appears in a device request user prompt. */
  public String getName() {
    return name;
  }

  /** Display name as it appears in a device request user prompt. */
  public void setName(String name) {
    this.name = name;
  }
}
