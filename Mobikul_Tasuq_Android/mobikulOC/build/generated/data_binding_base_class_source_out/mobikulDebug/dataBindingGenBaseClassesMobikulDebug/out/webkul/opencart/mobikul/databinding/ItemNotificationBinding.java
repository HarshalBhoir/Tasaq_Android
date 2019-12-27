package webkul.opencart.mobikul.databinding;

import android.databinding.DataBindingComponent;
import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public abstract class ItemNotificationBinding extends ViewDataBinding {
  @NonNull
  public final TextView newNotificationTitle;

  @NonNull
  public final ImageView notificationImage;

  @NonNull
  public final LinearLayout notificationPanel;

  @NonNull
  public final TextView notificationTitle;

  @NonNull
  public final LinearLayout productInfoLayoutList;

  @NonNull
  public final TextView shortDescriptionNotify;

  protected ItemNotificationBinding(DataBindingComponent _bindingComponent, View _root,
      int _localFieldCount, TextView newNotificationTitle, ImageView notificationImage,
      LinearLayout notificationPanel, TextView notificationTitle,
      LinearLayout productInfoLayoutList, TextView shortDescriptionNotify) {
    super(_bindingComponent, _root, _localFieldCount);
    this.newNotificationTitle = newNotificationTitle;
    this.notificationImage = notificationImage;
    this.notificationPanel = notificationPanel;
    this.notificationTitle = notificationTitle;
    this.productInfoLayoutList = productInfoLayoutList;
    this.shortDescriptionNotify = shortDescriptionNotify;
  }

  @NonNull
  public static ItemNotificationBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static ItemNotificationBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable DataBindingComponent component) {
    return DataBindingUtil.<ItemNotificationBinding>inflate(inflater, webkul.opencart.mobikul.R.layout.item_notification, root, attachToRoot, component);
  }

  @NonNull
  public static ItemNotificationBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static ItemNotificationBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable DataBindingComponent component) {
    return DataBindingUtil.<ItemNotificationBinding>inflate(inflater, webkul.opencart.mobikul.R.layout.item_notification, null, false, component);
  }

  public static ItemNotificationBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  public static ItemNotificationBinding bind(@NonNull View view,
      @Nullable DataBindingComponent component) {
    return (ItemNotificationBinding)bind(component, view, webkul.opencart.mobikul.R.layout.item_notification);
  }
}
