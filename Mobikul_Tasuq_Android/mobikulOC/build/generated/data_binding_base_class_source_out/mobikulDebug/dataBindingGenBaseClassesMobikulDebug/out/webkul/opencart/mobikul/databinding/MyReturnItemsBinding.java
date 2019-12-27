package webkul.opencart.mobikul.databinding;

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

public abstract class MyReturnItemsBinding extends ViewDataBinding {
  @NonNull
  public final LinearLayout containerOrder;

  @NonNull
  public final TextView customer;

  @NonNull
  public final TextView myReturnstatus;

  @NonNull
  public final TextView mydate;

  @NonNull
  public final TextView myorderId;

  @NonNull
  public final View myview;

  @NonNull
  public final TextView returnId;

  @NonNull
  public final ImageView view;

  protected MyReturnItemsBinding(DataBindingComponent _bindingComponent, View _root,
      int _localFieldCount, LinearLayout containerOrder, TextView customer, TextView myReturnstatus,
      TextView mydate, TextView myorderId, View myview, TextView returnId, ImageView view) {
    super(_bindingComponent, _root, _localFieldCount);
    this.containerOrder = containerOrder;
    this.customer = customer;
    this.myReturnstatus = myReturnstatus;
    this.mydate = mydate;
    this.myorderId = myorderId;
    this.myview = myview;
    this.returnId = returnId;
    this.view = view;
  }

  @NonNull
  public static MyReturnItemsBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static MyReturnItemsBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable DataBindingComponent component) {
    return DataBindingUtil.<MyReturnItemsBinding>inflate(inflater, webkul.opencart.mobikul.R.layout.my_return_items, root, attachToRoot, component);
  }

  @NonNull
  public static MyReturnItemsBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static MyReturnItemsBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable DataBindingComponent component) {
    return DataBindingUtil.<MyReturnItemsBinding>inflate(inflater, webkul.opencart.mobikul.R.layout.my_return_items, null, false, component);
  }

  public static MyReturnItemsBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  public static MyReturnItemsBinding bind(@NonNull View view,
      @Nullable DataBindingComponent component) {
    return (MyReturnItemsBinding)bind(component, view, webkul.opencart.mobikul.R.layout.my_return_items);
  }
}
