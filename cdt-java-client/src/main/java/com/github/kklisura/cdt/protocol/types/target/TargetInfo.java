package com.github.kklisura.cdt.protocol.types.target;

import com.github.kklisura.cdt.protocol.support.annotations.Experimental;
import com.github.kklisura.cdt.protocol.support.annotations.Optional;

public class TargetInfo {

  private String targetId;

  private String type;

  private String title;

  private String url;

  private Boolean attached;

  @Optional private String openerId;

  @Experimental private Boolean canAccessOpener;

  @Experimental @Optional private String openerFrameId;

  @Experimental @Optional private String browserContextId;

  @Experimental @Optional private String subtype;

  public String getTargetId() {
    return targetId;
  }

  public void setTargetId(String targetId) {
    this.targetId = targetId;
  }

  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  /** Whether the target has an attached client. */
  public Boolean getAttached() {
    return attached;
  }

  /** Whether the target has an attached client. */
  public void setAttached(Boolean attached) {
    this.attached = attached;
  }

  /** Opener target Id */
  public String getOpenerId() {
    return openerId;
  }

  /** Opener target Id */
  public void setOpenerId(String openerId) {
    this.openerId = openerId;
  }

  /** Whether the target has access to the originating window. */
  public Boolean getCanAccessOpener() {
    return canAccessOpener;
  }

  /** Whether the target has access to the originating window. */
  public void setCanAccessOpener(Boolean canAccessOpener) {
    this.canAccessOpener = canAccessOpener;
  }

  /** Frame id of originating window (is only set if target has an opener). */
  public String getOpenerFrameId() {
    return openerFrameId;
  }

  /** Frame id of originating window (is only set if target has an opener). */
  public void setOpenerFrameId(String openerFrameId) {
    this.openerFrameId = openerFrameId;
  }

  public String getBrowserContextId() {
    return browserContextId;
  }

  public void setBrowserContextId(String browserContextId) {
    this.browserContextId = browserContextId;
  }

  /**
   * Provides additional details for specific target types. For example, for the type of "page",
   * this may be set to "portal" or "prerender".
   */
  public String getSubtype() {
    return subtype;
  }

  /**
   * Provides additional details for specific target types. For example, for the type of "page",
   * this may be set to "portal" or "prerender".
   */
  public void setSubtype(String subtype) {
    this.subtype = subtype;
  }
}
