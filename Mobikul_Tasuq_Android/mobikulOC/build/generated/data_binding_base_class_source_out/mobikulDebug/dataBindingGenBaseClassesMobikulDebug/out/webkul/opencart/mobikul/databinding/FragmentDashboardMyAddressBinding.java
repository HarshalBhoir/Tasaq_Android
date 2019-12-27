package webkul.opencart.mobikul.databinding;

import android.databinding.DataBindingComponent;
import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ProgressBar;

public abstract class FragmentDashboardMyAddressBinding extends ViewDataBinding {
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
  public final LinearLayout newAddress;

  @NonNull
  public final View shadowView;

  protected FragmentDashboardMyAddressBinding(DataBindingComponent _bindingComponent, View _root,
      int _localFieldCount, Button addNewAddress, LinearLayout addrbookContainer,
      LinearLayout addrbookdataContainer, LinearLayout addrbookitemslayout,
      ProgressBar addrbookprogress, RecyclerView addressLayout, LinearLayout newAddress,
      View shadowView) {
    super(_bindingComponent, _root, _localFieldCount);
    this.addNewAddress = addNewAddress;
    this.addrbookContainer = addrbookContainer;
    this.addrbookdataContainer = addrbookdataContainer;
    this.addrbookitemslayout = addrbookitemslayout;
    this.addrbookprogress = addrbookprogress;
    this.addressLayout = addressLayout;
    this.newAddress = newAddress;
    this.shadowView = shadowView;
  }

  @NonNull
  public static FragmentDashboardMyAddressBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static FragmentDashboardMyAddressBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable DataBindingComponent component) {
    return DataBindingUtil.<FragmentDashboardMyAddressBinding>inflate(inflater, webkul.opencart.mobikul.R.layout.fragment_dashboard_my_address, root, attachToRoot, component);
  }

  @NonNull
  public static FragmentDashboardMyAddressBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static FragmentDashboardMyAddressBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable DataBindingComponent component) {
    return DataBindingUtil.<FragmentDashboardMyAddressBinding>inflate(inflater, webkul.opencart.mobikul.R.layout.fragment_dashboard_my_address, null, false, component);
  }

  public static FragmentDashboardMyAddressBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  public static FragmentDashboardMyAddressBinding bind(@NonNull View view,
      @Nullable DataBindingComponent component) {
    return (FragmentDashboardMyAddressBinding)bind(component, view, webkul.opencart.mobikul.R.layout.fragment_dashboard_my_address);
  }
}
