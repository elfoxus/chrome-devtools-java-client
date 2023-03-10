package com.github.kklisura.cdt.protocol.events.network;

import com.github.kklisura.cdt.protocol.support.annotations.Experimental;
import com.github.kklisura.cdt.protocol.types.network.ReportingApiReport;

/**
 * Is sent whenever a new report is added. And after 'enableReportingApi' for all existing reports.
 */
@Experimental
public class ReportingApiReportAdded {

  private ReportingApiReport report;

  public ReportingApiReport getReport() {
    return report;
  }

  public void setReport(ReportingApiReport report) {
    this.report = report;
  }
}
