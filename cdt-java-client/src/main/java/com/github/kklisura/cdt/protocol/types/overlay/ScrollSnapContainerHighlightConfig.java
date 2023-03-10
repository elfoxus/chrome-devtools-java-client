package com.github.kklisura.cdt.protocol.types.overlay;

import com.github.kklisura.cdt.protocol.support.annotations.Optional;
import com.github.kklisura.cdt.protocol.types.dom.RGBA;

public class ScrollSnapContainerHighlightConfig {

  @Optional private LineStyle snapportBorder;

  @Optional private LineStyle snapAreaBorder;

  @Optional private RGBA scrollMarginColor;

  @Optional private RGBA scrollPaddingColor;

  /** The style of the snapport border (default: transparent) */
  public LineStyle getSnapportBorder() {
    return snapportBorder;
  }

  /** The style of the snapport border (default: transparent) */
  public void setSnapportBorder(LineStyle snapportBorder) {
    this.snapportBorder = snapportBorder;
  }

  /** The style of the snap area border (default: transparent) */
  public LineStyle getSnapAreaBorder() {
    return snapAreaBorder;
  }

  /** The style of the snap area border (default: transparent) */
  public void setSnapAreaBorder(LineStyle snapAreaBorder) {
    this.snapAreaBorder = snapAreaBorder;
  }

  /** The margin highlight fill color (default: transparent). */
  public RGBA getScrollMarginColor() {
    return scrollMarginColor;
  }

  /** The margin highlight fill color (default: transparent). */
  public void setScrollMarginColor(RGBA scrollMarginColor) {
    this.scrollMarginColor = scrollMarginColor;
  }

  /** The padding highlight fill color (default: transparent). */
  public RGBA getScrollPaddingColor() {
    return scrollPaddingColor;
  }

  /** The padding highlight fill color (default: transparent). */
  public void setScrollPaddingColor(RGBA scrollPaddingColor) {
    this.scrollPaddingColor = scrollPaddingColor;
  }
}
