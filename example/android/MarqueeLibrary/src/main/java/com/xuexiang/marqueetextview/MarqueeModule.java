package com.xuexiang.marqueetextview;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.WritableArray;

/**
 * @author xuexiang
 * @date 2018/1/1 下午11:35
 */
public class MarqueeModule extends ReactContextBaseJavaModule {

    public MarqueeModule(ReactApplicationContext reactContext) {
        super(reactContext);
    }

    @Override
    public String getName() {
        return "MarqueeModule";
    }

    @ReactMethod
    public void getDisplayEntity(String displayData, Promise promise) {
        try {
            String[] displayItem = displayData.split("\\|");
            WritableArray array = Arguments.fromArray(displayItem);
            promise.resolve(array);
        } catch (Exception e) {
            e.printStackTrace();
            promise.reject(e);
        }

    }
}
