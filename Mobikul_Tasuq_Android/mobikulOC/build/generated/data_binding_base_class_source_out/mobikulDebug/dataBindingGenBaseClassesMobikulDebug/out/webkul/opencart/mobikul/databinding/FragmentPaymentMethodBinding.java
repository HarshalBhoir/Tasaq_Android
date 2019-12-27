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
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import webkul.opencart.mobikul.handlers.PaymethodMethodHandler;

public abstract class FragmentPaymentMethodBinding extends ViewDataBinding {
  @NonNull
  public final Button checkoutContinue;

  @NonNull
  public final EditText comment;

  @NonNull
  public final TextView errorTv;

  @NonNull
  public final LinearLayout paymentMethod;

  @NonNull
  public final CheckBox termsCondition;

  @NonNull
  public final TextView termsTxt;

  @Bindable
  protected PaymethodMethodHandler mHandler;

  protected FragmentPaymentMethodBinding(DataBindingComponent _bindingComponent, View _root,
      int _localFieldCount, Button checkoutContinue, EditText comment, TextView errorTv,
      LinearLayout paymentMethod, CheckBox termsCondition, TextView termsTxt) {
    super(_bindingComponent, _root, _localFieldCount);
    this.checkoutContinue = checkoutContinue;
    this.comment = comment;
    this.errorTv = errorTv;
    this.paymentMethod = paymentMethod;
    this.termsCondition = termsCondition;
    this.termsTxt = termsTxt;
  }

  public abstract void setHandler(@Nullable PaymethodMethodHandler handler);

  @Nullable
  public PaymethodMethodHandler getHandler() {
    return mHandler;
  }

  @NonNull
  public static FragmentPaymentMethodBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static FragmentPaymentMethodBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable DataBindingComponent component) {
    return DataBindingUtil.<FragmentPaymentMethodBinding>inflate(inflater, webkul.opencart.mobikul.R.layout.fragment_payment_method, root, attachToRoot, component);
  }

  @NonNull
  public static FragmentPaymentMethodBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static FragmentPaymentMethodBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable DataBindingComponent component) {
    return DataBindingUtil.<FragmentPaymentMethodBinding>inflate(inflater, webkul.opencart.mobikul.R.layout.fragment_payment_method, null, false, component);
  }

  public static FragmentPaymentMethodBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  public static FragmentPaymentMethodBinding bind(@NonNull View view,
      @Nullable DataBindingComponent component) {
    return (FragmentPaymentMethodBinding)bind(component, view, webkul.opencart.mobikul.R.layout.fragment_payment_method);
  }
}
