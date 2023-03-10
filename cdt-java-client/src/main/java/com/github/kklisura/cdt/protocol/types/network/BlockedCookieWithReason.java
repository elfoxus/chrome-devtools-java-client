package com.github.kklisura.cdt.protocol.types.network;

import com.github.kklisura.cdt.protocol.support.annotations.Experimental;
import java.util.List;

/** A cookie with was not sent with a request with the corresponding reason. */
@Experimental
public class BlockedCookieWithReason {

  private List<CookieBlockedReason> blockedReasons;

  private Cookie cookie;

  /** The reason(s) the cookie was blocked. */
  public List<CookieBlockedReason> getBlockedReasons() {
    return blockedReasons;
  }

  /** The reason(s) the cookie was blocked. */
  public void setBlockedReasons(List<CookieBlockedReason> blockedReasons) {
    this.blockedReasons = blockedReasons;
  }

  /** The cookie object representing the cookie which was not sent. */
  public Cookie getCookie() {
    return cookie;
  }

  /** The cookie object representing the cookie which was not sent. */
  public void setCookie(Cookie cookie) {
    this.cookie = cookie;
  }
}
