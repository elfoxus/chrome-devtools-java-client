package com.github.kklisura.cdt.protocol.types.browser;

import com.github.kklisura.cdt.protocol.support.annotations.Experimental;
import com.github.kklisura.cdt.protocol.support.annotations.Optional;

/**
 * Definition of PermissionDescriptor defined in the Permissions API:
 * https://w3c.github.io/permissions/#dictdef-permissiondescriptor.
 */
@Experimental
public class PermissionDescriptor {

  private String name;

  @Optional private Boolean sysex;

  @Optional private Boolean userVisibleOnly;

  @Optional private Boolean allowWithoutSanitization;

  @Optional private Boolean panTiltZoom;

  /**
   * Name of permission. See
   * https://cs.chromium.org/chromium/src/third_party/blink/renderer/modules/permissions/permission_descriptor.idl
   * for valid permission names.
   */
  public String getName() {
    return name;
  }

  /**
   * Name of permission. See
   * https://cs.chromium.org/chromium/src/third_party/blink/renderer/modules/permissions/permission_descriptor.idl
   * for valid permission names.
   */
  public void setName(String name) {
    this.name = name;
  }

  /** For "midi" permission, may also specify sysex control. */
  public Boolean getSysex() {
    return sysex;
  }

  /** For "midi" permission, may also specify sysex control. */
  public void setSysex(Boolean sysex) {
    this.sysex = sysex;
  }

  /**
   * For "push" permission, may specify userVisibleOnly. Note that userVisibleOnly = true is the
   * only currently supported type.
   */
  public Boolean getUserVisibleOnly() {
    return userVisibleOnly;
  }

  /**
   * For "push" permission, may specify userVisibleOnly. Note that userVisibleOnly = true is the
   * only currently supported type.
   */
  public void setUserVisibleOnly(Boolean userVisibleOnly) {
    this.userVisibleOnly = userVisibleOnly;
  }

  /** For "clipboard" permission, may specify allowWithoutSanitization. */
  public Boolean getAllowWithoutSanitization() {
    return allowWithoutSanitization;
  }

  /** For "clipboard" permission, may specify allowWithoutSanitization. */
  public void setAllowWithoutSanitization(Boolean allowWithoutSanitization) {
    this.allowWithoutSanitization = allowWithoutSanitization;
  }

  /** For "camera" permission, may specify panTiltZoom. */
  public Boolean getPanTiltZoom() {
    return panTiltZoom;
  }

  /** For "camera" permission, may specify panTiltZoom. */
  public void setPanTiltZoom(Boolean panTiltZoom) {
    this.panTiltZoom = panTiltZoom;
  }
}
