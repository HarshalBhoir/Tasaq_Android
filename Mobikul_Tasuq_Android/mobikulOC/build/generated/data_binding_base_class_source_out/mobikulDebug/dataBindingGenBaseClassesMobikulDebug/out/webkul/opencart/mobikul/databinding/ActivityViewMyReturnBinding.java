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
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TableLayout;
import android.widget.TextView;

public abstract class ActivityViewMyReturnBinding extends ViewDataBinding {
  @NonNull
  public final LinearLayout Container;

  @NonNull
  public final TextView actionValue;

  @NonNull
  public final AppBarLayout appbar;

  @NonNull
  public final TextView dateAdded;

  @NonNull
  public final TextView heading;

  @NonNull
  public final TextView model;

  @NonNull
  public final RelativeLayout mostParenLayout;

  @NonNull
  public final TextView openedValue;

  @NonNull
  public final TextView orderDate;

  @NonNull
  public final TextView orderId;

  @NonNull
  public final TextView productName;

  @NonNull
  public final TextView quantity;

  @NonNull
  public final TextView reasonValue;

  @NonNull
  public final LinearLayout returnCommentsLayput;

  @NonNull
  public final TextView returnCommentsValue;

  @NonNull
  public final TextView returnId;

  @NonNull
  public final ProgressBar signupprogress;

  @NonNull
  public final TextView subHeading1;

  @NonNull
  public final TextView subHeading2;

  @NonNull
  public final TableLayout tableLayout;

  @NonNull
  public final TableLayout tableLayout1;

  @NonNull
  public final View toolbar;

  protected ActivityViewMyReturnBinding(DataBindingComponent _bindingComponent, View _root,
      int _localFieldCount, LinearLayout Container, TextView actionValue, AppBarLayout appbar,
      TextView dateAdded, TextView heading, TextView model, RelativeLayout mostParenLayout,
      TextView openedValue, TextView orderDate, TextView orderId, TextView productName,
      TextView quantity, TextView reasonValue, LinearLayout returnCommentsLayput,
      TextView returnCommentsValue, TextView returnId, ProgressBar signupprogress,
      TextView subHeading1, TextView subHeading2, TableLayout tableLayout, TableLayout tableLayout1,
      View toolbar) {
    super(_bindingComponent, _root, _localFieldCount);
    this.Container = Container;
    this.actionValue = actionValue;
    this.appbar = appbar;
    this.dateAdded = dateAdded;
    this.heading = heading;
    this.model = model;
    this.mostParenLayout = mostParenLayout;
    this.openedValue = openedValue;
    this.orderDate = orderDate;
    this.orderId = orderId;
    this.productName = productName;
    this.quantity = quantity;
    this.reasonValue = reasonValue;
    this.returnCommentsLayput = returnCommentsLayput;
    this.returnCommentsValue = returnCommentsValue;
    this.returnId = returnId;
    this.signupprogress = signupprogress;
    this.subHeading1 = subHeading1;
    this.subHeading2 = subHeading2;
    this.tableLayout = tableLayout;
    this.tableLayout1 = tableLayout1;
    this.toolbar = toolbar;
  }

  @NonNull
  public static ActivityViewMyReturnBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static ActivityViewMyReturnBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable DataBindingComponent component) {
    return DataBindingUtil.<ActivityViewMyReturnBinding>inflate(inflater, webkul.opencart.mobikul.R.layout.activity_view_my_return, root, attachToRoot, component);
  }

  @NonNull
  public static ActivityViewMyReturnBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static ActivityViewMyReturnBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable DataBindingComponent component) {
    return DataBindingUtil.<ActivityViewMyReturnBinding>inflate(inflater, webkul.opencart.mobikul.R.layout.activity_view_my_return, null, false, component);
  }

  public static ActivityViewMyReturnBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  public static ActivityViewMyReturnBinding bind(@NonNull View view,
      @Nullable DataBindingComponent component) {
    return (ActivityViewMyReturnBinding)bind(component, view, webkul.opencart.mobikul.R.layout.activity_view_my_return);
  }
}
