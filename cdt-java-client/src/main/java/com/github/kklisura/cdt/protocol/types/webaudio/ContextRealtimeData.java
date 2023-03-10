package com.github.kklisura.cdt.protocol.types.webaudio;

/** Fields in AudioContext that change in real-time. */
public class ContextRealtimeData {

  private Double currentTime;

  private Double renderCapacity;

  private Double callbackIntervalMean;

  private Double callbackIntervalVariance;

  /** The current context time in second in BaseAudioContext. */
  public Double getCurrentTime() {
    return currentTime;
  }

  /** The current context time in second in BaseAudioContext. */
  public void setCurrentTime(Double currentTime) {
    this.currentTime = currentTime;
  }

  /**
   * The time spent on rendering graph divided by render quantum duration, and multiplied by 100.
   * 100 means the audio renderer reached the full capacity and glitch may occur.
   */
  public Double getRenderCapacity() {
    return renderCapacity;
  }

  /**
   * The time spent on rendering graph divided by render quantum duration, and multiplied by 100.
   * 100 means the audio renderer reached the full capacity and glitch may occur.
   */
  public void setRenderCapacity(Double renderCapacity) {
    this.renderCapacity = renderCapacity;
  }

  /** A running mean of callback interval. */
  public Double getCallbackIntervalMean() {
    return callbackIntervalMean;
  }

  /** A running mean of callback interval. */
  public void setCallbackIntervalMean(Double callbackIntervalMean) {
    this.callbackIntervalMean = callbackIntervalMean;
  }

  /** A running variance of callback interval. */
  public Double getCallbackIntervalVariance() {
    return callbackIntervalVariance;
  }

  /** A running variance of callback interval. */
  public void setCallbackIntervalVariance(Double callbackIntervalVariance) {
    this.callbackIntervalVariance = callbackIntervalVariance;
  }
}
