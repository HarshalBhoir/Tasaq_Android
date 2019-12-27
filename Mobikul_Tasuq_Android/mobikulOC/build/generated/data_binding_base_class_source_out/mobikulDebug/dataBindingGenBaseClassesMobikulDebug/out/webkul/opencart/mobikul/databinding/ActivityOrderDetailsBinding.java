package webkul.opencart.mobikul.databinding;

import android.databinding.DataBindingComponent;
import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public abstract class ActivityOrderDetailsBinding extends ViewDataBinding {
  @NonNull
  public final View toolbar;

  protected ActivityOrderDetailsBinding(DataBindingComponent _bindingComponent, View _root,
      int _localFieldCount, View toolbar) {
    super(_bindingComponent, _root, _localFieldCount);
    this.toolbar = toolbar;
  }

  @NonNull
  public static ActivityOrderDetailsBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static ActivityOrderDetailsBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable DataBindingComponent component) {
    return DataBindingUtil.<ActivityOrderDetailsBinding>inflate(inflater, webkul.opencart.mobikul.R.layout.activity_order_details, root, attachToRoot, component);
  }

  @NonNull
  public static ActivityOrderDetailsBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static ActivityOrderDetailsBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable DataBindingComponent component) {
    return DataBindingUtil.<ActivityOrderDetailsBinding>inflate(inflater, webkul.opencart.mobikul.R.layout.activity_order_details, null, false, component);
  }

  public static ActivityOrderDetailsBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  public static ActivityOrderDetailsBinding bind(@NonNull View view,
      @Nullable DataBindingComponent component) {
    return (ActivityOrderDetailsBinding)bind(component, view, webkul.opencart.mobikul.R.layout.activity_order_details);
  }
}
