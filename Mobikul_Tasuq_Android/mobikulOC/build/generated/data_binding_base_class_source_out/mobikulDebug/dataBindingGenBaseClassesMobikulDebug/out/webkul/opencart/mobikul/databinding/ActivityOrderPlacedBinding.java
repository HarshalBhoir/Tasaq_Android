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
import android.widget.Button;
import android.widget.TextView;

public abstract class ActivityOrderPlacedBinding extends ViewDataBinding {
  @NonNull
  public final AppBarLayout appbar;

  @NonNull
  public final Button continue1;

  @NonNull
  public final TextView heading;

  @NonNull
  public final TextView msg;

  @NonNull
  public final TextView placedOrderId;

  @NonNull
  public final View toolbar;

  protected ActivityOrderPlacedBinding(DataBindingComponent _bindingComponent, View _root,
      int _localFieldCount, AppBarLayout appbar, Button continue1, TextView heading, TextView msg,
      TextView placedOrderId, View toolbar) {
    super(_bindingComponent, _root, _localFieldCount);
    this.appbar = appbar;
    this.continue1 = continue1;
    this.heading = heading;
    this.msg = msg;
    this.placedOrderId = placedOrderId;
    this.toolbar = toolbar;
  }

  @NonNull
  public static ActivityOrderPlacedBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static ActivityOrderPlacedBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable DataBindingComponent component) {
    return DataBindingUtil.<ActivityOrderPlacedBinding>inflate(inflater, webkul.opencart.mobikul.R.layout.activity_order_placed, root, attachToRoot, component);
  }

  @NonNull
  public static ActivityOrderPlacedBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static ActivityOrderPlacedBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable DataBindingComponent component) {
    return DataBindingUtil.<ActivityOrderPlacedBinding>inflate(inflater, webkul.opencart.mobikul.R.layout.activity_order_placed, null, false, component);
  }

  public static ActivityOrderPlacedBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  public static ActivityOrderPlacedBinding bind(@NonNull View view,
      @Nullable DataBindingComponent component) {
    return (ActivityOrderPlacedBinding)bind(component, view, webkul.opencart.mobikul.R.layout.activity_order_placed);
  }
}
