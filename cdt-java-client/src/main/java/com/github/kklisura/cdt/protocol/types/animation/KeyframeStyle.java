package com.github.kklisura.cdt.protocol.types.animation;

/** Keyframe Style */
public class KeyframeStyle {

  private String offset;

  private String easing;

  /** Keyframe's time offset. */
  public String getOffset() {
    return offset;
  }

  /** Keyframe's time offset. */
  public void setOffset(String offset) {
    this.offset = offset;
  }

  /** `AnimationEffect`'s timing function. */
  public String getEasing() {
    return easing;
  }

  /** `AnimationEffect`'s timing function. */
  public void setEasing(String easing) {
    this.easing = easing;
  }
}
