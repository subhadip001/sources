package com.google.android.gms.measurement.internal;

import android.content.Context;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.measurement.zznh;
import com.google.android.gms.internal.measurement.zznk;
import com.google.android.gms.internal.measurement.zznn;
import com.google.android.gms.internal.measurement.zznq;
import com.google.android.gms.internal.measurement.zznt;
import com.google.android.gms.internal.measurement.zznw;
import com.google.android.gms.internal.measurement.zznz;
import com.google.android.gms.internal.measurement.zzoc;
import com.google.android.gms.internal.measurement.zzof;
import com.google.android.gms.internal.measurement.zzoi;
import com.google.android.gms.internal.measurement.zzol;
import com.google.android.gms.internal.measurement.zzoo;
import com.google.android.gms.internal.measurement.zzor;
import com.google.android.gms.internal.measurement.zzou;
import com.google.android.gms.internal.measurement.zzox;
import com.google.android.gms.internal.measurement.zzpa;
import com.google.android.gms.internal.measurement.zzpd;
import com.google.android.gms.internal.measurement.zzpg;
import com.google.android.gms.internal.measurement.zzpj;
import com.google.android.gms.internal.measurement.zzpm;
import com.google.android.gms.internal.measurement.zzpp;
import com.google.firebase.crashlytics.internal.metadata.LogFileManager;
import com.google.firebase.inappmessaging.display.FirebaseInAppMessagingDisplay;
import com.google.logging.type.LogSeverity;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
@VisibleForTesting
/* loaded from: classes.dex */
public final class zzdu {
    public static final zzdt zzA;
    public static final zzdt zzB;
    public static final zzdt zzC;
    public static final zzdt zzD;
    public static final zzdt zzE;
    public static final zzdt zzF;
    public static final zzdt zzG;
    public static final zzdt zzH;
    public static final zzdt zzI;
    public static final zzdt zzJ;
    public static final zzdt zzK;
    public static final zzdt zzL;
    public static final zzdt zzM;
    public static final zzdt zzN;
    public static final zzdt zzO;
    public static final zzdt zzP;
    public static final zzdt zzQ;
    public static final zzdt zzR;
    public static final zzdt zzS;
    public static final zzdt zzT;
    public static final zzdt zzU;
    public static final zzdt zzV;
    public static final zzdt zzW;
    public static final zzdt zzX;
    public static final zzdt zzY;
    public static final zzdt zzZ;
    public static final zzdt zzaa;
    public static final zzdt zzab;
    public static final zzdt zzac;
    public static final zzdt zzad;
    public static final zzdt zzae;
    public static final zzdt zzaf;
    public static final zzdt zzag;
    public static final zzdt zzah;
    public static final zzdt zzai;
    public static final zzdt zzaj;
    public static final zzdt zzak;
    public static final zzdt zzal;
    public static final zzdt zzam;
    public static final zzdt zzan;
    public static final zzdt zzao;
    public static final zzdt zzap;
    public static final zzdt zzaq;
    public static final zzdt zzar;
    public static final zzdt zzas;
    public static final zzdt zzat;
    public static final zzdt zzau;
    public static final zzdt zzg;
    public static final zzdt zzh;
    public static final zzdt zzi;
    public static final zzdt zzj;
    public static final zzdt zzk;
    public static final zzdt zzl;
    public static final zzdt zzm;
    public static final zzdt zzn;
    public static final zzdt zzo;
    public static final zzdt zzp;
    public static final zzdt zzq;
    public static final zzdt zzr;
    public static final zzdt zzs;
    public static final zzdt zzt;
    public static final zzdt zzu;
    public static final zzdt zzv;
    public static final zzdt zzw;
    public static final zzdt zzx;
    public static final zzdt zzy;
    public static final zzdt zzz;
    private static final List zzav = Collections.synchronizedList(new ArrayList());
    private static final Set zzaw = Collections.synchronizedSet(new HashSet());
    public static final zzdt zza = zza("measurement.ad_id_cache_time", 10000L, 10000L, new zzdq() { // from class: com.google.android.gms.measurement.internal.zzbj
        @Override // com.google.android.gms.measurement.internal.zzdq
        public final Object zza() {
            zzdt zzdtVar = zzdu.zza;
            return Long.valueOf(zznn.zzb());
        }
    });
    public static final zzdt zzb = zza("measurement.monitoring.sample_period_millis", 86400000L, 86400000L, new zzdq() { // from class: com.google.android.gms.measurement.internal.zzbb
        @Override // com.google.android.gms.measurement.internal.zzdq
        public final Object zza() {
            zzdt zzdtVar = zzdu.zza;
            return Long.valueOf(zznn.zzl());
        }
    });
    public static final zzdt zzc = zza("measurement.config.cache_time", 86400000L, 3600000L, new zzdq() { // from class: com.google.android.gms.measurement.internal.zzbn
        @Override // com.google.android.gms.measurement.internal.zzdq
        public final Object zza() {
            zzdt zzdtVar = zzdu.zza;
            return Long.valueOf(zznn.zzd());
        }
    });
    public static final zzdt zzd = zza("measurement.config.url_scheme", "https", "https", new zzdq() { // from class: com.google.android.gms.measurement.internal.zzbz
        @Override // com.google.android.gms.measurement.internal.zzdq
        public final Object zza() {
            zzdt zzdtVar = zzdu.zza;
            return zznn.zzK();
        }
    });
    public static final zzdt zze = zza("measurement.config.url_authority", "app-measurement.com", "app-measurement.com", new zzdq() { // from class: com.google.android.gms.measurement.internal.zzcl
        @Override // com.google.android.gms.measurement.internal.zzdq
        public final Object zza() {
            zzdt zzdtVar = zzdu.zza;
            return zznn.zzJ();
        }
    });
    public static final zzdt zzf = zza("measurement.upload.max_bundles", 100, 100, new zzdq() { // from class: com.google.android.gms.measurement.internal.zzcx
        @Override // com.google.android.gms.measurement.internal.zzdq
        public final Object zza() {
            zzdt zzdtVar = zzdu.zza;
            return Integer.valueOf((int) zznn.zzw());
        }
    });

    static {
        Integer valueOf = Integer.valueOf((int) LogFileManager.MAX_LOG_SIZE);
        zzg = zza("measurement.upload.max_batch_size", valueOf, valueOf, new zzdq() { // from class: com.google.android.gms.measurement.internal.zzdi
            @Override // com.google.android.gms.measurement.internal.zzdq
            public final Object zza() {
                zzdt zzdtVar = zzdu.zza;
                return Integer.valueOf((int) zznn.zzE());
            }
        });
        zzh = zza("measurement.upload.max_bundle_size", valueOf, valueOf, new zzdq() { // from class: com.google.android.gms.measurement.internal.zzdj
            @Override // com.google.android.gms.measurement.internal.zzdq
            public final Object zza() {
                zzdt zzdtVar = zzdu.zza;
                return Integer.valueOf((int) zznn.zzv());
            }
        });
        zzi = zza("measurement.upload.max_events_per_bundle", 1000, 1000, new zzdq() { // from class: com.google.android.gms.measurement.internal.zzdk
            @Override // com.google.android.gms.measurement.internal.zzdq
            public final Object zza() {
                zzdt zzdtVar = zzdu.zza;
                return Integer.valueOf((int) zznn.zzz());
            }
        });
        zzj = zza("measurement.upload.max_events_per_day", 100000, 100000, new zzdq() { // from class: com.google.android.gms.measurement.internal.zzdl
            @Override // com.google.android.gms.measurement.internal.zzdq
            public final Object zza() {
                zzdt zzdtVar = zzdu.zza;
                return Integer.valueOf((int) zznn.zzA());
            }
        });
        zzk = zza("measurement.upload.max_error_events_per_day", 1000, 1000, new zzdq() { // from class: com.google.android.gms.measurement.internal.zzbu
            @Override // com.google.android.gms.measurement.internal.zzdq
            public final Object zza() {
                zzdt zzdtVar = zzdu.zza;
                return Integer.valueOf((int) zznn.zzy());
            }
        });
        zzl = zza("measurement.upload.max_public_events_per_day", 50000, 50000, new zzdq() { // from class: com.google.android.gms.measurement.internal.zzcf
            @Override // com.google.android.gms.measurement.internal.zzdq
            public final Object zza() {
                zzdt zzdtVar = zzdu.zza;
                return Integer.valueOf((int) zznn.zzB());
            }
        });
        zzm = zza("measurement.upload.max_conversions_per_day", 10000, 10000, new zzdq() { // from class: com.google.android.gms.measurement.internal.zzcq
            @Override // com.google.android.gms.measurement.internal.zzdq
            public final Object zza() {
                zzdt zzdtVar = zzdu.zza;
                return Integer.valueOf((int) zznn.zzx());
            }
        });
        zzn = zza("measurement.upload.max_realtime_events_per_day", 10, 10, new zzdq() { // from class: com.google.android.gms.measurement.internal.zzdb
            @Override // com.google.android.gms.measurement.internal.zzdq
            public final Object zza() {
                zzdt zzdtVar = zzdu.zza;
                return Integer.valueOf((int) zznn.zzD());
            }
        });
        zzo = zza("measurement.store.max_stored_events_per_app", 100000, 100000, new zzdq() { // from class: com.google.android.gms.measurement.internal.zzdm
            @Override // com.google.android.gms.measurement.internal.zzdq
            public final Object zza() {
                zzdt zzdtVar = zzdu.zza;
                return Integer.valueOf((int) zznn.zzg());
            }
        });
        zzp = zza("measurement.upload.url", "https://app-measurement.com/a", "https://app-measurement.com/a", new zzdq() { // from class: com.google.android.gms.measurement.internal.zzdn
            @Override // com.google.android.gms.measurement.internal.zzdq
            public final Object zza() {
                zzdt zzdtVar = zzdu.zza;
                return zznn.zzL();
            }
        });
        zzq = zza("measurement.upload.backoff_period", 43200000L, 43200000L, new zzdq() { // from class: com.google.android.gms.measurement.internal.zzdo
            @Override // com.google.android.gms.measurement.internal.zzdq
            public final Object zza() {
                zzdt zzdtVar = zzdu.zza;
                return Long.valueOf(zznn.zzs());
            }
        });
        zzr = zza("measurement.upload.window_interval", 3600000L, 3600000L, new zzdq() { // from class: com.google.android.gms.measurement.internal.zzdp
            @Override // com.google.android.gms.measurement.internal.zzdq
            public final Object zza() {
                zzdt zzdtVar = zzdu.zza;
                return Long.valueOf(zznn.zzH());
            }
        });
        zzs = zza("measurement.upload.interval", 3600000L, 3600000L, new zzdq() { // from class: com.google.android.gms.measurement.internal.zzaz
            @Override // com.google.android.gms.measurement.internal.zzdq
            public final Object zza() {
                zzdt zzdtVar = zzdu.zza;
                return Long.valueOf(zznn.zzu());
            }
        });
        zzt = zza("measurement.upload.realtime_upload_interval", 10000L, 10000L, new zzdq() { // from class: com.google.android.gms.measurement.internal.zzba
            @Override // com.google.android.gms.measurement.internal.zzdq
            public final Object zza() {
                zzdt zzdtVar = zzdu.zza;
                return Long.valueOf(zznn.zzm());
            }
        });
        zzu = zza("measurement.upload.debug_upload_interval", 1000L, 1000L, new zzdq() { // from class: com.google.android.gms.measurement.internal.zzbc
            @Override // com.google.android.gms.measurement.internal.zzdq
            public final Object zza() {
                zzdt zzdtVar = zzdu.zza;
                return Long.valueOf(zznn.zze());
            }
        });
        zzv = zza("measurement.upload.minimum_delay", 500L, 500L, new zzdq() { // from class: com.google.android.gms.measurement.internal.zzbd
            @Override // com.google.android.gms.measurement.internal.zzdq
            public final Object zza() {
                zzdt zzdtVar = zzdu.zza;
                return Long.valueOf(zznn.zzk());
            }
        });
        zzw = zza("measurement.alarm_manager.minimum_interval", 60000L, 60000L, new zzdq() { // from class: com.google.android.gms.measurement.internal.zzbe
            @Override // com.google.android.gms.measurement.internal.zzdq
            public final Object zza() {
                zzdt zzdtVar = zzdu.zza;
                return Long.valueOf(zznn.zzj());
            }
        });
        zzx = zza("measurement.upload.stale_data_deletion_interval", 86400000L, 86400000L, new zzdq() { // from class: com.google.android.gms.measurement.internal.zzbf
            @Override // com.google.android.gms.measurement.internal.zzdq
            public final Object zza() {
                zzdt zzdtVar = zzdu.zza;
                return Long.valueOf(zznn.zzp());
            }
        });
        zzy = zza("measurement.upload.refresh_blacklisted_config_interval", 604800000L, 604800000L, new zzdq() { // from class: com.google.android.gms.measurement.internal.zzbg
            @Override // com.google.android.gms.measurement.internal.zzdq
            public final Object zza() {
                zzdt zzdtVar = zzdu.zza;
                return Long.valueOf(zznn.zzn());
            }
        });
        zzz = zza("measurement.upload.initial_upload_delay_time", 15000L, 15000L, new zzdq() { // from class: com.google.android.gms.measurement.internal.zzbh
            @Override // com.google.android.gms.measurement.internal.zzdq
            public final Object zza() {
                zzdt zzdtVar = zzdu.zza;
                return Long.valueOf(zznn.zzt());
            }
        });
        zzA = zza("measurement.upload.retry_time", 1800000L, 1800000L, new zzdq() { // from class: com.google.android.gms.measurement.internal.zzbi
            @Override // com.google.android.gms.measurement.internal.zzdq
            public final Object zza() {
                zzdt zzdtVar = zzdu.zza;
                return Long.valueOf(zznn.zzG());
            }
        });
        zzB = zza("measurement.upload.retry_count", 6, 6, new zzdq() { // from class: com.google.android.gms.measurement.internal.zzbk
            @Override // com.google.android.gms.measurement.internal.zzdq
            public final Object zza() {
                zzdt zzdtVar = zzdu.zza;
                return Integer.valueOf((int) zznn.zzF());
            }
        });
        zzC = zza("measurement.upload.max_queue_time", 2419200000L, 2419200000L, new zzdq() { // from class: com.google.android.gms.measurement.internal.zzbl
            @Override // com.google.android.gms.measurement.internal.zzdq
            public final Object zza() {
                zzdt zzdtVar = zzdu.zza;
                return Long.valueOf(zznn.zzC());
            }
        });
        zzD = zza("measurement.lifetimevalue.max_currency_tracked", 4, 4, new zzdq() { // from class: com.google.android.gms.measurement.internal.zzbm
            @Override // com.google.android.gms.measurement.internal.zzdq
            public final Object zza() {
                zzdt zzdtVar = zzdu.zza;
                return Integer.valueOf((int) zznn.zzf());
            }
        });
        Integer valueOf2 = Integer.valueOf((int) LogSeverity.INFO_VALUE);
        zzE = zza("measurement.audience.filter_result_max_count", valueOf2, valueOf2, new zzdq() { // from class: com.google.android.gms.measurement.internal.zzbo
            @Override // com.google.android.gms.measurement.internal.zzdq
            public final Object zza() {
                zzdt zzdtVar = zzdu.zza;
                return Integer.valueOf((int) zznn.zzi());
            }
        });
        zzF = zza("measurement.upload.max_public_user_properties", 25, 25, null);
        zzG = zza("measurement.upload.max_event_name_cardinality", 500, 500, null);
        zzH = zza("measurement.upload.max_public_event_params", 25, 25, null);
        Long valueOf3 = Long.valueOf((long) FirebaseInAppMessagingDisplay.IMPRESSION_THRESHOLD_MILLIS);
        zzI = zza("measurement.service_client.idle_disconnect_millis", valueOf3, valueOf3, new zzdq() { // from class: com.google.android.gms.measurement.internal.zzbp
            @Override // com.google.android.gms.measurement.internal.zzdq
            public final Object zza() {
                zzdt zzdtVar = zzdu.zza;
                return Long.valueOf(zznn.zzo());
            }
        });
        Boolean bool = Boolean.FALSE;
        zzJ = zza("measurement.test.boolean_flag", bool, bool, new zzdq() { // from class: com.google.android.gms.measurement.internal.zzbq
            @Override // com.google.android.gms.measurement.internal.zzdq
            public final Object zza() {
                zzdt zzdtVar = zzdu.zza;
                return Boolean.valueOf(zzor.zzg());
            }
        });
        zzK = zza("measurement.test.string_flag", "---", "---", new zzdq() { // from class: com.google.android.gms.measurement.internal.zzbr
            @Override // com.google.android.gms.measurement.internal.zzdq
            public final Object zza() {
                zzdt zzdtVar = zzdu.zza;
                return zzor.zzf();
            }
        });
        zzL = zza("measurement.test.long_flag", -1L, -1L, new zzdq() { // from class: com.google.android.gms.measurement.internal.zzbs
            @Override // com.google.android.gms.measurement.internal.zzdq
            public final Object zza() {
                zzdt zzdtVar = zzdu.zza;
                return Long.valueOf(zzor.zzd());
            }
        });
        zzM = zza("measurement.test.int_flag", -2, -2, new zzdq() { // from class: com.google.android.gms.measurement.internal.zzbt
            @Override // com.google.android.gms.measurement.internal.zzdq
            public final Object zza() {
                zzdt zzdtVar = zzdu.zza;
                return Integer.valueOf((int) zzor.zzc());
            }
        });
        Double valueOf4 = Double.valueOf(-3.0d);
        zzN = zza("measurement.test.double_flag", valueOf4, valueOf4, new zzdq() { // from class: com.google.android.gms.measurement.internal.zzbv
            @Override // com.google.android.gms.measurement.internal.zzdq
            public final Object zza() {
                zzdt zzdtVar = zzdu.zza;
                return Double.valueOf(zzor.zzb());
            }
        });
        zzO = zza("measurement.experiment.max_ids", 50, 50, new zzdq() { // from class: com.google.android.gms.measurement.internal.zzbw
            @Override // com.google.android.gms.measurement.internal.zzdq
            public final Object zza() {
                zzdt zzdtVar = zzdu.zza;
                return Integer.valueOf((int) zznn.zzh());
            }
        });
        zzP = zza("measurement.max_bundles_per_iteration", 100, 100, new zzdq() { // from class: com.google.android.gms.measurement.internal.zzbx
            @Override // com.google.android.gms.measurement.internal.zzdq
            public final Object zza() {
                zzdt zzdtVar = zzdu.zza;
                return Integer.valueOf((int) zznn.zzc());
            }
        });
        zzQ = zza("measurement.sdk.attribution.cache.ttl", 604800000L, 604800000L, new zzdq() { // from class: com.google.android.gms.measurement.internal.zzby
            @Override // com.google.android.gms.measurement.internal.zzdq
            public final Object zza() {
                zzdt zzdtVar = zzdu.zza;
                return Long.valueOf(zznn.zzq());
            }
        });
        zzR = zza("measurement.redaction.app_instance_id.ttl", 7200000L, 7200000L, new zzdq() { // from class: com.google.android.gms.measurement.internal.zzca
            @Override // com.google.android.gms.measurement.internal.zzdq
            public final Object zza() {
                zzdt zzdtVar = zzdu.zza;
                return Long.valueOf(zznn.zzr());
            }
        });
        Boolean bool2 = Boolean.TRUE;
        zzS = zza("measurement.collection.log_event_and_bundle_v2", bool2, bool2, new zzdq() { // from class: com.google.android.gms.measurement.internal.zzcb
            @Override // com.google.android.gms.measurement.internal.zzdq
            public final Object zza() {
                zzdt zzdtVar = zzdu.zza;
                return Boolean.valueOf(zzou.zzc());
            }
        });
        zzT = zza("measurement.quality.checksum", bool, bool, null);
        zzU = zza("measurement.audience.use_bundle_end_timestamp_for_non_sequence_property_filters", bool, bool, new zzdq() { // from class: com.google.android.gms.measurement.internal.zzcc
            @Override // com.google.android.gms.measurement.internal.zzdq
            public final Object zza() {
                zzdt zzdtVar = zzdu.zza;
                return Boolean.valueOf(zznz.zze());
            }
        });
        zzV = zza("measurement.audience.refresh_event_count_filters_timestamp", bool, bool, new zzdq() { // from class: com.google.android.gms.measurement.internal.zzcd
            @Override // com.google.android.gms.measurement.internal.zzdq
            public final Object zza() {
                zzdt zzdtVar = zzdu.zza;
                return Boolean.valueOf(zznz.zzd());
            }
        });
        zzW = zza("measurement.audience.use_bundle_timestamp_for_event_count_filters", bool, bool, new zzdq() { // from class: com.google.android.gms.measurement.internal.zzce
            @Override // com.google.android.gms.measurement.internal.zzdq
            public final Object zza() {
                zzdt zzdtVar = zzdu.zza;
                return Boolean.valueOf(zznz.zzf());
            }
        });
        zzX = zza("measurement.sdk.collection.retrieve_deeplink_from_bow_2", bool2, bool2, new zzdq() { // from class: com.google.android.gms.measurement.internal.zzcg
            @Override // com.google.android.gms.measurement.internal.zzdq
            public final Object zza() {
                zzdt zzdtVar = zzdu.zza;
                return Boolean.valueOf(zzpm.zzc());
            }
        });
        zzY = zza("measurement.sdk.collection.last_deep_link_referrer_campaign2", bool, bool, new zzdq() { // from class: com.google.android.gms.measurement.internal.zzch
            @Override // com.google.android.gms.measurement.internal.zzdq
            public final Object zza() {
                zzdt zzdtVar = zzdu.zza;
                return Boolean.valueOf(zzol.zzc());
            }
        });
        zzZ = zza("measurement.lifecycle.app_in_background_parameter", bool, bool, new zzdq() { // from class: com.google.android.gms.measurement.internal.zzci
            @Override // com.google.android.gms.measurement.internal.zzdq
            public final Object zza() {
                zzdt zzdtVar = zzdu.zza;
                return Boolean.valueOf(zzoo.zzc());
            }
        });
        zzaa = zza("measurement.integration.disable_firebase_instance_id", bool, bool, new zzdq() { // from class: com.google.android.gms.measurement.internal.zzcj
            @Override // com.google.android.gms.measurement.internal.zzdq
            public final Object zza() {
                zzdt zzdtVar = zzdu.zza;
                return Boolean.valueOf(zzpj.zzd());
            }
        });
        zzab = zza("measurement.collection.service.update_with_analytics_fix", bool, bool, new zzdq() { // from class: com.google.android.gms.measurement.internal.zzck
            @Override // com.google.android.gms.measurement.internal.zzdq
            public final Object zza() {
                zzdt zzdtVar = zzdu.zza;
                return Boolean.valueOf(zzpp.zzc());
            }
        });
        zzac = zza("measurement.client.firebase_feature_rollout.v1.enable", bool2, bool2, new zzdq() { // from class: com.google.android.gms.measurement.internal.zzcm
            @Override // com.google.android.gms.measurement.internal.zzdq
            public final Object zza() {
                zzdt zzdtVar = zzdu.zza;
                return Boolean.valueOf(zznw.zzd());
            }
        });
        zzad = zza("measurement.client.sessions.check_on_reset_and_enable2", bool2, bool2, new zzdq() { // from class: com.google.android.gms.measurement.internal.zzcn
            @Override // com.google.android.gms.measurement.internal.zzdq
            public final Object zza() {
                zzdt zzdtVar = zzdu.zza;
                return Boolean.valueOf(zzof.zzd());
            }
        });
        zzae = zza("measurement.collection.synthetic_data_mitigation", bool, bool, new zzdq() { // from class: com.google.android.gms.measurement.internal.zzco
            @Override // com.google.android.gms.measurement.internal.zzdq
            public final Object zza() {
                zzdt zzdtVar = zzdu.zza;
                return Boolean.valueOf(zzpg.zzc());
            }
        });
        zzaf = zza("measurement.service.storage_consent_support_version", 203600, 203600, new zzdq() { // from class: com.google.android.gms.measurement.internal.zzcp
            @Override // com.google.android.gms.measurement.internal.zzdq
            public final Object zza() {
                zzdt zzdtVar = zzdu.zza;
                return Integer.valueOf((int) zznq.zzb());
            }
        });
        zzag = zza("measurement.client.click_identifier_control.dev", bool, bool, new zzdq() { // from class: com.google.android.gms.measurement.internal.zzcr
            @Override // com.google.android.gms.measurement.internal.zzdq
            public final Object zza() {
                zzdt zzdtVar = zzdu.zza;
                return Boolean.valueOf(zznh.zzc());
            }
        });
        zzah = zza("measurement.service.click_identifier_control", bool, bool, new zzdq() { // from class: com.google.android.gms.measurement.internal.zzcs
            @Override // com.google.android.gms.measurement.internal.zzdq
            public final Object zza() {
                zzdt zzdtVar = zzdu.zza;
                return Boolean.valueOf(zznk.zzc());
            }
        });
        zzai = zza("measurement.service.store_null_safelist", bool2, bool2, new zzdq() { // from class: com.google.android.gms.measurement.internal.zzct
            @Override // com.google.android.gms.measurement.internal.zzdq
            public final Object zza() {
                zzdt zzdtVar = zzdu.zza;
                return Boolean.valueOf(zznt.zzd());
            }
        });
        zzaj = zza("measurement.service.store_safelist", bool2, bool2, new zzdq() { // from class: com.google.android.gms.measurement.internal.zzcu
            @Override // com.google.android.gms.measurement.internal.zzdq
            public final Object zza() {
                zzdt zzdtVar = zzdu.zza;
                return Boolean.valueOf(zznt.zze());
            }
        });
        zzak = zza("measurement.collection.enable_session_stitching_token.service", bool, bool, new zzdq() { // from class: com.google.android.gms.measurement.internal.zzcv
            @Override // com.google.android.gms.measurement.internal.zzdq
            public final Object zza() {
                zzdt zzdtVar = zzdu.zza;
                return Boolean.valueOf(zzpd.zzf());
            }
        });
        zzal = zza("measurement.collection.enable_session_stitching_token.service_new", bool2, bool2, new zzdq() { // from class: com.google.android.gms.measurement.internal.zzcw
            @Override // com.google.android.gms.measurement.internal.zzdq
            public final Object zza() {
                zzdt zzdtVar = zzdu.zza;
                return Boolean.valueOf(zzpd.zzg());
            }
        });
        zzam = zza("measurement.collection.enable_session_stitching_token.client.dev", bool2, bool2, new zzdq() { // from class: com.google.android.gms.measurement.internal.zzcy
            @Override // com.google.android.gms.measurement.internal.zzdq
            public final Object zza() {
                zzdt zzdtVar = zzdu.zza;
                return Boolean.valueOf(zzpd.zzd());
            }
        });
        zzan = zza("measurement.session_stitching_token_enabled", bool, bool, new zzdq() { // from class: com.google.android.gms.measurement.internal.zzcz
            @Override // com.google.android.gms.measurement.internal.zzdq
            public final Object zza() {
                zzdt zzdtVar = zzdu.zza;
                return Boolean.valueOf(zzpd.zze());
            }
        });
        zzao = zza("measurement.redaction.e_tag", bool2, bool2, new zzdq() { // from class: com.google.android.gms.measurement.internal.zzda
            @Override // com.google.android.gms.measurement.internal.zzdq
            public final Object zza() {
                zzdt zzdtVar = zzdu.zza;
                return Boolean.valueOf(zzox.zze());
            }
        });
        zzap = zza("measurement.redaction.client_ephemeral_aiid_generation", bool2, bool2, new zzdq() { // from class: com.google.android.gms.measurement.internal.zzdc
            @Override // com.google.android.gms.measurement.internal.zzdq
            public final Object zza() {
                zzdt zzdtVar = zzdu.zza;
                return Boolean.valueOf(zzox.zzd());
            }
        });
        zzaq = zza("measurement.redaction.retain_major_os_version", bool2, bool2, new zzdq() { // from class: com.google.android.gms.measurement.internal.zzdd
            @Override // com.google.android.gms.measurement.internal.zzdq
            public final Object zza() {
                zzdt zzdtVar = zzdu.zza;
                return Boolean.valueOf(zzox.zzf());
            }
        });
        zzar = zza("measurement.redaction.scion_payload_generator", bool2, bool2, new zzdq() { // from class: com.google.android.gms.measurement.internal.zzde
            @Override // com.google.android.gms.measurement.internal.zzdq
            public final Object zza() {
                zzdt zzdtVar = zzdu.zza;
                return Boolean.valueOf(zzox.zzg());
            }
        });
        zzas = zza("measurement.audience.dynamic_filters.oob_fix", bool2, bool2, new zzdq() { // from class: com.google.android.gms.measurement.internal.zzdf
            @Override // com.google.android.gms.measurement.internal.zzdq
            public final Object zza() {
                zzdt zzdtVar = zzdu.zza;
                return Boolean.valueOf(zzoc.zzd());
            }
        });
        zzat = zza("measurement.service.clear_global_params_on_uninstall", bool2, bool2, new zzdq() { // from class: com.google.android.gms.measurement.internal.zzdg
            @Override // com.google.android.gms.measurement.internal.zzdq
            public final Object zza() {
                zzdt zzdtVar = zzdu.zza;
                return Boolean.valueOf(zzoi.zzd());
            }
        });
        zzau = zza("measurement.sessionid.enable_client_session_id", bool2, bool2, new zzdq() { // from class: com.google.android.gms.measurement.internal.zzdh
            @Override // com.google.android.gms.measurement.internal.zzdq
            public final Object zza() {
                zzdt zzdtVar = zzdu.zza;
                return Boolean.valueOf(zzpa.zzd());
            }
        });
    }

    @VisibleForTesting
    public static zzdt zza(String str, Object obj, Object obj2, zzdq zzdqVar) {
        zzdt zzdtVar = new zzdt(str, obj, obj2, zzdqVar, null);
        zzav.add(zzdtVar);
        return zzdtVar;
    }

    public static Map zzc(Context context) {
        com.google.android.gms.internal.measurement.zzhf zza2 = com.google.android.gms.internal.measurement.zzhf.zza(context.getContentResolver(), com.google.android.gms.internal.measurement.zzhq.zza("com.google.android.gms.measurement"), new Runnable() { // from class: com.google.android.gms.measurement.internal.zzay
            @Override // java.lang.Runnable
            public final void run() {
                com.google.android.gms.internal.measurement.zzib.zzd();
            }
        });
        return zza2 == null ? Collections.emptyMap() : zza2.zzc();
    }
}
