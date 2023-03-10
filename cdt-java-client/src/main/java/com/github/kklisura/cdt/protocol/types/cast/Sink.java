package com.github.kklisura.cdt.protocol.types.cast;

import com.github.kklisura.cdt.protocol.support.annotations.Optional;

public class Sink {

  private String name;

  private String id;

  @Optional private String session;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  /**
   * Text describing the current session. Present only if there is an active session on the sink.
   */
  public String getSession() {
    return session;
  }

  /**
   * Text describing the current session. Present only if there is an active session on the sink.
   */
  public void setSession(String session) {
    this.session = session;
  }
}
