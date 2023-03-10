package com.github.kklisura.cdt.protocol.types.systeminfo;

/** Describes the width and height dimensions of an entity. */
public class Size {

  private Integer width;

  private Integer height;

  /** Width in pixels. */
  public Integer getWidth() {
    return width;
  }

  /** Width in pixels. */
  public void setWidth(Integer width) {
    this.width = width;
  }

  /** Height in pixels. */
  public Integer getHeight() {
    return height;
  }

  /** Height in pixels. */
  public void setHeight(Integer height) {
    this.height = height;
  }
}
