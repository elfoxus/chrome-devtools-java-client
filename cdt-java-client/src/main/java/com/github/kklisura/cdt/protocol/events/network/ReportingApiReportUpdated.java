package com.github.kklisura.cdt.protocol.events.network;

import com.github.kklisura.cdt.protocol.support.annotations.Experimental;
import com.github.kklisura.cdt.protocol.types.network.ReportingApiReport;

@Experimental
public class ReportingApiReportUpdated {

  private ReportingApiReport report;

  public ReportingApiReport getReport() {
    return report;
  }

  public void setReport(ReportingApiReport report) {
    this.report = report;
  }
}
