package com.arthenica.ffmpegkit;

import org.json.JSONObject;

/* loaded from: classes.dex */
public class StreamInformation {
    public static final String KEY_AVERAGE_FRAME_RATE = "avg_frame_rate";
    public static final String KEY_BIT_RATE = "bit_rate";
    public static final String KEY_CHANNEL_LAYOUT = "channel_layout";
    public static final String KEY_CODEC = "codec_name";
    public static final String KEY_CODEC_LONG = "codec_long_name";
    public static final String KEY_CODEC_TIME_BASE = "codec_time_base";
    public static final String KEY_DISPLAY_ASPECT_RATIO = "display_aspect_ratio";
    public static final String KEY_FORMAT = "pix_fmt";
    public static final String KEY_HEIGHT = "height";
    public static final String KEY_INDEX = "index";
    public static final String KEY_REAL_FRAME_RATE = "r_frame_rate";
    public static final String KEY_SAMPLE_ASPECT_RATIO = "sample_aspect_ratio";
    public static final String KEY_SAMPLE_FORMAT = "sample_fmt";
    public static final String KEY_SAMPLE_RATE = "sample_rate";
    public static final String KEY_TAGS = "tags";
    public static final String KEY_TIME_BASE = "time_base";
    public static final String KEY_TYPE = "codec_type";
    public static final String KEY_WIDTH = "width";
    private final JSONObject jsonObject;

    public StreamInformation(JSONObject jSONObject) {
        this.jsonObject = jSONObject;
    }

    public JSONObject getAllProperties() {
        return this.jsonObject;
    }

    public String getAverageFrameRate() {
        return getStringProperty(KEY_AVERAGE_FRAME_RATE);
    }

    public String getBitrate() {
        return getStringProperty("bit_rate");
    }

    public String getChannelLayout() {
        return getStringProperty(KEY_CHANNEL_LAYOUT);
    }

    public String getCodec() {
        return getStringProperty(KEY_CODEC);
    }

    public String getCodecLong() {
        return getStringProperty(KEY_CODEC_LONG);
    }

    public String getCodecTimeBase() {
        return getStringProperty(KEY_CODEC_TIME_BASE);
    }

    public String getDisplayAspectRatio() {
        return getStringProperty(KEY_DISPLAY_ASPECT_RATIO);
    }

    public String getFormat() {
        return getStringProperty(KEY_FORMAT);
    }

    public Long getHeight() {
        return getNumberProperty(KEY_HEIGHT);
    }

    public Long getIndex() {
        return getNumberProperty("index");
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

    public String getRealFrameRate() {
        return getStringProperty(KEY_REAL_FRAME_RATE);
    }

    public String getSampleAspectRatio() {
        return getStringProperty(KEY_SAMPLE_ASPECT_RATIO);
    }

    public String getSampleFormat() {
        return getStringProperty(KEY_SAMPLE_FORMAT);
    }

    public String getSampleRate() {
        return getStringProperty(KEY_SAMPLE_RATE);
    }

    public String getStringProperty(String str) {
        JSONObject allProperties = getAllProperties();
        if (allProperties != null && allProperties.has(str)) {
            return allProperties.optString(str);
        }
        return null;
    }

    public JSONObject getTags() {
        return getProperty("tags");
    }

    public String getTimeBase() {
        return getStringProperty("time_base");
    }

    public String getType() {
        return getStringProperty(KEY_TYPE);
    }

    public Long getWidth() {
        return getNumberProperty(KEY_WIDTH);
    }
}
