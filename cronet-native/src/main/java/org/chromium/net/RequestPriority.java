
// Copyright 2019 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by
//     java_cpp_enum.py
// From
//     ../../net/base/request_priority.h

package org.chromium.net;

import android.support.annotation.IntDef;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@IntDef({
    RequestPriority.THROTTLED, RequestPriority.MINIMUM_PRIORITY, RequestPriority.IDLE,
    RequestPriority.LOWEST, RequestPriority.DEFAULT_PRIORITY, RequestPriority.LOW,
    RequestPriority.MEDIUM, RequestPriority.HIGHEST, RequestPriority.MAXIMUM_PRIORITY
})
@Retention(RetentionPolicy.SOURCE)
public @interface RequestPriority {
  int THROTTLED = 0;
  /**
   * should be reserved for following requests (i.e. that higher priority following requests are
   * expected).
   */
  int MINIMUM_PRIORITY = THROTTLED;
  int IDLE = 1;
  int LOWEST = 2;
  int DEFAULT_PRIORITY = LOWEST;
  int LOW = 3;
  int MEDIUM = 4;
  int HIGHEST = 5;
  int MAXIMUM_PRIORITY = HIGHEST;
}
