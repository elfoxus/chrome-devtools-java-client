package com.github.kklisura.cdt.protocol.types.debugger;

import com.github.kklisura.cdt.protocol.support.annotations.Experimental;
import com.github.kklisura.cdt.protocol.support.annotations.Optional;
import com.github.kklisura.cdt.protocol.types.runtime.ExceptionDetails;
import com.github.kklisura.cdt.protocol.types.runtime.StackTrace;
import com.github.kklisura.cdt.protocol.types.runtime.StackTraceId;
import java.util.List;

public class SetScriptSource {

  @Deprecated @Optional private List<CallFrame> callFrames;

  @Deprecated @Optional private Boolean stackChanged;

  @Deprecated @Optional private StackTrace asyncStackTrace;

  @Deprecated @Optional private StackTraceId asyncStackTraceId;

  @Experimental private SetScriptSourceStatus status;

  @Optional private ExceptionDetails exceptionDetails;

  /** New stack trace in case editing has happened while VM was stopped. */
  public List<CallFrame> getCallFrames() {
    return callFrames;
  }

  /** New stack trace in case editing has happened while VM was stopped. */
  public void setCallFrames(List<CallFrame> callFrames) {
    this.callFrames = callFrames;
  }

  /** Whether current call stack was modified after applying the changes. */
  public Boolean getStackChanged() {
    return stackChanged;
  }

  /** Whether current call stack was modified after applying the changes. */
  public void setStackChanged(Boolean stackChanged) {
    this.stackChanged = stackChanged;
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

  /**
   * Whether the operation was successful or not. Only `Ok` denotes a successful live edit while the
   * other enum variants denote why the live edit failed.
   */
  public SetScriptSourceStatus getStatus() {
    return status;
  }

  /**
   * Whether the operation was successful or not. Only `Ok` denotes a successful live edit while the
   * other enum variants denote why the live edit failed.
   */
  public void setStatus(SetScriptSourceStatus status) {
    this.status = status;
  }

  /** Exception details if any. Only present when `status` is `CompileError`. */
  public ExceptionDetails getExceptionDetails() {
    return exceptionDetails;
  }

  /** Exception details if any. Only present when `status` is `CompileError`. */
  public void setExceptionDetails(ExceptionDetails exceptionDetails) {
    this.exceptionDetails = exceptionDetails;
  }
}
