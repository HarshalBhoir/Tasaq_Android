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
import android.widget.ProgressBar;
import android.widget.TextView;
import webkul.opencart.mobikul.adapterModel.DashBoardOrderAdapterModel;

public abstract class ActivityMyOrdersBinding extends ViewDataBinding {
  @NonNull
  public final TextView errorTv;

  @NonNull
  public final RecyclerView myorderRecylcerview;

  @NonNull
  public final ProgressBar progressBar;

  @NonNull
  public final View toolbar;

  @Bindable
  protected DashBoardOrderAdapterModel mData;

  protected ActivityMyOrdersBinding(DataBindingComponent _bindingComponent, View _root,
      int _localFieldCount, TextView errorTv, RecyclerView myorderRecylcerview,
      ProgressBar progressBar, View toolbar) {
    super(_bindingComponent, _root, _localFieldCount);
    this.errorTv = errorTv;
    this.myorderRecylcerview = myorderRecylcerview;
    this.progressBar = progressBar;
    this.toolbar = toolbar;
  }

  public abstract void setData(@Nullable DashBoardOrderAdapterModel data);

  @Nullable
  public DashBoardOrderAdapterModel getData() {
    return mData;
  }

  @NonNull
  public static ActivityMyOrdersBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static ActivityMyOrdersBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable DataBindingComponent component) {
    return DataBindingUtil.<ActivityMyOrdersBinding>inflate(inflater, webkul.opencart.mobikul.R.layout.activity_my_orders, root, attachToRoot, component);
  }

  @NonNull
  public static ActivityMyOrdersBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static ActivityMyOrdersBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable DataBindingComponent component) {
    return DataBindingUtil.<ActivityMyOrdersBinding>inflate(inflater, webkul.opencart.mobikul.R.layout.activity_my_orders, null, false, component);
  }

  public static ActivityMyOrdersBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  public static ActivityMyOrdersBinding bind(@NonNull View view,
      @Nullable DataBindingComponent component) {
    return (ActivityMyOrdersBinding)bind(component, view, webkul.opencart.mobikul.R.layout.activity_my_orders);
  }
}
