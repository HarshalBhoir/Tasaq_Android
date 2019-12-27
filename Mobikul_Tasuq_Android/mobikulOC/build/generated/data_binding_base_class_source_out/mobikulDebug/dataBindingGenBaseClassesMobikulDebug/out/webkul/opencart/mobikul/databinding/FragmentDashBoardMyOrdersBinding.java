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
import android.widget.TextView;
import webkul.opencart.mobikul.adapterModel.DashBoardOrderAdapterModel;

public abstract class FragmentDashBoardMyOrdersBinding extends ViewDataBinding {
  @NonNull
  public final TextView errorTv;

  @NonNull
  public final RecyclerView myorderRecylcerview;

  @Bindable
  protected DashBoardOrderAdapterModel mData;

  protected FragmentDashBoardMyOrdersBinding(DataBindingComponent _bindingComponent, View _root,
      int _localFieldCount, TextView errorTv, RecyclerView myorderRecylcerview) {
    super(_bindingComponent, _root, _localFieldCount);
    this.errorTv = errorTv;
    this.myorderRecylcerview = myorderRecylcerview;
  }

  public abstract void setData(@Nullable DashBoardOrderAdapterModel data);

  @Nullable
  public DashBoardOrderAdapterModel getData() {
    return mData;
  }

  @NonNull
  public static FragmentDashBoardMyOrdersBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static FragmentDashBoardMyOrdersBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable DataBindingComponent component) {
    return DataBindingUtil.<FragmentDashBoardMyOrdersBinding>inflate(inflater, webkul.opencart.mobikul.R.layout.fragment_dash_board_my_orders, root, attachToRoot, component);
  }

  @NonNull
  public static FragmentDashBoardMyOrdersBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static FragmentDashBoardMyOrdersBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable DataBindingComponent component) {
    return DataBindingUtil.<FragmentDashBoardMyOrdersBinding>inflate(inflater, webkul.opencart.mobikul.R.layout.fragment_dash_board_my_orders, null, false, component);
  }

  public static FragmentDashBoardMyOrdersBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  public static FragmentDashBoardMyOrdersBinding bind(@NonNull View view,
      @Nullable DataBindingComponent component) {
    return (FragmentDashBoardMyOrdersBinding)bind(component, view, webkul.opencart.mobikul.R.layout.fragment_dash_board_my_orders);
  }
}
