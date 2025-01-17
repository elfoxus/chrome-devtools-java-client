package com.github.kklisura.cdt.protocol.types.profiler;

import com.github.kklisura.cdt.protocol.support.annotations.Optional;
import java.util.List;

/** Profile. */
public class Profile {

  private List<ProfileNode> nodes;

  private Double startTime;

  private Double endTime;

  @Optional private List<Integer> samples;

  @Optional private List<Integer> timeDeltas;

  /** The list of profile nodes. First item is the root node. */
  public List<ProfileNode> getNodes() {
    return nodes;
  }

  /** The list of profile nodes. First item is the root node. */
  public void setNodes(List<ProfileNode> nodes) {
    this.nodes = nodes;
  }

  /** Profiling start timestamp in microseconds. */
  public Double getStartTime() {
    return startTime;
  }

  /** Profiling start timestamp in microseconds. */
  public void setStartTime(Double startTime) {
    this.startTime = startTime;
  }

  /** Profiling end timestamp in microseconds. */
  public Double getEndTime() {
    return endTime;
  }

  /** Profiling end timestamp in microseconds. */
  public void setEndTime(Double endTime) {
    this.endTime = endTime;
  }

  /** Ids of samples top nodes. */
  public List<Integer> getSamples() {
    return samples;
  }

  /** Ids of samples top nodes. */
  public void setSamples(List<Integer> samples) {
    this.samples = samples;
  }

  /**
   * Time intervals between adjacent samples in microseconds. The first delta is relative to the
   * profile startTime.
   */
  public List<Integer> getTimeDeltas() {
    return timeDeltas;
  }

  /**
   * Time intervals between adjacent samples in microseconds. The first delta is relative to the
   * profile startTime.
   */
  public void setTimeDeltas(List<Integer> timeDeltas) {
    this.timeDeltas = timeDeltas;
  }
}
