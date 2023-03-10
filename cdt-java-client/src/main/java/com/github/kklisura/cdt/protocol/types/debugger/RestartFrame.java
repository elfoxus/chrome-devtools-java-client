package com.github.kklisura.cdt.protocol.types.debugger;

import com.github.kklisura.cdt.protocol.support.annotations.Optional;
import com.github.kklisura.cdt.protocol.types.runtime.StackTrace;
import com.github.kklisura.cdt.protocol.types.runtime.StackTraceId;
import java.util.List;

public class RestartFrame {

  @Deprecated private List<CallFrame> callFrames;

  @Deprecated @Optional private StackTrace asyncStackTrace;

  @Deprecated @Optional private StackTraceId asyncStackTraceId;

  /** New stack trace. */
  public List<CallFrame> getCallFrames() {
    return callFrames;
  }

  /** New stack trace. */
  public void setCallFrames(List<CallFrame> callFrames) {
    this.callFrames = callFrames;
  }

  /** Async stack trace, if any. */
  public StackTrace getAsyncStackTrace() {
    return asyncStackTrace;
  }

  /** Async stack trace, if any. */
  public void setAsyncStackTrace(StackTrace asyncStackTrace) {
    this.asyncStackTrace = asyncStackTrace;
  }

  /** Async stack trace, if any. */
  public StackTraceId getAsyncStackTraceId() {
    return asyncStackTraceId;
  }

  /** Async stack trace, if any. */
  public void setAsyncStackTraceId(StackTraceId asyncStackTraceId) {
    this.asyncStackTraceId = asyncStackTraceId;
  }
}
