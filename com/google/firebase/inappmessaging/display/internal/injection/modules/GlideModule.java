package com.google.firebase.inappmessaging.display.internal.injection.modules;

import android.app.Application;
import com.google.firebase.inappmessaging.display.dagger.Module;
import com.google.firebase.inappmessaging.display.dagger.Provides;
import com.google.firebase.inappmessaging.display.internal.GlideErrorListener;
import com.google.firebase.inappmessaging.display.internal.injection.scopes.FirebaseAppScope;
import f.e.a.b;
import f.e.a.h;

@Module
/* loaded from: classes2.dex */
public class GlideModule {
    @Provides
    @FirebaseAppScope
    public h providesGlideRequestManager(Application application, GlideErrorListener glideErrorListener) {
        h d2 = b.d(application);
        d2.n.add(glideErrorListener);
        return d2;
    }
}
