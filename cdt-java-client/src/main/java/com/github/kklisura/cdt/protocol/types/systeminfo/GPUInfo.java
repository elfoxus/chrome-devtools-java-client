package com.github.kklisura.cdt.protocol.types.systeminfo;

import com.github.kklisura.cdt.protocol.support.annotations.Optional;
import java.util.List;
import java.util.Map;

/** Provides information about the GPU(s) on the system. */
public class GPUInfo {

  private List<GPUDevice> devices;

  @Optional private Map<String, Object> auxAttributes;

  @Optional private Map<String, Object> featureStatus;

  private List<String> driverBugWorkarounds;

  private List<VideoDecodeAcceleratorCapability> videoDecoding;

  private List<VideoEncodeAcceleratorCapability> videoEncoding;

  private List<ImageDecodeAcceleratorCapability> imageDecoding;

  /** The graphics devices on the system. Element 0 is the primary GPU. */
  public List<GPUDevice> getDevices() {
    return devices;
  }

  /** The graphics devices on the system. Element 0 is the primary GPU. */
  public void setDevices(List<GPUDevice> devices) {
    this.devices = devices;
  }

  /** An optional dictionary of additional GPU related attributes. */
  public Map<String, Object> getAuxAttributes() {
    return auxAttributes;
  }

  /** An optional dictionary of additional GPU related attributes. */
  public void setAuxAttributes(Map<String, Object> auxAttributes) {
    this.auxAttributes = auxAttributes;
  }

  /** An optional dictionary of graphics features and their status. */
  public Map<String, Object> getFeatureStatus() {
    return featureStatus;
  }

  /** An optional dictionary of graphics features and their status. */
  public void setFeatureStatus(Map<String, Object> featureStatus) {
    this.featureStatus = featureStatus;
  }

  /** An optional array of GPU driver bug workarounds. */
  public List<String> getDriverBugWorkarounds() {
    return driverBugWorkarounds;
  }

  /** An optional array of GPU driver bug workarounds. */
  public void setDriverBugWorkarounds(List<String> driverBugWorkarounds) {
    this.driverBugWorkarounds = driverBugWorkarounds;
  }

  /** Supported accelerated video decoding capabilities. */
  public List<VideoDecodeAcceleratorCapability> getVideoDecoding() {
    return videoDecoding;
  }

  /** Supported accelerated video decoding capabilities. */
  public void setVideoDecoding(List<VideoDecodeAcceleratorCapability> videoDecoding) {
    this.videoDecoding = videoDecoding;
  }

  /** Supported accelerated video encoding capabilities. */
  public List<VideoEncodeAcceleratorCapability> getVideoEncoding() {
    return videoEncoding;
  }

  /** Supported accelerated video encoding capabilities. */
  public void setVideoEncoding(List<VideoEncodeAcceleratorCapability> videoEncoding) {
    this.videoEncoding = videoEncoding;
  }

  /** Supported accelerated image decoding capabilities. */
  public List<ImageDecodeAcceleratorCapability> getImageDecoding() {
    return imageDecoding;
  }

  /** Supported accelerated image decoding capabilities. */
  public void setImageDecoding(List<ImageDecodeAcceleratorCapability> imageDecoding) {
    this.imageDecoding = imageDecoding;
  }
}
