package com.google.firebase.messaging.ktx;

import com.google.firebase.components.Component;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.platforminfo.LibraryVersionComponent;
import f.n.a.n.i;
import java.util.List;

/* compiled from: Messaging.kt */
/* loaded from: classes2.dex */
public final class FirebaseMessagingKtxRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    public List<Component<?>> getComponents() {
        return i.F(LibraryVersionComponent.create(MessagingKt.LIBRARY_NAME, "23.1.1"));
    }
}
