package com.github.kklisura.cdt.protocol.types.media;

/** Have one type per entry in MediaLogRecord::Type Corresponds to kMessage */
public class PlayerMessage {

  private PlayerMessageLevel level;

  private String message;

  /**
   * Keep in sync with MediaLogMessageLevel We are currently keeping the message level 'error'
   * separate from the PlayerError type because right now they represent different things, this one
   * being a DVLOG(ERROR) style log message that gets printed based on what log level is selected in
   * the UI, and the other is a representation of a media::PipelineStatus object. Soon however we're
   * going to be moving away from using PipelineStatus for errors and introducing a new error type
   * which should hopefully let us integrate the error log level into the PlayerError type.
   */
  public PlayerMessageLevel getLevel() {
    return level;
  }

  /**
   * Keep in sync with MediaLogMessageLevel We are currently keeping the message level 'error'
   * separate from the PlayerError type because right now they represent different things, this one
   * being a DVLOG(ERROR) style log message that gets printed based on what log level is selected in
   * the UI, and the other is a representation of a media::PipelineStatus object. Soon however we're
   * going to be moving away from using PipelineStatus for errors and introducing a new error type
   * which should hopefully let us integrate the error log level into the PlayerError type.
   */
  public void setLevel(PlayerMessageLevel level) {
    this.level = level;
  }

  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }
}
