// Copyright 2000-2020 JetBrains s.r.o. Use of this source code is governed by the Apache 2.0 license that can be found in the LICENSE file.
package com.intellij.coverage;

import com.intellij.openapi.Disposable;
import org.jetbrains.annotations.ApiStatus;

@ApiStatus.Experimental
public interface SrcFileAnnotatorBase extends Disposable {

  void hideCoverageData();

  void showCoverageInformation(final CoverageSuitesBundle suite);
}
