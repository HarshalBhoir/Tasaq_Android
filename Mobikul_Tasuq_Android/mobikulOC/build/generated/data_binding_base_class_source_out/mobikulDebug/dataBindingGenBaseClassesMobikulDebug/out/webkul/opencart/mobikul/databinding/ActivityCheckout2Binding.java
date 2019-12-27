package webkul.opencart.mobikul.databinding;

import android.databinding.Bindable;
import android.databinding.DataBindingComponent;
import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.AppBarLayout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import webkul.opencart.mobikul.handlers.CheckoutHandler;

public abstract class ActivityCheckout2Binding extends ViewDataBinding {
  @NonNull
  public final AppBarLayout appbar;

  @NonNull
  public final ImageView billingAddressImage;

  @NonNull
  public final ImageView billingAddressImage1;

  @NonNull
  public final View billingPipeView;

  @NonNull
  public final View billingPipeView1;

  @NonNull
  public final View billingPipeView12;

  @NonNull
  public final FrameLayout checkoutContainer;

  @NonNull
  public final ImageView confirmOrderImage;

  @NonNull
  public final View confirmPipeView;

  @NonNull
  public final View confirmPipeView12;

  @NonNull
  public final ImageView paymentMethodImage;

  @NonNull
  public final View paymentPipeView;

  @NonNull
  public final ImageView shippingAddressImage;

  @NonNull
  public final View toolbar;

  @Bindable
  protected CheckoutHandler mHandler;

  protected ActivityCheckout2Binding(DataBindingComponent _bindingComponent, View _root,
      int _localFieldCount, AppBarLayout appbar, ImageView billingAddressImage,
      ImageView billingAddressImage1, View billingPipeView, View billingPipeView1,
      View billingPipeView12, FrameLayout checkoutContainer, ImageView confirmOrderImage,
      View confirmPipeView, View confirmPipeView12, ImageView paymentMethodImage,
      View paymentPipeView, ImageView shippingAddressImage, View toolbar) {
    super(_bindingComponent, _root, _localFieldCount);
    this.appbar = appbar;
    this.billingAddressImage = billingAddressImage;
    this.billingAddressImage1 = billingAddressImage1;
    this.billingPipeView = billingPipeView;
    this.billingPipeView1 = billingPipeView1;
    this.billingPipeView12 = billingPipeView12;
    this.checkoutContainer = checkoutContainer;
    this.confirmOrderImage = confirmOrderImage;
    this.confirmPipeView = confirmPipeView;
    this.confirmPipeView12 = confirmPipeView12;
    this.paymentMethodImage = paymentMethodImage;
    this.paymentPipeView = paymentPipeView;
    this.shippingAddressImage = shippingAddressImage;
    this.toolbar = toolbar;
  }

  public abstract void setHandler(@Nullable CheckoutHandler handler);

  @Nullable
  public CheckoutHandler getHandler() {
    return mHandler;
  }

  @NonNull
  public static ActivityCheckout2Binding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static ActivityCheckout2Binding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable DataBindingComponent component) {
    return DataBindingUtil.<ActivityCheckout2Binding>inflate(inflater, webkul.opencart.mobikul.R.layout.activity_checkout2, root, attachToRoot, component);
  }

  @NonNull
  public static ActivityCheckout2Binding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static ActivityCheckout2Binding inflate(@NonNull LayoutInflater inflater,
      @Nullable DataBindingComponent component) {
    return DataBindingUtil.<ActivityCheckout2Binding>inflate(inflater, webkul.opencart.mobikul.R.layout.activity_checkout2, null, false, component);
  }

  public static ActivityCheckout2Binding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  public static ActivityCheckout2Binding bind(@NonNull View view,
      @Nullable DataBindingComponent component) {
    return (ActivityCheckout2Binding)bind(component, view, webkul.opencart.mobikul.R.layout.activity_checkout2);
  }
}
