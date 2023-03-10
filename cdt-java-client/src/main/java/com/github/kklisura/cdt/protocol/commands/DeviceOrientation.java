package com.github.kklisura.cdt.protocol.commands;

import com.github.kklisura.cdt.protocol.support.annotations.Experimental;
import com.github.kklisura.cdt.protocol.support.annotations.ParamName;

@Experimental
public interface DeviceOrientation {

  /** Clears the overridden Device Orientation. */
  void clearDeviceOrientationOverride();

  /**
   * Overrides the Device Orientation.
   *
   * @param alpha Mock alpha
   * @param beta Mock beta
   * @param gamma Mock gamma
   */
  void setDeviceOrientationOverride(
      @ParamName("alpha") Double alpha,
      @ParamName("beta") Double beta,
      @ParamName("gamma") Double gamma);
}
