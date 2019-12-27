package webkul.opencart.mobikul.databinding;

import android.databinding.DataBindingComponent;
import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.AppBarLayout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;

public abstract class ActivityViewMyOrderBinding extends ViewDataBinding {
  @NonNull
  public final AppBarLayout appbar;

  @NonNull
  public final Button cancelOrderAction;

  @NonNull
  public final Button changePasswordInfo;

  @NonNull
  public final TextView heading;

  @NonNull
  public final Button invoiceAction;

  @NonNull
  public final TextView invoicesView;

  @NonNull
  public final LinearLayout linearLaoyutBtns;

  @NonNull
  public final RelativeLayout mostParenLayout;

  @NonNull
  public final ProgressBar myproreviewprogress;

  @NonNull
  public final Button paycomissionAction;

  @NonNull
  public final TextView refundsView;

  @NonNull
  public final Button sendmailAction;

  @NonNull
  public final TextView shipmentsView;

  @NonNull
  public final View toolbar;

  @NonNull
  public final LinearLayout viewOrderLayout;

  @NonNull
  public final TextView viewmyorderheading;

  protected ActivityViewMyOrderBinding(DataBindingComponent _bindingComponent, View _root,
      int _localFieldCount, AppBarLayout appbar, Button cancelOrderAction,
      Button changePasswordInfo, TextView heading, Button invoiceAction, TextView invoicesView,
      LinearLayout linearLaoyutBtns, RelativeLayout mostParenLayout,
      ProgressBar myproreviewprogress, Button paycomissionAction, TextView refundsView,
      Button sendmailAction, TextView shipmentsView, View toolbar, LinearLayout viewOrderLayout,
      TextView viewmyorderheading) {
    super(_bindingComponent, _root, _localFieldCount);
    this.appbar = appbar;
    this.cancelOrderAction = cancelOrderAction;
    this.changePasswordInfo = changePasswordInfo;
    this.heading = heading;
    this.invoiceAction = invoiceAction;
    this.invoicesView = invoicesView;
    this.linearLaoyutBtns = linearLaoyutBtns;
    this.mostParenLayout = mostParenLayout;
    this.myproreviewprogress = myproreviewprogress;
    this.paycomissionAction = paycomissionAction;
    this.refundsView = refundsView;
    this.sendmailAction = sendmailAction;
    this.shipmentsView = shipmentsView;
    this.toolbar = toolbar;
    this.viewOrderLayout = viewOrderLayout;
    this.viewmyorderheading = viewmyorderheading;
  }

  @NonNull
  public static ActivityViewMyOrderBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static ActivityViewMyOrderBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable DataBindingComponent component) {
    return DataBindingUtil.<ActivityViewMyOrderBinding>inflate(inflater, webkul.opencart.mobikul.R.layout.activity_view_my_order, root, attachToRoot, component);
  }

  @NonNull
  public static ActivityViewMyOrderBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static ActivityViewMyOrderBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable DataBindingComponent component) {
    return DataBindingUtil.<ActivityViewMyOrderBinding>inflate(inflater, webkul.opencart.mobikul.R.layout.activity_view_my_order, null, false, component);
  }

  public static ActivityViewMyOrderBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  public static ActivityViewMyOrderBinding bind(@NonNull View view,
      @Nullable DataBindingComponent component) {
    return (ActivityViewMyOrderBinding)bind(component, view, webkul.opencart.mobikul.R.layout.activity_view_my_order);
  }
}
