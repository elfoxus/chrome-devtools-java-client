package com.github.kklisura.cdt.protocol.types.headlessexperimental;

import com.github.kklisura.cdt.protocol.support.annotations.Optional;

public class BeginFrame {

  private Boolean hasDamage;

  @Optional private String screenshotData;

  /**
   * Whether the BeginFrame resulted in damage and, thus, a new frame was committed to the display.
   * Reported for diagnostic uses, may be removed in the future.
   */
  public Boolean getHasDamage() {
    return hasDamage;
  }

  /**
   * Whether the BeginFrame resulted in damage and, thus, a new frame was committed to the display.
   * Reported for diagnostic uses, may be removed in the future.
   */
  public void setHasDamage(Boolean hasDamage) {
    this.hasDamage = hasDamage;
  }

  /**
   * Base64-encoded image data of the screenshot, if one was requested and successfully taken.
   * (Encoded as a base64 string when passed over JSON)
   */
  public String getScreenshotData() {
    return screenshotData;
  }

  /**
   * Base64-encoded image data of the screenshot, if one was requested and successfully taken.
   * (Encoded as a base64 string when passed over JSON)
   */
  public void setScreenshotData(String screenshotData) {
    this.screenshotData = screenshotData;
  }
}
