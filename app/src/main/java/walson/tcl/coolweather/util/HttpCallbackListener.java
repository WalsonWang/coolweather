package walson.tcl.coolweather.util;

/**
 * Created by 93766 on 8/5/2015.
 */
public interface HttpCallbackListener {
    void onFinish(String response);
    void onError(Exception e);
}
