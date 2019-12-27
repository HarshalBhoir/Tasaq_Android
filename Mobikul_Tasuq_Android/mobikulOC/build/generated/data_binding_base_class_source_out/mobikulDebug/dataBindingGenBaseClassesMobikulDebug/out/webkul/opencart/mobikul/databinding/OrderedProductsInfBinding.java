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

public abstract class OrderedProductsInfBinding extends ViewDataBinding {
  @NonNull
  public final TextView model;

  @NonNull
  public final LinearLayout option;

  @NonNull
  public final ImageView reorder;

  @NonNull
  public final ImageView returnOrder;

  @NonNull
  public final TextView tvOrderPaymentName;

  @NonNull
  public final TextView tvOrderProductPrice;

  @NonNull
  public final TextView tvOrderProductQty;

  @NonNull
  public final TextView tvOrderProductSubtotal;

  protected OrderedProductsInfBinding(DataBindingComponent _bindingComponent, View _root,
      int _localFieldCount, TextView model, LinearLayout option, ImageView reorder,
      ImageView returnOrder, TextView tvOrderPaymentName, TextView tvOrderProductPrice,
      TextView tvOrderProductQty, TextView tvOrderProductSubtotal) {
    super(_bindingComponent, _root, _localFieldCount);
    this.model = model;
    this.option = option;
    this.reorder = reorder;
    this.returnOrder = returnOrder;
    this.tvOrderPaymentName = tvOrderPaymentName;
    this.tvOrderProductPrice = tvOrderProductPrice;
    this.tvOrderProductQty = tvOrderProductQty;
    this.tvOrderProductSubtotal = tvOrderProductSubtotal;
  }

  @NonNull
  public static OrderedProductsInfBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static OrderedProductsInfBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable DataBindingComponent component) {
    return DataBindingUtil.<OrderedProductsInfBinding>inflate(inflater, webkul.opencart.mobikul.R.layout.ordered_products_inf, root, attachToRoot, component);
  }

  @NonNull
  public static OrderedProductsInfBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static OrderedProductsInfBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable DataBindingComponent component) {
    return DataBindingUtil.<OrderedProductsInfBinding>inflate(inflater, webkul.opencart.mobikul.R.layout.ordered_products_inf, null, false, component);
  }

  public static OrderedProductsInfBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  public static OrderedProductsInfBinding bind(@NonNull View view,
      @Nullable DataBindingComponent component) {
    return (OrderedProductsInfBinding)bind(component, view, webkul.opencart.mobikul.R.layout.ordered_products_inf);
  }
}
