package com.github.kklisura.cdt.protocol.commands;

import com.github.kklisura.cdt.protocol.support.annotations.Experimental;
import com.github.kklisura.cdt.protocol.support.annotations.Optional;
import com.github.kklisura.cdt.protocol.support.annotations.ParamName;
import com.github.kklisura.cdt.protocol.types.domsnapshot.CaptureSnapshot;
import com.github.kklisura.cdt.protocol.types.domsnapshot.Snapshot;
import java.util.List;

/** This domain facilitates obtaining document snapshots with DOM, layout, and style information. */
@Experimental
public interface DOMSnapshot {

  /** Disables DOM snapshot agent for the given page. */
  void disable();

  /** Enables DOM snapshot agent for the given page. */
  void enable();

  /**
   * Returns a document snapshot, including the full DOM tree of the root node (including iframes,
   * template contents, and imported documents) in a flattened array, as well as layout and
   * white-listed computed style information for the nodes. Shadow DOM in the returned DOM tree is
   * flattened.
   *
   * @param computedStyleWhitelist Whitelist of computed styles to return.
   */
  @Deprecated
  Snapshot getSnapshot(@ParamName("computedStyleWhitelist") List<String> computedStyleWhitelist);

  /**
   * Returns a document snapshot, including the full DOM tree of the root node (including iframes,
   * template contents, and imported documents) in a flattened array, as well as layout and
   * white-listed computed style information for the nodes. Shadow DOM in the returned DOM tree is
   * flattened.
   *
   * @param computedStyleWhitelist Whitelist of computed styles to return.
   * @param includeEventListeners Whether or not to retrieve details of DOM listeners (default
   *     false).
   * @param includePaintOrder Whether to determine and include the paint order index of
   *     LayoutTreeNodes (default false).
   * @param includeUserAgentShadowTree Whether to include UA shadow tree in the snapshot (default
   *     false).
   */
  @Deprecated
  Snapshot getSnapshot(
      @ParamName("computedStyleWhitelist") List<String> computedStyleWhitelist,
      @Optional @ParamName("includeEventListeners") Boolean includeEventListeners,
      @Optional @ParamName("includePaintOrder") Boolean includePaintOrder,
      @Optional @ParamName("includeUserAgentShadowTree") Boolean includeUserAgentShadowTree);

  /**
   * Returns a document snapshot, including the full DOM tree of the root node (including iframes,
   * template contents, and imported documents) in a flattened array, as well as layout and
   * white-listed computed style information for the nodes. Shadow DOM in the returned DOM tree is
   * flattened.
   *
   * @param computedStyles Whitelist of computed styles to return.
   */
  CaptureSnapshot captureSnapshot(@ParamName("computedStyles") List<String> computedStyles);

  /**
   * Returns a document snapshot, including the full DOM tree of the root node (including iframes,
   * template contents, and imported documents) in a flattened array, as well as layout and
   * white-listed computed style information for the nodes. Shadow DOM in the returned DOM tree is
   * flattened.
   *
   * @param computedStyles Whitelist of computed styles to return.
   * @param includePaintOrder Whether to include layout object paint orders into the snapshot.
   * @param includeDOMRects Whether to include DOM rectangles (offsetRects, clientRects,
   *     scrollRects) into the snapshot
   * @param includeBlendedBackgroundColors Whether to include blended background colors in the
   *     snapshot (default: false). Blended background color is achieved by blending background
   *     colors of all elements that overlap with the current element.
   * @param includeTextColorOpacities Whether to include text color opacity in the snapshot
   *     (default: false). An element might have the opacity property set that affects the text
   *     color of the element. The final text color opacity is computed based on the opacity of all
   *     overlapping elements.
   */
  CaptureSnapshot captureSnapshot(
      @ParamName("computedStyles") List<String> computedStyles,
      @Optional @ParamName("includePaintOrder") Boolean includePaintOrder,
      @Optional @ParamName("includeDOMRects") Boolean includeDOMRects,
      @Experimental @Optional @ParamName("includeBlendedBackgroundColors")
          Boolean includeBlendedBackgroundColors,
      @Experimental @Optional @ParamName("includeTextColorOpacities")
          Boolean includeTextColorOpacities);
}
