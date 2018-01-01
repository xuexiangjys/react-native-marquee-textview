package com.xuexiang.marqueetextview;

import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.uimanager.SimpleViewManager;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.annotations.ReactProp;

import java.util.ArrayList;
import java.util.List;

/**
 * @author xuexiang
 * @date 2017/12/26 上午11:55
 */
public class MarqueeViewManager extends SimpleViewManager<MarqueeTextView> {
    /**
     * @return the name of this view manager. This will be the name used to reference this view
     * manager from JavaScript in createReactNativeComponentClass.
     */
    @Override
    public String getName() {
        return "MarqueeTextView";
    }

    /**
     * Subclasses should return a new View instance of the proper type.
     *
     * @param reactContext
     */
    @Override
    protected MarqueeTextView createViewInstance(ThemedReactContext reactContext) {
        return new MarqueeTextView(reactContext);
    }

    @ReactProp(name = "items")
    public void setItems(MarqueeTextView view, ReadableArray array) {
        List<String> items = new ArrayList<>();
        for(int i = 0; i < array.size(); i++) {
            items.add(array.getString(i));
        }
        view.startSimpleRoll(items);
    }


}
