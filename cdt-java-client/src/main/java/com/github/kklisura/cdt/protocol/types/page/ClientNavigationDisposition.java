package com.github.kklisura.cdt.protocol.types.page;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum ClientNavigationDisposition {
  @JsonProperty("currentTab")
  CURRENT_TAB,
  @JsonProperty("newTab")
  NEW_TAB,
  @JsonProperty("newWindow")
  NEW_WINDOW,
  @JsonProperty("download")
  DOWNLOAD
}
