package com.github.kklisura.cdt.protocol.types.page;

import com.github.kklisura.cdt.protocol.support.annotations.Experimental;
import java.util.List;

/** The installability error */
@Experimental
public class InstallabilityError {

  private String errorId;

  private List<InstallabilityErrorArgument> errorArguments;

  /** The error id (e.g. 'manifest-missing-suitable-icon'). */
  public String getErrorId() {
    return errorId;
  }

  /** The error id (e.g. 'manifest-missing-suitable-icon'). */
  public void setErrorId(String errorId) {
    this.errorId = errorId;
  }

  /** The list of error arguments (e.g. {name:'minimum-icon-size-in-pixels', value:'64'}). */
  public List<InstallabilityErrorArgument> getErrorArguments() {
    return errorArguments;
  }

  /** The list of error arguments (e.g. {name:'minimum-icon-size-in-pixels', value:'64'}). */
  public void setErrorArguments(List<InstallabilityErrorArgument> errorArguments) {
    this.errorArguments = errorArguments;
  }
}
