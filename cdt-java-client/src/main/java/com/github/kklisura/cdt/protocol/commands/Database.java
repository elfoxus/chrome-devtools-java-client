package com.github.kklisura.cdt.protocol.commands;

import com.github.kklisura.cdt.protocol.events.database.AddDatabase;
import com.github.kklisura.cdt.protocol.support.annotations.EventName;
import com.github.kklisura.cdt.protocol.support.annotations.Experimental;
import com.github.kklisura.cdt.protocol.support.annotations.ParamName;
import com.github.kklisura.cdt.protocol.support.annotations.ReturnTypeParameter;
import com.github.kklisura.cdt.protocol.support.annotations.Returns;
import com.github.kklisura.cdt.protocol.support.types.EventHandler;
import com.github.kklisura.cdt.protocol.support.types.EventListener;
import com.github.kklisura.cdt.protocol.types.database.ExecuteSQL;
import java.util.List;

@Experimental
public interface Database {

  /** Disables database tracking, prevents database events from being sent to the client. */
  void disable();

  /** Enables database tracking, database events will now be delivered to the client. */
  void enable();

  /**
   * @param databaseId
   * @param query
   */
  ExecuteSQL executeSQL(
      @ParamName("databaseId") String databaseId, @ParamName("query") String query);

  /** @param databaseId */
  @Returns("tableNames")
  @ReturnTypeParameter(String.class)
  List<String> getDatabaseTableNames(@ParamName("databaseId") String databaseId);

  @EventName("addDatabase")
  EventListener onAddDatabase(EventHandler<AddDatabase> eventListener);
}
