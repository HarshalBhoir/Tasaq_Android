package webkul.opencart.mobikul.databinding;

import android.databinding.Bindable;
import android.databinding.DataBindingComponent;
import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import webkul.opencart.mobikul.handlers.BottomNavigationHandler;

public abstract class BottomNavigationBinding extends ViewDataBinding {
  @NonNull
  public final ImageView bottomAccount;

  @NonNull
  public final ImageView bottomCategory;

  @NonNull
  public final TextView bottomCategoryTv;

  @NonNull
  public final ImageView bottomHome;

  @NonNull
  public final TextView bottomHomeTv;

  @NonNull
  public final LinearLayout bottomLayout;

  @NonNull
  public final ImageView bottomNotification;

  @NonNull
  public final TextView bottomNotificationTv;

  @NonNull
  public final TextView bottomProfileTv;

  @NonNull
  public final LinearLayoutCompat categoryLl;

  @NonNull
  public final LinearLayoutCompat homeLl;

  @NonNull
  public final LinearLayoutCompat notificationLl;

  @NonNull
  public final LinearLayoutCompat profileLl;

  @Bindable
  protected BottomNavigationHandler mHandler;

  protected BottomNavigationBinding(DataBindingComponent _bindingComponent, View _root,
      int _localFieldCount, ImageView bottomAccount, ImageView bottomCategory,
      TextView bottomCategoryTv, ImageView bottomHome, TextView bottomHomeTv,
      LinearLayout bottomLayout, ImageView bottomNotification, TextView bottomNotificationTv,
      TextView bottomProfileTv, LinearLayoutCompat categoryLl, LinearLayoutCompat homeLl,
      LinearLayoutCompat notificationLl, LinearLayoutCompat profileLl) {
    super(_bindingComponent, _root, _localFieldCount);
    this.bottomAccount = bottomAccount;
    this.bottomCategory = bottomCategory;
    this.bottomCategoryTv = bottomCategoryTv;
    this.bottomHome = bottomHome;
    this.bottomHomeTv = bottomHomeTv;
    this.bottomLayout = bottomLayout;
    this.bottomNotification = bottomNotification;
    this.bottomNotificationTv = bottomNotificationTv;
    this.bottomProfileTv = bottomProfileTv;
    this.categoryLl = categoryLl;
    this.homeLl = homeLl;
    this.notificationLl = notificationLl;
    this.profileLl = profileLl;
  }

  public abstract void setHandler(@Nullable BottomNavigationHandler handler);

  @Nullable
  public BottomNavigationHandler getHandler() {
    return mHandler;
  }

  @NonNull
  public static BottomNavigationBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static BottomNavigationBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable DataBindingComponent component) {
    return DataBindingUtil.<BottomNavigationBinding>inflate(inflater, webkul.opencart.mobikul.R.layout.bottom_navigation, root, attachToRoot, component);
  }

  @NonNull
  public static BottomNavigationBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static BottomNavigationBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable DataBindingComponent component) {
    return DataBindingUtil.<BottomNavigationBinding>inflate(inflater, webkul.opencart.mobikul.R.layout.bottom_navigation, null, false, component);
  }

  public static BottomNavigationBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  public static BottomNavigationBinding bind(@NonNull View view,
      @Nullable DataBindingComponent component) {
    return (BottomNavigationBinding)bind(component, view, webkul.opencart.mobikul.R.layout.bottom_navigation);
  }
}
