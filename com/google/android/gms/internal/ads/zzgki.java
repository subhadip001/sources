package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.ServiceConfigurationError;
import java.util.ServiceLoader;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public abstract class zzgki {
    private static final Logger zza = Logger.getLogger(zzgjv.class.getName());
    private static final String zzb = "com.google.protobuf.BlazeGeneratedExtensionRegistryLiteLoader";

    public static zzgka zzb(Class cls) {
        String format;
        ClassLoader classLoader = zzgki.class.getClassLoader();
        if (cls.equals(zzgka.class)) {
            format = zzb;
        } else if (cls.getPackage().equals(zzgki.class.getPackage())) {
            format = String.format("%s.BlazeGenerated%sLoader", cls.getPackage().getName(), cls.getSimpleName());
        } else {
            throw new IllegalArgumentException(cls.getName());
        }
        try {
            try {
                try {
                    try {
                        return (zzgka) cls.cast(((zzgki) Class.forName(format, true, classLoader).getConstructor(new Class[0]).newInstance(new Object[0])).zza());
                    } catch (InstantiationException e2) {
                        throw new IllegalStateException(e2);
                    } catch (NoSuchMethodException e3) {
                        throw new IllegalStateException(e3);
                    }
                } catch (InvocationTargetException e4) {
                    throw new IllegalStateException(e4);
                }
            } catch (IllegalAccessException e5) {
                throw new IllegalStateException(e5);
            }
        } catch (ClassNotFoundException unused) {
            Iterator it = ServiceLoader.load(zzgki.class, classLoader).iterator();
            ArrayList arrayList = new ArrayList();
            while (it.hasNext()) {
                try {
                    arrayList.add(cls.cast(((zzgki) it.next()).zza()));
                } catch (ServiceConfigurationError e6) {
                    zza.logp(Level.SEVERE, "com.google.protobuf.GeneratedExtensionRegistryLoader", "load", "Unable to load ".concat(cls.getSimpleName()), (Throwable) e6);
                }
            }
            if (arrayList.size() == 1) {
                return (zzgka) arrayList.get(0);
            }
            if (arrayList.size() == 0) {
                return null;
            }
            try {
                return (zzgka) cls.getMethod("combine", Collection.class).invoke(null, arrayList);
            } catch (IllegalAccessException e7) {
                throw new IllegalStateException(e7);
            } catch (NoSuchMethodException e8) {
                throw new IllegalStateException(e8);
            } catch (InvocationTargetException e9) {
                throw new IllegalStateException(e9);
            }
        }
    }

    public abstract zzgka zza();
}
