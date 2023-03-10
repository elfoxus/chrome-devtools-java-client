package com.github.kklisura.cdt.protocol.types.systeminfo;

import java.util.List;

/**
 * Describes a supported image decoding profile with its associated minimum and maximum resolutions
 * and subsampling.
 */
public class ImageDecodeAcceleratorCapability {

  private ImageType imageType;

  private Size maxDimensions;

  private Size minDimensions;

  private List<SubsamplingFormat> subsamplings;

  /** Image coded, e.g. Jpeg. */
  public ImageType getImageType() {
    return imageType;
  }

  /** Image coded, e.g. Jpeg. */
  public void setImageType(ImageType imageType) {
    this.imageType = imageType;
  }

  /** Maximum supported dimensions of the image in pixels. */
  public Size getMaxDimensions() {
    return maxDimensions;
  }

  /** Maximum supported dimensions of the image in pixels. */
  public void setMaxDimensions(Size maxDimensions) {
    this.maxDimensions = maxDimensions;
  }

  /** Minimum supported dimensions of the image in pixels. */
  public Size getMinDimensions() {
    return minDimensions;
  }

  /** Minimum supported dimensions of the image in pixels. */
  public void setMinDimensions(Size minDimensions) {
    this.minDimensions = minDimensions;
  }

  /** Optional array of supported subsampling formats, e.g. 4:2:0, if known. */
  public List<SubsamplingFormat> getSubsamplings() {
    return subsamplings;
  }

  /** Optional array of supported subsampling formats, e.g. 4:2:0, if known. */
  public void setSubsamplings(List<SubsamplingFormat> subsamplings) {
    this.subsamplings = subsamplings;
  }
}
