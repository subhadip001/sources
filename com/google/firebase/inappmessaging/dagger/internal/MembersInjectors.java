package com.google.firebase.inappmessaging.dagger.internal;

import com.google.firebase.inappmessaging.dagger.MembersInjector;

/* loaded from: classes2.dex */
public final class MembersInjectors {

    /* loaded from: classes2.dex */
    public enum NoOpMembersInjector implements MembersInjector<Object> {
        INSTANCE;

        @Override // com.google.firebase.inappmessaging.dagger.MembersInjector
        public void injectMembers(Object obj) {
            Preconditions.checkNotNull(obj, "Cannot inject members into a null reference");
        }
    }

    private MembersInjectors() {
    }

    public static <T> MembersInjector<T> noOp() {
        return NoOpMembersInjector.INSTANCE;
    }
}
