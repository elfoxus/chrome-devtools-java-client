package com.github.kklisura.cdt.protocol.types.page;

/** Viewport for capturing screenshot. */
public class Viewport {

  private Double x;

  private Double y;

  private Double width;

  private Double height;

  private Double scale;

  /** X offset in device independent pixels (dip). */
  public Double getX() {
    return x;
  }

  /** X offset in device independent pixels (dip). */
  public void setX(Double x) {
    this.x = x;
  }

  /** Y offset in device independent pixels (dip). */
  public Double getY() {
    return y;
  }

  /** Y offset in device independent pixels (dip). */
  public void setY(Double y) {
    this.y = y;
  }

  /** Rectangle width in device independent pixels (dip). */
  public Double getWidth() {
    return width;
  }

  /** Rectangle width in device independent pixels (dip). */
  public void setWidth(Double width) {
    this.width = width;
  }

  /** Rectangle height in device independent pixels (dip). */
  public Double getHeight() {
    return height;
  }

  /** Rectangle height in device independent pixels (dip). */
  public void setHeight(Double height) {
    this.height = height;
  }

  /** Page scale factor. */
  public Double getScale() {
    return scale;
  }

  /** Page scale factor. */
  public void setScale(Double scale) {
    this.scale = scale;
  }
}
