package com.github.kklisura.cdt.protocol.types.emulation;

/** Screen orientation. */
public class ScreenOrientation {

  private ScreenOrientationType type;

  private Integer angle;

  /** Orientation type. */
  public ScreenOrientationType getType() {
    return type;
  }

  /** Orientation type. */
  public void setType(ScreenOrientationType type) {
    this.type = type;
  }

  /** Orientation angle. */
  public Integer getAngle() {
    return angle;
  }

  /** Orientation angle. */
  public void setAngle(Integer angle) {
    this.angle = angle;
  }
}
