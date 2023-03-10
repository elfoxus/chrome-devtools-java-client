package com.github.kklisura.cdt.protocol.types.layertree;

import com.github.kklisura.cdt.protocol.types.dom.Rect;

/** Rectangle where scrolling happens on the main thread. */
public class ScrollRect {

  private Rect rect;

  private ScrollRectType type;

  /** Rectangle itself. */
  public Rect getRect() {
    return rect;
  }

  /** Rectangle itself. */
  public void setRect(Rect rect) {
    this.rect = rect;
  }

  /** Reason for rectangle to force scrolling on the main thread */
  public ScrollRectType getType() {
    return type;
  }

  /** Reason for rectangle to force scrolling on the main thread */
  public void setType(ScrollRectType type) {
    this.type = type;
  }
}
