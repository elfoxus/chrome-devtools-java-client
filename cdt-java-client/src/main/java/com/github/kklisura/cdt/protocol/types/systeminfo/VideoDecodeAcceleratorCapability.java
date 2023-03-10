package com.github.kklisura.cdt.protocol.types.systeminfo;

/**
 * Describes a supported video decoding profile with its associated minimum and maximum resolutions.
 */
public class VideoDecodeAcceleratorCapability {

  private String profile;

  private Size maxResolution;

  private Size minResolution;

  /** Video codec profile that is supported, e.g. VP9 Profile 2. */
  public String getProfile() {
    return profile;
  }

  /** Video codec profile that is supported, e.g. VP9 Profile 2. */
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

  /** Minimum video dimensions in pixels supported for this |profile|. */
  public Size getMinResolution() {
    return minResolution;
  }

  /** Minimum video dimensions in pixels supported for this |profile|. */
  public void setMinResolution(Size minResolution) {
    this.minResolution = minResolution;
  }
}
