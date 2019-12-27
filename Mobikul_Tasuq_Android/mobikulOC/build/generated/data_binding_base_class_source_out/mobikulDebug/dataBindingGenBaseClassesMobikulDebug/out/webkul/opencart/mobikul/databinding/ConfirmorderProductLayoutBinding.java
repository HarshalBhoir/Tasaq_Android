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
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import webkul.opencart.mobikul.adapterModel.ConfirmOrderAdapteModel;
import webkul.opencart.mobikul.handlers.ConfirmCheckoutHandler;

public abstract class ConfirmorderProductLayoutBinding extends ViewDataBinding {
  @NonNull
  public final TextView details;

  @NonNull
  public final LinearLayout detailsLayout;

  @NonNull
  public final TextView model;

  @NonNull
  public final TextView optionLayout;

  @NonNull
  public final ImageView orderImg;

  @NonNull
  public final TextView orderProductName;

  @NonNull
  public final TextView qty;

  @NonNull
  public final TextView subtotal;

  @NonNull
  public final TextView unit;

  @Bindable
  protected ConfirmCheckoutHandler mHandler;

  @Bindable
  protected ConfirmOrderAdapteModel mData;

  protected ConfirmorderProductLayoutBinding(DataBindingComponent _bindingComponent, View _root,
      int _localFieldCount, TextView details, LinearLayout detailsLayout, TextView model,
      TextView optionLayout, ImageView orderImg, TextView orderProductName, TextView qty,
      TextView subtotal, TextView unit) {
    super(_bindingComponent, _root, _localFieldCount);
    this.details = details;
    this.detailsLayout = detailsLayout;
    this.model = model;
    this.optionLayout = optionLayout;
    this.orderImg = orderImg;
    this.orderProductName = orderProductName;
    this.qty = qty;
    this.subtotal = subtotal;
    this.unit = unit;
  }

  public abstract void setHandler(@Nullable ConfirmCheckoutHandler handler);

  @Nullable
  public ConfirmCheckoutHandler getHandler() {
    return mHandler;
  }

  public abstract void setData(@Nullable ConfirmOrderAdapteModel data);

  @Nullable
  public ConfirmOrderAdapteModel getData() {
    return mData;
  }

  @NonNull
  public static ConfirmorderProductLayoutBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static ConfirmorderProductLayoutBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable DataBindingComponent component) {
    return DataBindingUtil.<ConfirmorderProductLayoutBinding>inflate(inflater, webkul.opencart.mobikul.R.layout.confirmorder_product_layout, root, attachToRoot, component);
  }

  @NonNull
  public static ConfirmorderProductLayoutBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static ConfirmorderProductLayoutBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable DataBindingComponent component) {
    return DataBindingUtil.<ConfirmorderProductLayoutBinding>inflate(inflater, webkul.opencart.mobikul.R.layout.confirmorder_product_layout, null, false, component);
  }

  public static ConfirmorderProductLayoutBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  public static ConfirmorderProductLayoutBinding bind(@NonNull View view,
      @Nullable DataBindingComponent component) {
    return (ConfirmorderProductLayoutBinding)bind(component, view, webkul.opencart.mobikul.R.layout.confirmorder_product_layout);
  }
}
