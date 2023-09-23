package com.google.firebase.remoteconfig.internal;

import android.content.SharedPreferences;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigInfo;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigSettings;
import java.util.Date;

/* loaded from: classes2.dex */
public class ConfigMetadataClient {
    private static final String BACKOFF_END_TIME_IN_MILLIS_KEY = "backoff_end_time_in_millis";
    private static final String FETCH_TIMEOUT_IN_SECONDS_KEY = "fetch_timeout_in_seconds";
    private static final String LAST_FETCH_ETAG_KEY = "last_fetch_etag";
    private static final String LAST_FETCH_STATUS_KEY = "last_fetch_status";
    public static final long LAST_FETCH_TIME_IN_MILLIS_NO_FETCH_YET = -1;
    private static final String LAST_SUCCESSFUL_FETCH_TIME_IN_MILLIS_KEY = "last_fetch_time_in_millis";
    private static final String MINIMUM_FETCH_INTERVAL_IN_SECONDS_KEY = "minimum_fetch_interval_in_seconds";
    private static final long NO_BACKOFF_TIME_IN_MILLIS = -1;
    public static final int NO_FAILED_FETCHES = 0;
    private static final String NUM_FAILED_FETCHES_KEY = "num_failed_fetches";
    private final SharedPreferences frcMetadata;
    public static final Date LAST_FETCH_TIME_NO_FETCH_YET = new Date(-1);
    public static final Date NO_BACKOFF_TIME = new Date(-1);
    private final Object frcInfoLock = new Object();
    private final Object backoffMetadataLock = new Object();

    /* loaded from: classes2.dex */
    public static class BackoffMetadata {
        private Date backoffEndTime;
        private int numFailedFetches;

        public BackoffMetadata(int i2, Date date) {
            this.numFailedFetches = i2;
            this.backoffEndTime = date;
        }

        public Date getBackoffEndTime() {
            return this.backoffEndTime;
        }

        public int getNumFailedFetches() {
            return this.numFailedFetches;
        }
    }

    public ConfigMetadataClient(SharedPreferences sharedPreferences) {
        this.frcMetadata = sharedPreferences;
    }

    public void clear() {
        synchronized (this.frcInfoLock) {
            this.frcMetadata.edit().clear().commit();
        }
    }

    public BackoffMetadata getBackoffMetadata() {
        BackoffMetadata backoffMetadata;
        synchronized (this.backoffMetadataLock) {
            backoffMetadata = new BackoffMetadata(this.frcMetadata.getInt(NUM_FAILED_FETCHES_KEY, 0), new Date(this.frcMetadata.getLong(BACKOFF_END_TIME_IN_MILLIS_KEY, -1L)));
        }
        return backoffMetadata;
    }

    public long getFetchTimeoutInSeconds() {
        return this.frcMetadata.getLong(FETCH_TIMEOUT_IN_SECONDS_KEY, 60L);
    }

    public FirebaseRemoteConfigInfo getInfo() {
        FirebaseRemoteConfigInfoImpl build;
        synchronized (this.frcInfoLock) {
            long j2 = this.frcMetadata.getLong(LAST_SUCCESSFUL_FETCH_TIME_IN_MILLIS_KEY, -1L);
            int i2 = this.frcMetadata.getInt(LAST_FETCH_STATUS_KEY, 0);
            build = FirebaseRemoteConfigInfoImpl.newBuilder().withLastFetchStatus(i2).withLastSuccessfulFetchTimeInMillis(j2).withConfigSettings(new FirebaseRemoteConfigSettings.Builder().setFetchTimeoutInSeconds(this.frcMetadata.getLong(FETCH_TIMEOUT_IN_SECONDS_KEY, 60L)).setMinimumFetchIntervalInSeconds(this.frcMetadata.getLong(MINIMUM_FETCH_INTERVAL_IN_SECONDS_KEY, ConfigFetchHandler.DEFAULT_MINIMUM_FETCH_INTERVAL_IN_SECONDS)).build()).build();
        }
        return build;
    }

    public String getLastFetchETag() {
        return this.frcMetadata.getString(LAST_FETCH_ETAG_KEY, null);
    }

    public int getLastFetchStatus() {
        return this.frcMetadata.getInt(LAST_FETCH_STATUS_KEY, 0);
    }

    public Date getLastSuccessfulFetchTime() {
        return new Date(this.frcMetadata.getLong(LAST_SUCCESSFUL_FETCH_TIME_IN_MILLIS_KEY, -1L));
    }

    public long getMinimumFetchIntervalInSeconds() {
        return this.frcMetadata.getLong(MINIMUM_FETCH_INTERVAL_IN_SECONDS_KEY, ConfigFetchHandler.DEFAULT_MINIMUM_FETCH_INTERVAL_IN_SECONDS);
    }

    public void resetBackoff() {
        setBackoffMetadata(0, NO_BACKOFF_TIME);
    }

    public void setBackoffMetadata(int i2, Date date) {
        synchronized (this.backoffMetadataLock) {
            this.frcMetadata.edit().putInt(NUM_FAILED_FETCHES_KEY, i2).putLong(BACKOFF_END_TIME_IN_MILLIS_KEY, date.getTime()).apply();
        }
    }

    public void setConfigSettings(FirebaseRemoteConfigSettings firebaseRemoteConfigSettings) {
        synchronized (this.frcInfoLock) {
            this.frcMetadata.edit().putLong(FETCH_TIMEOUT_IN_SECONDS_KEY, firebaseRemoteConfigSettings.getFetchTimeoutInSeconds()).putLong(MINIMUM_FETCH_INTERVAL_IN_SECONDS_KEY, firebaseRemoteConfigSettings.getMinimumFetchIntervalInSeconds()).commit();
        }
    }

    public void setConfigSettingsWithoutWaitingOnDiskWrite(FirebaseRemoteConfigSettings firebaseRemoteConfigSettings) {
        synchronized (this.frcInfoLock) {
            this.frcMetadata.edit().putLong(FETCH_TIMEOUT_IN_SECONDS_KEY, firebaseRemoteConfigSettings.getFetchTimeoutInSeconds()).putLong(MINIMUM_FETCH_INTERVAL_IN_SECONDS_KEY, firebaseRemoteConfigSettings.getMinimumFetchIntervalInSeconds()).apply();
        }
    }

    public void setLastFetchETag(String str) {
        synchronized (this.frcInfoLock) {
            this.frcMetadata.edit().putString(LAST_FETCH_ETAG_KEY, str).apply();
        }
    }

    public void updateLastFetchAsFailed() {
        synchronized (this.frcInfoLock) {
            this.frcMetadata.edit().putInt(LAST_FETCH_STATUS_KEY, 1).apply();
        }
    }

    public void updateLastFetchAsSuccessfulAt(Date date) {
        synchronized (this.frcInfoLock) {
            this.frcMetadata.edit().putInt(LAST_FETCH_STATUS_KEY, -1).putLong(LAST_SUCCESSFUL_FETCH_TIME_IN_MILLIS_KEY, date.getTime()).apply();
        }
    }

    public void updateLastFetchAsThrottled() {
        synchronized (this.frcInfoLock) {
            this.frcMetadata.edit().putInt(LAST_FETCH_STATUS_KEY, 2).apply();
        }
    }
}
