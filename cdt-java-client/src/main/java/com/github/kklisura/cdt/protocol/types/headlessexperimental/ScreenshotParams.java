package com.github.kklisura.cdt.protocol.types.headlessexperimental;

import com.github.kklisura.cdt.protocol.support.annotations.Optional;

/** Encoding options for a screenshot. */
public class ScreenshotParams {

  @Optional private ScreenshotParamsFormat format;

  @Optional private Integer quality;

  @Optional private Boolean optimizeForSpeed;

  /** Image compression format (defaults to png). */
  public ScreenshotParamsFormat getFormat() {
    return format;
  }

  /** Image compression format (defaults to png). */
  public void setFormat(ScreenshotParamsFormat format) {
    this.format = format;
  }

  /** Compression quality from range [0..100] (jpeg only). */
  public Integer getQuality() {
    return quality;
  }

  /** Compression quality from range [0..100] (jpeg only). */
  public void setQuality(Integer quality) {
    this.quality = quality;
  }

  /** Optimize image encoding for speed, not for resulting size (defaults to false) */
  public Boolean getOptimizeForSpeed() {
    return optimizeForSpeed;
  }

  /** Optimize image encoding for speed, not for resulting size (defaults to false) */
  public void setOptimizeForSpeed(Boolean optimizeForSpeed) {
    this.optimizeForSpeed = optimizeForSpeed;
  }
}
