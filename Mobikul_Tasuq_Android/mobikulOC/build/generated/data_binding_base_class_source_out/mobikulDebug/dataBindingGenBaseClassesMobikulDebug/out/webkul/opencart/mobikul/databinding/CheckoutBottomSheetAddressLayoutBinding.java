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
import android.widget.LinearLayout;
import android.widget.TextView;
import webkul.opencart.mobikul.adapterModel.BottomCheckoutAddressModel;
import webkul.opencart.mobikul.handlers.CheckoutBottomSheetAddressHandler;

public abstract class CheckoutBottomSheetAddressLayoutBinding extends ViewDataBinding {
  @NonNull
  public final TextView address;

  @NonNull
  public final LinearLayout ll;

  @NonNull
  public final TextView name;

  @NonNull
  public final TextView postcode;

  @Bindable
  protected BottomCheckoutAddressModel mData;

  @Bindable
  protected CheckoutBottomSheetAddressHandler mHandler;

  protected CheckoutBottomSheetAddressLayoutBinding(DataBindingComponent _bindingComponent,
      View _root, int _localFieldCount, TextView address, LinearLayout ll, TextView name,
      TextView postcode) {
    super(_bindingComponent, _root, _localFieldCount);
    this.address = address;
    this.ll = ll;
    this.name = name;
    this.postcode = postcode;
  }

  public abstract void setData(@Nullable BottomCheckoutAddressModel data);

  @Nullable
  public BottomCheckoutAddressModel getData() {
    return mData;
  }

  public abstract void setHandler(@Nullable CheckoutBottomSheetAddressHandler handler);

  @Nullable
  public CheckoutBottomSheetAddressHandler getHandler() {
    return mHandler;
  }

  @NonNull
  public static CheckoutBottomSheetAddressLayoutBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static CheckoutBottomSheetAddressLayoutBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable DataBindingComponent component) {
    return DataBindingUtil.<CheckoutBottomSheetAddressLayoutBinding>inflate(inflater, webkul.opencart.mobikul.R.layout.checkout_bottom_sheet_address_layout, root, attachToRoot, component);
  }

  @NonNull
  public static CheckoutBottomSheetAddressLayoutBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static CheckoutBottomSheetAddressLayoutBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable DataBindingComponent component) {
    return DataBindingUtil.<CheckoutBottomSheetAddressLayoutBinding>inflate(inflater, webkul.opencart.mobikul.R.layout.checkout_bottom_sheet_address_layout, null, false, component);
  }

  public static CheckoutBottomSheetAddressLayoutBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  public static CheckoutBottomSheetAddressLayoutBinding bind(@NonNull View view,
      @Nullable DataBindingComponent component) {
    return (CheckoutBottomSheetAddressLayoutBinding)bind(component, view, webkul.opencart.mobikul.R.layout.checkout_bottom_sheet_address_layout);
  }
}
