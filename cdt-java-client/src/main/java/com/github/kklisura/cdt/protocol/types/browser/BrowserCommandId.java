package com.github.kklisura.cdt.protocol.types.browser;

import com.fasterxml.jackson.annotation.JsonProperty;

/** Browser command ids used by executeBrowserCommand. */
public enum BrowserCommandId {
  @JsonProperty("openTabSearch")
  OPEN_TAB_SEARCH,
  @JsonProperty("closeTabSearch")
  CLOSE_TAB_SEARCH
}
