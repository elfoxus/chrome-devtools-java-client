package com.github.kklisura.cdt.protocol.types.profiler;

import java.util.List;

/** Coverage data for a JavaScript function. */
public class FunctionCoverage {

  private String functionName;

  private List<CoverageRange> ranges;

  private Boolean isBlockCoverage;

  /** JavaScript function name. */
  public String getFunctionName() {
    return functionName;
  }

  /** JavaScript function name. */
  public void setFunctionName(String functionName) {
    this.functionName = functionName;
  }

  /** Source ranges inside the function with coverage data. */
  public List<CoverageRange> getRanges() {
    return ranges;
  }

  /** Source ranges inside the function with coverage data. */
  public void setRanges(List<CoverageRange> ranges) {
    this.ranges = ranges;
  }

  /** Whether coverage data for this function has block granularity. */
  public Boolean getIsBlockCoverage() {
    return isBlockCoverage;
  }

  /** Whether coverage data for this function has block granularity. */
  public void setIsBlockCoverage(Boolean isBlockCoverage) {
    this.isBlockCoverage = isBlockCoverage;
  }
}
