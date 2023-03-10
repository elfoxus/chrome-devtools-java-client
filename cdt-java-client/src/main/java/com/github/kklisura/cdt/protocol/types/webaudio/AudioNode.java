package com.github.kklisura.cdt.protocol.types.webaudio;

/** Protocol object for AudioNode */
public class AudioNode {

  private String nodeId;

  private String contextId;

  private String nodeType;

  private Double numberOfInputs;

  private Double numberOfOutputs;

  private Double channelCount;

  private ChannelCountMode channelCountMode;

  private ChannelInterpretation channelInterpretation;

  public String getNodeId() {
    return nodeId;
  }

  public void setNodeId(String nodeId) {
    this.nodeId = nodeId;
  }

  public String getContextId() {
    return contextId;
  }

  public void setContextId(String contextId) {
    this.contextId = contextId;
  }

  public String getNodeType() {
    return nodeType;
  }

  public void setNodeType(String nodeType) {
    this.nodeType = nodeType;
  }

  public Double getNumberOfInputs() {
    return numberOfInputs;
  }

  public void setNumberOfInputs(Double numberOfInputs) {
    this.numberOfInputs = numberOfInputs;
  }

  public Double getNumberOfOutputs() {
    return numberOfOutputs;
  }

  public void setNumberOfOutputs(Double numberOfOutputs) {
    this.numberOfOutputs = numberOfOutputs;
  }

  public Double getChannelCount() {
    return channelCount;
  }

  public void setChannelCount(Double channelCount) {
    this.channelCount = channelCount;
  }

  public ChannelCountMode getChannelCountMode() {
    return channelCountMode;
  }

  public void setChannelCountMode(ChannelCountMode channelCountMode) {
    this.channelCountMode = channelCountMode;
  }

  public ChannelInterpretation getChannelInterpretation() {
    return channelInterpretation;
  }

  public void setChannelInterpretation(ChannelInterpretation channelInterpretation) {
    this.channelInterpretation = channelInterpretation;
  }
}
