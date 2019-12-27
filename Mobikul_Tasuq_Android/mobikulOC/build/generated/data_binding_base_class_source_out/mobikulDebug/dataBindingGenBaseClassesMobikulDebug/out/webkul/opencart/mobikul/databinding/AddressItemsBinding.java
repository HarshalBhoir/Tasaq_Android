package webkul.opencart.mobikul.databinding;

import android.databinding.Bindable;
import android.databinding.DataBindingComponent;
import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.button.MaterialButton;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import webkul.opencart.mobikul.adapterModel.GetAddressAdaperModel;
import webkul.opencart.mobikul.handlers.GetAddressHandler;

public abstract class AddressItemsBinding extends ViewDataBinding {
  @NonNull
  public final TextView addrbookdefaultValue;

  @NonNull
  public final MaterialButton deleteBtn;

  @NonNull
  public final MaterialButton editBtn;

  @NonNull
  public final ImageView editOption;

  @Bindable
  protected GetAddressAdaperModel mData;

  @Bindable
  protected GetAddressHandler mHandler;

  protected AddressItemsBinding(DataBindingComponent _bindingComponent, View _root,
      int _localFieldCount, TextView addrbookdefaultValue, MaterialButton deleteBtn,
      MaterialButton editBtn, ImageView editOption) {
    super(_bindingComponent, _root, _localFieldCount);
    this.addrbookdefaultValue = addrbookdefaultValue;
    this.deleteBtn = deleteBtn;
    this.editBtn = editBtn;
    this.editOption = editOption;
  }

  public abstract void setData(@Nullable GetAddressAdaperModel data);

  @Nullable
  public GetAddressAdaperModel getData() {
    return mData;
  }

  public abstract void setHandler(@Nullable GetAddressHandler handler);

  @Nullable
  public GetAddressHandler getHandler() {
    return mHandler;
  }

  @NonNull
  public static AddressItemsBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static AddressItemsBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable DataBindingComponent component) {
    return DataBindingUtil.<AddressItemsBinding>inflate(inflater, webkul.opencart.mobikul.R.layout.address_items, root, attachToRoot, component);
  }

  @NonNull
  public static AddressItemsBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static AddressItemsBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable DataBindingComponent component) {
    return DataBindingUtil.<AddressItemsBinding>inflate(inflater, webkul.opencart.mobikul.R.layout.address_items, null, false, component);
  }

  public static AddressItemsBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  public static AddressItemsBinding bind(@NonNull View view,
      @Nullable DataBindingComponent component) {
    return (AddressItemsBinding)bind(component, view, webkul.opencart.mobikul.R.layout.address_items);
  }
}
