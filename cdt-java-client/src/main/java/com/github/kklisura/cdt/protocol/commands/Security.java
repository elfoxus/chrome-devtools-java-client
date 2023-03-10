package com.github.kklisura.cdt.protocol.commands;

import com.github.kklisura.cdt.protocol.events.security.CertificateError;
import com.github.kklisura.cdt.protocol.events.security.SecurityStateChanged;
import com.github.kklisura.cdt.protocol.events.security.VisibleSecurityStateChanged;
import com.github.kklisura.cdt.protocol.support.annotations.EventName;
import com.github.kklisura.cdt.protocol.support.annotations.Experimental;
import com.github.kklisura.cdt.protocol.support.annotations.ParamName;
import com.github.kklisura.cdt.protocol.support.types.EventHandler;
import com.github.kklisura.cdt.protocol.support.types.EventListener;
import com.github.kklisura.cdt.protocol.types.security.CertificateErrorAction;

/** Security */
public interface Security {

  /** Disables tracking security state changes. */
  void disable();

  /** Enables tracking security state changes. */
  void enable();

  /**
   * Enable/disable whether all certificate errors should be ignored.
   *
   * @param ignore If true, all certificate errors will be ignored.
   */
  @Experimental
  void setIgnoreCertificateErrors(@ParamName("ignore") Boolean ignore);

  /**
   * Handles a certificate error that fired a certificateError event.
   *
   * @param eventId The ID of the event.
   * @param action The action to take on the certificate error.
   */
  @Deprecated
  void handleCertificateError(
      @ParamName("eventId") Integer eventId, @ParamName("action") CertificateErrorAction action);

  /**
   * Enable/disable overriding certificate errors. If enabled, all certificate error events need to
   * be handled by the DevTools client and should be answered with `handleCertificateError`
   * commands.
   *
   * @param override If true, certificate errors will be overridden.
   */
  @Deprecated
  void setOverrideCertificateErrors(@ParamName("override") Boolean override);

  /**
   * There is a certificate error. If overriding certificate errors is enabled, then it should be
   * handled with the `handleCertificateError` command. Note: this event does not fire if the
   * certificate error has been allowed internally. Only one client per target should override
   * certificate errors at the same time.
   */
  @EventName("certificateError")
  @Deprecated
  EventListener onCertificateError(EventHandler<CertificateError> eventListener);

  /** The security state of the page changed. */
  @EventName("visibleSecurityStateChanged")
  @Experimental
  EventListener onVisibleSecurityStateChanged(
      EventHandler<VisibleSecurityStateChanged> eventListener);

  /** The security state of the page changed. No longer being sent. */
  @EventName("securityStateChanged")
  @Deprecated
  EventListener onSecurityStateChanged(EventHandler<SecurityStateChanged> eventListener);
}
