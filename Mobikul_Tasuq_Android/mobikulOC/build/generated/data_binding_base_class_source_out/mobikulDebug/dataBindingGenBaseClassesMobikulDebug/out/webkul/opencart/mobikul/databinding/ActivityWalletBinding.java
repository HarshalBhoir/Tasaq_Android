package webkul.opencart.mobikul.databinding;

import android.databinding.DataBindingComponent;
import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.AppBarLayout;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public abstract class ActivityWalletBinding extends ViewDataBinding {
  @NonNull
  public final Button addBalance;

  @NonNull
  public final AppBarLayout appbar;

  @NonNull
  public final EditText editxtAmt;

  @NonNull
  public final ViewPager pager;

  @NonNull
  public final TabLayout tablayout;

  @NonNull
  public final TextView termsConditons;

  @NonNull
  public final View toolbar;

  @NonNull
  public final TextView walletBalance;

  protected ActivityWalletBinding(DataBindingComponent _bindingComponent, View _root,
      int _localFieldCount, Button addBalance, AppBarLayout appbar, EditText editxtAmt,
      ViewPager pager, TabLayout tablayout, TextView termsConditons, View toolbar,
      TextView walletBalance) {
    super(_bindingComponent, _root, _localFieldCount);
    this.addBalance = addBalance;
    this.appbar = appbar;
    this.editxtAmt = editxtAmt;
    this.pager = pager;
    this.tablayout = tablayout;
    this.termsConditons = termsConditons;
    this.toolbar = toolbar;
    this.walletBalance = walletBalance;
  }

  @NonNull
  public static ActivityWalletBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static ActivityWalletBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable DataBindingComponent component) {
    return DataBindingUtil.<ActivityWalletBinding>inflate(inflater, webkul.opencart.mobikul.R.layout.activity_wallet, root, attachToRoot, component);
  }

  @NonNull
  public static ActivityWalletBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static ActivityWalletBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable DataBindingComponent component) {
    return DataBindingUtil.<ActivityWalletBinding>inflate(inflater, webkul.opencart.mobikul.R.layout.activity_wallet, null, false, component);
  }

  public static ActivityWalletBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  public static ActivityWalletBinding bind(@NonNull View view,
      @Nullable DataBindingComponent component) {
    return (ActivityWalletBinding)bind(component, view, webkul.opencart.mobikul.R.layout.activity_wallet);
  }
}
