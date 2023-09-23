package com.google.firebase.ktx;

import androidx.annotation.Keep;
import com.google.firebase.components.Component;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.platforminfo.LibraryVersionComponent;
import f.n.a.n.i;
import java.util.List;

/* compiled from: Firebase.kt */
@Keep
/* loaded from: classes2.dex */
public final class FirebaseCommonKtxRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    public List<Component<?>> getComponents() {
        return i.F(LibraryVersionComponent.create(FirebaseKt.LIBRARY_NAME, "20.2.0"));
    }
}
