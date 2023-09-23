package com.google.android.gms.internal.ads;

import android.util.JsonReader;
import androidx.core.app.NotificationCompat;
import com.arthenica.ffmpegkit.Chapter;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.messaging.Constants;
import java.util.Collections;
import java.util.List;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzfbg {
    public final String zzA;
    public final zzccg zzB;
    public final String zzC;
    public final JSONObject zzD;
    public final JSONObject zzE;
    public final String zzF;
    public final String zzG;
    public final String zzH;
    public final String zzI;
    public final String zzJ;
    public final boolean zzK;
    public final boolean zzL;
    public final boolean zzM;
    public final boolean zzN;
    public final boolean zzO;
    public final boolean zzP;
    public final boolean zzQ;
    public final int zzR;
    public final int zzS;
    public final boolean zzT;
    public final boolean zzU;
    public final String zzV;
    public final zzfcb zzW;
    public final boolean zzX;
    public final boolean zzY;
    public final int zzZ;
    public final List zza;
    public final String zzaa;
    public final int zzab;
    public final String zzac;
    public final boolean zzad;
    public final zzbya zzae;
    public final boolean zzaf;
    public final com.google.android.gms.ads.internal.client.zzs zzag;
    public final String zzah;
    public final boolean zzai;
    public final JSONObject zzaj;
    public final boolean zzak;
    public final JSONObject zzal;
    public final boolean zzam;
    public final String zzan;
    public final boolean zzao;
    public final String zzap;
    public final int zzb;
    public final List zzc;
    public final List zzd;
    public final List zze;
    public final int zzf;
    public final List zzg;
    public final List zzh;
    public final List zzi;
    public final List zzj;
    public final String zzk;
    public final String zzl;
    public final zzcaw zzm;
    public final List zzn;
    public final List zzo;
    public final List zzp;
    public final List zzq;
    public final int zzr;
    public final List zzs;
    public final zzfbl zzt;
    public final List zzu;
    public final List zzv;
    public final JSONObject zzw;
    public final String zzx;
    public final String zzy;
    public final String zzz;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v249, types: [java.util.List] */
    public zzfbg(JsonReader jsonReader) {
        List list;
        List list2;
        char c;
        List emptyList = Collections.emptyList();
        List emptyList2 = Collections.emptyList();
        List emptyList3 = Collections.emptyList();
        List emptyList4 = Collections.emptyList();
        List emptyList5 = Collections.emptyList();
        List emptyList6 = Collections.emptyList();
        List emptyList7 = Collections.emptyList();
        List emptyList8 = Collections.emptyList();
        List emptyList9 = Collections.emptyList();
        List emptyList10 = Collections.emptyList();
        List emptyList11 = Collections.emptyList();
        List emptyList12 = Collections.emptyList();
        List emptyList13 = Collections.emptyList();
        List emptyList14 = Collections.emptyList();
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        JSONObject jSONObject3 = new JSONObject();
        JSONObject jSONObject4 = new JSONObject();
        JSONObject jSONObject5 = new JSONObject();
        JSONObject jSONObject6 = new JSONObject();
        zzfrh zzo = zzfrh.zzo();
        jsonReader.beginObject();
        JSONObject jSONObject7 = jSONObject2;
        JSONObject jSONObject8 = jSONObject3;
        JSONObject jSONObject9 = jSONObject4;
        JSONObject jSONObject10 = jSONObject5;
        JSONObject jSONObject11 = jSONObject6;
        zzfrh zzfrhVar = zzo;
        zzfbl zzfblVar = null;
        zzccg zzccgVar = null;
        zzbya zzbyaVar = null;
        com.google.android.gms.ads.internal.client.zzs zzsVar = null;
        String str = null;
        String str2 = "";
        String str3 = str2;
        String str4 = str3;
        String str5 = str4;
        String str6 = str5;
        String str7 = str6;
        String str8 = str7;
        String str9 = str8;
        String str10 = str9;
        String str11 = str10;
        String str12 = str11;
        String str13 = str12;
        String str14 = str13;
        String str15 = str14;
        String str16 = str15;
        int i2 = 0;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        boolean z5 = false;
        boolean z6 = false;
        boolean z7 = false;
        int i3 = -1;
        int i4 = 0;
        boolean z8 = false;
        boolean z9 = false;
        boolean z10 = false;
        int i5 = 0;
        int i6 = -1;
        boolean z11 = false;
        boolean z12 = true;
        boolean z13 = false;
        boolean z14 = false;
        boolean z15 = false;
        boolean z16 = false;
        boolean z17 = false;
        List list3 = emptyList11;
        List list4 = emptyList12;
        List list5 = emptyList13;
        List list6 = emptyList14;
        JSONObject jSONObject12 = jSONObject;
        zzcaw zzcawVar = null;
        String str17 = str16;
        String str18 = str17;
        int i7 = 0;
        int i8 = 0;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            String str19 = nextName == null ? "" : nextName;
            switch (str19.hashCode()) {
                case -2138196627:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str19.equals("ad_source_instance_name")) {
                        c = ':';
                        break;
                    }
                    c = 65535;
                    break;
                case -1980587809:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str19.equals("debug_signals")) {
                        c = 28;
                        break;
                    }
                    c = 65535;
                    break;
                case -1965512151:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str19.equals("omid_settings")) {
                        c = ')';
                        break;
                    }
                    c = 65535;
                    break;
                case -1812055556:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str19.equals("play_prewarm_options")) {
                        c = '1';
                        break;
                    }
                    c = 65535;
                    break;
                case -1776946669:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str19.equals("ad_source_name")) {
                        c = '8';
                        break;
                    }
                    c = 65535;
                    break;
                case -1662989631:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str19.equals("is_interscroller")) {
                        c = '5';
                        break;
                    }
                    c = 65535;
                    break;
                case -1620470467:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str19.equals("backend_query_id")) {
                        c = '/';
                        break;
                    }
                    c = 65535;
                    break;
                case -1550155393:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str19.equals("nofill_urls")) {
                        c = '\r';
                        break;
                    }
                    c = 65535;
                    break;
                case -1440104884:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str19.equals("is_custom_close_blocked")) {
                        c = '#';
                        break;
                    }
                    c = 65535;
                    break;
                case -1439500848:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str19.equals("orientation")) {
                        c = '%';
                        break;
                    }
                    c = 65535;
                    break;
                case -1428969291:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str19.equals("enable_omid")) {
                        c = '\'';
                        break;
                    }
                    c = 65535;
                    break;
                case -1406227629:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str19.equals("buffer_click_url_as_ready_to_ping")) {
                        c = 'B';
                        break;
                    }
                    c = 65535;
                    break;
                case -1403779768:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str19.equals("showable_impression_type")) {
                        c = ',';
                        break;
                    }
                    c = 65535;
                    break;
                case -1375413093:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str19.equals("ad_cover")) {
                        c = '6';
                        break;
                    }
                    c = 65535;
                    break;
                case -1360811658:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str19.equals("ad_sizes")) {
                        c = 19;
                        break;
                    }
                    c = 65535;
                    break;
                case -1306015996:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str19.equals("adapters")) {
                        c = 20;
                        break;
                    }
                    c = 65535;
                    break;
                case -1303332046:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str19.equals("test_mode_enabled")) {
                        c = '\"';
                        break;
                    }
                    c = 65535;
                    break;
                case -1289032093:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str19.equals(NotificationCompat.MessagingStyle.Message.KEY_EXTRAS_BUNDLE)) {
                        c = 29;
                        break;
                    }
                    c = 65535;
                    break;
                case -1240082064:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str19.equals("ad_event_value")) {
                        c = '3';
                        break;
                    }
                    c = 65535;
                    break;
                case -1234181075:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str19.equals("allow_pub_rendered_attribution")) {
                        c = 30;
                        break;
                    }
                    c = 65535;
                    break;
                case -1168140544:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str19.equals("presentation_error_urls")) {
                        c = 14;
                        break;
                    }
                    c = 65535;
                    break;
                case -1152230954:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str19.equals("ad_type")) {
                        c = 1;
                        break;
                    }
                    c = 65535;
                    break;
                case -1146534047:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str19.equals("is_scroll_aware")) {
                        c = '+';
                        break;
                    }
                    c = 65535;
                    break;
                case -1115838944:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str19.equals("fill_urls")) {
                        c = '\f';
                        break;
                    }
                    c = 65535;
                    break;
                case -1081936678:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str19.equals("allocation_id")) {
                        c = 21;
                        break;
                    }
                    c = 65535;
                    break;
                case -1078050970:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str19.equals("video_complete_urls")) {
                        c = '\b';
                        break;
                    }
                    c = 65535;
                    break;
                case -1051269058:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str19.equals("active_view")) {
                        c = 25;
                        break;
                    }
                    c = 65535;
                    break;
                case -982608540:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str19.equals("valid_from_timestamp")) {
                        c = '\n';
                        break;
                    }
                    c = 65535;
                    break;
                case -972056451:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str19.equals("ad_source_instance_id")) {
                        c = ';';
                        break;
                    }
                    c = 65535;
                    break;
                case -776859333:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str19.equals("click_urls")) {
                        c = 2;
                        break;
                    }
                    c = 65535;
                    break;
                case -544216775:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str19.equals("safe_browsing")) {
                        c = 26;
                        break;
                    }
                    c = 65535;
                    break;
                case -437057161:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str19.equals("imp_urls")) {
                        c = 3;
                        break;
                    }
                    c = 65535;
                    break;
                case -404433734:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str19.equals("rtb_native_required_assets")) {
                        c = '=';
                        break;
                    }
                    c = 65535;
                    break;
                case -404326515:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str19.equals("render_timeout_ms")) {
                        c = '&';
                        break;
                    }
                    c = 65535;
                    break;
                case -397704715:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str19.equals("ad_close_time_ms")) {
                        c = '-';
                        break;
                    }
                    c = 65535;
                    break;
                case -388807511:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str19.equals("content_url")) {
                        c = '?';
                        break;
                    }
                    c = 65535;
                    break;
                case -369773488:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str19.equals("is_close_button_enabled")) {
                        c = '2';
                        break;
                    }
                    c = 65535;
                    break;
                case -213449460:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str19.equals("force_disable_hardware_acceleration")) {
                        c = '@';
                        break;
                    }
                    c = 65535;
                    break;
                case -213424028:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str19.equals("watermark")) {
                        c = '.';
                        break;
                    }
                    c = 65535;
                    break;
                case -180214626:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str19.equals("native_required_asset_viewability")) {
                        c = '>';
                        break;
                    }
                    c = 65535;
                    break;
                case -154616268:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str19.equals("is_offline_ad")) {
                        c = '<';
                        break;
                    }
                    c = 65535;
                    break;
                case -29338502:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str19.equals("allow_custom_click_gesture")) {
                        c = ' ';
                        break;
                    }
                    c = 65535;
                    break;
                case 3107:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str19.equals("ad")) {
                        c = 18;
                        break;
                    }
                    c = 65535;
                    break;
                case 3355:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str19.equals(Chapter.KEY_ID)) {
                        c = 23;
                        break;
                    }
                    c = 65535;
                    break;
                case 3076010:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str19.equals(Constants.ScionAnalytics.MessageType.DATA_MESSAGE)) {
                        c = 22;
                        break;
                    }
                    c = 65535;
                    break;
                case 37109963:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str19.equals("request_id")) {
                        c = 'C';
                        break;
                    }
                    c = 65535;
                    break;
                case 63195984:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str19.equals("render_test_label")) {
                        c = '!';
                        break;
                    }
                    c = 65535;
                    break;
                case 107433883:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str19.equals("qdata")) {
                        c = 24;
                        break;
                    }
                    c = 65535;
                    break;
                case 230323073:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str19.equals("ad_load_urls")) {
                        c = 4;
                        break;
                    }
                    c = 65535;
                    break;
                case 418392395:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str19.equals("is_closable_area_disabled")) {
                        c = '$';
                        break;
                    }
                    c = 65535;
                    break;
                case 549176928:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str19.equals("presentation_error_timeout_ms")) {
                        c = 16;
                        break;
                    }
                    c = 65535;
                    break;
                case 597473788:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str19.equals("debug_dialog_string")) {
                        c = 27;
                        break;
                    }
                    c = 65535;
                    break;
                case 754887508:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str19.equals("container_sizes")) {
                        c = 17;
                        break;
                    }
                    c = 65535;
                    break;
                case 791122864:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str19.equals("impression_type")) {
                        c = 5;
                        break;
                    }
                    c = 65535;
                    break;
                case 1010584092:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str19.equals(FirebaseAnalytics.Param.TRANSACTION_ID)) {
                        c = '\t';
                        break;
                    }
                    c = 65535;
                    break;
                case 1100650276:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str19.equals("rewards")) {
                        c = 11;
                        break;
                    }
                    c = 65535;
                    break;
                case 1186014765:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str19.equals("cache_hit_urls")) {
                        c = 'A';
                        break;
                    }
                    c = 65535;
                    break;
                case 1321720943:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str19.equals("allow_pub_owned_ad_view")) {
                        c = 31;
                        break;
                    }
                    c = 65535;
                    break;
                case 1437255331:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str19.equals("ad_source_id")) {
                        c = '9';
                        break;
                    }
                    c = 65535;
                    break;
                case 1637553475:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str19.equals("bid_response")) {
                        c = '(';
                        break;
                    }
                    c = 65535;
                    break;
                case 1638957285:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str19.equals("video_start_urls")) {
                        c = 6;
                        break;
                    }
                    c = 65535;
                    break;
                case 1686319423:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str19.equals("ad_network_class_name")) {
                        c = '7';
                        break;
                    }
                    c = 65535;
                    break;
                case 1688341040:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str19.equals("video_reward_urls")) {
                        c = 7;
                        break;
                    }
                    c = 65535;
                    break;
                case 1799285870:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str19.equals("use_third_party_container_height")) {
                        c = '0';
                        break;
                    }
                    c = 65535;
                    break;
                case 1839650832:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str19.equals("renderers")) {
                        c = 0;
                        break;
                    }
                    c = 65535;
                    break;
                case 1875425491:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str19.equals("is_analytics_logging_enabled")) {
                        c = '*';
                        break;
                    }
                    c = 65535;
                    break;
                case 2068142375:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str19.equals("rule_line_external_id")) {
                        c = '4';
                        break;
                    }
                    c = 65535;
                    break;
                case 2072888499:
                    list2 = emptyList10;
                    list = emptyList9;
                    if (str19.equals("manual_tracking_urls")) {
                        c = 15;
                        break;
                    }
                    c = 65535;
                    break;
                default:
                    list = emptyList9;
                    list2 = emptyList10;
                    c = 65535;
                    break;
            }
            switch (c) {
                case 0:
                    emptyList = com.google.android.gms.ads.internal.util.zzbu.zzd(jsonReader);
                    break;
                case 1:
                    i7 = zzb(jsonReader.nextString());
                    break;
                case 2:
                    emptyList2 = com.google.android.gms.ads.internal.util.zzbu.zzd(jsonReader);
                    break;
                case 3:
                    emptyList3 = com.google.android.gms.ads.internal.util.zzbu.zzd(jsonReader);
                    break;
                case 4:
                    emptyList4 = com.google.android.gms.ads.internal.util.zzbu.zzd(jsonReader);
                    break;
                case 5:
                    i8 = zzc(jsonReader.nextInt());
                    break;
                case 6:
                    emptyList5 = com.google.android.gms.ads.internal.util.zzbu.zzd(jsonReader);
                    break;
                case 7:
                    emptyList6 = com.google.android.gms.ads.internal.util.zzbu.zzd(jsonReader);
                    break;
                case '\b':
                    emptyList7 = com.google.android.gms.ads.internal.util.zzbu.zzd(jsonReader);
                    break;
                case '\t':
                    str18 = jsonReader.nextString();
                    break;
                case '\n':
                    str17 = jsonReader.nextString();
                    break;
                case 11:
                    zzcawVar = zzcaw.zza(com.google.android.gms.ads.internal.util.zzbu.zze(jsonReader));
                    break;
                case '\f':
                    emptyList8 = com.google.android.gms.ads.internal.util.zzbu.zzd(jsonReader);
                    break;
                case '\r':
                    emptyList9 = com.google.android.gms.ads.internal.util.zzbu.zzd(jsonReader);
                    continue;
                    emptyList10 = list2;
                case 14:
                    list2 = com.google.android.gms.ads.internal.util.zzbu.zzd(jsonReader);
                    break;
                case 15:
                    list3 = com.google.android.gms.ads.internal.util.zzbu.zzd(jsonReader);
                    break;
                case 16:
                    i2 = jsonReader.nextInt();
                    break;
                case 17:
                    list4 = zzfbh.zza(jsonReader);
                    break;
                case 18:
                    zzfblVar = new zzfbl(jsonReader);
                    break;
                case 19:
                    list6 = zzfbh.zza(jsonReader);
                    break;
                case 20:
                    list5 = com.google.android.gms.ads.internal.util.zzbu.zzd(jsonReader);
                    break;
                case 21:
                    str2 = jsonReader.nextString();
                    break;
                case 22:
                    jSONObject12 = com.google.android.gms.ads.internal.util.zzbu.zzh(jsonReader);
                    break;
                case 23:
                    str3 = jsonReader.nextString();
                    break;
                case 24:
                    str4 = jsonReader.nextString();
                    break;
                case 25:
                    str5 = com.google.android.gms.ads.internal.util.zzbu.zzh(jsonReader).toString();
                    break;
                case 26:
                    zzccgVar = zzccg.zza(com.google.android.gms.ads.internal.util.zzbu.zzh(jsonReader));
                    break;
                case 27:
                    str6 = jsonReader.nextString();
                    break;
                case 28:
                    jSONObject7 = com.google.android.gms.ads.internal.util.zzbu.zzh(jsonReader);
                    break;
                case 29:
                    jSONObject8 = com.google.android.gms.ads.internal.util.zzbu.zzh(jsonReader);
                    break;
                case 30:
                    z = jsonReader.nextBoolean();
                    break;
                case 31:
                    z2 = jsonReader.nextBoolean();
                    break;
                case ' ':
                    z3 = jsonReader.nextBoolean();
                    break;
                case '!':
                    z4 = jsonReader.nextBoolean();
                    break;
                case '\"':
                    z5 = jsonReader.nextBoolean();
                    break;
                case '#':
                    z6 = jsonReader.nextBoolean();
                    break;
                case '$':
                    z7 = jsonReader.nextBoolean();
                    break;
                case '%':
                    i3 = zzd(jsonReader.nextString());
                    break;
                case '&':
                    i4 = jsonReader.nextInt();
                    break;
                case '\'':
                    z8 = jsonReader.nextBoolean();
                    break;
                case '(':
                    str7 = jsonReader.nextString();
                    break;
                case ')':
                    jSONObject9 = com.google.android.gms.ads.internal.util.zzbu.zzh(jsonReader);
                    break;
                case '*':
                    z9 = jsonReader.nextBoolean();
                    break;
                case '+':
                    z10 = jsonReader.nextBoolean();
                    break;
                case ',':
                    i5 = jsonReader.nextInt();
                    break;
                case '-':
                    i6 = jsonReader.nextInt();
                    break;
                case '.':
                    str8 = jsonReader.nextString();
                    break;
                case '/':
                    str9 = jsonReader.nextString();
                    break;
                case '0':
                    z11 = jsonReader.nextBoolean();
                    break;
                case '1':
                    zzbyaVar = zzbya.zza(com.google.android.gms.ads.internal.util.zzbu.zzh(jsonReader));
                    break;
                case '2':
                    z12 = jsonReader.nextBoolean();
                    break;
                case '3':
                    zzsVar = com.google.android.gms.ads.internal.client.zzs.zza(com.google.android.gms.ads.internal.util.zzbu.zzh(jsonReader));
                    break;
                case '4':
                    str10 = jsonReader.nextString();
                    break;
                case '5':
                    z13 = jsonReader.nextBoolean();
                    break;
                case '6':
                    jSONObject10 = com.google.android.gms.ads.internal.util.zzbu.zzh(jsonReader);
                    break;
                case '7':
                    str11 = jsonReader.nextString();
                    break;
                case '8':
                    if (((Boolean) zzbhy.zzfK.zzl()).booleanValue()) {
                        str12 = jsonReader.nextString();
                    } else {
                        jsonReader.skipValue();
                    }
                    break;
                case '9':
                    if (((Boolean) zzbhy.zzfK.zzl()).booleanValue()) {
                        str13 = jsonReader.nextString();
                    } else {
                        jsonReader.skipValue();
                    }
                    break;
                case ':':
                    if (((Boolean) zzbhy.zzfK.zzl()).booleanValue()) {
                        str14 = jsonReader.nextString();
                    } else {
                        jsonReader.skipValue();
                    }
                    break;
                case ';':
                    if (((Boolean) zzbhy.zzfK.zzl()).booleanValue()) {
                        str15 = jsonReader.nextString();
                    } else {
                        jsonReader.skipValue();
                    }
                    break;
                case '<':
                    z14 = jsonReader.nextBoolean();
                    break;
                case '=':
                    jSONObject11 = com.google.android.gms.ads.internal.util.zzbu.zzh(jsonReader);
                    break;
                case '>':
                    z15 = jsonReader.nextBoolean();
                    break;
                case '?':
                    str = jsonReader.nextString();
                    break;
                case '@':
                    z16 = jsonReader.nextBoolean();
                    break;
                case 'A':
                    zzfrhVar = com.google.android.gms.ads.internal.util.zzbu.zzd(jsonReader);
                    break;
                case 'B':
                    z17 = jsonReader.nextBoolean();
                    break;
                case 'C':
                    str16 = jsonReader.nextString();
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
            emptyList9 = list;
            emptyList10 = list2;
        }
        jsonReader.endObject();
        this.zza = emptyList;
        this.zzb = i7;
        this.zzc = emptyList2;
        this.zzd = emptyList3;
        this.zzg = emptyList4;
        this.zzf = i8;
        this.zzh = emptyList5;
        this.zzi = emptyList6;
        this.zzj = emptyList7;
        this.zzk = str18;
        this.zzl = str17;
        this.zzm = zzcawVar;
        this.zzn = emptyList8;
        this.zzo = emptyList9;
        this.zzp = emptyList10;
        this.zzq = list3;
        this.zzr = i2;
        this.zzs = list4;
        this.zzt = zzfblVar;
        this.zzu = list5;
        this.zzv = list6;
        this.zzx = str2;
        this.zzw = jSONObject12;
        this.zzy = str3;
        this.zzz = str4;
        this.zzA = str5;
        this.zzB = zzccgVar;
        this.zzC = str6;
        this.zzD = jSONObject7;
        this.zzE = jSONObject8;
        this.zzK = z;
        this.zzL = z2;
        this.zzM = z3;
        this.zzN = z4;
        this.zzO = z5;
        this.zzP = z6;
        this.zzQ = z7;
        this.zzR = i3;
        this.zzS = i4;
        this.zzU = z8;
        this.zzV = str7;
        this.zzW = new zzfcb(jSONObject9);
        this.zzX = z9;
        this.zzY = z10;
        this.zzZ = i5;
        this.zzaa = str8;
        this.zzab = i6;
        this.zzac = str9;
        this.zzad = z11;
        this.zzae = zzbyaVar;
        this.zzaf = z12;
        this.zzag = zzsVar;
        this.zzah = str10;
        this.zzai = z13;
        this.zzaj = jSONObject10;
        this.zzF = str11;
        this.zzG = str12;
        this.zzH = str13;
        this.zzI = str14;
        this.zzJ = str15;
        this.zzak = z14;
        this.zzal = jSONObject11;
        this.zzam = z15;
        this.zzan = str;
        this.zzao = z16;
        this.zze = zzfrhVar;
        this.zzT = z17;
        this.zzap = str16;
    }

    public static String zza(int i2) {
        switch (i2) {
            case 1:
                return "BANNER";
            case 2:
                return "INTERSTITIAL";
            case 3:
                return "NATIVE_EXPRESS";
            case 4:
                return "NATIVE";
            case 5:
                return "REWARDED";
            case 6:
                return "APP_OPEN_AD";
            case 7:
                return "REWARDED_INTERSTITIAL";
            default:
                return "UNKNOWN";
        }
    }

    private static int zzb(String str) {
        if ("banner".equals(str)) {
            return 1;
        }
        if ("interstitial".equals(str)) {
            return 2;
        }
        if ("native_express".equals(str)) {
            return 3;
        }
        if ("native".equals(str)) {
            return 4;
        }
        if ("rewarded".equals(str)) {
            return 5;
        }
        if ("app_open_ad".equals(str) || "app_open_ad_v2".equals(str)) {
            return 6;
        }
        return "rewarded_interstitial".equals(str) ? 7 : 0;
    }

    private static int zzc(int i2) {
        if (i2 == 0 || i2 == 1) {
            return i2;
        }
        return 0;
    }

    private static final int zzd(String str) {
        if ("landscape".equalsIgnoreCase(str)) {
            return 6;
        }
        return "portrait".equalsIgnoreCase(str) ? 7 : -1;
    }
}
