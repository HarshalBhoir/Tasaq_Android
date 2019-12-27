package webkul.opencart.mobikul.databinding;

import android.databinding.DataBindingComponent;
import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.AppBarLayout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

public abstract class ActivityOtherBinding extends ViewDataBinding {
  @NonNull
  public final AppBarLayout appbar;

  @NonNull
  public final LinearLayout layout;

  @NonNull
  public final LinearLayout layoutOthers;

  @NonNull
  public final RelativeLayout listCategoryContainer;

  @NonNull
  public final TextView notificationOthersTitle;

  @NonNull
  public final TextView shortDescriptionNotifyOthers;

  @NonNull
  public final View toolbar;

  protected ActivityOtherBinding(DataBindingComponent _bindingComponent, View _root,
      int _localFieldCount, AppBarLayout appbar, LinearLayout layout, LinearLayout layoutOthers,
      RelativeLayout listCategoryContainer, TextView notificationOthersTitle,
      TextView shortDescriptionNotifyOthers, View toolbar) {
    super(_bindingComponent, _root, _localFieldCount);
    this.appbar = appbar;
    this.layout = layout;
    this.layoutOthers = layoutOthers;
    this.listCategoryContainer = listCategoryContainer;
    this.notificationOthersTitle = notificationOthersTitle;
    this.shortDescriptionNotifyOthers = shortDescriptionNotifyOthers;
    this.toolbar = toolbar;
  }

  @NonNull
  public static ActivityOtherBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static ActivityOtherBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable DataBindingComponent component) {
    return DataBindingUtil.<ActivityOtherBinding>inflate(inflater, webkul.opencart.mobikul.R.layout.activity_other, root, attachToRoot, component);
  }

  @NonNull
  public static ActivityOtherBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static ActivityOtherBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable DataBindingComponent component) {
    return DataBindingUtil.<ActivityOtherBinding>inflate(inflater, webkul.opencart.mobikul.R.layout.activity_other, null, false, component);
  }

  public static ActivityOtherBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  public static ActivityOtherBinding bind(@NonNull View view,
      @Nullable DataBindingComponent component) {
    return (ActivityOtherBinding)bind(component, view, webkul.opencart.mobikul.R.layout.activity_other);
  }
}
