package com.github.kklisura.cdt.protocol.types.systeminfo;

/**
 * Describes a supported video encoding profile with its associated maximum resolution and maximum
 * framerate.
 */
public class VideoEncodeAcceleratorCapability {

  private String profile;

  private Size maxResolution;

  private Integer maxFramerateNumerator;

  private Integer maxFramerateDenominator;

  /** Video codec profile that is supported, e.g H264 Main. */
  public String getProfile() {
    return profile;
  }

  /** Video codec profile that is supported, e.g H264 Main. */
  public void setProfile(String profile) {
    this.profile = profile;
  }

  /** Maximum video dimensions in pixels supported for this |profile|. */
  public Size getMaxResolution() {
    return maxResolution;
  }

  /** Maximum video dimensions in pixels supported for this |profile|. */
  public void setMaxResolution(Size maxResolution) {
    this.maxResolution = maxResolution;
  }

  /**
   * Maximum encoding framerate in frames per second supported for this |profile|, as fraction's
   * numerator and denominator, e.g. 24/1 fps, 24000/1001 fps, etc.
   */
  public Integer getMaxFramerateNumerator() {
    return maxFramerateNumerator;
  }

  /**
   * Maximum encoding framerate in frames per second supported for this |profile|, as fraction's
   * numerator and denominator, e.g. 24/1 fps, 24000/1001 fps, etc.
   */
  public void setMaxFramerateNumerator(Integer maxFramerateNumerator) {
    this.maxFramerateNumerator = maxFramerateNumerator;
  }

  public Integer getMaxFramerateDenominator() {
    return maxFramerateDenominator;
  }

  public void setMaxFramerateDenominator(Integer maxFramerateDenominator) {
    this.maxFramerateDenominator = maxFramerateDenominator;
  }
}
