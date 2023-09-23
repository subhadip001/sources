package com.google.android.gms.common.api;

import android.accounts.Account;
import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Api.ApiOptions;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.internal.ApiExceptionMapper;
import com.google.android.gms.common.api.internal.ApiKey;
import com.google.android.gms.common.api.internal.BaseImplementation;
import com.google.android.gms.common.api.internal.GoogleApiManager;
import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.common.api.internal.ListenerHolders;
import com.google.android.gms.common.api.internal.NonGmsServiceBrokerClient;
import com.google.android.gms.common.api.internal.RegisterListenerMethod;
import com.google.android.gms.common.api.internal.RegistrationMethods;
import com.google.android.gms.common.api.internal.StatusExceptionMapper;
import com.google.android.gms.common.api.internal.TaskApiCall;
import com.google.android.gms.common.api.internal.UnregisterListenerMethod;
import com.google.android.gms.common.api.internal.zaae;
import com.google.android.gms.common.api.internal.zabq;
import com.google.android.gms.common.api.internal.zabv;
import com.google.android.gms.common.api.internal.zact;
import com.google.android.gms.common.internal.BaseGmsClient;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.lang.reflect.InvocationTargetException;
import java.util.Collections;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
@KeepForSdk
/* loaded from: classes.dex */
public abstract class GoogleApi<O extends Api.ApiOptions> implements HasApiKey<O> {
    public final GoogleApiManager zaa;
    private final Context zab;
    private final String zac;
    private final Api<O> zad;
    private final O zae;
    private final ApiKey<O> zaf;
    private final Looper zag;
    private final int zah;
    private final GoogleApiClient zai;
    private final StatusExceptionMapper zaj;

    /* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
    @KeepForSdk
    /* loaded from: classes.dex */
    public static class Settings {
        @KeepForSdk
        public static final Settings DEFAULT_SETTINGS = new Builder().build();
        public final StatusExceptionMapper zaa;
        public final Looper zab;

        /* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
        @KeepForSdk
        /* loaded from: classes.dex */
        public static class Builder {
            private StatusExceptionMapper zaa;
            private Looper zab;

            @KeepForSdk
            public Settings build() {
                if (this.zaa == null) {
                    this.zaa = new ApiExceptionMapper();
                }
                if (this.zab == null) {
                    this.zab = Looper.getMainLooper();
                }
                return new Settings(this.zaa, this.zab);
            }

            @KeepForSdk
            public Builder setLooper(Looper looper) {
                Preconditions.checkNotNull(looper, "Looper must not be null.");
                this.zab = looper;
                return this;
            }

            @KeepForSdk
            public Builder setMapper(StatusExceptionMapper statusExceptionMapper) {
                Preconditions.checkNotNull(statusExceptionMapper, "StatusExceptionMapper must not be null.");
                this.zaa = statusExceptionMapper;
                return this;
            }
        }

        @KeepForSdk
        private Settings(StatusExceptionMapper statusExceptionMapper, Account account, Looper looper) {
            this.zaa = statusExceptionMapper;
            this.zab = looper;
        }
    }

    @KeepForSdk
    public GoogleApi(Activity activity, Api<O> api, O o, Settings settings) {
        this(activity, activity, api, o, settings);
    }

    private final <A extends Api.AnyClient, T extends BaseImplementation.ApiMethodImpl<? extends Result, A>> T zad(int i2, T t) {
        t.zak();
        this.zaa.zaw(this, i2, t);
        return t;
    }

    private final <TResult, A extends Api.AnyClient> Task<TResult> zae(int i2, TaskApiCall<A, TResult> taskApiCall) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.zaa.zax(this, i2, taskApiCall, taskCompletionSource, this.zaj);
        return taskCompletionSource.getTask();
    }

    @KeepForSdk
    public GoogleApiClient asGoogleApiClient() {
        return this.zai;
    }

    @KeepForSdk
    public ClientSettings.Builder createClientSettingsBuilder() {
        Account account;
        Set<Scope> emptySet;
        GoogleSignInAccount googleSignInAccount;
        ClientSettings.Builder builder = new ClientSettings.Builder();
        O o = this.zae;
        if ((o instanceof Api.ApiOptions.HasGoogleSignInAccountOptions) && (googleSignInAccount = ((Api.ApiOptions.HasGoogleSignInAccountOptions) o).getGoogleSignInAccount()) != null) {
            account = googleSignInAccount.getAccount();
        } else {
            O o2 = this.zae;
            account = o2 instanceof Api.ApiOptions.HasAccountOptions ? ((Api.ApiOptions.HasAccountOptions) o2).getAccount() : null;
        }
        builder.zab(account);
        O o3 = this.zae;
        if (o3 instanceof Api.ApiOptions.HasGoogleSignInAccountOptions) {
            GoogleSignInAccount googleSignInAccount2 = ((Api.ApiOptions.HasGoogleSignInAccountOptions) o3).getGoogleSignInAccount();
            if (googleSignInAccount2 == null) {
                emptySet = Collections.emptySet();
            } else {
                emptySet = googleSignInAccount2.getRequestedScopes();
            }
        } else {
            emptySet = Collections.emptySet();
        }
        builder.zaa(emptySet);
        builder.zac(this.zab.getClass().getName());
        builder.setRealClientPackageName(this.zab.getPackageName());
        return builder;
    }

    @KeepForSdk
    public Task<Boolean> disconnectService() {
        return this.zaa.zap(this);
    }

    @KeepForSdk
    public <A extends Api.AnyClient, T extends BaseImplementation.ApiMethodImpl<? extends Result, A>> T doBestEffortWrite(T t) {
        zad(2, t);
        return t;
    }

    @KeepForSdk
    public <A extends Api.AnyClient, T extends BaseImplementation.ApiMethodImpl<? extends Result, A>> T doRead(T t) {
        zad(0, t);
        return t;
    }

    @KeepForSdk
    @Deprecated
    public <A extends Api.AnyClient, T extends RegisterListenerMethod<A, ?>, U extends UnregisterListenerMethod<A, ?>> Task<Void> doRegisterEventListener(T t, U u) {
        Preconditions.checkNotNull(t);
        Preconditions.checkNotNull(u);
        Preconditions.checkNotNull(t.getListenerKey(), "Listener has already been released.");
        Preconditions.checkNotNull(u.getListenerKey(), "Listener has already been released.");
        Preconditions.checkArgument(Objects.equal(t.getListenerKey(), u.getListenerKey()), "Listener registration and unregistration methods must be constructed with the same ListenerHolder.");
        return this.zaa.zaq(this, t, u, new Runnable() { // from class: com.google.android.gms.common.api.zad
            @Override // java.lang.Runnable
            public final void run() {
            }
        });
    }

    @KeepForSdk
    public Task<Boolean> doUnregisterEventListener(ListenerHolder.ListenerKey<?> listenerKey) {
        return doUnregisterEventListener(listenerKey, 0);
    }

    @KeepForSdk
    public <A extends Api.AnyClient, T extends BaseImplementation.ApiMethodImpl<? extends Result, A>> T doWrite(T t) {
        zad(1, t);
        return t;
    }

    @Override // com.google.android.gms.common.api.HasApiKey
    public final ApiKey<O> getApiKey() {
        return this.zaf;
    }

    @KeepForSdk
    public O getApiOptions() {
        return this.zae;
    }

    @KeepForSdk
    public Context getApplicationContext() {
        return this.zab;
    }

    @KeepForSdk
    public String getContextAttributionTag() {
        return this.zac;
    }

    @KeepForSdk
    @Deprecated
    public String getContextFeatureId() {
        return this.zac;
    }

    @KeepForSdk
    public Looper getLooper() {
        return this.zag;
    }

    @KeepForSdk
    public <L> ListenerHolder<L> registerListener(L l2, String str) {
        return ListenerHolders.createListenerHolder(l2, this.zag, str);
    }

    public final int zaa() {
        return this.zah;
    }

    public final Api.Client zab(Looper looper, zabq<O> zabqVar) {
        Api.Client buildClient = ((Api.AbstractClientBuilder) Preconditions.checkNotNull(this.zad.zaa())).buildClient(this.zab, looper, createClientSettingsBuilder().build(), (ClientSettings) this.zae, (GoogleApiClient.ConnectionCallbacks) zabqVar, (GoogleApiClient.OnConnectionFailedListener) zabqVar);
        String contextAttributionTag = getContextAttributionTag();
        if (contextAttributionTag != null && (buildClient instanceof BaseGmsClient)) {
            ((BaseGmsClient) buildClient).setAttributionTag(contextAttributionTag);
        }
        if (contextAttributionTag != null && (buildClient instanceof NonGmsServiceBrokerClient)) {
            ((NonGmsServiceBrokerClient) buildClient).zac(contextAttributionTag);
        }
        return buildClient;
    }

    public final zact zac(Context context, Handler handler) {
        return new zact(context, handler, createClientSettingsBuilder().build());
    }

    /* JADX WARN: Illegal instructions before constructor call */
    @com.google.android.gms.common.annotation.KeepForSdk
    @java.lang.Deprecated
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public GoogleApi(android.app.Activity r2, com.google.android.gms.common.api.Api<O> r3, O r4, com.google.android.gms.common.api.internal.StatusExceptionMapper r5) {
        /*
            r1 = this;
            com.google.android.gms.common.api.GoogleApi$Settings$Builder r0 = new com.google.android.gms.common.api.GoogleApi$Settings$Builder
            r0.<init>()
            r0.setMapper(r5)
            android.os.Looper r5 = r2.getMainLooper()
            r0.setLooper(r5)
            com.google.android.gms.common.api.GoogleApi$Settings r5 = r0.build()
            r1.<init>(r2, r3, r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.GoogleApi.<init>(android.app.Activity, com.google.android.gms.common.api.Api, com.google.android.gms.common.api.Api$ApiOptions, com.google.android.gms.common.api.internal.StatusExceptionMapper):void");
    }

    @KeepForSdk
    public <TResult, A extends Api.AnyClient> Task<TResult> doBestEffortWrite(TaskApiCall<A, TResult> taskApiCall) {
        return zae(2, taskApiCall);
    }

    @KeepForSdk
    public <TResult, A extends Api.AnyClient> Task<TResult> doRead(TaskApiCall<A, TResult> taskApiCall) {
        return zae(0, taskApiCall);
    }

    @KeepForSdk
    public Task<Boolean> doUnregisterEventListener(ListenerHolder.ListenerKey<?> listenerKey, int i2) {
        Preconditions.checkNotNull(listenerKey, "Listener key cannot be null.");
        return this.zaa.zar(this, listenerKey, i2);
    }

    @KeepForSdk
    public <TResult, A extends Api.AnyClient> Task<TResult> doWrite(TaskApiCall<A, TResult> taskApiCall) {
        return zae(1, taskApiCall);
    }

    private GoogleApi(Context context, Activity activity, Api<O> api, O o, Settings settings) {
        Preconditions.checkNotNull(context, "Null context is not permitted.");
        Preconditions.checkNotNull(api, "Api must not be null.");
        Preconditions.checkNotNull(settings, "Settings must not be null; use Settings.DEFAULT_SETTINGS instead.");
        this.zab = context.getApplicationContext();
        String str = null;
        if (PlatformVersion.isAtLeastR()) {
            try {
                str = (String) Context.class.getMethod("getAttributionTag", new Class[0]).invoke(context, new Object[0]);
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            }
        }
        this.zac = str;
        this.zad = api;
        this.zae = o;
        this.zag = settings.zab;
        ApiKey<O> zaa = ApiKey.zaa(api, o, str);
        this.zaf = zaa;
        this.zai = new zabv(this);
        GoogleApiManager zam = GoogleApiManager.zam(this.zab);
        this.zaa = zam;
        this.zah = zam.zaa();
        this.zaj = settings.zaa;
        if (activity != null && !(activity instanceof GoogleApiActivity) && Looper.myLooper() == Looper.getMainLooper()) {
            zaae.zad(activity, zam, zaa);
        }
        zam.zaB(this);
    }

    @KeepForSdk
    public <A extends Api.AnyClient> Task<Void> doRegisterEventListener(RegistrationMethods<A, ?> registrationMethods) {
        Preconditions.checkNotNull(registrationMethods);
        Preconditions.checkNotNull(registrationMethods.register.getListenerKey(), "Listener has already been released.");
        Preconditions.checkNotNull(registrationMethods.zaa.getListenerKey(), "Listener has already been released.");
        return this.zaa.zaq(this, registrationMethods.register, registrationMethods.zaa, registrationMethods.zab);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    @com.google.android.gms.common.annotation.KeepForSdk
    @java.lang.Deprecated
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public GoogleApi(android.content.Context r2, com.google.android.gms.common.api.Api<O> r3, O r4, android.os.Looper r5, com.google.android.gms.common.api.internal.StatusExceptionMapper r6) {
        /*
            r1 = this;
            com.google.android.gms.common.api.GoogleApi$Settings$Builder r0 = new com.google.android.gms.common.api.GoogleApi$Settings$Builder
            r0.<init>()
            r0.setLooper(r5)
            r0.setMapper(r6)
            com.google.android.gms.common.api.GoogleApi$Settings r5 = r0.build()
            r1.<init>(r2, r3, r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.GoogleApi.<init>(android.content.Context, com.google.android.gms.common.api.Api, com.google.android.gms.common.api.Api$ApiOptions, android.os.Looper, com.google.android.gms.common.api.internal.StatusExceptionMapper):void");
    }

    @KeepForSdk
    public GoogleApi(Context context, Api<O> api, O o, Settings settings) {
        this(context, (Activity) null, api, o, settings);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    @com.google.android.gms.common.annotation.KeepForSdk
    @java.lang.Deprecated
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public GoogleApi(android.content.Context r2, com.google.android.gms.common.api.Api<O> r3, O r4, com.google.android.gms.common.api.internal.StatusExceptionMapper r5) {
        /*
            r1 = this;
            com.google.android.gms.common.api.GoogleApi$Settings$Builder r0 = new com.google.android.gms.common.api.GoogleApi$Settings$Builder
            r0.<init>()
            r0.setMapper(r5)
            com.google.android.gms.common.api.GoogleApi$Settings r5 = r0.build()
            r1.<init>(r2, r3, r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.GoogleApi.<init>(android.content.Context, com.google.android.gms.common.api.Api, com.google.android.gms.common.api.Api$ApiOptions, com.google.android.gms.common.api.internal.StatusExceptionMapper):void");
    }
}
