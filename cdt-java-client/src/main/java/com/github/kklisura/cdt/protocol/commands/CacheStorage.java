package com.github.kklisura.cdt.protocol.commands;

import com.github.kklisura.cdt.protocol.support.annotations.Experimental;
import com.github.kklisura.cdt.protocol.support.annotations.Optional;
import com.github.kklisura.cdt.protocol.support.annotations.ParamName;
import com.github.kklisura.cdt.protocol.support.annotations.ReturnTypeParameter;
import com.github.kklisura.cdt.protocol.support.annotations.Returns;
import com.github.kklisura.cdt.protocol.types.cachestorage.Cache;
import com.github.kklisura.cdt.protocol.types.cachestorage.CachedResponse;
import com.github.kklisura.cdt.protocol.types.cachestorage.Header;
import com.github.kklisura.cdt.protocol.types.cachestorage.RequestEntries;
import java.util.List;

@Experimental
public interface CacheStorage {

  /**
   * Deletes a cache.
   *
   * @param cacheId Id of cache for deletion.
   */
  void deleteCache(@ParamName("cacheId") String cacheId);

  /**
   * Deletes a cache entry.
   *
   * @param cacheId Id of cache where the entry will be deleted.
   * @param request URL spec of the request.
   */
  void deleteEntry(@ParamName("cacheId") String cacheId, @ParamName("request") String request);

  /** Requests cache names. */
  @Returns("caches")
  @ReturnTypeParameter(Cache.class)
  List<Cache> requestCacheNames();

  /**
   * Requests cache names.
   *
   * @param securityOrigin At least and at most one of securityOrigin, storageKey must be specified.
   *     Security origin.
   * @param storageKey Storage key.
   */
  @Returns("caches")
  @ReturnTypeParameter(Cache.class)
  List<Cache> requestCacheNames(
      @Optional @ParamName("securityOrigin") String securityOrigin,
      @Optional @ParamName("storageKey") String storageKey);

  /**
   * Fetches cache entry.
   *
   * @param cacheId Id of cache that contains the entry.
   * @param requestURL URL spec of the request.
   * @param requestHeaders headers of the request.
   */
  @Returns("response")
  CachedResponse requestCachedResponse(
      @ParamName("cacheId") String cacheId,
      @ParamName("requestURL") String requestURL,
      @ParamName("requestHeaders") List<Header> requestHeaders);

  /**
   * Requests data from cache.
   *
   * @param cacheId ID of cache to get entries from.
   */
  RequestEntries requestEntries(@ParamName("cacheId") String cacheId);

  /**
   * Requests data from cache.
   *
   * @param cacheId ID of cache to get entries from.
   * @param skipCount Number of records to skip.
   * @param pageSize Number of records to fetch.
   * @param pathFilter If present, only return the entries containing this substring in the path
   */
  RequestEntries requestEntries(
      @ParamName("cacheId") String cacheId,
      @Optional @ParamName("skipCount") Integer skipCount,
      @Optional @ParamName("pageSize") Integer pageSize,
      @Optional @ParamName("pathFilter") String pathFilter);
}
