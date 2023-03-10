package com.github.kklisura.cdt.protocol.events.database;

import com.github.kklisura.cdt.protocol.types.database.Database;

public class AddDatabase {

  private Database database;

  public Database getDatabase() {
    return database;
  }

  public void setDatabase(Database database) {
    this.database = database;
  }
}
