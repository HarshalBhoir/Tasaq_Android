package webkul.opencart.mobikul.databinding;

import android.databinding.Bindable;
import android.databinding.DataBindingComponent;
import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import webkul.opencart.mobikul.handlers.ConfirmOrderhandler;

public abstract class FragmentConfirmOrderBinding extends ViewDataBinding {
  @NonNull
  public final Button checkoutContinue;

  @NonNull
  public final RecyclerView confirmOrderRecyclerview;

  @NonNull
  public final LinearLayout productTotalLl;

  @NonNull
  public final ScrollView scrollView;

  @NonNull
  public final CheckBox shipToThisAddress;

  @NonNull
  public final LinearLayout shippingAddress;

  @Bindable
  protected ConfirmOrderhandler mHandler;

  protected FragmentConfirmOrderBinding(DataBindingComponent _bindingComponent, View _root,
      int _localFieldCount, Button checkoutContinue, RecyclerView confirmOrderRecyclerview,
      LinearLayout productTotalLl, ScrollView scrollView, CheckBox shipToThisAddress,
      LinearLayout shippingAddress) {
    super(_bindingComponent, _root, _localFieldCount);
    this.checkoutContinue = checkoutContinue;
    this.confirmOrderRecyclerview = confirmOrderRecyclerview;
    this.productTotalLl = productTotalLl;
    this.scrollView = scrollView;
    this.shipToThisAddress = shipToThisAddress;
    this.shippingAddress = shippingAddress;
  }

  public abstract void setHandler(@Nullable ConfirmOrderhandler handler);

  @Nullable
  public ConfirmOrderhandler getHandler() {
    return mHandler;
  }

  @NonNull
  public static FragmentConfirmOrderBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static FragmentConfirmOrderBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable DataBindingComponent component) {
    return DataBindingUtil.<FragmentConfirmOrderBinding>inflate(inflater, webkul.opencart.mobikul.R.layout.fragment_confirm_order, root, attachToRoot, component);
  }

  @NonNull
  public static FragmentConfirmOrderBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static FragmentConfirmOrderBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable DataBindingComponent component) {
    return DataBindingUtil.<FragmentConfirmOrderBinding>inflate(inflater, webkul.opencart.mobikul.R.layout.fragment_confirm_order, null, false, component);
  }

  public static FragmentConfirmOrderBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  public static FragmentConfirmOrderBinding bind(@NonNull View view,
      @Nullable DataBindingComponent component) {
    return (FragmentConfirmOrderBinding)bind(component, view, webkul.opencart.mobikul.R.layout.fragment_confirm_order);
  }
}
