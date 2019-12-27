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
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public abstract class CommentToOrdersBinding extends ViewDataBinding {
  @NonNull
  public final TextView addBookheading;

  @NonNull
  public final Button addHistory;

  @NonNull
  public final EditText editText;

  @NonNull
  public final TextView headingOrderStatus;

  @NonNull
  public final CheckBox notifyAdmin;

  @NonNull
  public final CheckBox notifyCustomer;

  @NonNull
  public final Spinner statusSpinner;

  @NonNull
  public final TextView textView;

  @NonNull
  public final TextView textView2;

  @NonNull
  public final TextView textView3;

  protected CommentToOrdersBinding(DataBindingComponent _bindingComponent, View _root,
      int _localFieldCount, TextView addBookheading, Button addHistory, EditText editText,
      TextView headingOrderStatus, CheckBox notifyAdmin, CheckBox notifyCustomer,
      Spinner statusSpinner, TextView textView, TextView textView2, TextView textView3) {
    super(_bindingComponent, _root, _localFieldCount);
    this.addBookheading = addBookheading;
    this.addHistory = addHistory;
    this.editText = editText;
    this.headingOrderStatus = headingOrderStatus;
    this.notifyAdmin = notifyAdmin;
    this.notifyCustomer = notifyCustomer;
    this.statusSpinner = statusSpinner;
    this.textView = textView;
    this.textView2 = textView2;
    this.textView3 = textView3;
  }

  @NonNull
  public static CommentToOrdersBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static CommentToOrdersBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable DataBindingComponent component) {
    return DataBindingUtil.<CommentToOrdersBinding>inflate(inflater, webkul.opencart.mobikul.R.layout.comment_to_orders, root, attachToRoot, component);
  }

  @NonNull
  public static CommentToOrdersBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static CommentToOrdersBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable DataBindingComponent component) {
    return DataBindingUtil.<CommentToOrdersBinding>inflate(inflater, webkul.opencart.mobikul.R.layout.comment_to_orders, null, false, component);
  }

  public static CommentToOrdersBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  public static CommentToOrdersBinding bind(@NonNull View view,
      @Nullable DataBindingComponent component) {
    return (CommentToOrdersBinding)bind(component, view, webkul.opencart.mobikul.R.layout.comment_to_orders);
  }
}
