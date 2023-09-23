package com.google.firebase.datatransport;

import android.content.Context;
import androidx.annotation.Keep;
import com.google.firebase.components.Component;
import com.google.firebase.components.ComponentContainer;
import com.google.firebase.components.ComponentFactory;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.components.Dependency;
import com.google.firebase.platforminfo.LibraryVersionComponent;
import f.h.b.a.f;
import f.h.b.a.h.c;
import f.h.b.a.i.p;
import java.util.Arrays;
import java.util.List;

@Keep
/* loaded from: classes2.dex */
public class TransportRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-transport";

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<Component<?>> getComponents() {
        return Arrays.asList(Component.builder(f.class).name(LIBRARY_NAME).add(Dependency.required(Context.class)).factory(new ComponentFactory() { // from class: f.h.e.k.a
            @Override // com.google.firebase.components.ComponentFactory
            public final Object create(ComponentContainer componentContainer) {
                p.b((Context) componentContainer.get(Context.class));
                return p.a().c(c.f3646g);
            }
        }).build(), LibraryVersionComponent.create(LIBRARY_NAME, BuildConfig.VERSION_NAME));
    }
}
