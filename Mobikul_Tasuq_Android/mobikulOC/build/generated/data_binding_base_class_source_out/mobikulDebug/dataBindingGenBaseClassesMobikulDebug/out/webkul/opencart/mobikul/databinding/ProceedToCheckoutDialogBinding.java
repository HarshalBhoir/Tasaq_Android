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
import android.widget.Button;
import webkul.opencart.mobikul.handlers.CheckoutBottomSheetHandler;

public abstract class ProceedToCheckoutDialogBinding extends ViewDataBinding {
  @NonNull
  public final MaterialButton facebook;

  @NonNull
  public final MaterialButton google;

  @NonNull
  public final Button guestBtn;

  @NonNull
  public final Button loginBtn;

  @NonNull
  public final Button registerBtn;

  @Bindable
  protected CheckoutBottomSheetHandler mHandler;

  protected ProceedToCheckoutDialogBinding(DataBindingComponent _bindingComponent, View _root,
      int _localFieldCount, MaterialButton facebook, MaterialButton google, Button guestBtn,
      Button loginBtn, Button registerBtn) {
    super(_bindingComponent, _root, _localFieldCount);
    this.facebook = facebook;
    this.google = google;
    this.guestBtn = guestBtn;
    this.loginBtn = loginBtn;
    this.registerBtn = registerBtn;
  }

  public abstract void setHandler(@Nullable CheckoutBottomSheetHandler handler);

  @Nullable
  public CheckoutBottomSheetHandler getHandler() {
    return mHandler;
  }

  @NonNull
  public static ProceedToCheckoutDialogBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static ProceedToCheckoutDialogBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable DataBindingComponent component) {
    return DataBindingUtil.<ProceedToCheckoutDialogBinding>inflate(inflater, webkul.opencart.mobikul.R.layout.proceed_to_checkout_dialog, root, attachToRoot, component);
  }

  @NonNull
  public static ProceedToCheckoutDialogBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static ProceedToCheckoutDialogBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable DataBindingComponent component) {
    return DataBindingUtil.<ProceedToCheckoutDialogBinding>inflate(inflater, webkul.opencart.mobikul.R.layout.proceed_to_checkout_dialog, null, false, component);
  }

  public static ProceedToCheckoutDialogBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  public static ProceedToCheckoutDialogBinding bind(@NonNull View view,
      @Nullable DataBindingComponent component) {
    return (ProceedToCheckoutDialogBinding)bind(component, view, webkul.opencart.mobikul.R.layout.proceed_to_checkout_dialog);
  }
}
