package webkul.opencart.mobikul.databinding;

import android.databinding.DataBindingComponent;
import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

public abstract class ActivityArBinding extends ViewDataBinding {
  @NonNull
  public final FrameLayout arLayout;

  protected ActivityArBinding(DataBindingComponent _bindingComponent, View _root,
      int _localFieldCount, FrameLayout arLayout) {
    super(_bindingComponent, _root, _localFieldCount);
    this.arLayout = arLayout;
  }

  @NonNull
  public static ActivityArBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static ActivityArBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable DataBindingComponent component) {
    return DataBindingUtil.<ActivityArBinding>inflate(inflater, webkul.opencart.mobikul.R.layout.activity_ar, root, attachToRoot, component);
  }

  @NonNull
  public static ActivityArBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static ActivityArBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable DataBindingComponent component) {
    return DataBindingUtil.<ActivityArBinding>inflate(inflater, webkul.opencart.mobikul.R.layout.activity_ar, null, false, component);
  }

  public static ActivityArBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  public static ActivityArBinding bind(@NonNull View view,
      @Nullable DataBindingComponent component) {
    return (ActivityArBinding)bind(component, view, webkul.opencart.mobikul.R.layout.activity_ar);
  }
}
