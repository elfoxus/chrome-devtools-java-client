package com.github.kklisura.cdt.protocol.events.profiler;

import com.github.kklisura.cdt.protocol.support.annotations.Optional;
import com.github.kklisura.cdt.protocol.types.debugger.Location;
import com.github.kklisura.cdt.protocol.types.profiler.Profile;

public class ConsoleProfileFinished {

  private String id;

  private Location location;

  private Profile profile;

  @Optional private String title;

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  /** Location of console.profileEnd(). */
  public Location getLocation() {
    return location;
  }

  /** Location of console.profileEnd(). */
  public void setLocation(Location location) {
    this.location = location;
  }

  public Profile getProfile() {
    return profile;
  }

  public void setProfile(Profile profile) {
    this.profile = profile;
  }

  /** Profile title passed as an argument to console.profile(). */
  public String getTitle() {
    return title;
  }

  /** Profile title passed as an argument to console.profile(). */
  public void setTitle(String title) {
    this.title = title;
  }
}
