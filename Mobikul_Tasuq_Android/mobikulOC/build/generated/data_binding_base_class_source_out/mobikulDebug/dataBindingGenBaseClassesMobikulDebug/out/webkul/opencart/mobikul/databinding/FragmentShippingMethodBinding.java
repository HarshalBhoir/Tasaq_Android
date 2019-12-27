package webkul.opencart.mobikul.databinding;

import android.databinding.Bindable;
import android.databinding.DataBindingComponent;
import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import webkul.opencart.mobikul.handlers.ShippingHandler;

public abstract class FragmentShippingMethodBinding extends ViewDataBinding {
  @NonNull
  public final Button checkoutContinue;

  @NonNull
  public final EditText comment;

  @NonNull
  public final TextView errorTv;

  @NonNull
  public final CheckBox gdprCheckbox;

  @NonNull
  public final LinearLayout shippingMethod;

  @NonNull
  public final LinearLayout shippingMethodCostLl;

  @NonNull
  public final LinearLayout shippingMethodLl;

  @Bindable
  protected ShippingHandler mHandler;

  protected FragmentShippingMethodBinding(DataBindingComponent _bindingComponent, View _root,
      int _localFieldCount, Button checkoutContinue, EditText comment, TextView errorTv,
      CheckBox gdprCheckbox, LinearLayout shippingMethod, LinearLayout shippingMethodCostLl,
      LinearLayout shippingMethodLl) {
    super(_bindingComponent, _root, _localFieldCount);
    this.checkoutContinue = checkoutContinue;
    this.comment = comment;
    this.errorTv = errorTv;
    this.gdprCheckbox = gdprCheckbox;
    this.shippingMethod = shippingMethod;
    this.shippingMethodCostLl = shippingMethodCostLl;
    this.shippingMethodLl = shippingMethodLl;
  }

  public abstract void setHandler(@Nullable ShippingHandler handler);

  @Nullable
  public ShippingHandler getHandler() {
    return mHandler;
  }

  @NonNull
  public static FragmentShippingMethodBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static FragmentShippingMethodBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable DataBindingComponent component) {
    return DataBindingUtil.<FragmentShippingMethodBinding>inflate(inflater, webkul.opencart.mobikul.R.layout.fragment_shipping_method, root, attachToRoot, component);
  }

  @NonNull
  public static FragmentShippingMethodBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static FragmentShippingMethodBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable DataBindingComponent component) {
    return DataBindingUtil.<FragmentShippingMethodBinding>inflate(inflater, webkul.opencart.mobikul.R.layout.fragment_shipping_method, null, false, component);
  }

  public static FragmentShippingMethodBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  public static FragmentShippingMethodBinding bind(@NonNull View view,
      @Nullable DataBindingComponent component) {
    return (FragmentShippingMethodBinding)bind(component, view, webkul.opencart.mobikul.R.layout.fragment_shipping_method);
  }
}
