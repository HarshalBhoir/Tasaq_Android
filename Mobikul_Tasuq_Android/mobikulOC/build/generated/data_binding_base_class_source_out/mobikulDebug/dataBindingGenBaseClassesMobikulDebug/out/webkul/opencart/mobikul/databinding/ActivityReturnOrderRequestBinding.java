package webkul.opencart.mobikul.databinding;

import android.databinding.Bindable;
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
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.ScrollView;
import android.widget.Spinner;
import android.widget.TextView;
import webkul.opencart.mobikul.handlers.ReturnOrderRequestHandler;
import webkul.opencart.mobikul.model.returnOrderRequestModel.ReturnOrderRequest;

public abstract class ActivityReturnOrderRequestBinding extends ViewDataBinding {
  @NonNull
  public final AppBarLayout appbar;

  @NonNull
  public final EditText comment;

  @NonNull
  public final TextView dateAdded;

  @NonNull
  public final EditText email;

  @NonNull
  public final EditText fname;

  @NonNull
  public final EditText lname;

  @NonNull
  public final RadioButton no;

  @NonNull
  public final EditText orderId;

  @NonNull
  public final EditText productCode;

  @NonNull
  public final EditText productName;

  @NonNull
  public final EditText productQty;

  @NonNull
  public final Spinner reason;

  @NonNull
  public final ScrollView scrollView;

  @NonNull
  public final ImageView selectDate;

  @NonNull
  public final Button submit;

  @NonNull
  public final EditText telephone;

  @NonNull
  public final View toolbar;

  @NonNull
  public final RadioButton yes;

  @Bindable
  protected ReturnOrderRequestHandler mHandler;

  @Bindable
  protected ReturnOrderRequest mData;

  protected ActivityReturnOrderRequestBinding(DataBindingComponent _bindingComponent, View _root,
      int _localFieldCount, AppBarLayout appbar, EditText comment, TextView dateAdded,
      EditText email, EditText fname, EditText lname, RadioButton no, EditText orderId,
      EditText productCode, EditText productName, EditText productQty, Spinner reason,
      ScrollView scrollView, ImageView selectDate, Button submit, EditText telephone, View toolbar,
      RadioButton yes) {
    super(_bindingComponent, _root, _localFieldCount);
    this.appbar = appbar;
    this.comment = comment;
    this.dateAdded = dateAdded;
    this.email = email;
    this.fname = fname;
    this.lname = lname;
    this.no = no;
    this.orderId = orderId;
    this.productCode = productCode;
    this.productName = productName;
    this.productQty = productQty;
    this.reason = reason;
    this.scrollView = scrollView;
    this.selectDate = selectDate;
    this.submit = submit;
    this.telephone = telephone;
    this.toolbar = toolbar;
    this.yes = yes;
  }

  public abstract void setHandler(@Nullable ReturnOrderRequestHandler handler);

  @Nullable
  public ReturnOrderRequestHandler getHandler() {
    return mHandler;
  }

  public abstract void setData(@Nullable ReturnOrderRequest data);

  @Nullable
  public ReturnOrderRequest getData() {
    return mData;
  }

  @NonNull
  public static ActivityReturnOrderRequestBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static ActivityReturnOrderRequestBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable DataBindingComponent component) {
    return DataBindingUtil.<ActivityReturnOrderRequestBinding>inflate(inflater, webkul.opencart.mobikul.R.layout.activity_return_order_request, root, attachToRoot, component);
  }

  @NonNull
  public static ActivityReturnOrderRequestBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static ActivityReturnOrderRequestBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable DataBindingComponent component) {
    return DataBindingUtil.<ActivityReturnOrderRequestBinding>inflate(inflater, webkul.opencart.mobikul.R.layout.activity_return_order_request, null, false, component);
  }

  public static ActivityReturnOrderRequestBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  public static ActivityReturnOrderRequestBinding bind(@NonNull View view,
      @Nullable DataBindingComponent component) {
    return (ActivityReturnOrderRequestBinding)bind(component, view, webkul.opencart.mobikul.R.layout.activity_return_order_request);
  }
}
