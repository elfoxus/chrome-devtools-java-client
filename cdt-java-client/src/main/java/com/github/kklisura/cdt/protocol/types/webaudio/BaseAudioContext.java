package com.github.kklisura.cdt.protocol.types.webaudio;

import com.github.kklisura.cdt.protocol.support.annotations.Optional;

/** Protocol object for BaseAudioContext */
public class BaseAudioContext {

  private String contextId;

  private ContextType contextType;

  private ContextState contextState;

  @Optional private ContextRealtimeData realtimeData;

  private Double callbackBufferSize;

  private Double maxOutputChannelCount;

  private Double sampleRate;

  public String getContextId() {
    return contextId;
  }

  public void setContextId(String contextId) {
    this.contextId = contextId;
  }

  public ContextType getContextType() {
    return contextType;
  }

  public void setContextType(ContextType contextType) {
    this.contextType = contextType;
  }

  public ContextState getContextState() {
    return contextState;
  }

  public void setContextState(ContextState contextState) {
    this.contextState = contextState;
  }

  public ContextRealtimeData getRealtimeData() {
    return realtimeData;
  }

  public void setRealtimeData(ContextRealtimeData realtimeData) {
    this.realtimeData = realtimeData;
  }

  /** Platform-dependent callback buffer size. */
  public Double getCallbackBufferSize() {
    return callbackBufferSize;
  }

  /** Platform-dependent callback buffer size. */
  public void setCallbackBufferSize(Double callbackBufferSize) {
    this.callbackBufferSize = callbackBufferSize;
  }

  /** Number of output channels supported by audio hardware in use. */
  public Double getMaxOutputChannelCount() {
    return maxOutputChannelCount;
  }

  /** Number of output channels supported by audio hardware in use. */
  public void setMaxOutputChannelCount(Double maxOutputChannelCount) {
    this.maxOutputChannelCount = maxOutputChannelCount;
  }

  /** Context sample rate. */
  public Double getSampleRate() {
    return sampleRate;
  }

  /** Context sample rate. */
  public void setSampleRate(Double sampleRate) {
    this.sampleRate = sampleRate;
  }
}
