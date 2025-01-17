package com.github.kklisura.cdt.protocol.types.log;

import com.github.kklisura.cdt.protocol.support.annotations.Optional;
import com.github.kklisura.cdt.protocol.types.runtime.RemoteObject;
import com.github.kklisura.cdt.protocol.types.runtime.StackTrace;
import java.util.List;

/** Log entry. */
public class LogEntry {

  private LogEntrySource source;

  private LogEntryLevel level;

  private String text;

  @Optional private LogEntryCategory category;

  private Double timestamp;

  @Optional private String url;

  @Optional private Integer lineNumber;

  @Optional private StackTrace stackTrace;

  @Optional private String networkRequestId;

  @Optional private String workerId;

  @Optional private List<RemoteObject> args;

  /** Log entry source. */
  public LogEntrySource getSource() {
    return source;
  }

  /** Log entry source. */
  public void setSource(LogEntrySource source) {
    this.source = source;
  }

  /** Log entry severity. */
  public LogEntryLevel getLevel() {
    return level;
  }

  /** Log entry severity. */
  public void setLevel(LogEntryLevel level) {
    this.level = level;
  }

  /** Logged text. */
  public String getText() {
    return text;
  }

  /** Logged text. */
  public void setText(String text) {
    this.text = text;
  }

  public LogEntryCategory getCategory() {
    return category;
  }

  public void setCategory(LogEntryCategory category) {
    this.category = category;
  }

  /** Timestamp when this entry was added. */
  public Double getTimestamp() {
    return timestamp;
  }

  /** Timestamp when this entry was added. */
  public void setTimestamp(Double timestamp) {
    this.timestamp = timestamp;
  }

  /** URL of the resource if known. */
  public String getUrl() {
    return url;
  }

  /** URL of the resource if known. */
  public void setUrl(String url) {
    this.url = url;
  }

  /** Line number in the resource. */
  public Integer getLineNumber() {
    return lineNumber;
  }

  /** Line number in the resource. */
  public void setLineNumber(Integer lineNumber) {
    this.lineNumber = lineNumber;
  }

  /** JavaScript stack trace. */
  public StackTrace getStackTrace() {
    return stackTrace;
  }

  /** JavaScript stack trace. */
  public void setStackTrace(StackTrace stackTrace) {
    this.stackTrace = stackTrace;
  }

  /** Identifier of the network request associated with this entry. */
  public String getNetworkRequestId() {
    return networkRequestId;
  }

  /** Identifier of the network request associated with this entry. */
  public void setNetworkRequestId(String networkRequestId) {
    this.networkRequestId = networkRequestId;
  }

  /** Identifier of the worker associated with this entry. */
  public String getWorkerId() {
    return workerId;
  }

  /** Identifier of the worker associated with this entry. */
  public void setWorkerId(String workerId) {
    this.workerId = workerId;
  }

  /** Call arguments. */
  public List<RemoteObject> getArgs() {
    return args;
  }

  /** Call arguments. */
  public void setArgs(List<RemoteObject> args) {
    this.args = args;
  }
}
