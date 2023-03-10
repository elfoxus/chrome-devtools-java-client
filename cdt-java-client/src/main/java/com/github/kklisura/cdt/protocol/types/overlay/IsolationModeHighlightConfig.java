package com.github.kklisura.cdt.protocol.types.overlay;

import com.github.kklisura.cdt.protocol.support.annotations.Optional;
import com.github.kklisura.cdt.protocol.types.dom.RGBA;

public class IsolationModeHighlightConfig {

  @Optional private RGBA resizerColor;

  @Optional private RGBA resizerHandleColor;

  @Optional private RGBA maskColor;

  /** The fill color of the resizers (default: transparent). */
  public RGBA getResizerColor() {
    return resizerColor;
  }

  /** The fill color of the resizers (default: transparent). */
  public void setResizerColor(RGBA resizerColor) {
    this.resizerColor = resizerColor;
  }

  /** The fill color for resizer handles (default: transparent). */
  public RGBA getResizerHandleColor() {
    return resizerHandleColor;
  }

  /** The fill color for resizer handles (default: transparent). */
  public void setResizerHandleColor(RGBA resizerHandleColor) {
    this.resizerHandleColor = resizerHandleColor;
  }

  /** The fill color for the mask covering non-isolated elements (default: transparent). */
  public RGBA getMaskColor() {
    return maskColor;
  }

  /** The fill color for the mask covering non-isolated elements (default: transparent). */
  public void setMaskColor(RGBA maskColor) {
    this.maskColor = maskColor;
  }
}
