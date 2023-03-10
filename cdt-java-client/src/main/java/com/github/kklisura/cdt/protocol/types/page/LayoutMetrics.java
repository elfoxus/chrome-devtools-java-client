package com.github.kklisura.cdt.protocol.types.page;

import com.github.kklisura.cdt.protocol.types.dom.Rect;

public class LayoutMetrics {

  @Deprecated private LayoutViewport layoutViewport;

  @Deprecated private VisualViewport visualViewport;

  @Deprecated private Rect contentSize;

  private LayoutViewport cssLayoutViewport;

  private VisualViewport cssVisualViewport;

  private Rect cssContentSize;

  /**
   * Deprecated metrics relating to the layout viewport. Is in device pixels. Use
   * `cssLayoutViewport` instead.
   */
  public LayoutViewport getLayoutViewport() {
    return layoutViewport;
  }

  /**
   * Deprecated metrics relating to the layout viewport. Is in device pixels. Use
   * `cssLayoutViewport` instead.
   */
  public void setLayoutViewport(LayoutViewport layoutViewport) {
    this.layoutViewport = layoutViewport;
  }

  /**
   * Deprecated metrics relating to the visual viewport. Is in device pixels. Use
   * `cssVisualViewport` instead.
   */
  public VisualViewport getVisualViewport() {
    return visualViewport;
  }

  /**
   * Deprecated metrics relating to the visual viewport. Is in device pixels. Use
   * `cssVisualViewport` instead.
   */
  public void setVisualViewport(VisualViewport visualViewport) {
    this.visualViewport = visualViewport;
  }

  /** Deprecated size of scrollable area. Is in DP. Use `cssContentSize` instead. */
  public Rect getContentSize() {
    return contentSize;
  }

  /** Deprecated size of scrollable area. Is in DP. Use `cssContentSize` instead. */
  public void setContentSize(Rect contentSize) {
    this.contentSize = contentSize;
  }

  /** Metrics relating to the layout viewport in CSS pixels. */
  public LayoutViewport getCssLayoutViewport() {
    return cssLayoutViewport;
  }

  /** Metrics relating to the layout viewport in CSS pixels. */
  public void setCssLayoutViewport(LayoutViewport cssLayoutViewport) {
    this.cssLayoutViewport = cssLayoutViewport;
  }

  /** Metrics relating to the visual viewport in CSS pixels. */
  public VisualViewport getCssVisualViewport() {
    return cssVisualViewport;
  }

  /** Metrics relating to the visual viewport in CSS pixels. */
  public void setCssVisualViewport(VisualViewport cssVisualViewport) {
    this.cssVisualViewport = cssVisualViewport;
  }

  /** Size of scrollable area in CSS pixels. */
  public Rect getCssContentSize() {
    return cssContentSize;
  }

  /** Size of scrollable area in CSS pixels. */
  public void setCssContentSize(Rect cssContentSize) {
    this.cssContentSize = cssContentSize;
  }
}
