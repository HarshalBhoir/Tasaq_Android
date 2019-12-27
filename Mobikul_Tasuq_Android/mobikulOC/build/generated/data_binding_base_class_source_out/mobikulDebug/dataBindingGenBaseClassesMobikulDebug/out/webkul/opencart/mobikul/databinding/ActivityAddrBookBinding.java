package webkul.opencart.mobikul.databinding;

import android.databinding.DataBindingComponent;
import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.AppBarLayout;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;

public abstract class ActivityAddrBookBinding extends ViewDataBinding {
  @NonNull
  public final Button addNewAddress;

  @NonNull
  public final LinearLayout addrbookContainer;

  @NonNull
  public final LinearLayout addrbookdataContainer;

  @NonNull
  public final LinearLayout addrbookitemslayout;

  @NonNull
  public final ProgressBar addrbookprogress;

  @NonNull
  public final RecyclerView addressLayout;

  @NonNull
  public final AppBarLayout appbar;

  @NonNull
  public final LinearLayout bottomLayout;

  @NonNull
  public final TextView errorTv;

  @NonNull
  public final View shadowView;

  @NonNull
  public final View toolbar;

  protected ActivityAddrBookBinding(DataBindingComponent _bindingComponent, View _root,
      int _localFieldCount, Button addNewAddress, LinearLayout addrbookContainer,
      LinearLayout addrbookdataContainer, LinearLayout addrbookitemslayout,
      ProgressBar addrbookprogress, RecyclerView addressLayout, AppBarLayout appbar,
      LinearLayout bottomLayout, TextView errorTv, View shadowView, View toolbar) {
    super(_bindingComponent, _root, _localFieldCount);
    this.addNewAddress = addNewAddress;
    this.addrbookContainer = addrbookContainer;
    this.addrbookdataContainer = addrbookdataContainer;
    this.addrbookitemslayout = addrbookitemslayout;
    this.addrbookprogress = addrbookprogress;
    this.addressLayout = addressLayout;
    this.appbar = appbar;
    this.bottomLayout = bottomLayout;
    this.errorTv = errorTv;
    this.shadowView = shadowView;
    this.toolbar = toolbar;
  }

  @NonNull
  public static ActivityAddrBookBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static ActivityAddrBookBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable DataBindingComponent component) {
    return DataBindingUtil.<ActivityAddrBookBinding>inflate(inflater, webkul.opencart.mobikul.R.layout.activity_addr_book, root, attachToRoot, component);
  }

  @NonNull
  public static ActivityAddrBookBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static ActivityAddrBookBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable DataBindingComponent component) {
    return DataBindingUtil.<ActivityAddrBookBinding>inflate(inflater, webkul.opencart.mobikul.R.layout.activity_addr_book, null, false, component);
  }

  public static ActivityAddrBookBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  public static ActivityAddrBookBinding bind(@NonNull View view,
      @Nullable DataBindingComponent component) {
    return (ActivityAddrBookBinding)bind(component, view, webkul.opencart.mobikul.R.layout.activity_addr_book);
  }
}
