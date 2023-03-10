package com.github.kklisura.cdt.protocol.types.media;

/**
 * Represents logged source line numbers reported in an error. NOTE: file and line are from chromium
 * c++ implementation code, not js.
 */
public class PlayerErrorSourceLocation {

  private String file;

  private Integer line;

  public String getFile() {
    return file;
  }

  public void setFile(String file) {
    this.file = file;
  }

  public Integer getLine() {
    return line;
  }

  public void setLine(Integer line) {
    this.line = line;
  }
}
