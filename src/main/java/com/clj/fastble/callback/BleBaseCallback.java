package com.clj.fastble.callback;


import android.os.Bundle;
import android.os.Handler;

public abstract class BleBaseCallback {

    private String key;
    private Handler handler;
    private BleImmedimmediateCallback bleImmedimmediateCallback;

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public Handler getHandler() {
        return handler;
    }

    public void setHandler(Handler handler) {
        this.handler = handler;
    }

    public BleImmedimmediateCallback getBleImmedimmediateCallback() {
        return bleImmedimmediateCallback;
    }

    public void setBleImmedimmediateCallback(BleImmedimmediateCallback bleImmedimmediateCallback) {
        this.bleImmedimmediateCallback = bleImmedimmediateCallback;
    }

    public interface BleImmedimmediateCallback {
        public void bleCallBackImmediate(Object key, Bundle bundle, Object callback);
    }

    public boolean isImmediate() {
        return false;
    }
}
