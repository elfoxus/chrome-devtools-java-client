package com.github.kklisura.cdt.protocol.events.tracing;

import com.github.kklisura.cdt.protocol.support.annotations.Optional;
import com.github.kklisura.cdt.protocol.types.tracing.StreamCompression;
import com.github.kklisura.cdt.protocol.types.tracing.StreamFormat;

/**
 * Signals that tracing is stopped and there is no trace buffers pending flush, all data were
 * delivered via dataCollected events.
 */
public class TracingComplete {

  private Boolean dataLossOccurred;

  @Optional private String stream;

  @Optional private StreamFormat traceFormat;

  @Optional private StreamCompression streamCompression;

  /**
   * Indicates whether some trace data is known to have been lost, e.g. because the trace ring
   * buffer wrapped around.
   */
  public Boolean getDataLossOccurred() {
    return dataLossOccurred;
  }

  /**
   * Indicates whether some trace data is known to have been lost, e.g. because the trace ring
   * buffer wrapped around.
   */
  public void setDataLossOccurred(Boolean dataLossOccurred) {
    this.dataLossOccurred = dataLossOccurred;
  }

  /** A handle of the stream that holds resulting trace data. */
  public String getStream() {
    return stream;
  }

  /** A handle of the stream that holds resulting trace data. */
  public void setStream(String stream) {
    this.stream = stream;
  }

  /** Trace data format of returned stream. */
  public StreamFormat getTraceFormat() {
    return traceFormat;
  }

  /** Trace data format of returned stream. */
  public void setTraceFormat(StreamFormat traceFormat) {
    this.traceFormat = traceFormat;
  }

  /** Compression format of returned stream. */
  public StreamCompression getStreamCompression() {
    return streamCompression;
  }

  /** Compression format of returned stream. */
  public void setStreamCompression(StreamCompression streamCompression) {
    this.streamCompression = streamCompression;
  }
}
