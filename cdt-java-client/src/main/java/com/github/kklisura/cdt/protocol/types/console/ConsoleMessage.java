package com.github.kklisura.cdt.protocol.types.console;

import com.github.kklisura.cdt.protocol.support.annotations.Optional;

/** Console message. */
public class ConsoleMessage {

  private ConsoleMessageSource source;

  private ConsoleMessageLevel level;

  private String text;

  @Optional private String url;

  @Optional private Integer line;

  @Optional private Integer column;

  /** Message source. */
  public ConsoleMessageSource getSource() {
    return source;
  }

  /** Message source. */
  public void setSource(ConsoleMessageSource source) {
    this.source = source;
  }

  /** Message severity. */
  public ConsoleMessageLevel getLevel() {
    return level;
  }

  /** Message severity. */
  public void setLevel(ConsoleMessageLevel level) {
    this.level = level;
  }

  /** Message text. */
  public String getText() {
    return text;
  }

  /** Message text. */
  public void setText(String text) {
    this.text = text;
  }

  /** URL of the message origin. */
  public String getUrl() {
    return url;
  }

  /** URL of the message origin. */
  public void setUrl(String url) {
    this.url = url;
  }

  /** Line number in the resource that generated this message (1-based). */
  public Integer getLine() {
    return line;
  }

  /** Line number in the resource that generated this message (1-based). */
  public void setLine(Integer line) {
    this.line = line;
  }

  /** Column number in the resource that generated this message (1-based). */
  public Integer getColumn() {
    return column;
  }

  /** Column number in the resource that generated this message (1-based). */
  public void setColumn(Integer column) {
    this.column = column;
  }
}
