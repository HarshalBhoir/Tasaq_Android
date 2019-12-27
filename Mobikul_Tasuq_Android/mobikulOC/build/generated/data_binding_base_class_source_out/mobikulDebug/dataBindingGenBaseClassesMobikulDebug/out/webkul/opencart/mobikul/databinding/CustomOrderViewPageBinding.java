package webkul.opencart.mobikul.databinding;

import android.databinding.DataBindingComponent;
import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.card.MaterialCardView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TableLayout;
import android.widget.TextView;

public abstract class CustomOrderViewPageBinding extends ViewDataBinding {
  @NonNull
  public final LinearLayout dboy;

  @NonNull
  public final LinearLayout historyContainer;

  @NonNull
  public final MaterialCardView orderHistory;

  @NonNull
  public final TextView orderStatus;

  @NonNull
  public final LinearLayout productLayout;

  @NonNull
  public final TextView shippingMethod;

  @NonNull
  public final TextView shippingMethodTitle;

  @NonNull
  public final TableLayout tableLayout;

  @NonNull
  public final TextView tvCanReorder;

  @NonNull
  public final TextView tvGiftCertificate;

  @NonNull
  public final TextView tvOrderBillingaddress;

  @NonNull
  public final TextView tvOrderBillingaddressheading;

  @NonNull
  public final TextView tvOrderDate;

  @NonNull
  public final TextView tvOrderId;

  @NonNull
  public final TextView tvOrderPaymentmethod;

  @NonNull
  public final TextView tvOrderPaymentmethodheading;

  @NonNull
  public final TextView tvOrderShippingaddress;

  @NonNull
  public final TextView tvOrderShippingaddressheading;

  @NonNull
  public final TextView tvOrderStatus;

  protected CustomOrderViewPageBinding(DataBindingComponent _bindingComponent, View _root,
      int _localFieldCount, LinearLayout dboy, LinearLayout historyContainer,
      MaterialCardView orderHistory, TextView orderStatus, LinearLayout productLayout,
      TextView shippingMethod, TextView shippingMethodTitle, TableLayout tableLayout,
      TextView tvCanReorder, TextView tvGiftCertificate, TextView tvOrderBillingaddress,
      TextView tvOrderBillingaddressheading, TextView tvOrderDate, TextView tvOrderId,
      TextView tvOrderPaymentmethod, TextView tvOrderPaymentmethodheading,
      TextView tvOrderShippingaddress, TextView tvOrderShippingaddressheading,
      TextView tvOrderStatus) {
    super(_bindingComponent, _root, _localFieldCount);
    this.dboy = dboy;
    this.historyContainer = historyContainer;
    this.orderHistory = orderHistory;
    this.orderStatus = orderStatus;
    this.productLayout = productLayout;
    this.shippingMethod = shippingMethod;
    this.shippingMethodTitle = shippingMethodTitle;
    this.tableLayout = tableLayout;
    this.tvCanReorder = tvCanReorder;
    this.tvGiftCertificate = tvGiftCertificate;
    this.tvOrderBillingaddress = tvOrderBillingaddress;
    this.tvOrderBillingaddressheading = tvOrderBillingaddressheading;
    this.tvOrderDate = tvOrderDate;
    this.tvOrderId = tvOrderId;
    this.tvOrderPaymentmethod = tvOrderPaymentmethod;
    this.tvOrderPaymentmethodheading = tvOrderPaymentmethodheading;
    this.tvOrderShippingaddress = tvOrderShippingaddress;
    this.tvOrderShippingaddressheading = tvOrderShippingaddressheading;
    this.tvOrderStatus = tvOrderStatus;
  }

  @NonNull
  public static CustomOrderViewPageBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static CustomOrderViewPageBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable DataBindingComponent component) {
    return DataBindingUtil.<CustomOrderViewPageBinding>inflate(inflater, webkul.opencart.mobikul.R.layout.custom_order_view_page, root, attachToRoot, component);
  }

  @NonNull
  public static CustomOrderViewPageBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static CustomOrderViewPageBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable DataBindingComponent component) {
    return DataBindingUtil.<CustomOrderViewPageBinding>inflate(inflater, webkul.opencart.mobikul.R.layout.custom_order_view_page, null, false, component);
  }

  public static CustomOrderViewPageBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  public static CustomOrderViewPageBinding bind(@NonNull View view,
      @Nullable DataBindingComponent component) {
    return (CustomOrderViewPageBinding)bind(component, view, webkul.opencart.mobikul.R.layout.custom_order_view_page);
  }
}
