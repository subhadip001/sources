package com.google.firebase.inappmessaging.internal;

import android.os.Bundle;
import com.google.firebase.analytics.connector.AnalyticsConnector;
import com.google.firebase.inappmessaging.internal.ProxyAnalyticsConnector;
import com.google.firebase.inject.Deferred;
import com.google.firebase.inject.Provider;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes2.dex */
public class ProxyAnalyticsConnector implements AnalyticsConnector {
    private volatile Object instance;

    /* loaded from: classes2.dex */
    public static class ProxyAnalyticsConnectorHandle implements AnalyticsConnector.AnalyticsConnectorHandle {
        private static final Object UNREGISTERED = new Object();
        private Set<String> eventNames;
        private volatile Object instance;

        public /* synthetic */ void a(String str, AnalyticsConnector.AnalyticsConnectorListener analyticsConnectorListener, Provider provider) {
            if (this.instance == UNREGISTERED) {
                return;
            }
            AnalyticsConnector.AnalyticsConnectorHandle registerAnalyticsConnectorListener = ((AnalyticsConnector) provider.get()).registerAnalyticsConnectorListener(str, analyticsConnectorListener);
            this.instance = registerAnalyticsConnectorListener;
            synchronized (this) {
                if (!this.eventNames.isEmpty()) {
                    registerAnalyticsConnectorListener.registerEventNames(this.eventNames);
                    this.eventNames = new HashSet();
                }
            }
        }

        @Override // com.google.firebase.analytics.connector.AnalyticsConnector.AnalyticsConnectorHandle
        public void registerEventNames(Set<String> set) {
            Object obj = this.instance;
            if (obj == UNREGISTERED) {
                return;
            }
            if (obj != null) {
                ((AnalyticsConnector.AnalyticsConnectorHandle) obj).registerEventNames(set);
                return;
            }
            synchronized (this) {
                this.eventNames.addAll(set);
            }
        }

        @Override // com.google.firebase.analytics.connector.AnalyticsConnector.AnalyticsConnectorHandle
        public void unregister() {
            Object obj = this.instance;
            Object obj2 = UNREGISTERED;
            if (obj == obj2) {
                return;
            }
            if (obj != null) {
                ((AnalyticsConnector.AnalyticsConnectorHandle) obj).unregister();
            }
            this.instance = obj2;
            synchronized (this) {
                this.eventNames.clear();
            }
        }

        @Override // com.google.firebase.analytics.connector.AnalyticsConnector.AnalyticsConnectorHandle
        public void unregisterEventNames() {
            Object obj = this.instance;
            if (obj == UNREGISTERED) {
                return;
            }
            if (obj != null) {
                ((AnalyticsConnector.AnalyticsConnectorHandle) obj).unregisterEventNames();
                return;
            }
            synchronized (this) {
                this.eventNames.clear();
            }
        }

        private ProxyAnalyticsConnectorHandle(final String str, final AnalyticsConnector.AnalyticsConnectorListener analyticsConnectorListener, Deferred<AnalyticsConnector> deferred) {
            this.eventNames = new HashSet();
            deferred.whenAvailable(new Deferred.DeferredHandler() { // from class: f.h.e.n.e.t1
                @Override // com.google.firebase.inject.Deferred.DeferredHandler
                public final void handle(Provider provider) {
                    ProxyAnalyticsConnector.ProxyAnalyticsConnectorHandle.this.a(str, analyticsConnectorListener, provider);
                }
            });
        }
    }

    public ProxyAnalyticsConnector(Deferred<AnalyticsConnector> deferred) {
        this.instance = deferred;
        deferred.whenAvailable(new Deferred.DeferredHandler() { // from class: f.h.e.n.e.u1
            @Override // com.google.firebase.inject.Deferred.DeferredHandler
            public final void handle(Provider provider) {
                ProxyAnalyticsConnector.this.a(provider);
            }
        });
    }

    private AnalyticsConnector safeGet() {
        Object obj = this.instance;
        if (obj instanceof AnalyticsConnector) {
            return (AnalyticsConnector) obj;
        }
        return null;
    }

    public /* synthetic */ void a(Provider provider) {
        this.instance = provider.get();
    }

    @Override // com.google.firebase.analytics.connector.AnalyticsConnector
    public void clearConditionalUserProperty(String str, String str2, Bundle bundle) {
    }

    @Override // com.google.firebase.analytics.connector.AnalyticsConnector
    public List<AnalyticsConnector.ConditionalUserProperty> getConditionalUserProperties(String str, String str2) {
        return Collections.emptyList();
    }

    @Override // com.google.firebase.analytics.connector.AnalyticsConnector
    public int getMaxUserProperties(String str) {
        return 0;
    }

    @Override // com.google.firebase.analytics.connector.AnalyticsConnector
    public Map<String, Object> getUserProperties(boolean z) {
        return Collections.emptyMap();
    }

    @Override // com.google.firebase.analytics.connector.AnalyticsConnector
    public void logEvent(String str, String str2, Bundle bundle) {
        AnalyticsConnector safeGet = safeGet();
        if (safeGet != null) {
            safeGet.logEvent(str, str2, bundle);
        }
    }

    @Override // com.google.firebase.analytics.connector.AnalyticsConnector
    public AnalyticsConnector.AnalyticsConnectorHandle registerAnalyticsConnectorListener(String str, AnalyticsConnector.AnalyticsConnectorListener analyticsConnectorListener) {
        Object obj = this.instance;
        if (obj instanceof AnalyticsConnector) {
            return ((AnalyticsConnector) obj).registerAnalyticsConnectorListener(str, analyticsConnectorListener);
        }
        return new ProxyAnalyticsConnectorHandle(str, analyticsConnectorListener, (Deferred) obj);
    }

    @Override // com.google.firebase.analytics.connector.AnalyticsConnector
    public void setConditionalUserProperty(AnalyticsConnector.ConditionalUserProperty conditionalUserProperty) {
    }

    @Override // com.google.firebase.analytics.connector.AnalyticsConnector
    public void setUserProperty(String str, String str2, Object obj) {
        AnalyticsConnector safeGet = safeGet();
        if (safeGet != null) {
            safeGet.setUserProperty(str, str2, obj);
        }
    }
}
