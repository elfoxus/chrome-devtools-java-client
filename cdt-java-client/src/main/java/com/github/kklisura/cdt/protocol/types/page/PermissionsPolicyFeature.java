package com.github.kklisura.cdt.protocol.types.page;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * All Permissions Policy features. This enum should match the one defined in
 * third_party/blink/renderer/core/permissions_policy/permissions_policy_features.json5.
 */
public enum PermissionsPolicyFeature {
  @JsonProperty("accelerometer")
  ACCELEROMETER,
  @JsonProperty("ambient-light-sensor")
  AMBIENT_LIGHT_SENSOR,
  @JsonProperty("attribution-reporting")
  ATTRIBUTION_REPORTING,
  @JsonProperty("autoplay")
  AUTOPLAY,
  @JsonProperty("bluetooth")
  BLUETOOTH,
  @JsonProperty("browsing-topics")
  BROWSING_TOPICS,
  @JsonProperty("camera")
  CAMERA,
  @JsonProperty("ch-dpr")
  CH_DPR,
  @JsonProperty("ch-device-memory")
  CH_DEVICE_MEMORY,
  @JsonProperty("ch-downlink")
  CH_DOWNLINK,
  @JsonProperty("ch-ect")
  CH_ECT,
  @JsonProperty("ch-prefers-color-scheme")
  CH_PREFERS_COLOR_SCHEME,
  @JsonProperty("ch-prefers-reduced-motion")
  CH_PREFERS_REDUCED_MOTION,
  @JsonProperty("ch-rtt")
  CH_RTT,
  @JsonProperty("ch-save-data")
  CH_SAVE_DATA,
  @JsonProperty("ch-ua")
  CH_UA,
  @JsonProperty("ch-ua-arch")
  CH_UA_ARCH,
  @JsonProperty("ch-ua-bitness")
  CH_UA_BITNESS,
  @JsonProperty("ch-ua-platform")
  CH_UA_PLATFORM,
  @JsonProperty("ch-ua-model")
  CH_UA_MODEL,
  @JsonProperty("ch-ua-mobile")
  CH_UA_MOBILE,
  @JsonProperty("ch-ua-full")
  CH_UA_FULL,
  @JsonProperty("ch-ua-full-version")
  CH_UA_FULL_VERSION,
  @JsonProperty("ch-ua-full-version-list")
  CH_UA_FULL_VERSION_LIST,
  @JsonProperty("ch-ua-platform-version")
  CH_UA_PLATFORM_VERSION,
  @JsonProperty("ch-ua-reduced")
  CH_UA_REDUCED,
  @JsonProperty("ch-ua-wow64")
  CH_UA_WOW_64,
  @JsonProperty("ch-viewport-height")
  CH_VIEWPORT_HEIGHT,
  @JsonProperty("ch-viewport-width")
  CH_VIEWPORT_WIDTH,
  @JsonProperty("ch-width")
  CH_WIDTH,
  @JsonProperty("clipboard-read")
  CLIPBOARD_READ,
  @JsonProperty("clipboard-write")
  CLIPBOARD_WRITE,
  @JsonProperty("compute-pressure")
  COMPUTE_PRESSURE,
  @JsonProperty("cross-origin-isolated")
  CROSS_ORIGIN_ISOLATED,
  @JsonProperty("direct-sockets")
  DIRECT_SOCKETS,
  @JsonProperty("display-capture")
  DISPLAY_CAPTURE,
  @JsonProperty("document-domain")
  DOCUMENT_DOMAIN,
  @JsonProperty("encrypted-media")
  ENCRYPTED_MEDIA,
  @JsonProperty("execution-while-out-of-viewport")
  EXECUTION_WHILE_OUT_OF_VIEWPORT,
  @JsonProperty("execution-while-not-rendered")
  EXECUTION_WHILE_NOT_RENDERED,
  @JsonProperty("focus-without-user-activation")
  FOCUS_WITHOUT_USER_ACTIVATION,
  @JsonProperty("fullscreen")
  FULLSCREEN,
  @JsonProperty("frobulate")
  FROBULATE,
  @JsonProperty("gamepad")
  GAMEPAD,
  @JsonProperty("geolocation")
  GEOLOCATION,
  @JsonProperty("gyroscope")
  GYROSCOPE,
  @JsonProperty("hid")
  HID,
  @JsonProperty("identity-credentials-get")
  IDENTITY_CREDENTIALS_GET,
  @JsonProperty("idle-detection")
  IDLE_DETECTION,
  @JsonProperty("interest-cohort")
  INTEREST_COHORT,
  @JsonProperty("join-ad-interest-group")
  JOIN_AD_INTEREST_GROUP,
  @JsonProperty("keyboard-map")
  KEYBOARD_MAP,
  @JsonProperty("local-fonts")
  LOCAL_FONTS,
  @JsonProperty("magnetometer")
  MAGNETOMETER,
  @JsonProperty("microphone")
  MICROPHONE,
  @JsonProperty("midi")
  MIDI,
  @JsonProperty("otp-credentials")
  OTP_CREDENTIALS,
  @JsonProperty("payment")
  PAYMENT,
  @JsonProperty("picture-in-picture")
  PICTURE_IN_PICTURE,
  @JsonProperty("private-aggregation")
  PRIVATE_AGGREGATION,
  @JsonProperty("publickey-credentials-get")
  PUBLICKEY_CREDENTIALS_GET,
  @JsonProperty("run-ad-auction")
  RUN_AD_AUCTION,
  @JsonProperty("screen-wake-lock")
  SCREEN_WAKE_LOCK,
  @JsonProperty("serial")
  SERIAL,
  @JsonProperty("shared-autofill")
  SHARED_AUTOFILL,
  @JsonProperty("shared-storage")
  SHARED_STORAGE,
  @JsonProperty("shared-storage-select-url")
  SHARED_STORAGE_SELECT_URL,
  @JsonProperty("smart-card")
  SMART_CARD,
  @JsonProperty("storage-access")
  STORAGE_ACCESS,
  @JsonProperty("sync-xhr")
  SYNC_XHR,
  @JsonProperty("trust-token-redemption")
  TRUST_TOKEN_REDEMPTION,
  @JsonProperty("unload")
  UNLOAD,
  @JsonProperty("usb")
  USB,
  @JsonProperty("vertical-scroll")
  VERTICAL_SCROLL,
  @JsonProperty("web-share")
  WEB_SHARE,
  @JsonProperty("window-management")
  WINDOW_MANAGEMENT,
  @JsonProperty("window-placement")
  WINDOW_PLACEMENT,
  @JsonProperty("xr-spatial-tracking")
  XR_SPATIAL_TRACKING
}
