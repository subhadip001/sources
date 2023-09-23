package com.google.firebase.database.android;

import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.appcheck.AppCheckTokenResult;
import com.google.firebase.appcheck.interop.AppCheckTokenListener;
import com.google.firebase.appcheck.interop.InternalAppCheckTokenProvider;
import com.google.firebase.database.android.AndroidAppCheckTokenProvider;
import com.google.firebase.database.core.TokenProvider;
import com.google.firebase.inject.Deferred;
import com.google.firebase.inject.Provider;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public class AndroidAppCheckTokenProvider implements TokenProvider {
    private final Deferred<InternalAppCheckTokenProvider> deferredAppCheckProvider;
    private final AtomicReference<InternalAppCheckTokenProvider> internalAppCheck = new AtomicReference<>();

    public AndroidAppCheckTokenProvider(Deferred<InternalAppCheckTokenProvider> deferred) {
        this.deferredAppCheckProvider = deferred;
        deferred.whenAvailable(new Deferred.DeferredHandler() { // from class: f.h.e.j.b.d
            @Override // com.google.firebase.inject.Deferred.DeferredHandler
            public final void handle(Provider provider) {
                AndroidAppCheckTokenProvider.this.a(provider);
            }
        });
    }

    public /* synthetic */ void a(Provider provider) {
        this.internalAppCheck.set((InternalAppCheckTokenProvider) provider.get());
    }

    @Override // com.google.firebase.database.core.TokenProvider
    public void addTokenChangeListener(final ExecutorService executorService, final TokenProvider.TokenChangeListener tokenChangeListener) {
        this.deferredAppCheckProvider.whenAvailable(new Deferred.DeferredHandler() { // from class: f.h.e.j.b.b
            @Override // com.google.firebase.inject.Deferred.DeferredHandler
            public final void handle(Provider provider) {
                final ExecutorService executorService2 = executorService;
                final TokenProvider.TokenChangeListener tokenChangeListener2 = tokenChangeListener;
                ((InternalAppCheckTokenProvider) provider.get()).addAppCheckTokenListener(new AppCheckTokenListener() { // from class: f.h.e.j.b.a
                    @Override // com.google.firebase.appcheck.interop.AppCheckTokenListener
                    public final void onAppCheckTokenChanged(final AppCheckTokenResult appCheckTokenResult) {
                        ExecutorService executorService3 = executorService2;
                        final TokenProvider.TokenChangeListener tokenChangeListener3 = tokenChangeListener2;
                        executorService3.execute(new Runnable() { // from class: f.h.e.j.b.c
                            @Override // java.lang.Runnable
                            public final void run() {
                                TokenProvider.TokenChangeListener.this.onTokenChange(appCheckTokenResult.getToken());
                            }
                        });
                    }
                });
            }
        });
    }

    @Override // com.google.firebase.database.core.TokenProvider
    public void getToken(boolean z, final TokenProvider.GetTokenCompletionListener getTokenCompletionListener) {
        InternalAppCheckTokenProvider internalAppCheckTokenProvider = this.internalAppCheck.get();
        if (internalAppCheckTokenProvider != null) {
            internalAppCheckTokenProvider.getToken(z).addOnSuccessListener(new OnSuccessListener() { // from class: f.h.e.j.b.e
                @Override // com.google.android.gms.tasks.OnSuccessListener
                public final void onSuccess(Object obj) {
                    TokenProvider.GetTokenCompletionListener.this.onSuccess(((AppCheckTokenResult) obj).getToken());
                }
            }).addOnFailureListener(new OnFailureListener() { // from class: f.h.e.j.b.f
                @Override // com.google.android.gms.tasks.OnFailureListener
                public final void onFailure(Exception exc) {
                    TokenProvider.GetTokenCompletionListener.this.onError(exc.getMessage());
                }
            });
        } else {
            getTokenCompletionListener.onSuccess(null);
        }
    }

    @Override // com.google.firebase.database.core.TokenProvider
    public void removeTokenChangeListener(TokenProvider.TokenChangeListener tokenChangeListener) {
    }
}
