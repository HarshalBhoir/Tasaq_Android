package webkul.opencart.mobikul.databinding;

import android.databinding.Bindable;
import android.databinding.DataBindingComponent;
import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.widget.CardView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.Spinner;
import android.widget.TextView;
import webkul.opencart.mobikul.handlers.BillingHandler;

public abstract class FragmentBillingAddressBinding extends ViewDataBinding {
  @NonNull
  public final LinearLayout address;

  @NonNull
  public final LinearLayout billingCheckoutContinue;

  @NonNull
  public final Spinner countrySpinner;

  @NonNull
  public final TextView defaultAddress;

  @NonNull
  public final TextView editChangeAddress;

  @NonNull
  public final TextView errorTv;

  @NonNull
  public final CardView mainCard;

  @NonNull
  public final CardView newaddress;

  @NonNull
  public final ScrollView scrollView;

  @NonNull
  public final CheckBox shipToThisAddress;

  @Bindable
  protected BillingHandler mHandler;

  protected FragmentBillingAddressBinding(DataBindingComponent _bindingComponent, View _root,
      int _localFieldCount, LinearLayout address, LinearLayout billingCheckoutContinue,
      Spinner countrySpinner, TextView defaultAddress, TextView editChangeAddress, TextView errorTv,
      CardView mainCard, CardView newaddress, ScrollView scrollView, CheckBox shipToThisAddress) {
    super(_bindingComponent, _root, _localFieldCount);
    this.address = address;
    this.billingCheckoutContinue = billingCheckoutContinue;
    this.countrySpinner = countrySpinner;
    this.defaultAddress = defaultAddress;
    this.editChangeAddress = editChangeAddress;
    this.errorTv = errorTv;
    this.mainCard = mainCard;
    this.newaddress = newaddress;
    this.scrollView = scrollView;
    this.shipToThisAddress = shipToThisAddress;
  }

  public abstract void setHandler(@Nullable BillingHandler handler);

  @Nullable
  public BillingHandler getHandler() {
    return mHandler;
  }

  @NonNull
  public static FragmentBillingAddressBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static FragmentBillingAddressBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable DataBindingComponent component) {
    return DataBindingUtil.<FragmentBillingAddressBinding>inflate(inflater, webkul.opencart.mobikul.R.layout.fragment_billing_address, root, attachToRoot, component);
  }

  @NonNull
  public static FragmentBillingAddressBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static FragmentBillingAddressBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable DataBindingComponent component) {
    return DataBindingUtil.<FragmentBillingAddressBinding>inflate(inflater, webkul.opencart.mobikul.R.layout.fragment_billing_address, null, false, component);
  }

  public static FragmentBillingAddressBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  public static FragmentBillingAddressBinding bind(@NonNull View view,
      @Nullable DataBindingComponent component) {
    return (FragmentBillingAddressBinding)bind(component, view, webkul.opencart.mobikul.R.layout.fragment_billing_address);
  }
}
