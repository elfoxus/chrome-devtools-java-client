package com.github.kklisura.cdt.protocol.types.audits;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum CookieOperation {
  @JsonProperty("SetCookie")
  SET_COOKIE,
  @JsonProperty("ReadCookie")
  READ_COOKIE
}
