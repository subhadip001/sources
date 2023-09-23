package com.google.firebase.inappmessaging.internal.injection.modules;

import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import com.google.common.io.BaseEncoding;
import com.google.firebase.FirebaseApp;
import com.google.firebase.inappmessaging.dagger.Module;
import com.google.firebase.inappmessaging.dagger.Provides;
import com.google.firebase.inappmessaging.internal.injection.scopes.FirebaseAppScope;
import f.h.g.a.a.a.d.g;
import g.a.b;
import g.a.c;
import g.a.i0;
import g.a.y0.c;
import g.a.y0.d;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;

@Module
/* loaded from: classes2.dex */
public class GrpcClientModule {
    private final FirebaseApp firebaseApp;

    public GrpcClientModule(FirebaseApp firebaseApp) {
        this.firebaseApp = firebaseApp;
    }

    public static String getSignature(PackageManager packageManager, String str) {
        Signature[] signatureArr;
        try {
            PackageInfo packageInfo = packageManager.getPackageInfo(str, 64);
            if (packageInfo != null && (signatureArr = packageInfo.signatures) != null && signatureArr.length != 0 && signatureArr[0] != null) {
                return signatureDigest(signatureArr[0]);
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return null;
    }

    private static String signatureDigest(Signature signature) {
        try {
            return BaseEncoding.b.f().c(MessageDigest.getInstance("SHA1").digest(signature.toByteArray()));
        } catch (NoSuchAlgorithmException unused) {
            return null;
        }
    }

    @Provides
    public i0 providesApiKeyHeaders() {
        i0.d<String> dVar = i0.f7537d;
        i0.f a = i0.f.a("X-Goog-Api-Key", dVar);
        i0.f a2 = i0.f.a("X-Android-Package", dVar);
        i0.f a3 = i0.f.a("X-Android-Cert", dVar);
        i0 i0Var = new i0();
        String packageName = this.firebaseApp.getApplicationContext().getPackageName();
        i0Var.h(a, this.firebaseApp.getOptions().getApiKey());
        i0Var.h(a2, packageName);
        String signature = getSignature(this.firebaseApp.getApplicationContext().getPackageManager(), packageName);
        if (signature != null) {
            i0Var.h(a3, signature);
        }
        return i0Var;
    }

    @Provides
    @FirebaseAppScope
    public g.a providesInAppMessagingSdkServingStub(c cVar, i0 i0Var) {
        return new g.a(g.a.g.a(cVar, Arrays.asList(new d(i0Var))), b.f7526j.e(g.a.y0.c.c, c.d.BLOCKING), null);
    }
}
