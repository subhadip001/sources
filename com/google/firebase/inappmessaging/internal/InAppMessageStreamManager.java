package com.google.firebase.inappmessaging.internal;

import android.text.TextUtils;
import com.google.android.gms.tasks.Task;
import com.google.firebase.inappmessaging.CommonTypesProto;
import com.google.firebase.inappmessaging.MessagesProto;
import com.google.firebase.inappmessaging.internal.AnalyticsEventsManager;
import com.google.firebase.inappmessaging.internal.InAppMessageStreamManager;
import com.google.firebase.inappmessaging.internal.InstallationIdResult;
import com.google.firebase.inappmessaging.internal.Logging;
import com.google.firebase.inappmessaging.internal.TestDeviceHelper;
import com.google.firebase.inappmessaging.internal.injection.qualifiers.AppForeground;
import com.google.firebase.inappmessaging.internal.injection.qualifiers.ProgrammaticTrigger;
import com.google.firebase.inappmessaging.internal.injection.scopes.FirebaseAppScope;
import com.google.firebase.inappmessaging.internal.time.Clock;
import com.google.firebase.inappmessaging.model.InAppMessage;
import com.google.firebase.inappmessaging.model.MessageType;
import com.google.firebase.inappmessaging.model.ProtoMarshallerClient;
import com.google.firebase.inappmessaging.model.RateLimit;
import com.google.firebase.inappmessaging.model.TriggeredInAppMessage;
import com.google.firebase.installations.FirebaseInstallationsApi;
import com.google.firebase.installations.InstallationTokenResult;
import com.google.internal.firebase.inappmessaging.v1.CampaignProto$ThickContent;
import f.h.e.n.e.b1;
import f.h.e.n.e.d1;
import f.h.e.n.e.g2;
import f.h.e.n.e.j1;
import f.h.e.n.e.r0;
import f.h.g.a.a.a.d.e;
import g.c.h;
import g.c.p;
import g.c.u.a;
import g.c.v.c;
import g.c.w.b.a;
import g.c.w.e.a.g;
import g.c.w.e.b.k;
import g.c.w.e.b.o;
import g.c.w.e.b.t;
import g.c.w.e.c.f;
import g.c.w.e.c.m;
import g.c.w.e.c.u;
import g.c.w.e.c.w;
import g.c.w.e.e.b;
import g.c.w.e.e.d;
import io.reactivex.internal.util.ArrayListSupplier;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.Objects;

@FirebaseAppScope
/* loaded from: classes2.dex */
public class InAppMessageStreamManager {
    public static final String ON_FOREGROUND = "ON_FOREGROUND";
    private final AbtIntegrationHelper abtIntegrationHelper;
    private final AnalyticsEventsManager analyticsEventsManager;
    private final ApiClient apiClient;
    private final a<String> appForegroundEventFlowable;
    private final RateLimit appForegroundRateLimit;
    private final CampaignCacheClient campaignCacheClient;
    private final Clock clock;
    private final DataCollectionHelper dataCollectionHelper;
    private final FirebaseInstallationsApi firebaseInstallations;
    private final ImpressionStorageClient impressionStorageClient;
    private final a<String> programmaticTriggerEventFlowable;
    private final RateLimiterClient rateLimiterClient;
    private final Schedulers schedulers;
    private final TestDeviceHelper testDeviceHelper;

    /* renamed from: com.google.firebase.inappmessaging.internal.InAppMessageStreamManager$1 */
    /* loaded from: classes2.dex */
    public static /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] $SwitchMap$com$google$firebase$inappmessaging$MessagesProto$Content$MessageDetailsCase;

        static {
            MessagesProto.Content.MessageDetailsCase.values();
            int[] iArr = new int[5];
            $SwitchMap$com$google$firebase$inappmessaging$MessagesProto$Content$MessageDetailsCase = iArr;
            try {
                MessagesProto.Content.MessageDetailsCase messageDetailsCase = MessagesProto.Content.MessageDetailsCase.BANNER;
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                int[] iArr2 = $SwitchMap$com$google$firebase$inappmessaging$MessagesProto$Content$MessageDetailsCase;
                MessagesProto.Content.MessageDetailsCase messageDetailsCase2 = MessagesProto.Content.MessageDetailsCase.IMAGE_ONLY;
                iArr2[2] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                int[] iArr3 = $SwitchMap$com$google$firebase$inappmessaging$MessagesProto$Content$MessageDetailsCase;
                MessagesProto.Content.MessageDetailsCase messageDetailsCase3 = MessagesProto.Content.MessageDetailsCase.MODAL;
                iArr3[1] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                int[] iArr4 = $SwitchMap$com$google$firebase$inappmessaging$MessagesProto$Content$MessageDetailsCase;
                MessagesProto.Content.MessageDetailsCase messageDetailsCase4 = MessagesProto.Content.MessageDetailsCase.CARD;
                iArr4[3] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public InAppMessageStreamManager(@AppForeground a<String> aVar, @ProgrammaticTrigger a<String> aVar2, CampaignCacheClient campaignCacheClient, Clock clock, ApiClient apiClient, AnalyticsEventsManager analyticsEventsManager, Schedulers schedulers, ImpressionStorageClient impressionStorageClient, RateLimiterClient rateLimiterClient, @AppForeground RateLimit rateLimit, TestDeviceHelper testDeviceHelper, FirebaseInstallationsApi firebaseInstallationsApi, DataCollectionHelper dataCollectionHelper, AbtIntegrationHelper abtIntegrationHelper) {
        this.appForegroundEventFlowable = aVar;
        this.programmaticTriggerEventFlowable = aVar2;
        this.campaignCacheClient = campaignCacheClient;
        this.clock = clock;
        this.apiClient = apiClient;
        this.analyticsEventsManager = analyticsEventsManager;
        this.schedulers = schedulers;
        this.impressionStorageClient = impressionStorageClient;
        this.rateLimiterClient = rateLimiterClient;
        this.appForegroundRateLimit = rateLimit;
        this.testDeviceHelper = testDeviceHelper;
        this.dataCollectionHelper = dataCollectionHelper;
        this.firebaseInstallations = firebaseInstallationsApi;
        this.abtIntegrationHelper = abtIntegrationHelper;
    }

    public static /* synthetic */ boolean a(InstallationIdResult installationIdResult) {
        return validIID(installationIdResult);
    }

    public static /* synthetic */ int b(CampaignProto$ThickContent campaignProto$ThickContent, CampaignProto$ThickContent campaignProto$ThickContent2) {
        return compareByPriority(campaignProto$ThickContent, campaignProto$ThickContent2);
    }

    public static e cacheExpiringResponse() {
        e.b f2 = e.f();
        f2.copyOnWrite();
        e.b((e) f2.instance, 1L);
        return f2.build();
    }

    public static int compareByPriority(CampaignProto$ThickContent campaignProto$ThickContent, CampaignProto$ThickContent campaignProto$ThickContent2) {
        if (!campaignProto$ThickContent.d() || campaignProto$ThickContent2.d()) {
            if (!campaignProto$ThickContent2.d() || campaignProto$ThickContent.d()) {
                return Integer.compare(campaignProto$ThickContent.f().getValue(), campaignProto$ThickContent2.f().getValue());
            }
            return 1;
        }
        return -1;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x001d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean containsTriggeringCondition(java.lang.String r4, com.google.internal.firebase.inappmessaging.v1.CampaignProto$ThickContent r5) {
        /*
            boolean r0 = isAppForegroundEvent(r4)
            r1 = 1
            if (r0 == 0) goto Le
            boolean r0 = r5.d()
            if (r0 == 0) goto Le
            return r1
        Le:
            java.util.List r5 = r5.g()
            java.util.Iterator r5 = r5.iterator()
        L16:
            boolean r0 = r5.hasNext()
            r2 = 0
            if (r0 == 0) goto L3d
            java.lang.Object r0 = r5.next()
            com.google.firebase.inappmessaging.CommonTypesProto$TriggeringCondition r0 = (com.google.firebase.inappmessaging.CommonTypesProto.TriggeringCondition) r0
            boolean r3 = hasFiamTrigger(r0, r4)
            if (r3 != 0) goto L2f
            boolean r0 = hasAnalyticsTrigger(r0, r4)
            if (r0 == 0) goto L16
        L2f:
            java.lang.Object[] r5 = new java.lang.Object[r1]
            r5[r2] = r4
            java.lang.String r4 = "The event %s is contained in the list of triggers"
            java.lang.String r4 = java.lang.String.format(r4, r5)
            com.google.firebase.inappmessaging.internal.Logging.logd(r4)
            return r1
        L3d:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.inappmessaging.internal.InAppMessageStreamManager.containsTriggeringCondition(java.lang.String, com.google.internal.firebase.inappmessaging.v1.CampaignProto$ThickContent):boolean");
    }

    /* renamed from: getContentIfNotRateLimited */
    public h<CampaignProto$ThickContent> d(String str, final CampaignProto$ThickContent campaignProto$ThickContent) {
        if (!campaignProto$ThickContent.d() && isAppForegroundEvent(str)) {
            p<Boolean> isRateLimited = this.rateLimiterClient.isRateLimited(this.appForegroundRateLimit);
            d1 d1Var = new c() { // from class: f.h.e.n.e.d1
                @Override // g.c.v.c
                public final void accept(Object obj) {
                    Logging.logi("App foreground rate limited ? : " + ((Boolean) obj));
                }
            };
            Objects.requireNonNull(isRateLimited);
            b bVar = new b(isRateLimited, d1Var);
            Boolean bool = Boolean.FALSE;
            Objects.requireNonNull(bool, "value is null");
            return new f(new d(bVar, new a.g(new g.c.w.e.e.c(bool))), new g.c.v.e() { // from class: f.h.e.n.e.e1
                @Override // g.c.v.e
                public final boolean a(Object obj) {
                    return !((Boolean) obj).booleanValue();
                }
            }).j(new g.c.v.d() { // from class: f.h.e.n.e.j0
                @Override // g.c.v.d
                public final Object apply(Object obj) {
                    Boolean bool2 = (Boolean) obj;
                    return CampaignProto$ThickContent.this;
                }
            });
        }
        return new m(campaignProto$ThickContent);
    }

    /* renamed from: getTriggeredInAppMessageMaybe */
    public h<TriggeredInAppMessage> e(final String str, g.c.v.d<CampaignProto$ThickContent, h<CampaignProto$ThickContent>> dVar, g.c.v.d<CampaignProto$ThickContent, h<CampaignProto$ThickContent>> dVar2, g.c.v.d<CampaignProto$ThickContent, h<CampaignProto$ThickContent>> dVar3, e eVar) {
        List<CampaignProto$ThickContent> e2 = eVar.e();
        int i2 = g.c.d.f8128f;
        Objects.requireNonNull(e2, "source is null");
        o oVar = new o(new t(new g.c.w.e.b.h(new g.c.w.e.b.h(new g.c.w.e.b.m(e2), new g.c.v.e() { // from class: f.h.e.n.e.f0
            @Override // g.c.v.e
            public final boolean a(Object obj) {
                return InAppMessageStreamManager.this.l((CampaignProto$ThickContent) obj);
            }
        }), new g.c.v.e() { // from class: f.h.e.n.e.p0
            @Override // g.c.v.e
            public final boolean a(Object obj) {
                return InAppMessageStreamManager.m(str, (CampaignProto$ThickContent) obj);
            }
        }).b(dVar).b(dVar2).b(dVar3), ArrayListSupplier.asCallable()), new a.h(new Comparator() { // from class: f.h.e.n.e.v0
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return InAppMessageStreamManager.b((CampaignProto$ThickContent) obj, (CampaignProto$ThickContent) obj2);
            }
        }));
        g.c.v.d<Object, Object> dVar4 = g.c.w.b.a.a;
        int i3 = g.c.d.f8128f;
        g.c.w.b.b.a(i3, "bufferSize");
        return new g.c.w.e.b.f(new k(oVar, dVar4, i3), 0L).g(new g.c.v.d() { // from class: f.h.e.n.e.g1
            @Override // g.c.v.d
            public final Object apply(Object obj) {
                return InAppMessageStreamManager.this.n(str, (CampaignProto$ThickContent) obj);
            }
        });
    }

    private static boolean hasAnalyticsTrigger(CommonTypesProto.TriggeringCondition triggeringCondition, String str) {
        return triggeringCondition.getEvent().getName().equals(str);
    }

    private static boolean hasFiamTrigger(CommonTypesProto.TriggeringCondition triggeringCondition, String str) {
        return triggeringCondition.getFiamTrigger().toString().equals(str);
    }

    private static boolean isActive(Clock clock, CampaignProto$ThickContent campaignProto$ThickContent) {
        long d2;
        long b;
        if (campaignProto$ThickContent.e().equals(CampaignProto$ThickContent.PayloadCase.VANILLA_PAYLOAD)) {
            d2 = campaignProto$ThickContent.h().d();
            b = campaignProto$ThickContent.h().b();
        } else if (!campaignProto$ThickContent.e().equals(CampaignProto$ThickContent.PayloadCase.EXPERIMENTAL_PAYLOAD)) {
            return false;
        } else {
            d2 = campaignProto$ThickContent.c().d();
            b = campaignProto$ThickContent.c().b();
        }
        long now = clock.now();
        return now > d2 && now < b;
    }

    public static boolean isAppForegroundEvent(CommonTypesProto.TriggeringCondition triggeringCondition) {
        return triggeringCondition.getFiamTrigger().toString().equals(ON_FOREGROUND);
    }

    public static /* synthetic */ void k(CampaignProto$ThickContent campaignProto$ThickContent, Boolean bool) {
        logImpressionStatus(campaignProto$ThickContent, bool);
    }

    public static void logImpressionStatus(CampaignProto$ThickContent campaignProto$ThickContent, Boolean bool) {
        if (campaignProto$ThickContent.e().equals(CampaignProto$ThickContent.PayloadCase.VANILLA_PAYLOAD)) {
            Logging.logi(String.format("Already impressed campaign %s ? : %s", campaignProto$ThickContent.h().c(), bool));
        } else if (campaignProto$ThickContent.e().equals(CampaignProto$ThickContent.PayloadCase.EXPERIMENTAL_PAYLOAD)) {
            Logging.logi(String.format("Already impressed experiment %s ? : %s", campaignProto$ThickContent.c().c(), bool));
        }
    }

    public static /* synthetic */ boolean m(String str, CampaignProto$ThickContent campaignProto$ThickContent) {
        return containsTriggeringCondition(str, campaignProto$ThickContent);
    }

    private boolean shouldIgnoreCache(String str) {
        if (this.testDeviceHelper.isAppInstallFresh()) {
            return isAppForegroundEvent(str);
        }
        return this.testDeviceHelper.isDeviceInTestMode();
    }

    private static <T> h<T> taskToMaybe(Task<T> task) {
        return new g.c.w.e.c.c(new j1(task));
    }

    /* renamed from: triggeredInAppMessage */
    public h<TriggeredInAppMessage> n(CampaignProto$ThickContent campaignProto$ThickContent, String str) {
        String campaignId;
        String c;
        if (campaignProto$ThickContent.e().equals(CampaignProto$ThickContent.PayloadCase.VANILLA_PAYLOAD)) {
            campaignId = campaignProto$ThickContent.h().getCampaignId();
            c = campaignProto$ThickContent.h().c();
        } else if (campaignProto$ThickContent.e().equals(CampaignProto$ThickContent.PayloadCase.EXPERIMENTAL_PAYLOAD)) {
            campaignId = campaignProto$ThickContent.c().getCampaignId();
            c = campaignProto$ThickContent.c().c();
            if (!campaignProto$ThickContent.d()) {
                this.abtIntegrationHelper.setExperimentActive(campaignProto$ThickContent.c().f());
            }
        } else {
            return g.c.w.e.c.d.f8342f;
        }
        InAppMessage decode = ProtoMarshallerClient.decode(campaignProto$ThickContent.getContent(), campaignId, c, campaignProto$ThickContent.d(), campaignProto$ThickContent.b());
        if (decode.getMessageType().equals(MessageType.UNSUPPORTED)) {
            return g.c.w.e.c.d.f8342f;
        }
        return new m(new TriggeredInAppMessage(decode, str));
    }

    public static boolean validIID(InstallationIdResult installationIdResult) {
        return (TextUtils.isEmpty(installationIdResult.installationId()) || TextUtils.isEmpty(installationIdResult.installationTokenResult().getToken())) ? false : true;
    }

    public h c(final CampaignProto$ThickContent campaignProto$ThickContent) {
        if (campaignProto$ThickContent.d()) {
            return new m(campaignProto$ThickContent);
        }
        p<Boolean> isImpressed = this.impressionStorageClient.isImpressed(campaignProto$ThickContent);
        b1 b1Var = new c() { // from class: f.h.e.n.e.b1
            @Override // g.c.v.c
            public final void accept(Object obj) {
                StringBuilder A = f.a.b.a.a.A("Impression store read fail: ");
                A.append(((Throwable) obj).getMessage());
                Logging.logw(A.toString());
            }
        };
        Objects.requireNonNull(isImpressed);
        g.c.w.e.e.a aVar = new g.c.w.e.e.a(isImpressed, b1Var);
        Boolean bool = Boolean.FALSE;
        Objects.requireNonNull(bool, "value is null");
        return new f(new b(new d(aVar, new a.g(new g.c.w.e.e.c(bool))), new c() { // from class: f.h.e.n.e.z0
            @Override // g.c.v.c
            public final void accept(Object obj) {
                InAppMessageStreamManager.k(CampaignProto$ThickContent.this, (Boolean) obj);
            }
        }), new g.c.v.e() { // from class: f.h.e.n.e.i1
            @Override // g.c.v.e
            public final boolean a(Object obj) {
                return !((Boolean) obj).booleanValue();
            }
        }).j(new g.c.v.d() { // from class: f.h.e.n.e.h0
            @Override // g.c.v.d
            public final Object apply(Object obj) {
                Boolean bool2 = (Boolean) obj;
                return CampaignProto$ThickContent.this;
            }
        });
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0099  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public g.c.d<com.google.firebase.inappmessaging.model.TriggeredInAppMessage> createFirebaseInAppMessageStream() {
        /*
            r12 = this;
            g.c.u.a<java.lang.String> r0 = r12.appForegroundEventFlowable
            com.google.firebase.inappmessaging.internal.AnalyticsEventsManager r1 = r12.analyticsEventsManager
            g.c.u.a r1 = r1.getAnalyticsEventsFlowable()
            g.c.u.a<java.lang.String> r2 = r12.programmaticTriggerEventFlowable
            int r3 = g.c.d.f8128f
            java.lang.String r3 = "source1 is null"
            java.util.Objects.requireNonNull(r0, r3)
            java.lang.String r3 = "source2 is null"
            java.util.Objects.requireNonNull(r1, r3)
            java.lang.String r3 = "source3 is null"
            java.util.Objects.requireNonNull(r2, r3)
            r3 = 3
            m.c.a[] r4 = new m.c.a[r3]
            r5 = 0
            r4[r5] = r0
            r0 = 1
            r4[r0] = r1
            r0 = 2
            r4[r0] = r2
            g.c.w.e.b.l r7 = new g.c.w.e.b.l
            r7.<init>(r4)
            g.c.v.d<java.lang.Object, java.lang.Object> r8 = g.c.w.b.a.a
            int r1 = g.c.d.f8128f
            java.lang.String r2 = "maxConcurrency"
            g.c.w.b.b.a(r3, r2)
            java.lang.String r2 = "bufferSize"
            g.c.w.b.b.a(r1, r2)
            boolean r3 = r7 instanceof g.c.w.c.h
            if (r3 == 0) goto L50
            g.c.w.c.h r7 = (g.c.w.c.h) r7
            java.lang.Object r3 = r7.call()
            if (r3 != 0) goto L49
            g.c.d<java.lang.Object> r3 = g.c.w.e.b.g.f8228g
            goto L59
        L49:
            g.c.w.e.b.s r4 = new g.c.w.e.b.s
            r4.<init>(r3, r8)
            r7 = r4
            goto L5a
        L50:
            g.c.w.e.b.i r3 = new g.c.w.e.b.i
            r10 = 3
            r9 = 0
            r6 = r3
            r11 = r1
            r6.<init>(r7, r8, r9, r10, r11)
        L59:
            r7 = r3
        L5a:
            f.h.e.n.e.n0 r8 = new g.c.v.c() { // from class: f.h.e.n.e.n0
                static {
                    /*
                        f.h.e.n.e.n0 r0 = new f.h.e.n.e.n0
                        r0.<init>()
                        
                        // error: 0x0005: SPUT  (r0 I:f.h.e.n.e.n0) f.h.e.n.e.n0.f f.h.e.n.e.n0
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: f.h.e.n.e.n0.<clinit>():void");
                }

                {
                    /*
                        r0 = this;
                        r0.<init>()
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: f.h.e.n.e.n0.<init>():void");
                }

                @Override // g.c.v.c
                public final void accept(java.lang.Object r3) {
                    /*
                        r2 = this;
                        java.lang.String r3 = (java.lang.String) r3
                        java.lang.StringBuilder r0 = new java.lang.StringBuilder
                        r0.<init>()
                        java.lang.String r1 = "Event Triggered: "
                        r0.append(r1)
                        r0.append(r3)
                        java.lang.String r3 = r0.toString()
                        com.google.firebase.inappmessaging.internal.Logging.logd(r3)
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: f.h.e.n.e.n0.accept(java.lang.Object):void");
                }
            }
            g.c.v.c<java.lang.Object> r9 = g.c.w.b.a.f8141d
            g.c.v.a r11 = g.c.w.b.a.c
            g.c.w.e.b.d r3 = new g.c.w.e.b.d
            r6 = r3
            r10 = r11
            r6.<init>(r7, r8, r9, r10, r11)
            com.google.firebase.inappmessaging.internal.Schedulers r4 = r12.schedulers
            g.c.o r4 = r4.io()
            java.lang.String r6 = "scheduler is null"
            java.util.Objects.requireNonNull(r4, r6)
            g.c.w.b.b.a(r1, r2)
            g.c.w.e.b.p r7 = new g.c.w.e.b.p
            r7.<init>(r3, r4, r5, r1)
            f.h.e.n.e.t0 r3 = new f.h.e.n.e.t0
            r3.<init>()
            java.lang.String r4 = "prefetch"
            g.c.w.b.b.a(r0, r4)
            boolean r4 = r7 instanceof g.c.w.c.h
            if (r4 == 0) goto L99
            g.c.w.c.h r7 = (g.c.w.c.h) r7
            java.lang.Object r0 = r7.call()
            if (r0 != 0) goto L93
            g.c.d<java.lang.Object> r0 = g.c.w.e.b.g.f8228g
            goto La1
        L93:
            g.c.w.e.b.s r4 = new g.c.w.e.b.s
            r4.<init>(r0, r3)
            goto La0
        L99:
            g.c.w.e.b.b r4 = new g.c.w.e.b.b
            io.reactivex.internal.util.ErrorMode r8 = io.reactivex.internal.util.ErrorMode.IMMEDIATE
            r4.<init>(r7, r3, r0, r8)
        La0:
            r0 = r4
        La1:
            com.google.firebase.inappmessaging.internal.Schedulers r3 = r12.schedulers
            g.c.o r3 = r3.mainThread()
            java.util.Objects.requireNonNull(r3, r6)
            g.c.w.b.b.a(r1, r2)
            g.c.w.e.b.p r2 = new g.c.w.e.b.p
            r2.<init>(r0, r3, r5, r1)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.inappmessaging.internal.InAppMessageStreamManager.createFirebaseInAppMessageStream():g.c.d");
    }

    public /* synthetic */ e f(f.h.g.a.a.a.d.b bVar, InstallationIdResult installationIdResult) {
        return this.apiClient.getFiams(installationIdResult, bVar);
    }

    public void g(e eVar) {
        g.c.a clearImpressions = this.impressionStorageClient.clearImpressions(eVar);
        Objects.requireNonNull(clearImpressions);
        clearImpressions.b(new g.c.w.d.e());
    }

    public /* synthetic */ h h(h hVar, final f.h.g.a.a.a.d.b bVar) {
        if (!this.dataCollectionHelper.isAutomaticDataCollectionEnabled()) {
            Logging.logi("Automatic data collection is disabled, not attempting campaign fetch from service.");
            return h.i(cacheExpiringResponse());
        }
        h e2 = hVar.f(new g.c.v.e() { // from class: f.h.e.n.e.i0
            @Override // g.c.v.e
            public final boolean a(Object obj) {
                return InAppMessageStreamManager.a((InstallationIdResult) obj);
            }
        }).j(new g.c.v.d() { // from class: f.h.e.n.e.x0
            @Override // g.c.v.d
            public final Object apply(Object obj) {
                return InAppMessageStreamManager.this.f(bVar, (InstallationIdResult) obj);
            }
        }).m(h.i(cacheExpiringResponse())).e(new c() { // from class: f.h.e.n.e.l0
            @Override // g.c.v.c
            public final void accept(Object obj) {
                Logging.logi(String.format(Locale.US, "Successfully fetched %d messages from backend", Integer.valueOf(((f.h.g.a.a.a.d.e) obj).e().size())));
            }
        }).e(new c() { // from class: f.h.e.n.e.k0
            @Override // g.c.v.c
            public final void accept(Object obj) {
                InAppMessageStreamManager.this.g((f.h.g.a.a.a.d.e) obj);
            }
        });
        final AnalyticsEventsManager analyticsEventsManager = this.analyticsEventsManager;
        Objects.requireNonNull(analyticsEventsManager);
        h e3 = e2.e(new c() { // from class: f.h.e.n.e.i2
            @Override // g.c.v.c
            public final void accept(Object obj) {
                AnalyticsEventsManager.this.updateContextualTriggers((f.h.g.a.a.a.d.e) obj);
            }
        });
        final TestDeviceHelper testDeviceHelper = this.testDeviceHelper;
        Objects.requireNonNull(testDeviceHelper);
        return e3.e(new c() { // from class: f.h.e.n.e.m1
            @Override // g.c.v.c
            public final void accept(Object obj) {
                TestDeviceHelper.this.processCampaignFetch((f.h.g.a.a.a.d.e) obj);
            }
        }).d(new c() { // from class: f.h.e.n.e.c1
            @Override // g.c.v.c
            public final void accept(Object obj) {
                StringBuilder A = f.a.b.a.a.A("Service fetch error: ");
                A.append(((Throwable) obj).getMessage());
                Logging.logw(A.toString());
            }
        }).k(g.c.w.e.c.d.f8342f);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public m.c.a i(final String str) {
        u uVar;
        h<e> k2 = this.campaignCacheClient.get().e(new c() { // from class: f.h.e.n.e.w0
            @Override // g.c.v.c
            public final void accept(Object obj) {
                f.h.g.a.a.a.d.e eVar = (f.h.g.a.a.a.d.e) obj;
                Logging.logd("Fetched from cache");
            }
        }).d(new c() { // from class: f.h.e.n.e.o0
            @Override // g.c.v.c
            public final void accept(Object obj) {
                StringBuilder A = f.a.b.a.a.A("Cache read error: ");
                A.append(((Throwable) obj).getMessage());
                Logging.logw(A.toString());
            }
        }).k(g.c.w.e.c.d.f8342f);
        c cVar = new c() { // from class: f.h.e.n.e.q0
            @Override // g.c.v.c
            public final void accept(Object obj) {
                InAppMessageStreamManager.this.j((f.h.g.a.a.a.d.e) obj);
            }
        };
        final g.c.v.d dVar = new g.c.v.d() { // from class: f.h.e.n.e.f1
            @Override // g.c.v.d
            public final Object apply(Object obj) {
                return InAppMessageStreamManager.this.c((CampaignProto$ThickContent) obj);
            }
        };
        final g.c.v.d dVar2 = new g.c.v.d() { // from class: f.h.e.n.e.g0
            @Override // g.c.v.d
            public final Object apply(Object obj) {
                return InAppMessageStreamManager.this.d(str, (CampaignProto$ThickContent) obj);
            }
        };
        final r0 r0Var = new g.c.v.d() { // from class: f.h.e.n.e.r0
            @Override // g.c.v.d
            public final Object apply(Object obj) {
                CampaignProto$ThickContent campaignProto$ThickContent = (CampaignProto$ThickContent) obj;
                int ordinal = campaignProto$ThickContent.getContent().getMessageDetailsCase().ordinal();
                if (ordinal != 0 && ordinal != 1 && ordinal != 2 && ordinal != 3) {
                    Logging.logd("Filtering non-displayable message");
                    return g.c.w.e.c.d.f8342f;
                }
                return new g.c.w.e.c.m(campaignProto$ThickContent);
            }
        };
        g.c.v.d<? super e, ? extends g.c.k<? extends R>> dVar3 = new g.c.v.d() { // from class: f.h.e.n.e.m0
            @Override // g.c.v.d
            public final Object apply(Object obj) {
                return InAppMessageStreamManager.this.e(str, dVar, dVar2, r0Var, (f.h.g.a.a.a.d.e) obj);
            }
        };
        h<f.h.g.a.a.a.d.b> k3 = this.impressionStorageClient.getAllImpressions().d(new c() { // from class: f.h.e.n.e.u0
            @Override // g.c.v.c
            public final void accept(Object obj) {
                StringBuilder A = f.a.b.a.a.A("Impressions store read fail: ");
                A.append(((Throwable) obj).getMessage());
                Logging.logw(A.toString());
            }
        }).c(f.h.g.a.a.a.d.b.d()).k(h.i(f.h.g.a.a.a.d.b.d()));
        h taskToMaybe = taskToMaybe(this.firebaseInstallations.getId());
        h taskToMaybe2 = taskToMaybe(this.firebaseInstallations.getToken(false));
        g2 g2Var = new g.c.v.b() { // from class: f.h.e.n.e.g2
            @Override // g.c.v.b
            public final Object apply(Object obj, Object obj2) {
                return InstallationIdResult.create((String) obj, (InstallationTokenResult) obj2);
            }
        };
        Objects.requireNonNull(taskToMaybe, "source1 is null");
        Objects.requireNonNull(taskToMaybe2, "source2 is null");
        w wVar = new w(new g.c.k[]{taskToMaybe, taskToMaybe2}, new a.C0206a(g2Var));
        g.c.o io2 = this.schedulers.io();
        Objects.requireNonNull(io2, "scheduler is null");
        final g.c.w.e.c.o oVar = new g.c.w.e.c.o(wVar, io2);
        g.c.v.d<? super f.h.g.a.a.a.d.b, ? extends g.c.k<? extends R>> dVar4 = new g.c.v.d() { // from class: f.h.e.n.e.s0
            @Override // g.c.v.d
            public final Object apply(Object obj) {
                return InAppMessageStreamManager.this.h(oVar, (f.h.g.a.a.a.d.b) obj);
            }
        };
        if (shouldIgnoreCache(str)) {
            Logging.logi(String.format("Forcing fetch from service rather than cache. Test Device: %s | App Fresh Install: %s", Boolean.valueOf(this.testDeviceHelper.isDeviceInTestMode()), Boolean.valueOf(this.testDeviceHelper.isAppInstallFresh())));
            h g2 = k3.g(dVar4).g(dVar3);
            if (g2 instanceof g.c.w.c.b) {
                return ((g.c.w.c.b) g2).b();
            }
            uVar = new u(g2);
        } else {
            Logging.logd("Attempting to fetch campaigns using cache");
            g.c.k g3 = k2.m(k3.g(dVar4).e(cVar)).g(dVar3);
            if (g3 instanceof g.c.w.c.b) {
                return ((g.c.w.c.b) g3).b();
            }
            uVar = new u(g3);
        }
        return uVar;
    }

    public void j(e eVar) {
        new g(this.campaignCacheClient.put(eVar).d(new g.c.v.a() { // from class: f.h.e.n.e.h1
            @Override // g.c.v.a
            public final void run() {
                Logging.logd("Wrote to cache");
            }
        }).e(new c() { // from class: f.h.e.n.e.a1
            @Override // g.c.v.c
            public final void accept(Object obj) {
                StringBuilder A = f.a.b.a.a.A("Cache write error: ");
                A.append(((Throwable) obj).getMessage());
                Logging.logw(A.toString());
            }
        }), new g.c.v.d() { // from class: f.h.e.n.e.k1
            @Override // g.c.v.d
            public final Object apply(Object obj) {
                Throwable th = (Throwable) obj;
                return g.c.w.e.a.b.a;
            }
        }).g();
    }

    public /* synthetic */ boolean l(CampaignProto$ThickContent campaignProto$ThickContent) {
        return this.testDeviceHelper.isDeviceInTestMode() || isActive(this.clock, campaignProto$ThickContent);
    }

    public static boolean isAppForegroundEvent(String str) {
        return str.equals(ON_FOREGROUND);
    }
}
