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
import android.widget.TableRow;
import android.widget.TextView;
import webkul.opencart.mobikul.adapterModel.SellerOrderAdapterModel;
import webkul.opencart.mobikul.handlers.SellerOrderHandler;

public abstract class ItemMyOrderBinding extends ViewDataBinding {
  @NonNull
  public final LinearLayout containerInCardView;

  @NonNull
  public final ImageView floatingvieworder;

  @NonNull
  public final TextView myorderCustomerName;

  @NonNull
  public final TextView myorderId;

  @NonNull
  public final TextView myorderdate;

  @NonNull
  public final TextView myorderordertotal;

  @NonNull
  public final TextView myorderstatus;

  @NonNull
  public final View myview;

  @NonNull
  public final TableRow noOfProRow;

  @NonNull
  public final TextView noOfProducts;

  @NonNull
  public final TextView order;

  @Bindable
  protected SellerOrderAdapterModel mData;

  @Bindable
  protected SellerOrderHandler mHandler;

  protected ItemMyOrderBinding(DataBindingComponent _bindingComponent, View _root,
      int _localFieldCount, LinearLayout containerInCardView, ImageView floatingvieworder,
      TextView myorderCustomerName, TextView myorderId, TextView myorderdate,
      TextView myorderordertotal, TextView myorderstatus, View myview, TableRow noOfProRow,
      TextView noOfProducts, TextView order) {
    super(_bindingComponent, _root, _localFieldCount);
    this.containerInCardView = containerInCardView;
    this.floatingvieworder = floatingvieworder;
    this.myorderCustomerName = myorderCustomerName;
    this.myorderId = myorderId;
    this.myorderdate = myorderdate;
    this.myorderordertotal = myorderordertotal;
    this.myorderstatus = myorderstatus;
    this.myview = myview;
    this.noOfProRow = noOfProRow;
    this.noOfProducts = noOfProducts;
    this.order = order;
  }

  public abstract void setData(@Nullable SellerOrderAdapterModel data);

  @Nullable
  public SellerOrderAdapterModel getData() {
    return mData;
  }

  public abstract void setHandler(@Nullable SellerOrderHandler handler);

  @Nullable
  public SellerOrderHandler getHandler() {
    return mHandler;
  }

  @NonNull
  public static ItemMyOrderBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static ItemMyOrderBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable DataBindingComponent component) {
    return DataBindingUtil.<ItemMyOrderBinding>inflate(inflater, webkul.opencart.mobikul.R.layout.item_my_order, root, attachToRoot, component);
  }

  @NonNull
  public static ItemMyOrderBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static ItemMyOrderBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable DataBindingComponent component) {
    return DataBindingUtil.<ItemMyOrderBinding>inflate(inflater, webkul.opencart.mobikul.R.layout.item_my_order, null, false, component);
  }

  public static ItemMyOrderBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  public static ItemMyOrderBinding bind(@NonNull View view,
      @Nullable DataBindingComponent component) {
    return (ItemMyOrderBinding)bind(component, view, webkul.opencart.mobikul.R.layout.item_my_order);
  }
}
