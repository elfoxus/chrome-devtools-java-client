package com.github.kklisura.cdt.protocol.events.animation;

import com.github.kklisura.cdt.protocol.types.animation.Animation;

/** Event for animation that has been started. */
public class AnimationStarted {

  private Animation animation;

  /** Animation that was started. */
  public Animation getAnimation() {
    return animation;
  }

  /** Animation that was started. */
  public void setAnimation(Animation animation) {
    this.animation = animation;
  }
}
