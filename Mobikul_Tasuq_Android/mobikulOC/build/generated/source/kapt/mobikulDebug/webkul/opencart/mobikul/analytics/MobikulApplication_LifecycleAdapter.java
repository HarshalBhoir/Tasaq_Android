package webkul.opencart.mobikul.analytics;

import android.arch.lifecycle.GeneratedAdapter;
import android.arch.lifecycle.Lifecycle;
import android.arch.lifecycle.LifecycleOwner;
import android.arch.lifecycle.MethodCallsLogger;
import java.lang.Override;

public class MobikulApplication_LifecycleAdapter implements GeneratedAdapter {
  final MobikulApplication mReceiver;

  MobikulApplication_LifecycleAdapter(MobikulApplication receiver) {
    this.mReceiver = receiver;
  }

  @Override
  public void callMethods(LifecycleOwner owner, Lifecycle.Event event, boolean onAny,
      MethodCallsLogger logger) {
    boolean hasLogger = logger != null;
    if (onAny) {
      return;
    }
    if (event == Lifecycle.Event.ON_STOP) {
      if (!hasLogger || logger.approveCall("onStop$mobikulOC_mobikulDebug", 1)) {
        mReceiver.onStop$mobikulOC_mobikulDebug();
      }
      return;
    }
    if (event == Lifecycle.Event.ON_START) {
      if (!hasLogger || logger.approveCall("onStart$mobikulOC_mobikulDebug", 1)) {
        mReceiver.onStart$mobikulOC_mobikulDebug();
      }
      return;
    }
  }
}
