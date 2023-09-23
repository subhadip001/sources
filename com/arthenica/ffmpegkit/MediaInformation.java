package com.arthenica.ffmpegkit;

import java.util.List;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class MediaInformation {
    public static final String KEY_BIT_RATE = "bit_rate";
    public static final String KEY_DURATION = "duration";
    public static final String KEY_FILENAME = "filename";
    public static final String KEY_FORMAT = "format_name";
    public static final String KEY_FORMAT_LONG = "format_long_name";
    public static final String KEY_FORMAT_PROPERTIES = "format";
    public static final String KEY_SIZE = "size";
    public static final String KEY_START_TIME = "start_time";
    public static final String KEY_TAGS = "tags";
    private final List<Chapter> chapters;
    private final JSONObject jsonObject;
    private final List<StreamInformation> streams;

    public MediaInformation(JSONObject jSONObject, List<StreamInformation> list, List<Chapter> list2) {
        this.jsonObject = jSONObject;
        this.streams = list;
        this.chapters = list2;
    }

    public JSONObject getAllProperties() {
        return this.jsonObject;
    }

    public String getBitrate() {
        return getStringFormatProperty("bit_rate");
    }

    public List<Chapter> getChapters() {
        return this.chapters;
    }

    public String getDuration() {
        return getStringFormatProperty(KEY_DURATION);
    }

    public String getFilename() {
        return getStringFormatProperty(KEY_FILENAME);
    }

    public String getFormat() {
        return getStringFormatProperty(KEY_FORMAT);
    }

    public JSONObject getFormatProperties() {
        return this.jsonObject.optJSONObject(KEY_FORMAT_PROPERTIES);
    }

    public JSONObject getFormatProperty(String str) {
        JSONObject formatProperties = getFormatProperties();
        if (formatProperties == null) {
            return null;
        }
        return formatProperties.optJSONObject(str);
    }

    public String getLongFormat() {
        return getStringFormatProperty(KEY_FORMAT_LONG);
    }

    public Long getNumberFormatProperty(String str) {
        JSONObject formatProperties = getFormatProperties();
        if (formatProperties != null && formatProperties.has(str)) {
            return Long.valueOf(formatProperties.optLong(str));
        }
        return null;
    }

    public Long getNumberProperty(String str) {
        JSONObject allProperties = getAllProperties();
        if (allProperties != null && allProperties.has(str)) {
            return Long.valueOf(allProperties.optLong(str));
        }
        return null;
    }

    public JSONObject getProperty(String str) {
        JSONObject allProperties = getAllProperties();
        if (allProperties == null) {
            return null;
        }
        return allProperties.optJSONObject(str);
    }

    public String getSize() {
        return getStringFormatProperty(KEY_SIZE);
    }

    public String getStartTime() {
        return getStringFormatProperty("start_time");
    }

    public List<StreamInformation> getStreams() {
        return this.streams;
    }

    public String getStringFormatProperty(String str) {
        JSONObject formatProperties = getFormatProperties();
        if (formatProperties != null && formatProperties.has(str)) {
            return formatProperties.optString(str);
        }
        return null;
    }

    public String getStringProperty(String str) {
        JSONObject allProperties = getAllProperties();
        if (allProperties != null && allProperties.has(str)) {
            return allProperties.optString(str);
        }
        return null;
    }

    public JSONObject getTags() {
        return getFormatProperty("tags");
    }
}
