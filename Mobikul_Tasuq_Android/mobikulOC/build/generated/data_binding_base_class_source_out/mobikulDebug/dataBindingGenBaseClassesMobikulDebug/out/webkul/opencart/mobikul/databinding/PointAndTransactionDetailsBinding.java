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
import android.widget.TableRow;
import android.widget.TextView;

public abstract class PointAndTransactionDetailsBinding extends ViewDataBinding {
  @NonNull
  public final TextView TableHeading1;

  @NonNull
  public final TextView TableHeading2;

  @NonNull
  public final TextView TableHeading3;

  @NonNull
  public final AppBarLayout appbar;

  @NonNull
  public final LinearLayout dataContainer;

  @NonNull
  public final TextView errorTv;

  @NonNull
  public final TextView heading;

  @NonNull
  public final RelativeLayout mostParenLayout;

  @NonNull
  public final ProgressBar progress;

  @NonNull
  public final LinearLayout ptContainer;

  @NonNull
  public final TextView subHeading;

  @NonNull
  public final TableLayout tableLayout;

  @NonNull
  public final TableRow tableRowHeadingLayout;

  @NonNull
  public final View toolbar;

  protected PointAndTransactionDetailsBinding(DataBindingComponent _bindingComponent, View _root,
      int _localFieldCount, TextView TableHeading1, TextView TableHeading2, TextView TableHeading3,
      AppBarLayout appbar, LinearLayout dataContainer, TextView errorTv, TextView heading,
      RelativeLayout mostParenLayout, ProgressBar progress, LinearLayout ptContainer,
      TextView subHeading, TableLayout tableLayout, TableRow tableRowHeadingLayout, View toolbar) {
    super(_bindingComponent, _root, _localFieldCount);
    this.TableHeading1 = TableHeading1;
    this.TableHeading2 = TableHeading2;
    this.TableHeading3 = TableHeading3;
    this.appbar = appbar;
    this.dataContainer = dataContainer;
    this.errorTv = errorTv;
    this.heading = heading;
    this.mostParenLayout = mostParenLayout;
    this.progress = progress;
    this.ptContainer = ptContainer;
    this.subHeading = subHeading;
    this.tableLayout = tableLayout;
    this.tableRowHeadingLayout = tableRowHeadingLayout;
    this.toolbar = toolbar;
  }

  @NonNull
  public static PointAndTransactionDetailsBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static PointAndTransactionDetailsBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable DataBindingComponent component) {
    return DataBindingUtil.<PointAndTransactionDetailsBinding>inflate(inflater, webkul.opencart.mobikul.R.layout.point_and_transaction_details, root, attachToRoot, component);
  }

  @NonNull
  public static PointAndTransactionDetailsBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static PointAndTransactionDetailsBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable DataBindingComponent component) {
    return DataBindingUtil.<PointAndTransactionDetailsBinding>inflate(inflater, webkul.opencart.mobikul.R.layout.point_and_transaction_details, null, false, component);
  }

  public static PointAndTransactionDetailsBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  public static PointAndTransactionDetailsBinding bind(@NonNull View view,
      @Nullable DataBindingComponent component) {
    return (PointAndTransactionDetailsBinding)bind(component, view, webkul.opencart.mobikul.R.layout.point_and_transaction_details);
  }
}
