package com.github.kklisura.cdt.protocol.types.network;

import com.github.kklisura.cdt.protocol.support.annotations.Experimental;
import com.github.kklisura.cdt.protocol.support.annotations.Optional;
import java.util.List;

/** A cookie which was not stored from a response with the corresponding reason. */
@Experimental
public class BlockedSetCookieWithReason {

  private List<SetCookieBlockedReason> blockedReasons;

  private String cookieLine;

  @Optional private Cookie cookie;

  /** The reason(s) this cookie was blocked. */
  public List<SetCookieBlockedReason> getBlockedReasons() {
    return blockedReasons;
  }

  /** The reason(s) this cookie was blocked. */
  public void setBlockedReasons(List<SetCookieBlockedReason> blockedReasons) {
    this.blockedReasons = blockedReasons;
  }

  /**
   * The string representing this individual cookie as it would appear in the header. This is not
   * the entire "cookie" or "set-cookie" header which could have multiple cookies.
   */
  public String getCookieLine() {
    return cookieLine;
  }

  /**
   * The string representing this individual cookie as it would appear in the header. This is not
   * the entire "cookie" or "set-cookie" header which could have multiple cookies.
   */
  public void setCookieLine(String cookieLine) {
    this.cookieLine = cookieLine;
  }

  /**
   * The cookie object which represents the cookie which was not stored. It is optional because
   * sometimes complete cookie information is not available, such as in the case of parsing errors.
   */
  public Cookie getCookie() {
    return cookie;
  }

  /**
   * The cookie object which represents the cookie which was not stored. It is optional because
   * sometimes complete cookie information is not available, such as in the case of parsing errors.
   */
  public void setCookie(Cookie cookie) {
    this.cookie = cookie;
  }
}
