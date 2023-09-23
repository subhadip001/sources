package com.google.firebase.inappmessaging.internal;

import android.app.Application;
import com.google.firebase.inappmessaging.internal.ProtoStorageClient;
import com.google.protobuf.InvalidProtocolBufferException;
import f.h.h.a;
import f.h.h.u0;
import g.c.h;
import g.c.w.e.a.d;
import g.c.w.e.c.i;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
public class ProtoStorageClient {
    private final Application application;
    private final String fileName;

    public ProtoStorageClient(Application application, String str) {
        this.application = application;
        this.fileName = str;
    }

    public /* synthetic */ a a(u0 u0Var) {
        a aVar;
        synchronized (this) {
            try {
                FileInputStream openFileInput = this.application.openFileInput(this.fileName);
                try {
                    aVar = (a) u0Var.a(openFileInput);
                    if (openFileInput != null) {
                        openFileInput.close();
                    }
                } catch (Throwable th) {
                    if (openFileInput != null) {
                        try {
                            openFileInput.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                    }
                    throw th;
                }
            } catch (InvalidProtocolBufferException | FileNotFoundException e2) {
                Logging.logi("Recoverable exception while reading cache: " + e2.getMessage());
                aVar = null;
            }
        }
        return aVar;
    }

    public /* synthetic */ Object b(a aVar) {
        synchronized (this) {
            FileOutputStream openFileOutput = this.application.openFileOutput(this.fileName, 0);
            openFileOutput.write(aVar.toByteArray());
            openFileOutput.close();
        }
        return aVar;
    }

    public <T extends a> h<T> read(final u0<T> u0Var) {
        return new i(new Callable() { // from class: f.h.e.n.e.s1
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return ProtoStorageClient.this.a(u0Var);
            }
        });
    }

    public g.c.a write(final a aVar) {
        return new d(new Callable() { // from class: f.h.e.n.e.r1
            @Override // java.util.concurrent.Callable
            public final Object call() {
                ProtoStorageClient protoStorageClient = ProtoStorageClient.this;
                f.h.h.a aVar2 = aVar;
                protoStorageClient.b(aVar2);
                return aVar2;
            }
        });
    }
}
