package com.google.android.gms.internal.ads;

import f.a.b.a.a;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzfxi {
    private static final Logger zza = Logger.getLogger(zzfxi.class.getName());
    private static final ConcurrentMap zzb = new ConcurrentHashMap();
    private static final ConcurrentMap zzc = new ConcurrentHashMap();
    private static final ConcurrentMap zzd = new ConcurrentHashMap();
    private static final ConcurrentMap zze = new ConcurrentHashMap();
    private static final ConcurrentMap zzf = new ConcurrentHashMap();
    private static final ConcurrentMap zzg = new ConcurrentHashMap();

    private zzfxi() {
    }

    @Deprecated
    public static zzfwg zza(String str) {
        if (str != null) {
            ConcurrentMap concurrentMap = zze;
            Locale locale = Locale.US;
            zzfwg zzfwgVar = (zzfwg) concurrentMap.get(str.toLowerCase(locale));
            if (zzfwgVar == null) {
                String format = String.format("no catalogue found for %s. ", str);
                if (str.toLowerCase(locale).startsWith("tinkaead")) {
                    format = String.valueOf(format).concat("Maybe call AeadConfig.register().");
                }
                if (!str.toLowerCase(locale).startsWith("tinkdeterministicaead")) {
                    if (!str.toLowerCase(locale).startsWith("tinkstreamingaead")) {
                        if (!str.toLowerCase(locale).startsWith("tinkhybriddecrypt") && !str.toLowerCase(locale).startsWith("tinkhybridencrypt")) {
                            if (!str.toLowerCase(locale).startsWith("tinkmac")) {
                                if (!str.toLowerCase(locale).startsWith("tinkpublickeysign") && !str.toLowerCase(locale).startsWith("tinkpublickeyverify")) {
                                    if (str.toLowerCase(locale).startsWith("tink")) {
                                        format = String.valueOf(format).concat("Maybe call TinkConfig.register().");
                                    }
                                } else {
                                    format = String.valueOf(format).concat("Maybe call SignatureConfig.register().");
                                }
                            } else {
                                format = String.valueOf(format).concat("Maybe call MacConfig.register().");
                            }
                        } else {
                            format = String.valueOf(format).concat("Maybe call HybridConfig.register().");
                        }
                    } else {
                        format = String.valueOf(format).concat("Maybe call StreamingAeadConfig.register().");
                    }
                } else {
                    format = String.valueOf(format).concat("Maybe call DeterministicAeadConfig.register().");
                }
                throw new GeneralSecurityException(format);
            }
            return zzfwgVar;
        }
        throw new IllegalArgumentException("catalogueName must be non-null.");
    }

    public static zzfwm zzb(String str) {
        return zzp(str).zzb();
    }

    public static synchronized zzgfh zzc(zzgfm zzgfmVar) {
        zzgfh zza2;
        synchronized (zzfxi.class) {
            zzfwm zzb2 = zzb(zzgfmVar.zzf());
            if (((Boolean) zzd.get(zzgfmVar.zzf())).booleanValue()) {
                zza2 = zzb2.zza(zzgfmVar.zze());
            } else {
                throw new GeneralSecurityException("newKey-operation not permitted for key type ".concat(String.valueOf(zzgfmVar.zzf())));
            }
        }
        return zza2;
    }

    public static synchronized zzgly zzd(zzgfm zzgfmVar) {
        zzgly zzb2;
        synchronized (zzfxi.class) {
            zzfwm zzb3 = zzb(zzgfmVar.zzf());
            if (((Boolean) zzd.get(zzgfmVar.zzf())).booleanValue()) {
                zzb2 = zzb3.zzb(zzgfmVar.zze());
            } else {
                throw new GeneralSecurityException("newKey-operation not permitted for key type ".concat(String.valueOf(zzgfmVar.zzf())));
            }
        }
        return zzb2;
    }

    public static Class zze(Class cls) {
        zzfxb zzfxbVar = (zzfxb) zzf.get(cls);
        if (zzfxbVar == null) {
            return null;
        }
        return zzfxbVar.zza();
    }

    public static Object zzf(zzgfh zzgfhVar, Class cls) {
        return zzq(zzgfhVar.zzf(), zzgfhVar.zze(), cls);
    }

    public static Object zzg(String str, zzgly zzglyVar, Class cls) {
        return zzo(str, cls).zze(zzglyVar);
    }

    public static Object zzh(String str, byte[] bArr, Class cls) {
        return zzq(str, zzgjg.zzv(bArr), cls);
    }

    public static Object zzi(zzfxa zzfxaVar, Class cls) {
        zzfxb zzfxbVar = (zzfxb) zzf.get(cls);
        if (zzfxbVar != null) {
            if (zzfxbVar.zza().equals(zzfxaVar.zzd())) {
                return zzfxbVar.zzc(zzfxaVar);
            }
            throw new GeneralSecurityException(a.r("Wrong input primitive class, expected ", zzfxbVar.zza().toString(), ", got ", zzfxaVar.zzd().toString()));
        }
        throw new GeneralSecurityException("No wrapper found for ".concat(zzfxaVar.zzd().getName()));
    }

    public static synchronized Map zzj() {
        Map unmodifiableMap;
        synchronized (zzfxi.class) {
            unmodifiableMap = Collections.unmodifiableMap(zzg);
        }
        return unmodifiableMap;
    }

    public static synchronized void zzk(zzgas zzgasVar, zzgar zzgarVar, boolean z) {
        Class zzd2;
        synchronized (zzfxi.class) {
            String zzc2 = zzgasVar.zzc();
            String zzc3 = zzgarVar.zzc();
            zzr(zzc2, zzgasVar.getClass(), zzgasVar.zza().zzc(), true);
            zzr(zzc3, zzgarVar.getClass(), Collections.emptyMap(), false);
            if (!zzc2.equals(zzc3)) {
                int zze2 = zzgarVar.zze();
                if (zzfzc.zza(1)) {
                    if (zzfzc.zza(zze2)) {
                        ConcurrentMap concurrentMap = zzb;
                        if (concurrentMap.containsKey(zzc2) && (zzd2 = ((zzfxh) concurrentMap.get(zzc2)).zzd()) != null && !zzd2.getName().equals(zzgarVar.getClass().getName())) {
                            Logger logger = zza;
                            Level level = Level.WARNING;
                            logger.logp(level, "com.google.crypto.tink.Registry", "registerAsymmetricKeyManagers", "Attempted overwrite of a registered key manager for key type " + zzc2 + " with inconsistent public key type " + zzc3);
                            throw new GeneralSecurityException(String.format("public key manager corresponding to %s is already registered with %s, cannot be re-registered with %s", zzgasVar.getClass().getName(), zzd2.getName(), zzgarVar.getClass().getName()));
                        }
                        if (!concurrentMap.containsKey(zzc2) || ((zzfxh) concurrentMap.get(zzc2)).zzd() == null) {
                            concurrentMap.put(zzc2, new zzfxf(zzgasVar, zzgarVar));
                            zzc.put(zzc2, new zzfxg(zzgasVar));
                            zzs(zzgasVar.zzc(), zzgasVar.zza().zzc());
                        }
                        ConcurrentMap concurrentMap2 = zzd;
                        concurrentMap2.put(zzc2, Boolean.TRUE);
                        if (!concurrentMap.containsKey(zzc3)) {
                            concurrentMap.put(zzc3, new zzfxe(zzgarVar));
                        }
                        concurrentMap2.put(zzc3, Boolean.FALSE);
                    } else {
                        String valueOf = String.valueOf(zzgarVar.getClass());
                        throw new GeneralSecurityException("failed to register key manager " + valueOf + " as it is not FIPS compatible.");
                    }
                } else {
                    String valueOf2 = String.valueOf(zzgasVar.getClass());
                    throw new GeneralSecurityException("failed to register key manager " + valueOf2 + " as it is not FIPS compatible.");
                }
            } else {
                throw new GeneralSecurityException("Private and public key type must be different.");
            }
        }
    }

    public static synchronized void zzl(zzfwm zzfwmVar, boolean z) {
        synchronized (zzfxi.class) {
            if (zzfwmVar != null) {
                String zzf2 = zzfwmVar.zzf();
                zzr(zzf2, zzfwmVar.getClass(), Collections.emptyMap(), z);
                zzb.putIfAbsent(zzf2, new zzfxd(zzfwmVar));
                zzd.put(zzf2, Boolean.valueOf(z));
            } else {
                throw new IllegalArgumentException("key manager must be non-null.");
            }
        }
    }

    public static synchronized void zzm(zzgar zzgarVar, boolean z) {
        synchronized (zzfxi.class) {
            String zzc2 = zzgarVar.zzc();
            zzr(zzc2, zzgarVar.getClass(), zzgarVar.zza().zzc(), true);
            if (zzfzc.zza(zzgarVar.zze())) {
                ConcurrentMap concurrentMap = zzb;
                if (!concurrentMap.containsKey(zzc2)) {
                    concurrentMap.put(zzc2, new zzfxe(zzgarVar));
                    zzc.put(zzc2, new zzfxg(zzgarVar));
                    zzs(zzc2, zzgarVar.zza().zzc());
                }
                zzd.put(zzc2, Boolean.TRUE);
            } else {
                String valueOf = String.valueOf(zzgarVar.getClass());
                throw new GeneralSecurityException("failed to register key manager " + valueOf + " as it is not FIPS compatible.");
            }
        }
    }

    public static synchronized void zzn(zzfxb zzfxbVar) {
        synchronized (zzfxi.class) {
            if (zzfxbVar != null) {
                Class zzb2 = zzfxbVar.zzb();
                ConcurrentMap concurrentMap = zzf;
                if (concurrentMap.containsKey(zzb2)) {
                    zzfxb zzfxbVar2 = (zzfxb) concurrentMap.get(zzb2);
                    if (!zzfxbVar.getClass().getName().equals(zzfxbVar2.getClass().getName())) {
                        zza.logp(Level.WARNING, "com.google.crypto.tink.Registry", "registerPrimitiveWrapper", "Attempted overwrite of a registered PrimitiveWrapper for type ".concat(zzb2.toString()));
                        throw new GeneralSecurityException(String.format("PrimitiveWrapper for primitive (%s) is already registered to be %s, cannot be re-registered with %s", zzb2.getName(), zzfxbVar2.getClass().getName(), zzfxbVar.getClass().getName()));
                    }
                }
                concurrentMap.put(zzb2, zzfxbVar);
            } else {
                throw new IllegalArgumentException("wrapper must be non-null");
            }
        }
    }

    private static zzfwm zzo(String str, Class cls) {
        zzfxh zzp = zzp(str);
        if (zzp.zze().contains(cls)) {
            return zzp.zza(cls);
        }
        String name = cls.getName();
        String valueOf = String.valueOf(zzp.zzc());
        Set<Class> zze2 = zzp.zze();
        StringBuilder sb = new StringBuilder();
        boolean z = true;
        for (Class cls2 : zze2) {
            if (!z) {
                sb.append(", ");
            }
            sb.append(cls2.getCanonicalName());
            z = false;
        }
        String sb2 = sb.toString();
        StringBuilder F = a.F("Primitive type ", name, " not supported by key manager of type ", valueOf, ", supported primitives: ");
        F.append(sb2);
        throw new GeneralSecurityException(F.toString());
    }

    private static synchronized zzfxh zzp(String str) {
        zzfxh zzfxhVar;
        synchronized (zzfxi.class) {
            ConcurrentMap concurrentMap = zzb;
            if (concurrentMap.containsKey(str)) {
                zzfxhVar = (zzfxh) concurrentMap.get(str);
            } else {
                throw new GeneralSecurityException("No key manager found for key type ".concat(String.valueOf(str)));
            }
        }
        return zzfxhVar;
    }

    private static Object zzq(String str, zzgjg zzgjgVar, Class cls) {
        return zzo(str, cls).zzd(zzgjgVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x004f, code lost:
        r6 = com.google.android.gms.internal.ads.zzfxi.zzd;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0055, code lost:
        if (r6.containsKey(r5) == false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0061, code lost:
        if (((java.lang.Boolean) r6.get(r5)).booleanValue() == false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x006f, code lost:
        throw new java.security.GeneralSecurityException("New keys are already disallowed for key type ".concat(r5));
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0074, code lost:
        if (r1.containsKey(r5) == false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0076, code lost:
        r6 = r7.entrySet().iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0082, code lost:
        if (r6.hasNext() == false) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0084, code lost:
        r7 = (java.util.Map.Entry) r6.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0094, code lost:
        if (com.google.android.gms.internal.ads.zzfxi.zzg.containsKey(r7.getKey()) == false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00bb, code lost:
        throw new java.security.GeneralSecurityException("Attempted to register a new key template " + ((java.lang.String) r7.getKey()) + " from an existing key manager of type " + r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00bc, code lost:
        r5 = r7.entrySet().iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00c8, code lost:
        if (r5.hasNext() == false) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00ca, code lost:
        r6 = (java.util.Map.Entry) r5.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00da, code lost:
        if (com.google.android.gms.internal.ads.zzfxi.zzg.containsKey(r6.getKey()) != false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00f2, code lost:
        throw new java.security.GeneralSecurityException("Attempted overwrite of a registered key template ".concat(java.lang.String.valueOf((java.lang.String) r6.getKey())));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static synchronized void zzr(java.lang.String r5, java.lang.Class r6, java.util.Map r7, boolean r8) {
        /*
            java.lang.Class<com.google.android.gms.internal.ads.zzfxi> r0 = com.google.android.gms.internal.ads.zzfxi.class
            monitor-enter(r0)
            java.util.concurrent.ConcurrentMap r1 = com.google.android.gms.internal.ads.zzfxi.zzb     // Catch: java.lang.Throwable -> Lf5
            java.lang.Object r2 = r1.get(r5)     // Catch: java.lang.Throwable -> Lf5
            com.google.android.gms.internal.ads.zzfxh r2 = (com.google.android.gms.internal.ads.zzfxh) r2     // Catch: java.lang.Throwable -> Lf5
            if (r2 == 0) goto L4d
            java.lang.Class r3 = r2.zzc()     // Catch: java.lang.Throwable -> Lf5
            boolean r3 = r3.equals(r6)     // Catch: java.lang.Throwable -> Lf5
            if (r3 == 0) goto L18
            goto L4d
        L18:
            java.util.logging.Logger r7 = com.google.android.gms.internal.ads.zzfxi.zza     // Catch: java.lang.Throwable -> Lf5
            java.util.logging.Level r8 = java.util.logging.Level.WARNING     // Catch: java.lang.Throwable -> Lf5
            java.lang.String r1 = "com.google.crypto.tink.Registry"
            java.lang.String r3 = "ensureKeyManagerInsertable"
            java.lang.String r4 = "Attempted overwrite of a registered key manager for key type "
            java.lang.String r4 = r4.concat(r5)     // Catch: java.lang.Throwable -> Lf5
            r7.logp(r8, r1, r3, r4)     // Catch: java.lang.Throwable -> Lf5
            java.security.GeneralSecurityException r7 = new java.security.GeneralSecurityException     // Catch: java.lang.Throwable -> Lf5
            r8 = 3
            java.lang.Object[] r8 = new java.lang.Object[r8]     // Catch: java.lang.Throwable -> Lf5
            r1 = 0
            r8[r1] = r5     // Catch: java.lang.Throwable -> Lf5
            r5 = 1
            java.lang.Class r1 = r2.zzc()     // Catch: java.lang.Throwable -> Lf5
            java.lang.String r1 = r1.getName()     // Catch: java.lang.Throwable -> Lf5
            r8[r5] = r1     // Catch: java.lang.Throwable -> Lf5
            r5 = 2
            java.lang.String r6 = r6.getName()     // Catch: java.lang.Throwable -> Lf5
            r8[r5] = r6     // Catch: java.lang.Throwable -> Lf5
            java.lang.String r5 = "typeUrl (%s) is already registered with %s, cannot be re-registered with %s"
            java.lang.String r5 = java.lang.String.format(r5, r8)     // Catch: java.lang.Throwable -> Lf5
            r7.<init>(r5)     // Catch: java.lang.Throwable -> Lf5
            throw r7     // Catch: java.lang.Throwable -> Lf5
        L4d:
            if (r8 == 0) goto Lf3
            java.util.concurrent.ConcurrentMap r6 = com.google.android.gms.internal.ads.zzfxi.zzd     // Catch: java.lang.Throwable -> Lf5
            boolean r8 = r6.containsKey(r5)     // Catch: java.lang.Throwable -> Lf5
            if (r8 == 0) goto L70
            java.lang.Object r6 = r6.get(r5)     // Catch: java.lang.Throwable -> Lf5
            java.lang.Boolean r6 = (java.lang.Boolean) r6     // Catch: java.lang.Throwable -> Lf5
            boolean r6 = r6.booleanValue()     // Catch: java.lang.Throwable -> Lf5
            if (r6 == 0) goto L64
            goto L70
        L64:
            java.security.GeneralSecurityException r6 = new java.security.GeneralSecurityException     // Catch: java.lang.Throwable -> Lf5
            java.lang.String r7 = "New keys are already disallowed for key type "
            java.lang.String r5 = r7.concat(r5)     // Catch: java.lang.Throwable -> Lf5
            r6.<init>(r5)     // Catch: java.lang.Throwable -> Lf5
            throw r6     // Catch: java.lang.Throwable -> Lf5
        L70:
            boolean r6 = r1.containsKey(r5)     // Catch: java.lang.Throwable -> Lf5
            if (r6 == 0) goto Lbc
            java.util.Set r6 = r7.entrySet()     // Catch: java.lang.Throwable -> Lf5
            java.util.Iterator r6 = r6.iterator()     // Catch: java.lang.Throwable -> Lf5
        L7e:
            boolean r7 = r6.hasNext()     // Catch: java.lang.Throwable -> Lf5
            if (r7 == 0) goto Lf3
            java.lang.Object r7 = r6.next()     // Catch: java.lang.Throwable -> Lf5
            java.util.Map$Entry r7 = (java.util.Map.Entry) r7     // Catch: java.lang.Throwable -> Lf5
            java.util.concurrent.ConcurrentMap r8 = com.google.android.gms.internal.ads.zzfxi.zzg     // Catch: java.lang.Throwable -> Lf5
            java.lang.Object r1 = r7.getKey()     // Catch: java.lang.Throwable -> Lf5
            boolean r8 = r8.containsKey(r1)     // Catch: java.lang.Throwable -> Lf5
            if (r8 == 0) goto L97
            goto L7e
        L97:
            java.security.GeneralSecurityException r6 = new java.security.GeneralSecurityException     // Catch: java.lang.Throwable -> Lf5
            java.lang.Object r7 = r7.getKey()     // Catch: java.lang.Throwable -> Lf5
            java.lang.String r7 = (java.lang.String) r7     // Catch: java.lang.Throwable -> Lf5
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lf5
            r8.<init>()     // Catch: java.lang.Throwable -> Lf5
            java.lang.String r1 = "Attempted to register a new key template "
            r8.append(r1)     // Catch: java.lang.Throwable -> Lf5
            r8.append(r7)     // Catch: java.lang.Throwable -> Lf5
            java.lang.String r7 = " from an existing key manager of type "
            r8.append(r7)     // Catch: java.lang.Throwable -> Lf5
            r8.append(r5)     // Catch: java.lang.Throwable -> Lf5
            java.lang.String r5 = r8.toString()     // Catch: java.lang.Throwable -> Lf5
            r6.<init>(r5)     // Catch: java.lang.Throwable -> Lf5
            throw r6     // Catch: java.lang.Throwable -> Lf5
        Lbc:
            java.util.Set r5 = r7.entrySet()     // Catch: java.lang.Throwable -> Lf5
            java.util.Iterator r5 = r5.iterator()     // Catch: java.lang.Throwable -> Lf5
        Lc4:
            boolean r6 = r5.hasNext()     // Catch: java.lang.Throwable -> Lf5
            if (r6 == 0) goto Lf3
            java.lang.Object r6 = r5.next()     // Catch: java.lang.Throwable -> Lf5
            java.util.Map$Entry r6 = (java.util.Map.Entry) r6     // Catch: java.lang.Throwable -> Lf5
            java.util.concurrent.ConcurrentMap r7 = com.google.android.gms.internal.ads.zzfxi.zzg     // Catch: java.lang.Throwable -> Lf5
            java.lang.Object r8 = r6.getKey()     // Catch: java.lang.Throwable -> Lf5
            boolean r7 = r7.containsKey(r8)     // Catch: java.lang.Throwable -> Lf5
            if (r7 != 0) goto Ldd
            goto Lc4
        Ldd:
            java.security.GeneralSecurityException r5 = new java.security.GeneralSecurityException     // Catch: java.lang.Throwable -> Lf5
            java.lang.String r7 = "Attempted overwrite of a registered key template "
            java.lang.Object r6 = r6.getKey()     // Catch: java.lang.Throwable -> Lf5
            java.lang.String r6 = (java.lang.String) r6     // Catch: java.lang.Throwable -> Lf5
            java.lang.String r6 = java.lang.String.valueOf(r6)     // Catch: java.lang.Throwable -> Lf5
            java.lang.String r6 = r7.concat(r6)     // Catch: java.lang.Throwable -> Lf5
            r5.<init>(r6)     // Catch: java.lang.Throwable -> Lf5
            throw r5     // Catch: java.lang.Throwable -> Lf5
        Lf3:
            monitor-exit(r0)
            return
        Lf5:
            r5 = move-exception
            monitor-exit(r0)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzfxi.zzr(java.lang.String, java.lang.Class, java.util.Map, boolean):void");
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [com.google.android.gms.internal.ads.zzgly, java.lang.Object] */
    private static void zzs(String str, Map map) {
        for (Map.Entry entry : map.entrySet()) {
            zzg.put((String) entry.getKey(), zzfwp.zze(str, ((zzgao) entry.getValue()).zza.zzau(), ((zzgao) entry.getValue()).zzb));
        }
    }
}
