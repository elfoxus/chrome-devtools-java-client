package com.github.kklisura.cdt.protocol.types.backgroundservice;

import java.util.List;

public class BackgroundServiceEvent {

  private Double timestamp;

  private String origin;

  private String serviceWorkerRegistrationId;

  private ServiceName service;

  private String eventName;

  private String instanceId;

  private List<EventMetadata> eventMetadata;

  private String storageKey;

  /** Timestamp of the event (in seconds). */
  public Double getTimestamp() {
    return timestamp;
  }

  /** Timestamp of the event (in seconds). */
  public void setTimestamp(Double timestamp) {
    this.timestamp = timestamp;
  }

  /** The origin this event belongs to. */
  public String getOrigin() {
    return origin;
  }

  /** The origin this event belongs to. */
  public void setOrigin(String origin) {
    this.origin = origin;
  }

  /** The Service Worker ID that initiated the event. */
  public String getServiceWorkerRegistrationId() {
    return serviceWorkerRegistrationId;
  }

  /** The Service Worker ID that initiated the event. */
  public void setServiceWorkerRegistrationId(String serviceWorkerRegistrationId) {
    this.serviceWorkerRegistrationId = serviceWorkerRegistrationId;
  }

  /** The Background Service this event belongs to. */
  public ServiceName getService() {
    return service;
  }

  /** The Background Service this event belongs to. */
  public void setService(ServiceName service) {
    this.service = service;
  }

  /** A description of the event. */
  public String getEventName() {
    return eventName;
  }

  /** A description of the event. */
  public void setEventName(String eventName) {
    this.eventName = eventName;
  }

  /** An identifier that groups related events together. */
  public String getInstanceId() {
    return instanceId;
  }

  /** An identifier that groups related events together. */
  public void setInstanceId(String instanceId) {
    this.instanceId = instanceId;
  }

  /** A list of event-specific information. */
  public List<EventMetadata> getEventMetadata() {
    return eventMetadata;
  }

  /** A list of event-specific information. */
  public void setEventMetadata(List<EventMetadata> eventMetadata) {
    this.eventMetadata = eventMetadata;
  }

  /** Storage key this event belongs to. */
  public String getStorageKey() {
    return storageKey;
  }

  /** Storage key this event belongs to. */
  public void setStorageKey(String storageKey) {
    this.storageKey = storageKey;
  }
}
