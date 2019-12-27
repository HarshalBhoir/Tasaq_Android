package webkul.opencart.mobikul.databinding;

import android.databinding.DataBindingComponent;
import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

public abstract class GdprNotificationInfoLayoutBinding extends ViewDataBinding {
  @NonNull
  public final Button close;

  @NonNull
  public final TextView content;

  protected GdprNotificationInfoLayoutBinding(DataBindingComponent _bindingComponent, View _root,
      int _localFieldCount, Button close, TextView content) {
    super(_bindingComponent, _root, _localFieldCount);
    this.close = close;
    this.content = content;
  }

  @NonNull
  public static GdprNotificationInfoLayoutBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static GdprNotificationInfoLayoutBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable DataBindingComponent component) {
    return DataBindingUtil.<GdprNotificationInfoLayoutBinding>inflate(inflater, webkul.opencart.mobikul.R.layout.gdpr_notification_info_layout, root, attachToRoot, component);
  }

  @NonNull
  public static GdprNotificationInfoLayoutBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static GdprNotificationInfoLayoutBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable DataBindingComponent component) {
    return DataBindingUtil.<GdprNotificationInfoLayoutBinding>inflate(inflater, webkul.opencart.mobikul.R.layout.gdpr_notification_info_layout, null, false, component);
  }

  public static GdprNotificationInfoLayoutBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  public static GdprNotificationInfoLayoutBinding bind(@NonNull View view,
      @Nullable DataBindingComponent component) {
    return (GdprNotificationInfoLayoutBinding)bind(component, view, webkul.opencart.mobikul.R.layout.gdpr_notification_info_layout);
  }
}
