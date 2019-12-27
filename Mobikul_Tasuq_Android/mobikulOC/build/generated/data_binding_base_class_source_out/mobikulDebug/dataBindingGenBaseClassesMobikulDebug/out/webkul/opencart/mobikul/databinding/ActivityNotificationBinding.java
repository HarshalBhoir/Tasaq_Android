package webkul.opencart.mobikul.databinding;

import android.databinding.DataBindingComponent;
import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;

public abstract class ActivityNotificationBinding extends ViewDataBinding {
  @NonNull
  public final TextView header;

  @NonNull
  public final ProgressBar mainProgressBar;

  @NonNull
  public final TextView noNotification;

  @NonNull
  public final LinearLayout notificationContainer;

  @NonNull
  public final LinearLayout notificationLayout;

  protected ActivityNotificationBinding(DataBindingComponent _bindingComponent, View _root,
      int _localFieldCount, TextView header, ProgressBar mainProgressBar, TextView noNotification,
      LinearLayout notificationContainer, LinearLayout notificationLayout) {
    super(_bindingComponent, _root, _localFieldCount);
    this.header = header;
    this.mainProgressBar = mainProgressBar;
    this.noNotification = noNotification;
    this.notificationContainer = notificationContainer;
    this.notificationLayout = notificationLayout;
  }

  @NonNull
  public static ActivityNotificationBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static ActivityNotificationBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable DataBindingComponent component) {
    return DataBindingUtil.<ActivityNotificationBinding>inflate(inflater, webkul.opencart.mobikul.R.layout.activity_notification, root, attachToRoot, component);
  }

  @NonNull
  public static ActivityNotificationBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static ActivityNotificationBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable DataBindingComponent component) {
    return DataBindingUtil.<ActivityNotificationBinding>inflate(inflater, webkul.opencart.mobikul.R.layout.activity_notification, null, false, component);
  }

  public static ActivityNotificationBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  public static ActivityNotificationBinding bind(@NonNull View view,
      @Nullable DataBindingComponent component) {
    return (ActivityNotificationBinding)bind(component, view, webkul.opencart.mobikul.R.layout.activity_notification);
  }
}
