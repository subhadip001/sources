package com.google.firebase.remoteconfig.internal;

import android.text.format.DateUtils;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.analytics.connector.AnalyticsConnector;
import com.google.firebase.inject.Provider;
import com.google.firebase.installations.FirebaseInstallationsApi;
import com.google.firebase.installations.InstallationTokenResult;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigClientException;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigException;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigFetchThrottledException;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigServerException;
import com.google.firebase.remoteconfig.internal.ConfigContainer;
import com.google.firebase.remoteconfig.internal.ConfigFetchHandler;
import com.google.firebase.remoteconfig.internal.ConfigMetadataClient;
import f.a.b.a.a;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public class ConfigFetchHandler {
    public static final String FIRST_OPEN_TIME_KEY = "_fot";
    public static final int HTTP_TOO_MANY_REQUESTS = 429;
    private final Provider<AnalyticsConnector> analyticsConnector;
    private final Clock clock;
    private final Map<String, String> customHttpHeaders;
    private final Executor executor;
    private final ConfigCacheClient fetchedConfigsCache;
    private final FirebaseInstallationsApi firebaseInstallations;
    private final ConfigFetchHttpClient frcBackendApiClient;
    private final ConfigMetadataClient frcMetadata;
    private final Random randomGenerator;
    public static final long DEFAULT_MINIMUM_FETCH_INTERVAL_IN_SECONDS = TimeUnit.HOURS.toSeconds(12);
    public static final int[] BACKOFF_TIME_DURATIONS_IN_MINUTES = {2, 4, 8, 16, 32, 64, 128, 256};

    /* loaded from: classes2.dex */
    public static class FetchResponse {
        private final Date fetchTime;
        private final ConfigContainer fetchedConfigs;
        private final String lastFetchETag;
        private final int status;

        @Retention(RetentionPolicy.SOURCE)
        /* loaded from: classes2.dex */
        public @interface Status {
            public static final int BACKEND_HAS_NO_UPDATES = 1;
            public static final int BACKEND_UPDATES_FETCHED = 0;
            public static final int LOCAL_STORAGE_USED = 2;
        }

        private FetchResponse(Date date, int i2, ConfigContainer configContainer, String str) {
            this.fetchTime = date;
            this.status = i2;
            this.fetchedConfigs = configContainer;
            this.lastFetchETag = str;
        }

        public static FetchResponse forBackendHasNoUpdates(Date date) {
            return new FetchResponse(date, 1, null, null);
        }

        public static FetchResponse forBackendUpdatesFetched(ConfigContainer configContainer, String str) {
            return new FetchResponse(configContainer.getFetchTime(), 0, configContainer, str);
        }

        public static FetchResponse forLocalStorageUsed(Date date) {
            return new FetchResponse(date, 2, null, null);
        }

        public Date getFetchTime() {
            return this.fetchTime;
        }

        public ConfigContainer getFetchedConfigs() {
            return this.fetchedConfigs;
        }

        public String getLastFetchETag() {
            return this.lastFetchETag;
        }

        public int getStatus() {
            return this.status;
        }
    }

    public ConfigFetchHandler(FirebaseInstallationsApi firebaseInstallationsApi, Provider<AnalyticsConnector> provider, Executor executor, Clock clock, Random random, ConfigCacheClient configCacheClient, ConfigFetchHttpClient configFetchHttpClient, ConfigMetadataClient configMetadataClient, Map<String, String> map) {
        this.firebaseInstallations = firebaseInstallationsApi;
        this.analyticsConnector = provider;
        this.executor = executor;
        this.clock = clock;
        this.randomGenerator = random;
        this.fetchedConfigsCache = configCacheClient;
        this.frcBackendApiClient = configFetchHttpClient;
        this.frcMetadata = configMetadataClient;
        this.customHttpHeaders = map;
    }

    private boolean areCachedFetchConfigsValid(long j2, Date date) {
        Date lastSuccessfulFetchTime = this.frcMetadata.getLastSuccessfulFetchTime();
        if (lastSuccessfulFetchTime.equals(ConfigMetadataClient.LAST_FETCH_TIME_NO_FETCH_YET)) {
            return false;
        }
        return date.before(new Date(TimeUnit.SECONDS.toMillis(j2) + lastSuccessfulFetchTime.getTime()));
    }

    private FirebaseRemoteConfigServerException createExceptionWithGenericMessage(FirebaseRemoteConfigServerException firebaseRemoteConfigServerException) {
        String str;
        int httpStatusCode = firebaseRemoteConfigServerException.getHttpStatusCode();
        if (httpStatusCode == 401) {
            str = "The request did not have the required credentials. Please make sure your google-services.json is valid.";
        } else if (httpStatusCode == 403) {
            str = "The user is not authorized to access the project. Please make sure you are using the API key that corresponds to your Firebase project.";
        } else if (httpStatusCode == 429) {
            throw new FirebaseRemoteConfigClientException("The throttled response from the server was not handled correctly by the FRC SDK.");
        } else {
            if (httpStatusCode != 500) {
                switch (httpStatusCode) {
                    case 502:
                    case 503:
                    case 504:
                        str = "The server is unavailable. Please try again later.";
                        break;
                    default:
                        str = "The server returned an unexpected error.";
                        break;
                }
            } else {
                str = "There was an internal server error.";
            }
        }
        return new FirebaseRemoteConfigServerException(firebaseRemoteConfigServerException.getHttpStatusCode(), a.p("Fetch failed: ", str), firebaseRemoteConfigServerException);
    }

    private String createThrottledMessage(long j2) {
        return String.format("Fetch is throttled. Please wait before calling fetch again: %s", DateUtils.formatElapsedTime(TimeUnit.MILLISECONDS.toSeconds(j2)));
    }

    private FetchResponse fetchFromBackend(String str, String str2, Date date) {
        try {
            FetchResponse fetch = this.frcBackendApiClient.fetch(this.frcBackendApiClient.createHttpURLConnection(), str, str2, getUserProperties(), this.frcMetadata.getLastFetchETag(), this.customHttpHeaders, getFirstOpenTime(), date);
            if (fetch.getLastFetchETag() != null) {
                this.frcMetadata.setLastFetchETag(fetch.getLastFetchETag());
            }
            this.frcMetadata.resetBackoff();
            return fetch;
        } catch (FirebaseRemoteConfigServerException e2) {
            ConfigMetadataClient.BackoffMetadata updateAndReturnBackoffMetadata = updateAndReturnBackoffMetadata(e2.getHttpStatusCode(), date);
            if (shouldThrottle(updateAndReturnBackoffMetadata, e2.getHttpStatusCode())) {
                throw new FirebaseRemoteConfigFetchThrottledException(updateAndReturnBackoffMetadata.getBackoffEndTime().getTime());
            }
            throw createExceptionWithGenericMessage(e2);
        }
    }

    private Task<FetchResponse> fetchFromBackendAndCacheResponse(String str, String str2, Date date) {
        try {
            final FetchResponse fetchFromBackend = fetchFromBackend(str, str2, date);
            if (fetchFromBackend.getStatus() != 0) {
                return Tasks.forResult(fetchFromBackend);
            }
            return this.fetchedConfigsCache.put(fetchFromBackend.getFetchedConfigs()).onSuccessTask(this.executor, new SuccessContinuation() { // from class: f.h.e.r.o.f
                @Override // com.google.android.gms.tasks.SuccessContinuation
                public final Task then(Object obj) {
                    ConfigFetchHandler.FetchResponse fetchResponse = ConfigFetchHandler.FetchResponse.this;
                    ConfigContainer configContainer = (ConfigContainer) obj;
                    int[] iArr = ConfigFetchHandler.BACKOFF_TIME_DURATIONS_IN_MINUTES;
                    return Tasks.forResult(fetchResponse);
                }
            });
        } catch (FirebaseRemoteConfigException e2) {
            return Tasks.forException(e2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: fetchIfCacheExpiredAndNotThrottled */
    public Task<FetchResponse> a(Task<ConfigContainer> task, long j2) {
        Task continueWithTask;
        final Date date = new Date(this.clock.currentTimeMillis());
        if (task.isSuccessful() && areCachedFetchConfigsValid(j2, date)) {
            return Tasks.forResult(FetchResponse.forLocalStorageUsed(date));
        }
        Date backoffEndTimeInMillis = getBackoffEndTimeInMillis(date);
        if (backoffEndTimeInMillis != null) {
            continueWithTask = Tasks.forException(new FirebaseRemoteConfigFetchThrottledException(createThrottledMessage(backoffEndTimeInMillis.getTime() - date.getTime()), backoffEndTimeInMillis.getTime()));
        } else {
            final Task<String> id = this.firebaseInstallations.getId();
            final Task<InstallationTokenResult> token = this.firebaseInstallations.getToken(false);
            continueWithTask = Tasks.whenAllComplete(id, token).continueWithTask(this.executor, new Continuation() { // from class: f.h.e.r.o.c
                @Override // com.google.android.gms.tasks.Continuation
                public final Object then(Task task2) {
                    return ConfigFetchHandler.this.b(id, token, date, task2);
                }
            });
        }
        return continueWithTask.continueWithTask(this.executor, new Continuation() { // from class: f.h.e.r.o.e
            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task2) {
                ConfigFetchHandler.this.c(date, task2);
                return task2;
            }
        });
    }

    private Date getBackoffEndTimeInMillis(Date date) {
        Date backoffEndTime = this.frcMetadata.getBackoffMetadata().getBackoffEndTime();
        if (date.before(backoffEndTime)) {
            return backoffEndTime;
        }
        return null;
    }

    private Long getFirstOpenTime() {
        AnalyticsConnector analyticsConnector = this.analyticsConnector.get();
        if (analyticsConnector == null) {
            return null;
        }
        return (Long) analyticsConnector.getUserProperties(true).get(FIRST_OPEN_TIME_KEY);
    }

    private long getRandomizedBackoffDurationInMillis(int i2) {
        TimeUnit timeUnit = TimeUnit.MINUTES;
        int[] iArr = BACKOFF_TIME_DURATIONS_IN_MINUTES;
        long millis = timeUnit.toMillis(iArr[Math.min(i2, iArr.length) - 1]);
        return (millis / 2) + this.randomGenerator.nextInt((int) millis);
    }

    private Map<String, String> getUserProperties() {
        HashMap hashMap = new HashMap();
        AnalyticsConnector analyticsConnector = this.analyticsConnector.get();
        if (analyticsConnector == null) {
            return hashMap;
        }
        for (Map.Entry<String, Object> entry : analyticsConnector.getUserProperties(false).entrySet()) {
            hashMap.put(entry.getKey(), entry.getValue().toString());
        }
        return hashMap;
    }

    private boolean isThrottleableServerError(int i2) {
        return i2 == 429 || i2 == 502 || i2 == 503 || i2 == 504;
    }

    private boolean shouldThrottle(ConfigMetadataClient.BackoffMetadata backoffMetadata, int i2) {
        return backoffMetadata.getNumFailedFetches() > 1 || i2 == 429;
    }

    private ConfigMetadataClient.BackoffMetadata updateAndReturnBackoffMetadata(int i2, Date date) {
        if (isThrottleableServerError(i2)) {
            updateBackoffMetadataWithLastFailedFetchTime(date);
        }
        return this.frcMetadata.getBackoffMetadata();
    }

    private void updateBackoffMetadataWithLastFailedFetchTime(Date date) {
        int numFailedFetches = this.frcMetadata.getBackoffMetadata().getNumFailedFetches() + 1;
        this.frcMetadata.setBackoffMetadata(numFailedFetches, new Date(date.getTime() + getRandomizedBackoffDurationInMillis(numFailedFetches)));
    }

    private void updateLastFetchStatusAndTime(Task<FetchResponse> task, Date date) {
        if (task.isSuccessful()) {
            this.frcMetadata.updateLastFetchAsSuccessfulAt(date);
            return;
        }
        Exception exception = task.getException();
        if (exception == null) {
            return;
        }
        if (exception instanceof FirebaseRemoteConfigFetchThrottledException) {
            this.frcMetadata.updateLastFetchAsThrottled();
        } else {
            this.frcMetadata.updateLastFetchAsFailed();
        }
    }

    public /* synthetic */ Task b(Task task, Task task2, Date date, Task task3) {
        if (!task.isSuccessful()) {
            return Tasks.forException(new FirebaseRemoteConfigClientException("Firebase Installations failed to get installation ID for fetch.", task.getException()));
        }
        if (!task2.isSuccessful()) {
            return Tasks.forException(new FirebaseRemoteConfigClientException("Firebase Installations failed to get installation auth token for fetch.", task2.getException()));
        }
        return fetchFromBackendAndCacheResponse((String) task.getResult(), ((InstallationTokenResult) task2.getResult()).getToken(), date);
    }

    public /* synthetic */ Task c(Date date, Task task) {
        updateLastFetchStatusAndTime(task, date);
        return task;
    }

    public Task<FetchResponse> fetch() {
        return fetch(this.frcMetadata.getMinimumFetchIntervalInSeconds());
    }

    public Provider<AnalyticsConnector> getAnalyticsConnector() {
        return this.analyticsConnector;
    }

    public Task<FetchResponse> fetch(final long j2) {
        return this.fetchedConfigsCache.get().continueWithTask(this.executor, new Continuation() { // from class: f.h.e.r.o.d
            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task) {
                return ConfigFetchHandler.this.a(j2, task);
            }
        });
    }
}
