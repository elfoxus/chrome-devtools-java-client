package com.github.kklisura.cdt.protocol.commands;

import com.github.kklisura.cdt.protocol.events.audits.IssueAdded;
import com.github.kklisura.cdt.protocol.support.annotations.EventName;
import com.github.kklisura.cdt.protocol.support.annotations.Experimental;
import com.github.kklisura.cdt.protocol.support.annotations.Optional;
import com.github.kklisura.cdt.protocol.support.annotations.ParamName;
import com.github.kklisura.cdt.protocol.support.types.EventHandler;
import com.github.kklisura.cdt.protocol.support.types.EventListener;
import com.github.kklisura.cdt.protocol.types.audits.EncodedResponse;
import com.github.kklisura.cdt.protocol.types.audits.GetEncodedResponseEncoding;

/** Audits domain allows investigation of page violations and possible improvements. */
@Experimental
public interface Audits {

  /**
   * Returns the response body and size if it were re-encoded with the specified settings. Only
   * applies to images.
   *
   * @param requestId Identifier of the network request to get content for.
   * @param encoding The encoding to use.
   */
  EncodedResponse getEncodedResponse(
      @ParamName("requestId") String requestId,
      @ParamName("encoding") GetEncodedResponseEncoding encoding);

  /**
   * Returns the response body and size if it were re-encoded with the specified settings. Only
   * applies to images.
   *
   * @param requestId Identifier of the network request to get content for.
   * @param encoding The encoding to use.
   * @param quality The quality of the encoding (0-1). (defaults to 1)
   * @param sizeOnly Whether to only return the size information (defaults to false).
   */
  EncodedResponse getEncodedResponse(
      @ParamName("requestId") String requestId,
      @ParamName("encoding") GetEncodedResponseEncoding encoding,
      @Optional @ParamName("quality") Double quality,
      @Optional @ParamName("sizeOnly") Boolean sizeOnly);

  /** Disables issues domain, prevents further issues from being reported to the client. */
  void disable();

  /**
   * Enables issues domain, sends the issues collected so far to the client by means of the
   * `issueAdded` event.
   */
  void enable();

  /**
   * Runs the contrast check for the target page. Found issues are reported using Audits.issueAdded
   * event.
   */
  void checkContrast();

  /**
   * Runs the contrast check for the target page. Found issues are reported using Audits.issueAdded
   * event.
   *
   * @param reportAAA Whether to report WCAG AAA level issues. Default is false.
   */
  void checkContrast(@Optional @ParamName("reportAAA") Boolean reportAAA);

  @EventName("issueAdded")
  EventListener onIssueAdded(EventHandler<IssueAdded> eventListener);
}
