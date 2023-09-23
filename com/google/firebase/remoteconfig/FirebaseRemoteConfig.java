package com.google.firebase.remoteconfig;

import android.content.Context;
import android.util.Log;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.FirebaseApp;
import com.google.firebase.abt.AbtException;
import com.google.firebase.abt.FirebaseABTesting;
import com.google.firebase.installations.FirebaseInstallationsApi;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigInfo;
import com.google.firebase.remoteconfig.internal.ConfigCacheClient;
import com.google.firebase.remoteconfig.internal.ConfigContainer;
import com.google.firebase.remoteconfig.internal.ConfigFetchHandler;
import com.google.firebase.remoteconfig.internal.ConfigGetParameterHandler;
import com.google.firebase.remoteconfig.internal.ConfigMetadataClient;
import com.google.firebase.remoteconfig.internal.DefaultsXmlParser;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class FirebaseRemoteConfig {
    public static final boolean DEFAULT_VALUE_FOR_BOOLEAN = false;
    public static final byte[] DEFAULT_VALUE_FOR_BYTE_ARRAY = new byte[0];
    public static final double DEFAULT_VALUE_FOR_DOUBLE = 0.0d;
    public static final long DEFAULT_VALUE_FOR_LONG = 0;
    public static final String DEFAULT_VALUE_FOR_STRING = "";
    public static final int LAST_FETCH_STATUS_FAILURE = 1;
    public static final int LAST_FETCH_STATUS_NO_FETCH_YET = 0;
    public static final int LAST_FETCH_STATUS_SUCCESS = -1;
    public static final int LAST_FETCH_STATUS_THROTTLED = 2;
    public static final String TAG = "FirebaseRemoteConfig";
    public static final int VALUE_SOURCE_DEFAULT = 1;
    public static final int VALUE_SOURCE_REMOTE = 2;
    public static final int VALUE_SOURCE_STATIC = 0;
    private final ConfigCacheClient activatedConfigsCache;
    private final Context context;
    private final ConfigCacheClient defaultConfigsCache;
    private final Executor executor;
    private final ConfigFetchHandler fetchHandler;
    private final ConfigCacheClient fetchedConfigsCache;
    private final FirebaseABTesting firebaseAbt;
    private final FirebaseApp firebaseApp;
    private final FirebaseInstallationsApi firebaseInstallations;
    private final ConfigMetadataClient frcMetadata;
    private final ConfigGetParameterHandler getHandler;

    public FirebaseRemoteConfig(Context context, FirebaseApp firebaseApp, FirebaseInstallationsApi firebaseInstallationsApi, FirebaseABTesting firebaseABTesting, Executor executor, ConfigCacheClient configCacheClient, ConfigCacheClient configCacheClient2, ConfigCacheClient configCacheClient3, ConfigFetchHandler configFetchHandler, ConfigGetParameterHandler configGetParameterHandler, ConfigMetadataClient configMetadataClient) {
        this.context = context;
        this.firebaseApp = firebaseApp;
        this.firebaseInstallations = firebaseInstallationsApi;
        this.firebaseAbt = firebaseABTesting;
        this.executor = executor;
        this.fetchedConfigsCache = configCacheClient;
        this.activatedConfigsCache = configCacheClient2;
        this.defaultConfigsCache = configCacheClient3;
        this.fetchHandler = configFetchHandler;
        this.getHandler = configGetParameterHandler;
        this.frcMetadata = configMetadataClient;
    }

    public static /* synthetic */ boolean b(FirebaseRemoteConfig firebaseRemoteConfig, Task task) {
        return firebaseRemoteConfig.processActivatePutTask(task);
    }

    public static FirebaseRemoteConfig getInstance() {
        return getInstance(FirebaseApp.getInstance());
    }

    private static boolean isFetchedFresh(ConfigContainer configContainer, ConfigContainer configContainer2) {
        return configContainer2 == null || !configContainer.getFetchTime().equals(configContainer2.getFetchTime());
    }

    public boolean processActivatePutTask(Task<ConfigContainer> task) {
        if (task.isSuccessful()) {
            this.fetchedConfigsCache.clear();
            if (task.getResult() != null) {
                updateAbtWithActivatedExperiments(task.getResult().getAbtExperiments());
                return true;
            }
            Log.e(TAG, "Activated configs written to disk are null.");
            return true;
        }
        return false;
    }

    private Task<Void> setDefaultsWithStringsMapAsync(Map<String, String> map) {
        try {
            return this.defaultConfigsCache.put(ConfigContainer.newBuilder().replaceConfigsWith(map).build()).onSuccessTask(new SuccessContinuation() { // from class: f.h.e.r.e
                @Override // com.google.android.gms.tasks.SuccessContinuation
                public final Task then(Object obj) {
                    ConfigContainer configContainer = (ConfigContainer) obj;
                    return Tasks.forResult(null);
                }
            });
        } catch (JSONException e2) {
            Log.e(TAG, "The provided defaults map could not be processed.", e2);
            return Tasks.forResult(null);
        }
    }

    public static List<Map<String, String>> toExperimentInfoMaps(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < jSONArray.length(); i2++) {
            HashMap hashMap = new HashMap();
            JSONObject jSONObject = jSONArray.getJSONObject(i2);
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                hashMap.put(next, jSONObject.getString(next));
            }
            arrayList.add(hashMap);
        }
        return arrayList;
    }

    public /* synthetic */ Task a(Task task, Task task2, Task task3) {
        if (task.isSuccessful() && task.getResult() != null) {
            ConfigContainer configContainer = (ConfigContainer) task.getResult();
            if (task2.isSuccessful() && !isFetchedFresh(configContainer, (ConfigContainer) task2.getResult())) {
                return Tasks.forResult(Boolean.FALSE);
            }
            return this.activatedConfigsCache.put(configContainer).continueWith(this.executor, new Continuation() { // from class: f.h.e.r.i
                @Override // com.google.android.gms.tasks.Continuation
                public final Object then(Task task4) {
                    return Boolean.valueOf(FirebaseRemoteConfig.b(FirebaseRemoteConfig.this, task4));
                }
            });
        }
        return Tasks.forResult(Boolean.FALSE);
    }

    public Task<Boolean> activate() {
        final Task<ConfigContainer> task = this.fetchedConfigsCache.get();
        final Task<ConfigContainer> task2 = this.activatedConfigsCache.get();
        return Tasks.whenAllComplete(task, task2).continueWithTask(this.executor, new Continuation() { // from class: f.h.e.r.g
            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task3) {
                return FirebaseRemoteConfig.this.a(task, task2, task3);
            }
        });
    }

    public /* synthetic */ Void c() {
        this.activatedConfigsCache.clear();
        this.fetchedConfigsCache.clear();
        this.defaultConfigsCache.clear();
        this.frcMetadata.clear();
        return null;
    }

    public /* synthetic */ Void d(FirebaseRemoteConfigSettings firebaseRemoteConfigSettings) {
        this.frcMetadata.setConfigSettings(firebaseRemoteConfigSettings);
        return null;
    }

    public Task<FirebaseRemoteConfigInfo> ensureInitialized() {
        Task<ConfigContainer> task = this.activatedConfigsCache.get();
        Task<ConfigContainer> task2 = this.defaultConfigsCache.get();
        Task<ConfigContainer> task3 = this.fetchedConfigsCache.get();
        final Task call = Tasks.call(this.executor, new Callable() { // from class: f.h.e.r.n
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return FirebaseRemoteConfig.this.getInfo();
            }
        });
        return Tasks.whenAllComplete(task, task2, task3, call, this.firebaseInstallations.getId(), this.firebaseInstallations.getToken(false)).continueWith(this.executor, new Continuation() { // from class: f.h.e.r.h
            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task4) {
                return (FirebaseRemoteConfigInfo) Task.this.getResult();
            }
        });
    }

    public Task<Void> fetch() {
        return this.fetchHandler.fetch().onSuccessTask(new SuccessContinuation() { // from class: f.h.e.r.c
            @Override // com.google.android.gms.tasks.SuccessContinuation
            public final Task then(Object obj) {
                ConfigFetchHandler.FetchResponse fetchResponse = (ConfigFetchHandler.FetchResponse) obj;
                return Tasks.forResult(null);
            }
        });
    }

    public Task<Boolean> fetchAndActivate() {
        return fetch().onSuccessTask(this.executor, new SuccessContinuation() { // from class: f.h.e.r.f
            @Override // com.google.android.gms.tasks.SuccessContinuation
            public final Task then(Object obj) {
                Void r2 = (Void) obj;
                return FirebaseRemoteConfig.this.activate();
            }
        });
    }

    public Map<String, FirebaseRemoteConfigValue> getAll() {
        return this.getHandler.getAll();
    }

    public boolean getBoolean(String str) {
        return this.getHandler.getBoolean(str);
    }

    public double getDouble(String str) {
        return this.getHandler.getDouble(str);
    }

    public FirebaseRemoteConfigInfo getInfo() {
        return this.frcMetadata.getInfo();
    }

    public Set<String> getKeysByPrefix(String str) {
        return this.getHandler.getKeysByPrefix(str);
    }

    public long getLong(String str) {
        return this.getHandler.getLong(str);
    }

    public String getString(String str) {
        return this.getHandler.getString(str);
    }

    public FirebaseRemoteConfigValue getValue(String str) {
        return this.getHandler.getValue(str);
    }

    public Task<Void> reset() {
        return Tasks.call(this.executor, new Callable() { // from class: f.h.e.r.d
            @Override // java.util.concurrent.Callable
            public final Object call() {
                FirebaseRemoteConfig.this.c();
                return null;
            }
        });
    }

    public Task<Void> setConfigSettingsAsync(final FirebaseRemoteConfigSettings firebaseRemoteConfigSettings) {
        return Tasks.call(this.executor, new Callable() { // from class: f.h.e.r.b
            @Override // java.util.concurrent.Callable
            public final Object call() {
                FirebaseRemoteConfig.this.d(firebaseRemoteConfigSettings);
                return null;
            }
        });
    }

    public Task<Void> setDefaultsAsync(Map<String, Object> map) {
        HashMap hashMap = new HashMap();
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            Object value = entry.getValue();
            if (value instanceof byte[]) {
                hashMap.put(entry.getKey(), new String((byte[]) value));
            } else {
                hashMap.put(entry.getKey(), value.toString());
            }
        }
        return setDefaultsWithStringsMapAsync(hashMap);
    }

    public void startLoadingConfigsFromDisk() {
        this.activatedConfigsCache.get();
        this.defaultConfigsCache.get();
        this.fetchedConfigsCache.get();
    }

    public void updateAbtWithActivatedExperiments(JSONArray jSONArray) {
        if (this.firebaseAbt == null) {
            return;
        }
        try {
            this.firebaseAbt.replaceAllExperiments(toExperimentInfoMaps(jSONArray));
        } catch (AbtException e2) {
            Log.w(TAG, "Could not update ABT experiments.", e2);
        } catch (JSONException e3) {
            Log.e(TAG, "Could not parse ABT experiments from the JSON response.", e3);
        }
    }

    public static FirebaseRemoteConfig getInstance(FirebaseApp firebaseApp) {
        return ((RemoteConfigComponent) firebaseApp.get(RemoteConfigComponent.class)).getDefault();
    }

    public Task<Void> fetch(long j2) {
        return this.fetchHandler.fetch(j2).onSuccessTask(new SuccessContinuation() { // from class: f.h.e.r.a
            @Override // com.google.android.gms.tasks.SuccessContinuation
            public final Task then(Object obj) {
                ConfigFetchHandler.FetchResponse fetchResponse = (ConfigFetchHandler.FetchResponse) obj;
                return Tasks.forResult(null);
            }
        });
    }

    public Task<Void> setDefaultsAsync(int i2) {
        return setDefaultsWithStringsMapAsync(DefaultsXmlParser.getDefaultsFromXml(this.context, i2));
    }
}
