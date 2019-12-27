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
import android.widget.TextView;
import webkul.opencart.mobikul.adapterModel.DashBoardOrderAdapterModel;
import webkul.opencart.mobikul.handlers.DashBoardMyOrderHandler;

public abstract class SingleDashboardMyordersLayoutBinding extends ViewDataBinding {
  @NonNull
  public final TextView dateAdded;

  @NonNull
  public final TextView orderId;

  @NonNull
  public final TextView orderName;

  @NonNull
  public final TextView orderProducts;

  @NonNull
  public final TextView orderStatus;

  @NonNull
  public final TextView orderTotal;

  @Bindable
  protected DashBoardOrderAdapterModel mData;

  @Bindable
  protected DashBoardMyOrderHandler mHandler;

  protected SingleDashboardMyordersLayoutBinding(DataBindingComponent _bindingComponent, View _root,
      int _localFieldCount, TextView dateAdded, TextView orderId, TextView orderName,
      TextView orderProducts, TextView orderStatus, TextView orderTotal) {
    super(_bindingComponent, _root, _localFieldCount);
    this.dateAdded = dateAdded;
    this.orderId = orderId;
    this.orderName = orderName;
    this.orderProducts = orderProducts;
    this.orderStatus = orderStatus;
    this.orderTotal = orderTotal;
  }

  public abstract void setData(@Nullable DashBoardOrderAdapterModel data);

  @Nullable
  public DashBoardOrderAdapterModel getData() {
    return mData;
  }

  public abstract void setHandler(@Nullable DashBoardMyOrderHandler handler);

  @Nullable
  public DashBoardMyOrderHandler getHandler() {
    return mHandler;
  }

  @NonNull
  public static SingleDashboardMyordersLayoutBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static SingleDashboardMyordersLayoutBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable DataBindingComponent component) {
    return DataBindingUtil.<SingleDashboardMyordersLayoutBinding>inflate(inflater, webkul.opencart.mobikul.R.layout.single_dashboard_myorders_layout, root, attachToRoot, component);
  }

  @NonNull
  public static SingleDashboardMyordersLayoutBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static SingleDashboardMyordersLayoutBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable DataBindingComponent component) {
    return DataBindingUtil.<SingleDashboardMyordersLayoutBinding>inflate(inflater, webkul.opencart.mobikul.R.layout.single_dashboard_myorders_layout, null, false, component);
  }

  public static SingleDashboardMyordersLayoutBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  public static SingleDashboardMyordersLayoutBinding bind(@NonNull View view,
      @Nullable DataBindingComponent component) {
    return (SingleDashboardMyordersLayoutBinding)bind(component, view, webkul.opencart.mobikul.R.layout.single_dashboard_myorders_layout);
  }
}
