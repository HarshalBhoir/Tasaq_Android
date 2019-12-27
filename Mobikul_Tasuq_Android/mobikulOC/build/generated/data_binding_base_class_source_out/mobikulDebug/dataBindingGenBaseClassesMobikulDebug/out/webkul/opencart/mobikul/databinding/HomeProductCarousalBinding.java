package webkul.opencart.mobikul.databinding;

import android.databinding.Bindable;
import android.databinding.DataBindingComponent;
import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import webkul.opencart.mobikul.model.getHomePage.Modules;

public abstract class HomeProductCarousalBinding extends ViewDataBinding {
  @NonNull
  public final LinearLayout llMain;

  @NonNull
  public final RecyclerView productList;

  @NonNull
  public final TextView title;

  @NonNull
  public final TextView viewAll;

  @Bindable
  protected Modules mData;

  protected HomeProductCarousalBinding(DataBindingComponent _bindingComponent, View _root,
      int _localFieldCount, LinearLayout llMain, RecyclerView productList, TextView title,
      TextView viewAll) {
    super(_bindingComponent, _root, _localFieldCount);
    this.llMain = llMain;
    this.productList = productList;
    this.title = title;
    this.viewAll = viewAll;
  }

  public abstract void setData(@Nullable Modules data);

  @Nullable
  public Modules getData() {
    return mData;
  }

  @NonNull
  public static HomeProductCarousalBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static HomeProductCarousalBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable DataBindingComponent component) {
    return DataBindingUtil.<HomeProductCarousalBinding>inflate(inflater, webkul.opencart.mobikul.R.layout.home_product_carousal, root, attachToRoot, component);
  }

  @NonNull
  public static HomeProductCarousalBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static HomeProductCarousalBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable DataBindingComponent component) {
    return DataBindingUtil.<HomeProductCarousalBinding>inflate(inflater, webkul.opencart.mobikul.R.layout.home_product_carousal, null, false, component);
  }

  public static HomeProductCarousalBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  public static HomeProductCarousalBinding bind(@NonNull View view,
      @Nullable DataBindingComponent component) {
    return (HomeProductCarousalBinding)bind(component, view, webkul.opencart.mobikul.R.layout.home_product_carousal);
  }
}
