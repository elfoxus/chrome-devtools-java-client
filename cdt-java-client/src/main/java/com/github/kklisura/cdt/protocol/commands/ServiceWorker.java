package com.github.kklisura.cdt.protocol.commands;

import com.github.kklisura.cdt.protocol.events.serviceworker.WorkerErrorReported;
import com.github.kklisura.cdt.protocol.events.serviceworker.WorkerRegistrationUpdated;
import com.github.kklisura.cdt.protocol.events.serviceworker.WorkerVersionUpdated;
import com.github.kklisura.cdt.protocol.support.annotations.EventName;
import com.github.kklisura.cdt.protocol.support.annotations.Experimental;
import com.github.kklisura.cdt.protocol.support.annotations.ParamName;
import com.github.kklisura.cdt.protocol.support.types.EventHandler;
import com.github.kklisura.cdt.protocol.support.types.EventListener;

@Experimental
public interface ServiceWorker {

  /**
   * @param origin
   * @param registrationId
   * @param data
   */
  void deliverPushMessage(
      @ParamName("origin") String origin,
      @ParamName("registrationId") String registrationId,
      @ParamName("data") String data);

  void disable();

  /**
   * @param origin
   * @param registrationId
   * @param tag
   * @param lastChance
   */
  void dispatchSyncEvent(
      @ParamName("origin") String origin,
      @ParamName("registrationId") String registrationId,
      @ParamName("tag") String tag,
      @ParamName("lastChance") Boolean lastChance);

  /**
   * @param origin
   * @param registrationId
   * @param tag
   */
  void dispatchPeriodicSyncEvent(
      @ParamName("origin") String origin,
      @ParamName("registrationId") String registrationId,
      @ParamName("tag") String tag);

  void enable();

  /** @param versionId */
  void inspectWorker(@ParamName("versionId") String versionId);

  /** @param forceUpdateOnPageLoad */
  void setForceUpdateOnPageLoad(@ParamName("forceUpdateOnPageLoad") Boolean forceUpdateOnPageLoad);

  /** @param scopeURL */
  void skipWaiting(@ParamName("scopeURL") String scopeURL);

  /** @param scopeURL */
  void startWorker(@ParamName("scopeURL") String scopeURL);

  void stopAllWorkers();

  /** @param versionId */
  void stopWorker(@ParamName("versionId") String versionId);

  /** @param scopeURL */
  void unregister(@ParamName("scopeURL") String scopeURL);

  /** @param scopeURL */
  void updateRegistration(@ParamName("scopeURL") String scopeURL);

  @EventName("workerErrorReported")
  EventListener onWorkerErrorReported(EventHandler<WorkerErrorReported> eventListener);

  @EventName("workerRegistrationUpdated")
  EventListener onWorkerRegistrationUpdated(EventHandler<WorkerRegistrationUpdated> eventListener);

  @EventName("workerVersionUpdated")
  EventListener onWorkerVersionUpdated(EventHandler<WorkerVersionUpdated> eventListener);
}
