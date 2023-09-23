package com.google.firebase.inappmessaging.internal;

import android.app.Application;
import android.content.pm.PackageManager;
import android.os.Build;
import android.text.TextUtils;
import com.google.firebase.FirebaseApp;
import com.google.firebase.inappmessaging.internal.injection.scopes.FirebaseAppScope;
import com.google.firebase.inappmessaging.internal.time.Clock;
import f.h.d.a.a.a.b;
import f.h.g.a.a.a.d.c;
import f.h.g.a.a.a.d.d;
import f.h.g.a.a.a.d.e;
import h.a.a;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;

@FirebaseAppScope
/* loaded from: classes2.dex */
public class ApiClient {
    private static final String FETCHING_CAMPAIGN_MESSAGE = "Fetching campaigns from service.";
    private final Application application;
    private final Clock clock;
    private final FirebaseApp firebaseApp;
    private final a<GrpcClient> grpcClient;
    private final ProviderInstaller providerInstaller;

    public ApiClient(a<GrpcClient> aVar, FirebaseApp firebaseApp, Application application, Clock clock, ProviderInstaller providerInstaller) {
        this.grpcClient = aVar;
        this.firebaseApp = firebaseApp;
        this.application = application;
        this.clock = clock;
        this.providerInstaller = providerInstaller;
    }

    private c getClientAppInfo(InstallationIdResult installationIdResult) {
        c.b e2 = c.e();
        String applicationId = this.firebaseApp.getOptions().getApplicationId();
        e2.copyOnWrite();
        c.b((c) e2.instance, applicationId);
        String installationId = installationIdResult.installationId();
        e2.copyOnWrite();
        c.c((c) e2.instance, installationId);
        String token = installationIdResult.installationTokenResult().getToken();
        e2.copyOnWrite();
        c.d((c) e2.instance, token);
        return e2.build();
    }

    private b getClientSignals() {
        b.a f2 = b.f();
        String valueOf = String.valueOf(Build.VERSION.SDK_INT);
        f2.copyOnWrite();
        b.d((b) f2.instance, valueOf);
        String locale = Locale.getDefault().toString();
        f2.copyOnWrite();
        b.e((b) f2.instance, locale);
        String id = TimeZone.getDefault().getID();
        f2.copyOnWrite();
        b.c((b) f2.instance, id);
        String versionName = getVersionName();
        if (!TextUtils.isEmpty(versionName)) {
            f2.copyOnWrite();
            b.b((b) f2.instance, versionName);
        }
        return f2.build();
    }

    private String getVersionName() {
        try {
            return this.application.getPackageManager().getPackageInfo(this.application.getPackageName(), 0).versionName;
        } catch (PackageManager.NameNotFoundException e2) {
            StringBuilder A = f.a.b.a.a.A("Error finding versionName : ");
            A.append(e2.getMessage());
            Logging.loge(A.toString());
            return null;
        }
    }

    private e withCacheExpirationSafeguards(e eVar) {
        if (eVar.d() >= TimeUnit.MINUTES.toMillis(1L) + this.clock.now()) {
            if (eVar.d() <= TimeUnit.DAYS.toMillis(3L) + this.clock.now()) {
                return eVar;
            }
        }
        e.b builder = eVar.toBuilder();
        long millis = TimeUnit.DAYS.toMillis(1L) + this.clock.now();
        builder.copyOnWrite();
        e.b((e) builder.instance, millis);
        return builder.build();
    }

    public e getFiams(InstallationIdResult installationIdResult, f.h.g.a.a.a.d.b bVar) {
        Logging.logi(FETCHING_CAMPAIGN_MESSAGE);
        this.providerInstaller.install();
        d.b g2 = d.g();
        String gcmSenderId = this.firebaseApp.getOptions().getGcmSenderId();
        g2.copyOnWrite();
        d.b((d) g2.instance, gcmSenderId);
        List<f.h.g.a.a.a.d.a> c = bVar.c();
        g2.copyOnWrite();
        d.c((d) g2.instance, c);
        b clientSignals = getClientSignals();
        g2.copyOnWrite();
        d.d((d) g2.instance, clientSignals);
        c clientAppInfo = getClientAppInfo(installationIdResult);
        g2.copyOnWrite();
        d.e((d) g2.instance, clientAppInfo);
        return withCacheExpirationSafeguards(this.grpcClient.get().fetchEligibleCampaigns(g2.build()));
    }
}
