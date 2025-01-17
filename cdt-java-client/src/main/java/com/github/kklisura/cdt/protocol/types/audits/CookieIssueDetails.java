package com.github.kklisura.cdt.protocol.types.audits;

import com.github.kklisura.cdt.protocol.support.annotations.Optional;
import java.util.List;

/**
 * This information is currently necessary, as the front-end has a difficult time finding a specific
 * cookie. With this, we can convey specific error information without the cookie.
 */
public class CookieIssueDetails {

  @Optional private AffectedCookie cookie;

  @Optional private String rawCookieLine;

  private List<CookieWarningReason> cookieWarningReasons;

  private List<CookieExclusionReason> cookieExclusionReasons;

  private CookieOperation operation;

  @Optional private String siteForCookies;

  @Optional private String cookieUrl;

  @Optional private AffectedRequest request;

  /**
   * If AffectedCookie is not set then rawCookieLine contains the raw Set-Cookie header string. This
   * hints at a problem where the cookie line is syntactically or semantically malformed in a way
   * that no valid cookie could be created.
   */
  public AffectedCookie getCookie() {
    return cookie;
  }

  /**
   * If AffectedCookie is not set then rawCookieLine contains the raw Set-Cookie header string. This
   * hints at a problem where the cookie line is syntactically or semantically malformed in a way
   * that no valid cookie could be created.
   */
  public void setCookie(AffectedCookie cookie) {
    this.cookie = cookie;
  }

  public String getRawCookieLine() {
    return rawCookieLine;
  }

  public void setRawCookieLine(String rawCookieLine) {
    this.rawCookieLine = rawCookieLine;
  }

  public List<CookieWarningReason> getCookieWarningReasons() {
    return cookieWarningReasons;
  }

  public void setCookieWarningReasons(List<CookieWarningReason> cookieWarningReasons) {
    this.cookieWarningReasons = cookieWarningReasons;
  }

  public List<CookieExclusionReason> getCookieExclusionReasons() {
    return cookieExclusionReasons;
  }

  public void setCookieExclusionReasons(List<CookieExclusionReason> cookieExclusionReasons) {
    this.cookieExclusionReasons = cookieExclusionReasons;
  }

  /**
   * Optionally identifies the site-for-cookies and the cookie url, which may be used by the
   * front-end as additional context.
   */
  public CookieOperation getOperation() {
    return operation;
  }

  /**
   * Optionally identifies the site-for-cookies and the cookie url, which may be used by the
   * front-end as additional context.
   */
  public void setOperation(CookieOperation operation) {
    this.operation = operation;
  }

  public String getSiteForCookies() {
    return siteForCookies;
  }

  public void setSiteForCookies(String siteForCookies) {
    this.siteForCookies = siteForCookies;
  }

  public String getCookieUrl() {
    return cookieUrl;
  }

  public void setCookieUrl(String cookieUrl) {
    this.cookieUrl = cookieUrl;
  }

  public AffectedRequest getRequest() {
    return request;
  }

  public void setRequest(AffectedRequest request) {
    this.request = request;
  }
}
