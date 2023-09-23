package com.google.firebase.inappmessaging.internal;

import com.google.internal.firebase.inappmessaging.v1.CampaignProto$ThickContent;
import f.h.g.a.a.a.d.e;

/* loaded from: classes2.dex */
public class TestDeviceHelper {
    public static final String FRESH_INSTALL_PREFERENCES = "fresh_install";
    public static final int MAX_FETCH_COUNT = 5;
    public static final String TEST_DEVICE_PREFERENCES = "test_device";
    private int fetchCount = 0;
    private boolean isFreshInstall = readFreshInstallStatusFromPreferences();
    private boolean isTestDevice = readTestDeviceStatusFromPreferences();
    private final SharedPreferencesUtils sharedPreferencesUtils;

    public TestDeviceHelper(SharedPreferencesUtils sharedPreferencesUtils) {
        this.sharedPreferencesUtils = sharedPreferencesUtils;
    }

    private boolean readFreshInstallStatusFromPreferences() {
        return this.sharedPreferencesUtils.getAndSetBooleanPreference(FRESH_INSTALL_PREFERENCES, true);
    }

    private boolean readTestDeviceStatusFromPreferences() {
        return this.sharedPreferencesUtils.getAndSetBooleanPreference(TEST_DEVICE_PREFERENCES, false);
    }

    private void setFreshInstallStatus(boolean z) {
        this.isFreshInstall = z;
        this.sharedPreferencesUtils.setBooleanPreference(FRESH_INSTALL_PREFERENCES, z);
    }

    private void setTestDeviceStatus(boolean z) {
        this.isTestDevice = z;
        this.sharedPreferencesUtils.setBooleanPreference(TEST_DEVICE_PREFERENCES, z);
    }

    private void updateFreshInstallStatus() {
        if (this.isFreshInstall) {
            int i2 = this.fetchCount + 1;
            this.fetchCount = i2;
            if (i2 >= 5) {
                setFreshInstallStatus(false);
            }
        }
    }

    public boolean isAppInstallFresh() {
        return this.isFreshInstall;
    }

    public boolean isDeviceInTestMode() {
        return this.isTestDevice;
    }

    public void processCampaignFetch(e eVar) {
        if (this.isTestDevice) {
            return;
        }
        updateFreshInstallStatus();
        for (CampaignProto$ThickContent campaignProto$ThickContent : eVar.e()) {
            if (campaignProto$ThickContent.d()) {
                setTestDeviceStatus(true);
                Logging.logi("Setting this device as a test device");
                return;
            }
        }
    }
}
