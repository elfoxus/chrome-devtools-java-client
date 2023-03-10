package com.github.kklisura.cdt.protocol.types.media;

import java.util.List;
import java.util.Map;

/** Corresponds to kMediaError */
public class PlayerError {

  private String errorType;

  private Integer code;

  private List<PlayerErrorSourceLocation> stack;

  private List<PlayerError> cause;

  private Map<String, Object> data;

  public String getErrorType() {
    return errorType;
  }

  public void setErrorType(String errorType) {
    this.errorType = errorType;
  }

  /**
   * Code is the numeric enum entry for a specific set of error codes, such as PipelineStatusCodes
   * in media/base/pipeline_status.h
   */
  public Integer getCode() {
    return code;
  }

  /**
   * Code is the numeric enum entry for a specific set of error codes, such as PipelineStatusCodes
   * in media/base/pipeline_status.h
   */
  public void setCode(Integer code) {
    this.code = code;
  }

  /** A trace of where this error was caused / where it passed through. */
  public List<PlayerErrorSourceLocation> getStack() {
    return stack;
  }

  /** A trace of where this error was caused / where it passed through. */
  public void setStack(List<PlayerErrorSourceLocation> stack) {
    this.stack = stack;
  }

  /**
   * Errors potentially have a root cause error, ie, a DecoderError might be caused by an
   * WindowsError
   */
  public List<PlayerError> getCause() {
    return cause;
  }

  /**
   * Errors potentially have a root cause error, ie, a DecoderError might be caused by an
   * WindowsError
   */
  public void setCause(List<PlayerError> cause) {
    this.cause = cause;
  }

  /** Extra data attached to an error, such as an HRESULT, Video Codec, etc. */
  public Map<String, Object> getData() {
    return data;
  }

  /** Extra data attached to an error, such as an HRESULT, Video Codec, etc. */
  public void setData(Map<String, Object> data) {
    this.data = data;
  }
}
