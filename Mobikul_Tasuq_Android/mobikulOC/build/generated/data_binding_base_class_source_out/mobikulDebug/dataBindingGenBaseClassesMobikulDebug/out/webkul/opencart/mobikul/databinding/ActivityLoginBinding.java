package webkul.opencart.mobikul.databinding;

import android.databinding.Bindable;
import android.databinding.DataBindingComponent;
import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.button.MaterialButton;
import android.support.design.widget.AppBarLayout;
import android.support.design.widget.TextInputEditText;
import android.support.design.widget.TextInputLayout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import webkul.opencart.mobikul.adapterModel.LoginAdapterModel;
import webkul.opencart.mobikul.handlers.LoginHandler;

public abstract class ActivityLoginBinding extends ViewDataBinding {
  @NonNull
  public final AppBarLayout appbar;

  @NonNull
  public final TextInputEditText etPassword;

  @NonNull
  public final TextInputEditText etUsername;

  @NonNull
  public final TextView forgotPassword;

  @NonNull
  public final MaterialButton login;

  @NonNull
  public final ImageView loginThroughFp;

  @NonNull
  public final TextInputLayout passLayout11;

  @NonNull
  public final TextView register;

  @NonNull
  public final View toolbar;

  @NonNull
  public final TextInputLayout userlayout11;

  @Bindable
  protected LoginAdapterModel mData;

  @Bindable
  protected LoginHandler mHandler;

  protected ActivityLoginBinding(DataBindingComponent _bindingComponent, View _root,
      int _localFieldCount, AppBarLayout appbar, TextInputEditText etPassword,
      TextInputEditText etUsername, TextView forgotPassword, MaterialButton login,
      ImageView loginThroughFp, TextInputLayout passLayout11, TextView register, View toolbar,
      TextInputLayout userlayout11) {
    super(_bindingComponent, _root, _localFieldCount);
    this.appbar = appbar;
    this.etPassword = etPassword;
    this.etUsername = etUsername;
    this.forgotPassword = forgotPassword;
    this.login = login;
    this.loginThroughFp = loginThroughFp;
    this.passLayout11 = passLayout11;
    this.register = register;
    this.toolbar = toolbar;
    this.userlayout11 = userlayout11;
  }

  public abstract void setData(@Nullable LoginAdapterModel data);

  @Nullable
  public LoginAdapterModel getData() {
    return mData;
  }

  public abstract void setHandler(@Nullable LoginHandler handler);

  @Nullable
  public LoginHandler getHandler() {
    return mHandler;
  }

  @NonNull
  public static ActivityLoginBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static ActivityLoginBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable DataBindingComponent component) {
    return DataBindingUtil.<ActivityLoginBinding>inflate(inflater, webkul.opencart.mobikul.R.layout.activity_login, root, attachToRoot, component);
  }

  @NonNull
  public static ActivityLoginBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static ActivityLoginBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable DataBindingComponent component) {
    return DataBindingUtil.<ActivityLoginBinding>inflate(inflater, webkul.opencart.mobikul.R.layout.activity_login, null, false, component);
  }

  public static ActivityLoginBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  public static ActivityLoginBinding bind(@NonNull View view,
      @Nullable DataBindingComponent component) {
    return (ActivityLoginBinding)bind(component, view, webkul.opencart.mobikul.R.layout.activity_login);
  }
}
