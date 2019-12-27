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
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;

public abstract class ActivityReturnDataBinding extends ViewDataBinding {
  @NonNull
  public final AppBarLayout appbar;

  @NonNull
  public final RelativeLayout mostParenLayout;

  @NonNull
  public final RelativeLayout myReturnContainer;

  @NonNull
  public final RelativeLayout myReturnContainerList;

  @NonNull
  public final ListView myReturnList;

  @NonNull
  public final ProgressBar myReturnRequestBar;

  @NonNull
  public final TextView myReturnheading;

  @NonNull
  public final ProgressBar myprogress;

  @NonNull
  public final View toolbar;

  protected ActivityReturnDataBinding(DataBindingComponent _bindingComponent, View _root,
      int _localFieldCount, AppBarLayout appbar, RelativeLayout mostParenLayout,
      RelativeLayout myReturnContainer, RelativeLayout myReturnContainerList, ListView myReturnList,
      ProgressBar myReturnRequestBar, TextView myReturnheading, ProgressBar myprogress,
      View toolbar) {
    super(_bindingComponent, _root, _localFieldCount);
    this.appbar = appbar;
    this.mostParenLayout = mostParenLayout;
    this.myReturnContainer = myReturnContainer;
    this.myReturnContainerList = myReturnContainerList;
    this.myReturnList = myReturnList;
    this.myReturnRequestBar = myReturnRequestBar;
    this.myReturnheading = myReturnheading;
    this.myprogress = myprogress;
    this.toolbar = toolbar;
  }

  @NonNull
  public static ActivityReturnDataBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static ActivityReturnDataBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable DataBindingComponent component) {
    return DataBindingUtil.<ActivityReturnDataBinding>inflate(inflater, webkul.opencart.mobikul.R.layout.activity_return_data, root, attachToRoot, component);
  }

  @NonNull
  public static ActivityReturnDataBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static ActivityReturnDataBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable DataBindingComponent component) {
    return DataBindingUtil.<ActivityReturnDataBinding>inflate(inflater, webkul.opencart.mobikul.R.layout.activity_return_data, null, false, component);
  }

  public static ActivityReturnDataBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  public static ActivityReturnDataBinding bind(@NonNull View view,
      @Nullable DataBindingComponent component) {
    return (ActivityReturnDataBinding)bind(component, view, webkul.opencart.mobikul.R.layout.activity_return_data);
  }
}
