package com.google.firebase.database.connection.util;

import com.google.firebase.database.logging.LogWrapper;
import com.google.firebase.database.logging.Logger;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import java.util.Random;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public class RetryHelper {
    private long currentRetryDelay;
    private final ScheduledExecutorService executorService;
    private final double jitterFactor;
    private boolean lastWasSuccess;
    private final LogWrapper logger;
    private final long maxRetryDelay;
    private final long minRetryDelayAfterFailure;
    private final Random random;
    private final double retryExponent;
    private ScheduledFuture<?> scheduledRetry;

    /* loaded from: classes2.dex */
    public static class Builder {
        private final LogWrapper logger;
        private final ScheduledExecutorService service;
        private long minRetryDelayAfterFailure = 1000;
        private double jitterFactor = 0.5d;
        private long retryMaxDelay = 30000;
        private double retryExponent = 1.3d;

        public Builder(ScheduledExecutorService scheduledExecutorService, Logger logger, String str) {
            this.service = scheduledExecutorService;
            this.logger = new LogWrapper(logger, str);
        }

        public RetryHelper build() {
            return new RetryHelper(this.service, this.logger, this.minRetryDelayAfterFailure, this.retryMaxDelay, this.retryExponent, this.jitterFactor);
        }

        public Builder withJitterFactor(double d2) {
            if (d2 >= FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE && d2 <= 1.0d) {
                this.jitterFactor = d2;
                return this;
            }
            throw new IllegalArgumentException("Argument out of range: " + d2);
        }

        public Builder withMaxDelay(long j2) {
            this.retryMaxDelay = j2;
            return this;
        }

        public Builder withMinDelayAfterFailure(long j2) {
            this.minRetryDelayAfterFailure = j2;
            return this;
        }

        public Builder withRetryExponent(double d2) {
            this.retryExponent = d2;
            return this;
        }
    }

    public void cancel() {
        if (this.scheduledRetry != null) {
            this.logger.debug("Cancelling existing retry attempt", new Object[0]);
            this.scheduledRetry.cancel(false);
            this.scheduledRetry = null;
        } else {
            this.logger.debug("No existing retry attempt to cancel", new Object[0]);
        }
        this.currentRetryDelay = 0L;
    }

    public void retry(final Runnable runnable) {
        Runnable runnable2 = new Runnable() { // from class: com.google.firebase.database.connection.util.RetryHelper.1
            @Override // java.lang.Runnable
            public void run() {
                RetryHelper.this.scheduledRetry = null;
                runnable.run();
            }
        };
        if (this.scheduledRetry != null) {
            this.logger.debug("Cancelling previous scheduled retry", new Object[0]);
            this.scheduledRetry.cancel(false);
            this.scheduledRetry = null;
        }
        long j2 = 0;
        if (!this.lastWasSuccess) {
            long j3 = this.currentRetryDelay;
            if (j3 == 0) {
                this.currentRetryDelay = this.minRetryDelayAfterFailure;
            } else {
                this.currentRetryDelay = Math.min((long) (j3 * this.retryExponent), this.maxRetryDelay);
            }
            double d2 = this.jitterFactor;
            long j4 = this.currentRetryDelay;
            j2 = (long) ((this.random.nextDouble() * d2 * j4) + ((1.0d - d2) * j4));
        }
        this.lastWasSuccess = false;
        this.logger.debug("Scheduling retry in %dms", Long.valueOf(j2));
        this.scheduledRetry = this.executorService.schedule(runnable2, j2, TimeUnit.MILLISECONDS);
    }

    public void setMaxDelay() {
        this.currentRetryDelay = this.maxRetryDelay;
    }

    public void signalSuccess() {
        this.lastWasSuccess = true;
        this.currentRetryDelay = 0L;
    }

    private RetryHelper(ScheduledExecutorService scheduledExecutorService, LogWrapper logWrapper, long j2, long j3, double d2, double d3) {
        this.random = new Random();
        this.lastWasSuccess = true;
        this.executorService = scheduledExecutorService;
        this.logger = logWrapper;
        this.minRetryDelayAfterFailure = j2;
        this.maxRetryDelay = j3;
        this.retryExponent = d2;
        this.jitterFactor = d3;
    }
}
