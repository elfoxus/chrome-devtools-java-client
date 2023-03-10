package com.github.kklisura.cdt.protocol.types.performancetimeline;

import com.github.kklisura.cdt.protocol.support.annotations.Optional;

/** See https://github.com/WICG/LargestContentfulPaint and largest_contentful_paint.idl */
public class LargestContentfulPaint {

  private Double renderTime;

  private Double loadTime;

  private Double size;

  @Optional private String elementId;

  @Optional private String url;

  @Optional private Integer nodeId;

  public Double getRenderTime() {
    return renderTime;
  }

  public void setRenderTime(Double renderTime) {
    this.renderTime = renderTime;
  }

  public Double getLoadTime() {
    return loadTime;
  }

  public void setLoadTime(Double loadTime) {
    this.loadTime = loadTime;
  }

  /** The number of pixels being painted. */
  public Double getSize() {
    return size;
  }

  /** The number of pixels being painted. */
  public void setSize(Double size) {
    this.size = size;
  }

  /** The id attribute of the element, if available. */
  public String getElementId() {
    return elementId;
  }

  /** The id attribute of the element, if available. */
  public void setElementId(String elementId) {
    this.elementId = elementId;
  }

  /** The URL of the image (may be trimmed). */
  public String getUrl() {
    return url;
  }

  /** The URL of the image (may be trimmed). */
  public void setUrl(String url) {
    this.url = url;
  }

  public Integer getNodeId() {
    return nodeId;
  }

  public void setNodeId(Integer nodeId) {
    this.nodeId = nodeId;
  }
}
