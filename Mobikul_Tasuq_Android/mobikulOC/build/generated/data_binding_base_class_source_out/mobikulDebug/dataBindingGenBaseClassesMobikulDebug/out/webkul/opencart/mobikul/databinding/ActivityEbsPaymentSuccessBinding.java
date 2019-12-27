package webkul.opencart.mobikul.databinding;

import android.databinding.DataBindingComponent;
import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

public abstract class ActivityEbsPaymentSuccessBinding extends ViewDataBinding {
  @NonNull
  public final RelativeLayout bottomLayout;

  @NonNull
  public final Button btnCancel;

  @NonNull
  public final Button btnPaymentSuccess;

  @NonNull
  public final Button btnRetry;

  @NonNull
  public final LinearLayout llButton;

  protected ActivityEbsPaymentSuccessBinding(DataBindingComponent _bindingComponent, View _root,
      int _localFieldCount, RelativeLayout bottomLayout, Button btnCancel, Button btnPaymentSuccess,
      Button btnRetry, LinearLayout llButton) {
    super(_bindingComponent, _root, _localFieldCount);
    this.bottomLayout = bottomLayout;
    this.btnCancel = btnCancel;
    this.btnPaymentSuccess = btnPaymentSuccess;
    this.btnRetry = btnRetry;
    this.llButton = llButton;
  }

  @NonNull
  public static ActivityEbsPaymentSuccessBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static ActivityEbsPaymentSuccessBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable DataBindingComponent component) {
    return DataBindingUtil.<ActivityEbsPaymentSuccessBinding>inflate(inflater, webkul.opencart.mobikul.R.layout.activity_ebs_payment_success, root, attachToRoot, component);
  }

  @NonNull
  public static ActivityEbsPaymentSuccessBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static ActivityEbsPaymentSuccessBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable DataBindingComponent component) {
    return DataBindingUtil.<ActivityEbsPaymentSuccessBinding>inflate(inflater, webkul.opencart.mobikul.R.layout.activity_ebs_payment_success, null, false, component);
  }

  public static ActivityEbsPaymentSuccessBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  public static ActivityEbsPaymentSuccessBinding bind(@NonNull View view,
      @Nullable DataBindingComponent component) {
    return (ActivityEbsPaymentSuccessBinding)bind(component, view, webkul.opencart.mobikul.R.layout.activity_ebs_payment_success);
  }
}
