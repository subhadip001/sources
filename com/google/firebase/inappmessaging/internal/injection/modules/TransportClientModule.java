package com.google.firebase.inappmessaging.internal.injection.modules;

import com.google.android.datatransport.Priority;
import com.google.firebase.FirebaseApp;
import com.google.firebase.analytics.connector.AnalyticsConnector;
import com.google.firebase.inappmessaging.dagger.Module;
import com.google.firebase.inappmessaging.dagger.Provides;
import com.google.firebase.inappmessaging.internal.DeveloperListenerManager;
import com.google.firebase.inappmessaging.internal.MetricsLoggerClient;
import com.google.firebase.inappmessaging.internal.injection.scopes.FirebaseAppScope;
import com.google.firebase.inappmessaging.internal.time.Clock;
import com.google.firebase.installations.FirebaseInstallationsApi;
import f.h.b.a.d;
import f.h.b.a.e;
import f.h.b.a.f;
import f.h.b.a.i.n;

@Module
/* loaded from: classes2.dex */
public class TransportClientModule {
    private static final String TRANSPORT_NAME = "FIREBASE_INAPPMESSAGING";

    @Provides
    @FirebaseAppScope
    public static MetricsLoggerClient providesMetricsLoggerClient(FirebaseApp firebaseApp, f fVar, AnalyticsConnector analyticsConnector, FirebaseInstallationsApi firebaseInstallationsApi, Clock clock, DeveloperListenerManager developerListenerManager) {
        final e a = fVar.a(TRANSPORT_NAME, byte[].class, new d() { // from class: f.h.e.n.e.j2.a.c
            @Override // f.h.b.a.d
            public final Object apply(Object obj) {
                return (byte[]) obj;
            }
        });
        return new MetricsLoggerClient(new MetricsLoggerClient.EngagementMetricsLoggerInterface() { // from class: f.h.e.n.e.j2.a.d
            @Override // com.google.firebase.inappmessaging.internal.MetricsLoggerClient.EngagementMetricsLoggerInterface
            public final void logEvent(byte[] bArr) {
                ((n) e.this).a(new f.h.b.a.a(null, bArr, Priority.DEFAULT), f.h.b.a.i.a.a);
            }
        }, analyticsConnector, firebaseApp, firebaseInstallationsApi, clock, developerListenerManager);
    }
}
