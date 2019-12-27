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
import android.widget.LinearLayout;
import android.widget.TextView;
import de.hdodenhof.circleimageview.CircleImageView;
import webkul.opencart.mobikul.handlers.MainActivityHandler;
import webkul.opencart.mobikul.loginlistener.LoginChecker;

public abstract class FragmentProfileBinding extends ViewDataBinding {
  @NonNull
  public final TextView addProduct;

  @NonNull
  public final TextView addressbookDashboard;

  @NonNull
  public final TextView changePassword;

  @NonNull
  public final TextView dashboard;

  @NonNull
  public final TextView downloadProduct;

  @NonNull
  public final TextView editAccout;

  @NonNull
  public final MaterialButton facebookBtn;

  @NonNull
  public final MaterialButton googleBtn;

  @NonNull
  public final TextView logout;

  @NonNull
  public final TextView newsletter;

  @NonNull
  public final TextView notification;

  @NonNull
  public final TextView orderDashboard;

  @NonNull
  public final TextView orderReturn;

  @NonNull
  public final TextView productList;

  @NonNull
  public final CircleImageView profileImage;

  @NonNull
  public final TextView rewardPoints;

  @NonNull
  public final TextView sellerDashboard;

  @NonNull
  public final TextView sellerOrder;

  @NonNull
  public final LinearLayout socialLogin;

  @NonNull
  public final TextView transaction;

  @NonNull
  public final TextView wishlistDashboard;

  @Bindable
  protected LoginChecker mData;

  @Bindable
  protected MainActivityHandler mHandlers;

  protected FragmentProfileBinding(DataBindingComponent _bindingComponent, View _root,
      int _localFieldCount, TextView addProduct, TextView addressbookDashboard,
      TextView changePassword, TextView dashboard, TextView downloadProduct, TextView editAccout,
      MaterialButton facebookBtn, MaterialButton googleBtn, TextView logout, TextView newsletter,
      TextView notification, TextView orderDashboard, TextView orderReturn, TextView productList,
      CircleImageView profileImage, TextView rewardPoints, TextView sellerDashboard,
      TextView sellerOrder, LinearLayout socialLogin, TextView transaction,
      TextView wishlistDashboard) {
    super(_bindingComponent, _root, _localFieldCount);
    this.addProduct = addProduct;
    this.addressbookDashboard = addressbookDashboard;
    this.changePassword = changePassword;
    this.dashboard = dashboard;
    this.downloadProduct = downloadProduct;
    this.editAccout = editAccout;
    this.facebookBtn = facebookBtn;
    this.googleBtn = googleBtn;
    this.logout = logout;
    this.newsletter = newsletter;
    this.notification = notification;
    this.orderDashboard = orderDashboard;
    this.orderReturn = orderReturn;
    this.productList = productList;
    this.profileImage = profileImage;
    this.rewardPoints = rewardPoints;
    this.sellerDashboard = sellerDashboard;
    this.sellerOrder = sellerOrder;
    this.socialLogin = socialLogin;
    this.transaction = transaction;
    this.wishlistDashboard = wishlistDashboard;
  }

  public abstract void setData(@Nullable LoginChecker data);

  @Nullable
  public LoginChecker getData() {
    return mData;
  }

  public abstract void setHandlers(@Nullable MainActivityHandler handlers);

  @Nullable
  public MainActivityHandler getHandlers() {
    return mHandlers;
  }

  @NonNull
  public static FragmentProfileBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static FragmentProfileBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable DataBindingComponent component) {
    return DataBindingUtil.<FragmentProfileBinding>inflate(inflater, webkul.opencart.mobikul.R.layout.fragment_profile, root, attachToRoot, component);
  }

  @NonNull
  public static FragmentProfileBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static FragmentProfileBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable DataBindingComponent component) {
    return DataBindingUtil.<FragmentProfileBinding>inflate(inflater, webkul.opencart.mobikul.R.layout.fragment_profile, null, false, component);
  }

  public static FragmentProfileBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  public static FragmentProfileBinding bind(@NonNull View view,
      @Nullable DataBindingComponent component) {
    return (FragmentProfileBinding)bind(component, view, webkul.opencart.mobikul.R.layout.fragment_profile);
  }
}
