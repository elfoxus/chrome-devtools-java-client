package com.github.kklisura.cdt.protocol.types.network;

import com.github.kklisura.cdt.protocol.support.annotations.Experimental;

@Experimental
public class ConnectTiming {

  private Double requestTime;

  /**
   * Timing's requestTime is a baseline in seconds, while the other numbers are ticks in
   * milliseconds relatively to this requestTime. Matches ResourceTiming's requestTime for the same
   * request (but not for redirected requests).
   */
  public Double getRequestTime() {
    return requestTime;
  }

  /**
   * Timing's requestTime is a baseline in seconds, while the other numbers are ticks in
   * milliseconds relatively to this requestTime. Matches ResourceTiming's requestTime for the same
   * request (but not for redirected requests).
   */
  public void setRequestTime(Double requestTime) {
    this.requestTime = requestTime;
  }
}
