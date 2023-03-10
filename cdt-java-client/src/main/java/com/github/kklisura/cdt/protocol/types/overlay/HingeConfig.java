package com.github.kklisura.cdt.protocol.types.overlay;

import com.github.kklisura.cdt.protocol.support.annotations.Optional;
import com.github.kklisura.cdt.protocol.types.dom.RGBA;
import com.github.kklisura.cdt.protocol.types.dom.Rect;

/** Configuration for dual screen hinge */
public class HingeConfig {

  private Rect rect;

  @Optional private RGBA contentColor;

  @Optional private RGBA outlineColor;

  /** A rectangle represent hinge */
  public Rect getRect() {
    return rect;
  }

  /** A rectangle represent hinge */
  public void setRect(Rect rect) {
    this.rect = rect;
  }

  /** The content box highlight fill color (default: a dark color). */
  public RGBA getContentColor() {
    return contentColor;
  }

  /** The content box highlight fill color (default: a dark color). */
  public void setContentColor(RGBA contentColor) {
    this.contentColor = contentColor;
  }

  /** The content box highlight outline color (default: transparent). */
  public RGBA getOutlineColor() {
    return outlineColor;
  }

  /** The content box highlight outline color (default: transparent). */
  public void setOutlineColor(RGBA outlineColor) {
    this.outlineColor = outlineColor;
  }
}
