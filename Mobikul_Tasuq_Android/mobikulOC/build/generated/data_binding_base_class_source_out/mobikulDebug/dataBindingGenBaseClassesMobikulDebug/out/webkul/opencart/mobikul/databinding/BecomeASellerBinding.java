package webkul.opencart.mobikul.databinding;

import android.databinding.Bindable;
import android.databinding.DataBindingComponent;
import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.TextInputLayout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import webkul.opencart.mobikul.handlers.BecomeSellerHandler;
import webkul.opencart.mobikul.model.becomeSellerModel.BecomeSeller;

public abstract class BecomeASellerBinding extends ViewDataBinding {
  @NonNull
  public final EditText desc;

  @NonNull
  public final EditText shop;

  @NonNull
  public final TextInputLayout shopLayout;

  @Bindable
  protected BecomeSellerHandler mHandler;

  @Bindable
  protected BecomeSeller mData;

  protected BecomeASellerBinding(DataBindingComponent _bindingComponent, View _root,
      int _localFieldCount, EditText desc, EditText shop, TextInputLayout shopLayout) {
    super(_bindingComponent, _root, _localFieldCount);
    this.desc = desc;
    this.shop = shop;
    this.shopLayout = shopLayout;
  }

  public abstract void setHandler(@Nullable BecomeSellerHandler handler);

  @Nullable
  public BecomeSellerHandler getHandler() {
    return mHandler;
  }

  public abstract void setData(@Nullable BecomeSeller data);

  @Nullable
  public BecomeSeller getData() {
    return mData;
  }

  @NonNull
  public static BecomeASellerBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static BecomeASellerBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable DataBindingComponent component) {
    return DataBindingUtil.<BecomeASellerBinding>inflate(inflater, webkul.opencart.mobikul.R.layout.become_a_seller, root, attachToRoot, component);
  }

  @NonNull
  public static BecomeASellerBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static BecomeASellerBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable DataBindingComponent component) {
    return DataBindingUtil.<BecomeASellerBinding>inflate(inflater, webkul.opencart.mobikul.R.layout.become_a_seller, null, false, component);
  }

  public static BecomeASellerBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  public static BecomeASellerBinding bind(@NonNull View view,
      @Nullable DataBindingComponent component) {
    return (BecomeASellerBinding)bind(component, view, webkul.opencart.mobikul.R.layout.become_a_seller);
  }
}
