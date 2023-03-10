package com.github.kklisura.cdt.protocol.commands;

import com.github.kklisura.cdt.protocol.support.annotations.Experimental;
import com.github.kklisura.cdt.protocol.support.annotations.ParamName;
import com.github.kklisura.cdt.protocol.support.annotations.ReturnTypeParameter;
import com.github.kklisura.cdt.protocol.support.annotations.Returns;
import com.github.kklisura.cdt.protocol.types.systeminfo.Info;
import com.github.kklisura.cdt.protocol.types.systeminfo.ProcessInfo;
import java.util.List;

/** The SystemInfo domain defines methods and events for querying low-level system information. */
@Experimental
public interface SystemInfo {

  /** Returns information about the system. */
  Info getInfo();

  /**
   * Returns information about the feature state.
   *
   * @param featureState
   */
  @Returns("featureEnabled")
  Boolean getFeatureState(@ParamName("featureState") String featureState);

  /** Returns information about all running processes. */
  @Returns("processInfo")
  @ReturnTypeParameter(ProcessInfo.class)
  List<ProcessInfo> getProcessInfo();
}
