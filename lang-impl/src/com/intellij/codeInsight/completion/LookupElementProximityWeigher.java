/*
 * Copyright (c) 2000-2005 by JetBrains s.r.o. All Rights Reserved.
 * Use is subject to license terms.
 */
package com.intellij.codeInsight.completion;

import com.intellij.codeInsight.lookup.LookupElement;
import com.intellij.psi.PsiElement;
import com.intellij.psi.util.proximity.PsiProximityComparator;
import org.jetbrains.annotations.NotNull;

/**
 * @author peter
*/
public class LookupElementProximityWeigher extends CompletionWeigher {

  public Comparable weigh(@NotNull final LookupElement<?> item, final CompletionLocation location) {
    if (item.getObject() instanceof PsiElement) {
      return PsiProximityComparator.getProximity((PsiElement)item.getObject(), location.getCompletionParameters().getPosition());
    }
    return null;
  }
}
